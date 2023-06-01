import java.io.*;
import java.util.*;
public class duplicatebrackets {
    public static void main(String[] args) {
        //duplicate brackets means if we don't get any content between bracket
        //unnecessery brackets are duplicate brackets
        //push every character till get closing bracket
        //push closing bracket and now pop every element from stack till opening bracket
        //and also pop opening bracket
        //if there is still something in stack after popping it contains duplicacy

        String str="(a+b)+((c+d))";
        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch ==')'){   
                if(ch =='('){ //if we directly get the opening bracket means these brackets dont' have
                    System.out.println(true); //its own content they are useless
                    return;
                }
                else{
                    while(st.peek()!='('){  //now till we get opening bracket pop every character from stack
                        st.pop();
                    }
                    st.pop();  // and also pop opening bracket
                }
            }
            else{
                st.push(ch);
            }
        }
        System.out.println(false);
    }
}
