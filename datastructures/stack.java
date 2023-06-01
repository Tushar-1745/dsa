import java.io.*;
import java.util.*;
public class stack{
    public static void main(String[] args) {
        Stack<Integer> st;//only in memory stack
        st=new Stack<>();  //in memory heap
        //stack offers discipline. addition, remove will be at the end
        //function : push, pop, peek, size

        st.push(10);
        st.push(20);
        System.out.println(st);
        System.out.println(st.size());
        st.push(30);
        st.pop();
        System.out.println(st.peek());
    }
}