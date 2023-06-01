import java.io.*;
import java.util.*;
public class postfixexpression {
    public static void main(String[] args) {
        //postfix to infix and prefix conversion
        String str="ab+";
        
        Stack<Character> operator = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch>='a'&&ch<='z'||ch>='0'&&ch<='9'){
                prefix.push(ch+"");
                infix.push(ch+"");
                operator.push(ch);
            }
            else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                while(operator.size()>0&&precedence(ch)<=precedence(operator.peek())){
                    char op = operator.pop();

                    String v2 = prefix.pop();
                    String v1 = prefix.pop();
                    prefix.push(op+v1+v2);

                    String v22 = infix.pop();
                    String v11 = infix.pop();
                    infix.push("("+v11+op+v22+")");
                }
            
            }
        }
        
        System.out.println("The infix form is: " + infix.pop());
        System.out.println("The prefix form is: " + prefix.pop());
        
    }
    public static int precedence(char op) {
        if (op == '+') {
            return 1;
        } else if (op == '-') {
            return 1;
        } else if (op == '*') {
            return 2;
        } else {
            return 2;
        }
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
