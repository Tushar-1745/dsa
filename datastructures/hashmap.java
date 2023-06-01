import java.io.*;
import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        // it performs many operations in 0(1) complexity constant time
        // used in table of information scenario just like use key against value
        // we cannot control the order of answer in printing

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("india", 10);
        hm.put("china", 39);
        hm.put("japan", 37);

        System.out.println(hm);

        System.out.println(hm.get("japan"));

        System.out.println(hm.containsKey("china"));
        
        Set<String> set =hm.keySet();
        System.out.println(set);

        for(String key: hm.keySet()){
            int val=hm.get(key);
            System.out.println(key+"="+val);
        }
    }
}
