import java.io.*;
import java.util.*;
public class fibonaccidp{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the N: ");
        int n = scn.nextInt();

        int[] qb = new int[n+1];
        int fin = fibonacci(n, qb);
        System.out.println(fin);

    }
    public static int fibonacci(int n, int[] qb){
        if(n==0||n==1){
            return n;
        }
        if(qb[n]>0){
            return qb[n];
        }

        int fib1 = fibonacci(n-1, qb);
        int fib2 = fibonacci(n-2, qb);
        int finb = fib1+fib2;

        qb[n]=finb;
        return finb;
    }

}