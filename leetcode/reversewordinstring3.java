import java.io.*;
import java.util.*;
public class reversewordinstring {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // System.out.print("enter the string: ");
        // String str = scn.nextLine();
        String str = "Let's take LeetCode contest";
        reverseString(str);

    }
    public static void reverseString(String str){
        String []st = str.split(" ");
        for(int i = 0;i<st.length;i++){
            String sm = st[i];
            String f = "";
            for(int j = sm.length()-1;j>=0;j--){
                f+=sm.charAt(j);
            }
           
            st[i]=f;
        }
        
        String  ansstr="";
        for(int i = 0;i<st.length;i++){
            if(i<st.length-1){
                ansstr = ansstr +st[i]+" ";
            }else{
                ansstr = ansstr +st[i];
            }
        }
        // return ansstr;
        System.out.println(ansstr);

    }
}
