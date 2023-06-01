import java.io.*;
import java.util.*;
public class sortdates {
    public static void main(String[] args) {
        //this is the application of radix sort
        //but it requires count sort code
        //have to sort dates first sort on dates then on month then on year
        //ex. 05.06.1997 
        //to get day 05061997/1000000 && %100
        //to get month 05061997/1000 && %100
        //to get year  05061997/1  && %1000
        
        // Scanner scn =new Scanner(System.in);
        // System.out.print("enter the n: ");
        // int n=scn.nextInt();
        // String[] arr=new String[n];
        // for(int i=0;i<n;i++){
        //     System.out.print("enter the element of array: ");
        //     arr[i]=scn.next();
        // }

        int[] arr = {12041996, 20041996, 15061997, 12041989, 11081987};
        sortdates(arr);
        print(arr);
    }
    public static void sortdates(int[] arr){
        countsort(arr, 1000000, 100, 32);//days
        countsort(arr, 10000, 100, 13);//month
        countsort(arr, 1, 1000, 2501);//year
    }

    public static void countsort(int[] arr, int div, int mod, int range){
        int[] farr = new int[range];
        for(int i=0;i<arr.length;i++){
            int idx=arr[i]/div%mod;
            // farr[Integer.parseInt(arr[i], 10)/div%mod]++;
            farr[idx]++;
        }

        for(int i=1;i<farr.length;i++){
            farr[i]=farr[i]+farr[i-1];
        }

        int[] ans = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            // int val=Integer.parseInt(arr[i],10)/div%mod;
            int val=arr[i]/div%mod;
            int pos=farr[val];
            int idx=pos-1;
            ans[idx]=arr[i];
            farr[val]--;
        }

        for(int i=0;i<ans.length;i++){
            arr[i]=ans[i];
        }
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
