import java.io.*;
import java.util.*;
public class reversestring2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // System.out.print("enter the string: ");
        // String str = scn.nextLine();
        String str = "abcdefg";
        int k=2;

        String ans=reversestring(str, k);
        System.out.println(ans);
        // Input: s = "abcdefg", k = 2
        // Output: "bacdfeg"
    }
    public static String reversestring(String str, int k){

        
        for(int i=0;i<str.length();i++){ 
            int n=2*rk;
            for(int m=1;m<=n;m++){
                StringBuilder sb = new StringBuilder();
                for(int j=k-1;n>=0;n--){
                    sb.append(str.charAt(j));
                }
                for(int j=k;j<str.length();j++){
                    sb.append(str.charAt(j));
                }
                
            }
            
        }
        }

        
    }
    
}
