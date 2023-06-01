import java.util.Scanner;
public class printdecreasing {
    public static void main(String[]args){
        Scanner scn = new Scanner (System.in);          // recursion is function which call itself in the same function.
        System.out.print("enter the N: ");
        int n= scn.nextInt();

        pdi(n);
       
    }

    public static void pdi(int n){
        if(n==0){
            return;
        }
        System.out.println(n);                   // this is for decreasing pattern
        pdi(n-1);
        if(n!=1){
            System.out.println(n);   
        }                // this is for increasing pattern
    }
    
}
