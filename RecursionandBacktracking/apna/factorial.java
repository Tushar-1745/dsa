import java.io.*;
import java.util.*;
public class factorial{
    public static void main(String[] args) {
        fact(5, 1);
    }
    public static void fact(int n, int mul){
        if(n==1){
            System.out.println(mul);
            return;
        }
        mul*=n;
        fact(n-1, mul);
    }
}
