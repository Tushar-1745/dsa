import java.io.*;
import java.util.*;
public class printincreasingdecreasing {
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the n: ");
        int n =scn.nextInt();
        
        printincreasing(n);
    }

    
    public static void printincreasing(int n){
        if(n==0){
            return;
        }
        printincreasing(n-1);
        System.out.println(n);
    }
}
