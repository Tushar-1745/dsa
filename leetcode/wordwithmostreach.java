import java.io.*;
import java.util.*;
public class wordwithmostreach {
    public static void main(String[] args) {
        String str = "tushar madane";
        String ans = reach(str);
        System.out.println(ans);
    }
    public static String reach(String str){
        String[] s = str.split(" ");

        HashMap<String, Integer> hm = new HashMap<>();

        for(int i=0;i<s.length;i++){
            String st = s[i];
            
            HashMap<Character, Integer> ans = getfrequency(st);
            int answer = hifrequency(ans, st);
            hm.put(st, answer);
        }

        String fin = s[0];
        for(String sj: s){
            if(hm.get(sj)>hm.get(fin)){
                fin=sj;
            }
        }

        return fin;
    }

    public static int hifrequency(HashMap<Character, Integer> map, String sr){

        Character chs = sr.charAt(0);
        for(Character ch: map.keySet()){
            if(map.get(ch)>map.get(chs)){
                chs=ch;
            }
        }

        return map.get(chs);
    }

    public static HashMap<Character, Integer> getfrequency(String str){
        HashMap<Character, Integer> sm = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(sm.containsKey(ch)){
                sm.put(ch, sm.get(ch)+1);
            }
            else{
                sm.put(ch, 1);
            }
        }

        return sm;
    }
}
