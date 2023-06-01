import java.io.*;
import java.util.*;
public class slidingwindowmaximum {
    //basically the idea of this code is that first get the array of nge
    //then go to the largest element of window by nge to nge 
    //we will be given array and k (size of window)
    //we have to take first k element and give its largest no.
    //the approach is dependent on next greater element
    //first create array containing nge of each element
    //take two pointers. put them on 0
    //j will go on the nge of 0 and look for the nge of current nge is within window or not
    //if nge is within window then that nge will be max of that window 
    public static void main(String[] args) {
        int[] arr = {2, 9, 3, 8, 1, 7, 12, 6, 14, 4, 32, 0, 7, 19, 8, 12, 6};
        int k=4;

        //code to get nge array 
        Stack<Integer> st = new Stack<>();
        st.push(arr.length-1);
        int[] nge = new int[arr.length];
        nge[arr.length-1]=arr.length;

        for(int i=arr.length-2;i>=0;i--){
            while(st.size()>0&&arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                nge[i]=arr.length;
            }
            else{
                nge[i]=st.peek();
            }
            st.push(i);
        }

        int j=0;
        for(int i=0;i<=arr.length-k;i++){
            if(j<i){    //this is just if j lags behind i
                j=i;
            }
            while(nge[j]<i+k){  //this code will take us to the largest element of window
                j=nge[j];       //by going nge to nge  //i+k is the window
            }
            System.out.print(arr[j]+" ");
        }
    }
}
