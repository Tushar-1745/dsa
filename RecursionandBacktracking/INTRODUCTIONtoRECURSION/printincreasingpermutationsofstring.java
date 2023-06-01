import java.io.*;
import java.util.*;
public class printincreasingpermutationsofstring{       // in this program we have to print permutations of string
    public  static void solution(String str){           // ex.  abc  =  aaa baa caa aba bba  cba
        int n= str.length();
        int f= factorial(n);
        for(int i=0;i<f;i++){             // this loop is of factorial means for if factorial is 6 then it will print 6 answers
            StringBuilder sb = new StringBuilder(str);       // we use stringbuilder because we have to change the size of string
            int temp=i;                                 // its because i is used to control to outside loop;

            for(int div=n;div>=1;div--){       
                int q = temp/div;              
                int r = temp%div;              
                                               
                System.out.print(sb.charAt(r));   //removed indexed Character is to print;

                sb.deleteCharAt(r);   // we need to delete the char as soon as so index decreases 
                                      //  suppose character at index 2 is delete then index will be from 1 and 0
                temp=q;
            }
            System.out.println();
        }
    }
    public static int factorial(int n){                   // this is to find the no. of factorial of number
        int val=1;                                        // ex 3! = 3*2*1=6
        for(int i=2;i<=n;i++){
            val*=i;
        }
        return val;
    }
   
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the string: ");
        String str =scn.next();
        solution(str);
    }
}