import java.io.*;
import java.util.*;
public class postfixevaluationandconversion {
    public static void main(String[] args) {
        //postfix to infix and prefix conversion
        //three stacks for values, infix and prefix
        String str="264*8/+3-";
        
        Stack<Integer> operand = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                int v2=operand.pop();
                int v1=operand.pop();
                int ans = operation(v1, v2, ch);
                operand.push(ans);

                String iv2 = infix.pop();
                String iv1 = infix.pop();
                String ians = "(" + iv1+ch+iv2+")";
                infix.push(ians);

                String pv2 = prefix.pop();
                String pv1 = prefix.pop();
                String pans = ch+pv1+pv2;
                prefix.push(pans);
            }
            else{
                operand.push(ch-'0');
                prefix.push(ch+"");
                infix.push(ch+"");
            }

        }
        System.out.println("the answer is: "+operand.peek());
        System.out.println("the infix is: "+infix.peek());
        System.out.println("the prefix is: "+prefix.peek());
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
