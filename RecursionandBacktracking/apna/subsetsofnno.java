import java.io.*;
import java.util.*;
public class subsetsofnno {
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset = new ArrayList<>();
        findsubset(n, subset);
    }
    public static void findsubset(int n, ArrayList<Integer> subset){

        if(n==0){
            print(subset);
            return;
        }

        //will add
        subset.add(n);
        findsubset(n-1, subset);

        //will not add
        subset.remove(subset.size()-1);
        findsubset(n-1, subset);
    }

    public static void print(ArrayList<Integer> subset){

        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
}
