
import java.io.*;
import java.util.*;

public class infixconversion {
    public static void main(String[] args) {
        // infix to prefix and postfix conversion
        // infix - a+b
        // prefix - +ab
        // postfix - ab+
        // make traversal on euler path, while traversing from left we get prefix
        // and traversing from right we get postfix
        // make three stacks for prefix, operator, postfix
        // ex. a+b
        // b b
        // a + a
        // prefix operator postfix
        // for prefix = operator+operands so, +ab
        // for postfix = operands+operators so, ab+
        // ex. 264*8/

        String str = "a*(b-c+d)/e";
        Stack<String> prefix = new Stack<>();
        Stack<String> postfix = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                operator.push(ch);
            } 
            else if (ch == ')') {
                while (operator.size() > 0 && operator.peek() != '(') {
                    char op = operator.pop();
                    String v2 = prefix.pop();
                    String v1 = prefix.pop();
                    prefix.push(op + v1 + v2);

                    String v22 = postfix.pop();
                    String v11 = postfix.pop();
                    postfix.push(v11 + v22 + op);
                }
                if (operator.size() > 0) {
                    operator.pop();
                }
            } 
            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                prefix.push(ch + "");
                postfix.push(ch + "");
            } 
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (operator.size() > 0 && operator.peek() != '(' && precedence(ch) <= precedence(operator.peek())) {
                    char op = operator.pop();
                    String v2 = prefix.pop();
                    String v1 = prefix.pop();
                    prefix.push(op+v1+v2);

                    String v22 = postfix.pop();
                    String v11 = postfix.pop();
                    postfix.push(v11+v22+op);
                }
                operator.push(ch);
            }

        }
        while (operator.size() > 0) {
            char op = operator.pop();
            String v2 = prefix.pop();
            String v1 = prefix.pop();
            prefix.push(op + v1 + v2);

            String v22 = postfix.pop();
            String v11 = postfix.pop();
            postfix.push(v11+ v22+ op);
        }
        System.out.println("The prefix form is: " + prefix.peek());
        System.out.println("The postfix form is: " + postfix.peek());
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
}
