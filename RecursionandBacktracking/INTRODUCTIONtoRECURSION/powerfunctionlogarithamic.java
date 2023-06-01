
import java.util.Scanner;
public class powerfunctionlogarithamic {
    public static void main(String[]args){
        Scanner scn =new Scanner(System.in);           // this is by logarithamic method
        System.out.print("enter the number: ");     // here we have to get power of n using recursion
        int x = scn.nextInt();                         // same as of factorial program
        System.out.print("enter the power: ");
        int n = scn.nextInt();
        int tp = power(x, n);
        System.out.println(tp);
    }                                      // logarithiamic method based on  x^n = x^n/2 * x^n/2

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int tpb2 = power(x, n/2);
        int tp= tpb2*tpb2;

        if(n%2==1){
            tp=tp*x;
        }
        return tp;
    }
}
