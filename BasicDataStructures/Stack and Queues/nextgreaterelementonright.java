import java.io.*;
import java.util.*;
public class nextgreaterelementonright {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // System.out.println("enter the n: ");
        // int n=scn.nextInt();
        // int[] arr = new int[n];
        // for(int i=0;i<n;i++){
        //     System.out.print("enter the ele: ");
        //     arr[i]=scn.nextInt();
        // }
        int[] arr={2,5,9,3,1,12,6,8,7};
        //ex. 2 5 9 3 1 12 6 8 7
        //    5 9 12 12 12 -1 8 -1 -1
        //remember line graph
        //make stack and start pushing from last element with -1
        //now if second last element is greater than last ele. then it will pop the current top
        //and if it is small it will do nothing
        //after this operation st.peek() will be printed
        int[] ans = solve(arr);
        print(ans);
    }
    public static int[] solve(int[] arr){
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);
        nge[nge.length-1]=-1;//pushed -1 because last element doesn't have next greter ele.

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

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
