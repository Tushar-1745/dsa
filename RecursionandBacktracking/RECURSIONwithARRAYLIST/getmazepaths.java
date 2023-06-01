import java.io.*;
import java.util.*;
public class getmazepaths {
    //in this program, we will get maze of 2d array in terms of n and m
    // we have to go from top left corner to bottom right corner i.e. from 1st box to last box of 2d matrix.
    // have to give all paths. In one steps we can go either 1 vertical or 1 horizontal step
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // System.out.print("enter the n: ");
        // int n= scn.nextInt();
        // System.out.print("enter the m: ");
        // int m= scn.nextInt();

        int n=3;
        int m=3;

        // [hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]


        ArrayList<String> paths = mazepaths(1,1,n,m);
        System.out.println(paths);
    }

    public static ArrayList<String> mazepaths(int sr, int sc, int dr, int dc){

        if(sr==dr&&sc==dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();
        
        if(sc<dc){
            hpaths = mazepaths(sr, sc+1, dr, dc);      //first faith   going first horizontal step
        }
        if(sr<dr){
            vpaths = mazepaths(sr+1,sc,dr,dc);       //second faith   going first vertical step
        }
        
        ArrayList<String> paths = new ArrayList<>();

        for(String  val: hpaths){
            paths.add("h"+val);          // meeting with expection
        }
        for(String  val: vpaths){        // meeting with expection
            paths.add("v"+val);
        }
        return paths;
    }
}
