import java.io.*;
import java.util.*;
public class printxraisedton {
    //stack height
    public static void main(String[] args) {
        int x=2;
        int n=5;

        int ans = calsPow(x, n);
        System.out.println(ans);
    }
    public static int calsPow(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpownm1 = calsPow(x, n-1);
        int xpown = xpownm1*x;
        return xpown;
    }
}
