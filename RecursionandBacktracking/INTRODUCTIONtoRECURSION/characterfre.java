import java.util.HashMap;

public class characterfre {
   public static void main(String[] args) {
        String str = "sits";
        greaterfrequence(str);
   } 
   public static void greaterfrequence(String str){
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(hm.containsKey(ch)){
                int of = hm.get(ch);
                hm.put(ch, of+1);
            }
            else{
                hm.put(ch, 1);
            }
        }

        System.out.println(hm);
   }
}
