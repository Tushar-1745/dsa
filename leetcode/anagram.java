import java.io.*;
import java.util.*;
public class anagram {
   public static void main(String[] args) {
        String s1="anagram";
        String s2="nagaram";
        ana(s1, s2);
   }
   public static void ana(String s1, String s2){

        if(s1.length()!=s2.length()){
            System.out.println(false);
            return;
        }

        StringBuilder sb = new StringBuilder(s1);
        StringBuilder mb = new StringBuilder(s2);

        for(int i=sb.length()-1;i>=0;i--){
            char ch1 = sb.charAt(i);

            for(int j=0;j<mb.length();j++){
                char ch2 = mb.charAt(j);
                if(ch1==ch2){
                    sb.deleteCharAt(i);
                    mb.deleteCharAt(j);
                    break;
                }
                 

            }
        }

        if(sb.length()>0||mb.length()>0){
            System.out.println(false);
            return;
        }
        else{
            System.out.println(true);
        }
    
    }
}