import java.io.*;
import java.util.*;
public class getmazepathswithjumps {

    // in this program we can step maximum steps are allowed 
    // as well horizontal, vertical, and direct also
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // System.out.print("enter the n: ");
        // int n= scn.nextInt();
        // System.out.print("enter the m: ");
        // int m= scn.nextInt();

        int n=2;
        int m=2;

        ArrayList<String> paths = mazepathswithjumps(1,1,n,m);
        System.out.println(paths);
    }

    public static ArrayList<String> mazepathswithjumps(int sr, int sc, int dr, int dc){
        if(sr==dr&&sc==dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> tros = new ArrayList<>();


        //as we have been told maximum any moves are allowed 
        //horizontal moves
        for(int i=1;i<=dc-sc;i++){   // here i=1 is lowest move but dc-sc is the largest move  and i is of recursion
            ArrayList<String> hpaths = mazepathswithjumps(sr, sc+i, dr, dc);   //same apply for all three moves
            for(String val: hpaths){
                tros.add("h"+i+val);
            }
        }
        
        //vertical moves
        for(int i=1;i<=dr-sr;i++){
            ArrayList<String> vpaths = mazepathswithjumps(sr+i, sc, dr, dc);   //here sr+i for each faith means i+1, i+2 means jumps
            for(String val: vpaths){
                tros.add("v"+i+val);
            }
        }

        //diagonal moves
        for(int i=1;i<=dr-sr&&i<=dc-sc;i++){
            ArrayList<String> dpaths = mazepathswithjumps(sr+i, sc+i, dr, dc);
            for(String val: dpaths){
                tros.add("d"+i+val);
            }
        }

        return tros;
    }
}
