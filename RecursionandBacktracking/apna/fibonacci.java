import java.io.*;
import java.util.*;
public class fibonacci{
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        fib(a, b, n-2);

    }
    public static void fib(int a, int b, int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        fib(b, c, n-1);

        // int c=a+b;
        // System.out.println(c);
        // fib(b, c, n+1);
    }
}
