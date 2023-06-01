import java.util.Scanner;
class powerfunction {
    public static void main(String[]args){
        Scanner scn =new Scanner(System.in);
        System.out.print("enter the number: ");     // here we have to get power of n using recursion
        int n = scn.nextInt();                         // same as of factorial program
        System.out.print("enter the power: ");
        int x = scn.nextInt();
        int tp = power(n, x);
        System.out.println(tp);
    }
                                                
    public static int power(int n, int x){

        if(x==0){
            return 1;
        }
       int tpnm1 = power(n, x-1);
       int p = tpnm1*n;
       return p;
    }

}

