import java.io.*;
import java.util.*;
public class placetiles {
    public static void main(String[] args) {
        int n=2, m=3;
        int ans =placing(n, m);
        System.out.println(ans);
    }
    public static int placing(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //vertically
        int vertpaths = placing(n-m, m);

        //horizontally 
        int horpaths = placing(n-1, m);

        return horpaths + vertpaths;

    }
}
