import java.io.*;
import java.util.*;
public class getkpc {
    // kpc = keypad combination old cell phone letters on numbers of its keyboard
    // we have to get all the words of given numbers
    // have to use recursion
    // suppose for ex 78 number 7=tu, and  8=vwx
    // so answer is [tv, tw, tx, uv, uw, ux]
    // we will separe first character then each string element is multiplied with the others characters.

    static String[] codes ={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) {
        String str = "78";
        ArrayList< String> words = kpc(str);
        System.out.println(words);
        
    }

    public static ArrayList<String> kpc(String str){

        if(str.length()==0){                    //this base case is the most important code. don't forget
            ArrayList<String> bres = new ArrayList<>();
            bres.add(" ");
            return bres;
        }
        char ch = str.charAt(0);   //here we get first character of string. To fulfil the expectation

        String ros = str.substring(1);   //this is remaining string for faith part
        ArrayList<String> roros = kpc(ros);      // here we get faith arraylist.

        ArrayList<String> tros = new ArrayList<>();

        String codeforch = codes[ch-'0'];  //elements of first character
        

        for(int i=0;i<codeforch.length();i++){   // this loop is for getting elements of first character
            char chcode = codeforch.charAt(i);
            for(String val: roros){      //we have add the element of first character with the other characters elements
                tros.add(chcode+val);
            }
        }
        return tros;
    }
}