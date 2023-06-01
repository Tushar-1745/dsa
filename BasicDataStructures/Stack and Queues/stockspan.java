import java.io.*;
import java.util.*;
public class stockspan{
    public static void main(String[] args) {
        //we will be given price of share on each day
        //span is next greater on left side
        //
        int[] arr = {1,0,3,4,5,6,1};

        int[] span = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        span[0]=1;
        st.push(0);

        for(int i=1;i<arr.length;i++){
            while(st.size()>0&&arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                span[i]=i+1;
            }
            else{
                span[i]=i-st.peek();
            }
            st.push(i);
        }
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }
    
}