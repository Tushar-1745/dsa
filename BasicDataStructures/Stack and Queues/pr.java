import java.io.*;
import java.util.*;
public class pr {
    public static void main(String[] args) {
        int[] arr={2,5,9,3,1,12,6,8,7};
        int[] ans = next(arr);
        print(ans);
    }

    public static int[] next(int[] arr){
        int[] nge = new int[arr.length];
        nge[0]=-1;

        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);

        for(int i=1;i<arr.length;i++){
            while(st.size()>0&&arr[i]<=st.peek()){
                st.pop();
            }
            if(st.size()==0){
                nge[i]=-1;
            }
            else{
                nge[i]=st.peek();
            }
            st.push(arr[i]);
        }

        return nge;
    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
