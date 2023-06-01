import java.io.*;
import java.lang.Thread.State;
import java.util.*;
public class mergetwosortedarrays {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("enter the n: ");
        int n1=scn.nextInt();
        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++){
            System.out.print("enter the element of array1: ");
            arr1[i]=scn.nextInt();
        }
        System.out.print("enter the n: ");
        int n2=scn.nextInt();
        int[] arr2=new int[n2];
        for(int i=0;i<n2;i++){
            System.out.print("enter the element of array2: ");
            arr2[i]=scn.nextInt();
        }

        int[] ans =mergesortedarrays(arr1, arr2);
        print(ans);
        
    }
    public static int[] mergesortedarrays(int[] arr1, int[] arr2){
        int[] res = new int[arr1.length+arr2.length];  //new res array of size of sum of size of two arrays
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length&&j<arr2.length){ 
            if(arr1[i]<arr2[j]){    //comparing if 1's element is small or 2's 
                res[k]=arr1[i];  //smaller element will be added in res.
                k++;
                i++;
            }
            else{
                res[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<arr1.length){    //when second array is less than first 
            res[k]=arr1[i];  //so this is for collecting remained element of arr1
            k++;
            i++;
        }
        while(j<arr2.length){  //when first array is less than second
            res[k]=arr2[j];    //so this is for collecting remained element of arr2
            k++;
            j++;
        }
        return res;
    }
    public static void print(int[] res) {
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        
    }
}
