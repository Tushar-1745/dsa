import java.io.*;
import java.util.*;
public class prefixevaluationandconversion {
    public static void main(String[] args) {
        String str = "-+2/*6483";

        Stack<Integer> operand = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> postfix = new Stack<>();

        for(int i=str.length()-1;i>=0;i--){

            char ch = str.charAt(i);

            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                int v1 = operand.pop();
                int v2 = operand.pop();
                int ans = operation(v1, v2, ch);
                operand.push(ans);

                String iv1 = infix.pop();
                String iv2 = infix.pop();
                String ians = "("+iv1+ch+iv2+")";
                infix.push(ians);

                String pv1 = postfix.pop();
                String pv2 = postfix.pop();
                String pans = pv1+pv2+ch;
                postfix.push(pans);

            }
            else{
                operand.push(ch-'0');
                infix.push(ch+"");
                postfix.push(ch+"");
            }
        }
        System.out.println("the answer is: " + operand.peek());
        System.out.println("the infix value is: "+infix.peek());
        System.out.println("the prefix value is: "+postfix.peek());
    }
    public static int operation(int v1, int v2, char op){
        if(op=='+'){
            return v1+v2;
        }
        else if(op=='-'){
            return v1-v2;
        }
        else if(op=='*'){
            return v1*v2;
        }
        else{
            return v1/v2;
        }
    }
}
