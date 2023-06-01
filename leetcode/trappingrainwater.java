import java.io.*;
import java.util.*;
public class trappingrainwater {
    public static void main(String[] args) {
        // int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] height = {4,2,0,3,2,5};

        int[] lge = lge(height);
        int[] nge = nge(height);

        for(int i=0;i<height.length;i++){
            System.out.print(height[i]+" ");

            int max=nge[i];
             for(int j=i;j<nge.length;j++){
                 int asn = Math.max(max, nge[j]);
                 if(asn>max){
                     max=asn;
                 }
             }
             System.out.print(max+" ");

             int max2 = lge[i];
             for(int j=i;j>=0;j--){
                 int asn2 = Math.max(max2, lge[j]);
                 if(asn2>max2){
                     max2=asn2;
                 }
             }

             System.out.print(max2);
             System.out.println();
        }

        // int count=0;
        // for(int i=0;i<height.length;i++){
        //     System.out.print(height[i]+" ");
        //     int max=nge[i];
        //     for(int j=i;j<nge.length;j++){
        //         int asn = Math.max(max, nge[j]);
        //         if(asn>max){
        //             max=asn;
        //         }
        //     }
        //     System.out.print(max+" ");
            
        //     int max2 = lge[i];
        //     for(int j=i;j>=0;j--){
        //         int asn2 = Math.max(max2, lge[j]);
        //         if(asn2>max2){
        //             max2=asn2;
        //         }
        //     }
        //     System.out.print(max2+" ");
        //     System.out.println();

        //     int ans = Math.min(max, max2);
        //     if(ans>height[i]){
        //         count+= ans-height[i];
        //     }
            
           
        // }
        // System.out.println(count);
    }

    public static int[] lge(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] lge = new int[arr.length];
        lge[0]=0;
        st.push(arr[0]);

        for(int i=1;i<arr.length;i++){
            while(st.size()>0&&arr[i]>=st.peek()){
                st.pop();
            }
            if(st.size()==0){
                lge[i]=0;
            }
            else{
                lge[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return lge;
    }
    public static int[] nge(int[] arr){
        int[] nge = new int[arr.length];
        Stack<Integer> st2 = new Stack<>();
        nge[nge.length-1]=0;
        st2.push(arr[arr.length-1]);

        for(int i=arr.length-2;i>=0;i--){
            while(st2.size()>0&&arr[i]>=st2.peek()){
                st2.pop();
            }
            if(st2.size()==0){
                nge[i]=0;
            }
            else{
                nge[i]=st2.peek();
            }
            st2.push(arr[i]);
        }

        return nge;
    }
}
