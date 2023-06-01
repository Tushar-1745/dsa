import java.io.*;
import java.util.*;
public class longestpalindromicsubstring {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // System.out.print("enter the string: ");
        // String str = scn.next();

        String str = "cbbd";
        
        String ans = longestPalindrome(str);
        System.out.println(ans);
        
    }
    public static  String longestPalindrome(String str){
        String ans = " ";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String ss = str.substring(i, j);
                if(isPalindrome(ss)){
                    if(ss.length()>ans.length()){
                        ans=ss;
                    }
                }
            }
        }

        return ans;

        

    }
    public static boolean isPalindrome(String ss){
        int i=0;
        int j=ss.length()-1;

        while(i<=j){
            char ch1=ss.charAt(i);
            char ch2=ss.charAt(j);

            if(ch1!=ch2){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}
