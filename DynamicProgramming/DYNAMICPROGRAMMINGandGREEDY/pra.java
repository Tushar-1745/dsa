import java.io.*;
import java.util.*;
public class pra {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // System.out.println("enter the n: ");
        // int n=scn.nextInt();
        int n=5;

        int cp = countpaths(n, new int[n+1]);
        System.out.println(cp);
    }
 //0 1 1 2 3
    public static int countpaths(int n, int[] fib){
       if(n==0){
        return n;
       }
       if(fib[n]>0){
        return fib[n];
       }
       int fib1 = countpaths(n-1, fib);
       int fib2 = countpaths(n-2, fib);
       int fib3 = countpaths(n-3, fib);
       int fib4 = fib1+fib2+fib3;
       fib[n]=fib4;
       return fib4;
    }
}
