import java.io.*;
import java.util.*;
public class sort01 {
    public static void main(String[] args) {
        
        //can use partioning concept
        Scanner scn =new Scanner(System.in);
        System.out.print("enter the n: ");
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the element of array: ");
            arr[i]=scn.nextInt();
        }
        sort01(arr);
        print(arr);
    }
    public static void sort01(int[] arr){
        int i=0;
        int j=0;
        while(i<arr.length){
            if(arr[i]==0){
                swap(arr, i, j);
                i++;
                j++;
            }
            else{
                i++; 
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
            System.out.println(arr[i]);
        }
    }
}
