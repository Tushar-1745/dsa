import java.io.*;
import java.util.*;
public class largestareahistogram {
    //   _           _
    //  | |  _   _  | |
    //  | | |_|_|_| | |
    //  | | | | | | | |
    //  | |_| | | | | |
    //  | | | | | |_| |
    //  | | | | | | | |
    //   6 2 5 4 5 1 6
    //here rectangle of 5,4,5 = 4*3 is largest rectangle
    //assume width=1;
    //have to finde largest rectangle
    //to find its width i spreads till it gets smaller element than itself on left and right
    //next smaller on left is its left boundary and same for right
    //for each element we have to find next smaller on left and next smaller on right
    public static void main(String[] args) {
        int[] arr={6,2,5,4,5,1,6};

        //code to take nse index on right for each element
        int[] rb=new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr.length-1);
        rb[rb.length-1]=arr.length;

        for(int i=arr.length-2;i>=0;i--){
            while(st.size()>0&&arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                rb[i]=arr.length;
            }
            else{
                rb[i]=st.peek();
            }
            st.push(i);
        }

        //code to get nse index on left
        int[] lb = new int[arr.length];
        Stack<Integer> lst = new Stack<>();
        lst.push(0);
        lb[0]=-1;

        for(int i=1;i<arr.length;i++){
            while(lst.size()>0&&arr[i]<=arr[lst.peek()]){
                lst.pop();
            }
            if(lst.size()==0){
                lb[i]=-1;
            }
            else{
                lb[i]=lst.peek();
            }
            lst.push(i);
        }

        int maxarea=0;
        for(int i=0;i<arr.length;i++){
            int width=rb[i]-lb[i]-1;
            int area=arr[i]*width;
            if(area>maxarea){
                maxarea=area;
            }
        }
        System.out.println(maxarea);
    }
    

    
    
}
