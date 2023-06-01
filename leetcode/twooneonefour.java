import java.io.*;
import java.util.*;
public class twooneonefour {
    public static void main(String[] args) {
        // String[] sentences = {"alice and bob love leetcode", 
        //                        "i think so too", "this is great thanks very much"};
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        
        HashMap<Integer, Integer> hm = new HashMap<>();
       
        for(int i=0;i<sentences.length;i++){
            String[] ans = sentences[i].split(" ");
            hm.put(i, ans.length);
        }

        System.out.println(hm);

        int max=0;
        for(int i=0;i<sentences.length;i++){
            if(hm.get(i)>hm.get(max)){
                max=i;
            }
        }

        System.out.println(max+" "+hm.get(max));
    }
}
