import java.io.*;
import java.util.*;
public class getsubsequences {

    // get subsequence of string = let abc be string  
     // its length l=3 means we have 2^3 subsequence such as 1)_ _ _  2)_ _ c  3)_ b _  4)_ b c
     //                                                      5)a _ _  6)a _ c  7)a b _  8)a b c
     // in substring index doesn't matter but in subsequence index matters.
     // have to do it with recursion (faith and expectation)
     // while printing outcome witout a and outcome with a
    public static void main (String args[]){
        // Scanner scn = new Scanner(System.in);
        // System.out.print("enter the string; ");
        // String str = scn.next();
        // String str = "abc";
        String str = "ahbgdc";

        ArrayList<String> result = gss(str);
        System.out.println(result);

    }

    // faith = [bc] -> [_ _, _ c, b _, b c]
    // expectation = [abc] -> [_ _, _ c, b _, b c, a _ _, a_c, ab_, abc]
    public static ArrayList<String> gss(String str){

        if(str.length()==0){
           ArrayList<String> bres = new ArrayList<>();   //blank string also have one subsequence that is blank
           bres.add("");
           return bres;
        }
        char ch = str.charAt(0);   // here we have separated the first character for expectation;
        String ros = str.substring(1);   // here we have remaining part of string for faith;

        ArrayList<String> roros = gss(ros); // this call is for our faith string it will give [_ _, _c, b_, bc]

        ArrayList<String> mres = new ArrayList<>();
        for(String val: roros){
            mres.add("" + val);      //this is for printing faith;
        }
        for(String val: roros){
            mres.add(ch + val);     //this is for printing expectation with char at [0].
        }
        return mres;
    }


    // public static void main(String args[]){

        // ArrayList could be of Integer, string
    //     ArrayList<Integer> list = new ArrayList<>();  //arraylist is a dynamic array means 
    //     list.add(10);                               //it can grow as long as we want
    //     list.add(20);
    //     list.add(30);
    //     System.out.println(list + " " + list.size());

    //     // for(int val: list){
    //     //     System.out.println(val);
    //     // }

    //     // for(int i=0;i<list.size();i++){
    //     //     int val = list.get(i);
    //     //     System.out.println(val);
    //     // }

    //     list.set(2, 50);
    //     System.out.println(list + " " + list.size());
    //     list.add(1, 200);
    //     System.out.println(list + " " + list.size());
    // }
}
