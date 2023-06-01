import java.io.*;
import java.util.*;
public class selectionsort{
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("enter the n: ");
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the element of array: ");
            arr[i]=scn.nextInt();
        }

        //selection sort is similar to bubble sort just putting smallest element at first
        //there will be arr.length-1 iteration
        //in first iteraton we have to find minimum of array and have to swap it with first position element
        //in second iteration, iteration will be start from second position element and again smallert element will be 
        //find and will be swapped with second position element and so on
        selectionsorting(arr);
        print(arr);
    }
    public static void selectionsorting(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int mi=i;             //we assum that first element is smallest index
            for(int j=i+1;j<arr.length;j++){ //here j=i because our smallest element will be place on first and second smalles 
                                        //will be placed on second place and so on 
                if(isSmaller(arr, j, mi)){   //comparing next ele. in array with assumed smallest no. 
                    mi=j;        
                }
            }
            swap(arr, i, mi);   //swapping of smallest no. with ith position
        }
    }

    //swapping function
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    //isSmaller function
    public static boolean isSmaller(int[] arr, int i, int j){
        if(arr[i]<arr[j]){
            return true;
        }
        else{
            return false;
        }
    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}