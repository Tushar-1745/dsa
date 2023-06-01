import java.io.*;
import java.util.*;
public class issubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        
        // boolean ans = dsisSubsequence(s, t);
        // System.out.println(ans);
        dsisSubsequence(s,t);
    }
    public static void dsisSubsequence(String s, String t) {
       
        ArrayList<String> answer = getSubsequence(t);

        for(int i=0;i<answer.size();i++){
            String st1 = answer.get(i);
            if(st1.equals(s)){
                System.out.println(st1);
            }
        }
        // return false;
    }

    public static ArrayList<String> getSubsequence(String t){
        if(t.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add(" ");
            return bres;
        }

        char ch = t.charAt(0);
        String st = t.substring(1);

        ArrayList<String> sst = getSubsequence(st);

        ArrayList<String> ans = new ArrayList<>();

        for(String val: sst){
            ans.add(val);
        }
        for(String val: sst){
            ans.add(ch+val);
        }
        return ans;
    }
}
