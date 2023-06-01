import java.io.*;
import java.util.*;
public class mergesort {
    public static void main(String[] args) {
        //have to use recursion 
        //have to use code of mergetwosortedarrays
        Scanner scn =new Scanner(System.in);
        System.out.print("enter the n: ");
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the element of array: ");
            arr[i]=scn.nextInt();
        }
        int[] ans=mergesort(arr, 0, arr.length-1);
        print(ans);
    }
    public static int[] mergesort(int[] arr, int low, int high){
        if(low==high){
            int[] ba= new int[1];
            ba[0]=arr[low];
            return ba;
        }
        //first made arrays as low as possible(because of recursion) sorted them 
        //and add them again with the help of mergetwosortedarrays program
        int mid = (low+high)/2;
        int[] fsh=mergesort(arr, low, mid); 
        int[] ssh=mergesort(arr, mid+1, high);
        int[] fsa=mergetwosortedarrays(fsh, ssh);//
        return fsa;
    }
    public static int[] mergetwosortedarrays(int[] fsh, int[] ssh){
        int i=0;
        int j=0;
        int k=0;
        
        int[] res = new int[fsh.length+ssh.length];

        while(i<fsh.length&&j<ssh.length){
            if(fsh[i]<ssh[j]){
                res[k]=fsh[i];
                k++;
                i++;
            }
            else{
                res[k]=ssh[j];
                k++;
                j++;
            }
        }
        while(i<fsh.length){
            res[k]=fsh[i];
            k++;
            i++;
        }
        while(j<ssh.length){
            res[k]=ssh[j];
            k++;
            j++;
        }
        return res;
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
