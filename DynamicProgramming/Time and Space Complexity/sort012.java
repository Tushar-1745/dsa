import java.io.*;
import java.util.*;
public class sort012 {
    public static void main(String[] args) {
        // Scanner scn =new Scanner(System.in);
        // System.out.print("enter the n: ");
        // int n=scn.nextInt();
        // int[] arr=new int[n];
        // for(int i=0;i<n;i++){
        //     System.out.print("enter the element of array: ");
        //     arr[i]=scn.nextInt();
        // }
        int[] arr = {1, 2, 0, 0, 2, 1, 1, 2, 0, 2, 2, 1, 0, 1, 2, 1, 2, 0};
        sort012(arr);
        print(arr);
        //can use partitioning concept and extend sort01 program
        //make three pointers i and j on 0 and k on arr.length-1
        //three cases 1)a[i]=0 then swap i and j and i++, j++;
        //            2)a[i]=1 then just i++
        //            3)a[i]=2  then swap i and k and k--
    }
    public static void sort012(int[] arr){
        int i=0;
        int j=0;
        int k=arr.length-1;

        while(i<=k){
            if(arr[i]==0){
                swap(arr, i, j);
                i++;
                j++;
            }
            else if(arr[i]==1){
                i++;
            }
            else if(arr[i]==2){
                swap(arr, i, k);
                k--;
            }
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
