import java.io.*;
import java.util.*;
public class hashmapintroduction{
    public static void main(String[] args) {     //it performs many operations in 0(1) complexity constant time
        HashMap<String, Integer> hm = new HashMap<>();  // used in table of information scenario
                                                    // just like use key against value
        hm.put("india", 120);            // example:  population map    here hashmap of string for india and integer for 120
        hm.put("china", 150);            //           india, 120
        hm.put("usa", 50);               //           china, 150

        // System.out.println(hm);

        hm.put("nigeria", 20);           // we cannot control the order of answer in printing
        hm.put("usa", 60);

        System.out.println(hm);

        // System.out.println(hm.get("india"));
        // System.out.println(hm.get("japan"));

        // System.out.println(hm.containsKey("india"));   //containsKey only tells true or false if value for key 
        // System.out.println(hm.containsKey("japan"));   // is present or not

        Set<String> keys = hm.keySet();          // this is like loop for getting keys in hashmap
        System.out.println(keys);

        // for(String key: hm.keySet()){
        //     Integer val = hm.get(key);
        //     System.out.println(key + " " + val);
        // }

        // System.out.println("maximum price is : "+ Collections.min(hm.keySet()));

        String maxstr = null;
        for(String key: hm.keySet()){
            if(maxstr==null||hm.get(key)>hm.get(maxstr)){
                maxstr=key;
            }
        }
        System.out.println(maxstr);
    
    }
}