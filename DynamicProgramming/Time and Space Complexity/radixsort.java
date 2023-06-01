import java.io.*;
import java.util.*;
public class radixsort {
    public static void main(String[] args) {
        //radix sort is used to sort large no. means 123, 718, 37, 982, 375
        //it require count sort code
        //in radix code just pass array and digit of no.in array

        Scanner scn =new Scanner(System.in);
        // System.out.print("enter the n: ");
        // int n=scn.nextInt();
        // int[] arr=new int[n];
        // for(int i=0;i<n;i++){
        //     System.out.print("enter the element of array: ");
        //     arr[i]=scn.nextInt();
        // }
        int[] arr={123, 718, 37, 982, 375};
        radixsort(arr);
        // print(arr);
    }
    public static void radixsort(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int val: arr){
            if(val>max){
                max=val;
            }
        }
        int exp=1;   //first comparison will be done on 1's place digit of element of array
        while(exp<=max){
            countsort(arr, exp);
            exp=exp*10;    //next comparison will be done on 10's place digit of element
        }
    }
    public static void countsort(int[] arr, int exp){
        int[] farr = new int[10];
        for(int i=0;i<arr.length;i++){
            int idx=arr[i]/exp%10;
            farr[idx]++;
        }

        for(int i=1;i<farr.length;i++){
            farr[i]=farr[i]+farr[i-1];
        }

        int[] ans = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int val=arr[i]/exp%10;
            int pos=farr[val];
            int idx=pos-1;
            ans[idx]=arr[i];
            farr[val]--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=ans[i];
        }
        System.out.print("after sorting on "+ exp +" place ->");
        print(arr);
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
