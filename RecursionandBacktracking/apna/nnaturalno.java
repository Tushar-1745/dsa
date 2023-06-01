import java.io.*;
import java.util.*;
public class nnaturalno{
    public static void main(String[] args) {
        printSum(1, 5, 0);
    }
    public static void printSum(int i, int n, int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        System.out.println(sum);
        printSum(i+1, n, sum);
        
    }
}
