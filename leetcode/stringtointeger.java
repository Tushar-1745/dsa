import java.io.*;
import java.util.*;
public class stringtointeger {
    public static void main(String[] args) {
        String s="hello -695 world";
        int ans = myAtoi(s);
        System.out.println(ans);
    }
    public static int myAtoi(String s) {
        String str = " ";
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='-'){
                str = str+s.charAt(i);
            }
            if(Character.isDigit(s.charAt(i))){
                str=str+s.charAt(i);
            }
        }

        return Integer.parseInt(str.trim());
    }
}
