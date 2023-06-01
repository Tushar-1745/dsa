
import java.io.*;
import java.util.*;
public class pr {
    // Input: digits = "23"
// Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
    static String[] codes ={"", ".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) {
        String str = "2";
        ArrayList< String> words = kpc(str);
        System.out.println(words);
    }
    
    public static ArrayList<String> kpc(String str){
        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add(" ");
            return bres;
        }

        char ch = str.charAt(0);
        String rstr = str.substring(1);

        ArrayList<String> rrstr = kpc(rstr);

        ArrayList<String> ansstr = new ArrayList<>();

        String codeforch = codes[ch-'0'];

        for(int i=0;i<codeforch.length();i++){
            char chcode = codeforch.charAt(i);
            for(String val: rrstr){
                ansstr.add(chcode+val);
            }
        }

        return ansstr;
    }
}
