import java.util.Scanner;
class factorial{
    public static void main(String[]args){
        Scanner scn =new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = scn.nextInt();
        int fn = factorialrecursion(n);
        System.out.println(fn);
    }
        // factorial ex. = if n=5 then 1*2*3*4*5=120
        // we have to get the factorial of n;
        // we have faith that n-1 will give its factorial(by calling factorial functiono itself)
        // so multiplying n to factorial of n will give factorial of it
    public static int factorialrecursion(int n){
        if(n==1){
            return 1;
        }
        int fmn1 = factorialrecursion(n-1);
        int fn = n*fmn1;
        return fn;
    }

}
