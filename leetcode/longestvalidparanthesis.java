
import java.util.*;
public class longestvalidparanthesis {
    public static void main(String[] args) {
        String s = ")()())";
        int ans = longestValidParentheses(s);
        System.out.println(ans);
    }
    public static int longestValidParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch=='('){
                
            }
        }
        return count;
    }
}
