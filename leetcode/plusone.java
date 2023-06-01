import java.io.*;
import java.util.*;
public class plusone {
    public static int[] plus(int[] digits) {
        int n =digits.length;
        for(int i=n-1;i>=1;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i]=0;
            }
        }

        int[] newno = new int[n+1];
        newno[0]=1;
        return newno;
    }
    public static void main(String[] args) {
        int[] digit = {1,1,3,8};

        int[] ans = plus(digit);
        
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    
}
