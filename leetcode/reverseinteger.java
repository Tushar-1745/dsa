import java.io.*;
import java.util.*;
public class reverseinteger {
    public static void main(String[] args) {
        int x=-123;
        reverseintegerjk(x);
        // System.out.println(reverseinteger(x));
    }
    public static void reverseintegerjk(int x){
        int n=Math.abs(x);
        String str = Integer.toString(n);
        int size=str.length();
        int ans=0;
        int mul=size-1;
        while(n>0){
            int r=n%10;
            n=n/10;

            ans = ans + (r*(int)Math.pow(10, mul));
            mul--;
        }
        if(x<0){
            ans=0-ans;
        }
        System.out.println(ans);

    }
}
