import java.util.Stack;

public class balancedbrackets {
    public static void main(String[] args) {
        //balanced bracked means top of the stack should be its counter part
        //there should be closing bracket for each opening bracket
        //less or greater bracket leads to unbalancing
        //push only opening bracket in stack until closing bracket comes
        //now if we get closing bracket and if top of stack contains its counter part
        //then pop it and if its counter part is not there return false;
        //ans still after push and pop operations, after stack contain brackets
        //means there are unbalanced no. of opening or closing bracket return false

        String str="[(a+b)+{(c+d)*(e/f)}]";

        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='['||ch=='('||ch=='{'){
                st.push(ch);
            }
            else if(ch==')'){
                boolean val = handleClosing(st, '(');
                System.out.println(val);
                return;
            }
            else if(ch==']'){
                boolean val = handleClosing(st, '[');
                System.out.println(val);
                return;
            }
            else if(ch=='}'){
                boolean val = handleClosing(st, '{');
                return;
            }
            
        }

        if(st.size()==0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }

    public static boolean handleClosing(Stack<Character> st, char correspchar){
        if(st.size()==0){
            return false;
        }
        else if(st.peek()!=correspchar){
            return false;
        }
        else{
            st.pop();
            return true;
        }
        
    }
}
