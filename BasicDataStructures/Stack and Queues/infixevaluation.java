import java.io.*;
import java.util.*;
public class infixevaluation {
    public static void main(String[] args) {
        //solving expression ex. 2+3/4-(5*6)
        //we create two stacks one for operand and other for operator
        //in operand till we get closing bracket in operator stack we push operands
        //till we get closing bracket we will push operator with opening bracket
        //as soon as closing bracket comes it will perfrom operations according to operator
        // it will pop everything till opening bracket ans op. br. also
        //2+(5-3*6/2)
        //operand - push
        // ( - push
        // ) - pop till (
        // operator - operator with greater/same priority will be solved first

        String str = "2*8+8-2";
        // String str = "2+6*4/8-3";

        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='('){
                operators.push(ch);
            }
            else if(Character.isDigit(ch)){
                operands.push(ch-'0');
            }
            else if(ch==')'){
                while(operators.size()>0&&operators.peek()!='('){
                    char op = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();

                    int ans = operation(v1, v2, op);
                    operands.push(ans);
                }
                operators.pop();
            }
            else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                while(operators.size()>0 && operators.peek()!='('  && precedence(ch)<=precedence(operators.peek()) ){
                    char op = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();

                    int ans = operation(v1, v2, op);
                    operands.push(ans);
                }
                operators.push(ch);
            }
        }
        while(operators.size()>0){
            char op = operators.pop();
            int v2 = operands.pop();
            int v1 = operands.pop();

            int ans = operation(v1, v2, op);
            operands.push(ans);
        }
        System.out.println(operands.peek());
    } 
    public static int operation(int v1, int v2, char operator){
        if(operator=='+'){
            return v1+v2;
        }
        if(operator=='-'){
            return v1-v2;
        }
        if(operator=='*'){
            return v1*v2;
        }
        else{
            return v1/v2;
        }
    }
    public static int precedence(char operator){
        if(operator=='+'){
            return 1;
        }
        else if(operator=='-'){
            return 1;
        }
        else if(operator=='*'){
            return 2;
        }
        else{
            return 2;
        }
    }
}
