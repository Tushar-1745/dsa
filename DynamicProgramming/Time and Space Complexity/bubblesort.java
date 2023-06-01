import java.io.*;
import java.util.*;
public class bubblesort{
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("enter the n: ");
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the element of array: ");
            arr[i]=scn.nextInt();
        }
        //bubble sort means putting largest element at the end
        //bubble sort depends on the iteration 
        //we need two functions 1)swap and 2)isSmaller
        //if there are 5 elements in array there will be 4 iterations
        //in first iteration largest element will be at last position
        //in second iteration second largest element will be at second last position and so on
        //inside each iteration there will more iterations
        //ex. curr=i and prev=i-1 if curr is less than prev then they will be swapped
        bubblesorting(arr);
        print(arr);

    }
    public static void bubblesorting(int[] arr){
        for(int itr=1;itr<=arr.length-1;itr++){
            for(int j=0;j<arr.length-itr;j++){ //here till arr.length-itr because at each iteration largest, second largest and so on
                                               // will be settled at respective positions we don't need to include them
                if(isSmaller(arr, j+1, j)){  //if curr(j+1) is smaller than prev(j) 
                    swap(arr, j+1, j);        //swap them
                }
            }
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