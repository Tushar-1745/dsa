import java.io.*;
import java.util.*;
public class stringpermutation{
    public static void main(String[] args) {
        String str = "abc";
        String permstring = " ";
        strperm(str, " ");
    }

    public static void strperm(String str, String permstring){

        if(str.length()==0){
            System.out.println(permstring);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currch = str.charAt(i);

            String newstr = str.substring(0, i)+str.substring(i+1);
            strperm(newstr, permstring+currch);
        }
    }
}