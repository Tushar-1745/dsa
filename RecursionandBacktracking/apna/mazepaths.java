import java.io.*;
import java.util.*;
public class mazepaths {
    public static void main(String[] args) {
        int n=3;
        int m=3;
        int ans =countpaths(0,0,n,m);
        System.out.println(ans);
    }
    public static int countpaths(int i, int j, int n, int m){
        if(i==n-1&&j==m-1){
            return 1;
        }
        if(i==n||j==m){
            return 0;
        }
        int righpaths = countpaths(i, j+1, n, m);
        int downpaths = countpaths(i+1, j, n, m);

        return righpaths+downpaths;
    }
}
