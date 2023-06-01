import java.io.*;
import java.util.*;
public class practice {
    public static void main(String[] args) {
        int[] arr = {4,2,0,3,2,5};
        int[] ans = nge(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    } 
    public static int[] lge(int[] arr){
        int[] lge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        lge[0]=0;//pushed -1 because last element doesn't have next greter ele.

        for(int i=0;i<arr.length;i++){
            while(st.size()>0&&arr[i]>=st.peek()){//only if curr ele. is greater 
                st.pop();
            }
            if(st.size()==0){   //means curr doesn't have any nge in future 
                lge[i]=-1;      //so we have given -1
            }
            else{
                lge[i]=st.peek();  //here prev ele is less than curr means curr(top of stack)
                                   // has become nge to prev
            }
            st.push(arr[i]);//else just push the smaller element
        }
        return lge;
    }
    public static int[] nge(int[] arr){
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);
        nge[nge.length-1]=0;//pushed -1 because last element doesn't have next greter ele.

        for(int i=arr.length-2;i>=0;i--){
            while(st.size()>0&&arr[i]>=st.peek()){//only if curr ele. is greater 
                st.pop();
            }
            if(st.size()==0){   //means curr doesn't have any nge in future 
                nge[i]=-1;      //so we have given -1
            }
            else{
                nge[i]=st.peek();  //here prev ele is less than curr means curr(top of stack)
                                   // has become nge to prev
            }
            st.push(arr[i]);//else just push the smaller element
        }
        return nge;
    }
}
