import java.io.*;
import java.util.*;
public class getstairpaths {

    // in this program we have to tell all the paths from to go from nth stair to ground 
    // maximum 3 stairs are allowed
    // so we will have 3 faiths (n-1), (n-2), (n-2)
    // when we get the answers from first faith i.e. from (n-1) add 1 in front of each answers for (n-2) add 2 and so on
    // use recursion in program 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the n: ");
        int n= scn.nextInt();

        ArrayList<String> paths = stairpaths(n);
        System.out.println(paths);
    }

    public static ArrayList<String> stairpaths(int n){
        if(n==0){             // there is one path to go from 0 to 0 is to stop there. it has value
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        else if(n<0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }

        ArrayList<String> p1 = stairpaths(n-1);     //this is our first faith 
        ArrayList<String> p2 = stairpaths(n-2);     // second faith 
        ArrayList<String> p3 = stairpaths(n-3);       // third faith as only max 3 steps are allowed

        ArrayList<String> p = new ArrayList<>();

        for(String val: p1){       //adding 1 to answers of first faith
            p.add(1+val);
        }

        for(String val: p2){     //adding 2 to anwers of second faith
            p.add(2+val);
        }
 
        for(String val: p3){      //addding 3 to answers of third faith
            p.add(3+val);
        }
        return p;
    }
}
