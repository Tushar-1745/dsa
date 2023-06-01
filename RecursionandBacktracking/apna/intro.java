import java.io.*;
import java.util.*;
public class intro{
    public static void main(String[] args) {
        rec(1);
    }
    public static void rec(int n){
        if(n==6){
            return;
        }

        int a=n;
        int b=n-1;
        int c=a+b;
        System.out.println(c);
        rec(n+1);
    }
}