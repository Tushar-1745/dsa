import java.io.*;
import java.util.*;
public class quicksort {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("enter the n: ");
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the element of array: ");
            arr[i]=scn.nextInt();
        }   
        //we will need partitioning array code
        //by partitioning array program, we get smaller elem.on one side and greater on one side
        //send two groups to be sorted again using recursion we will get whole sorted array
        quicksort(arr, 0, arr.length-1);
        print(arr);
    }
    public static void quicksort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int pivot=arr[high];
        int pi = partition(arr, pivot, low, high);//this will give pivot no index and partitioning(smaller on one side and greater on one side)
        quicksort(arr, low, pi-1);//now element till pi-1 will be small they are sorted using recursion
        quicksort(arr, pi+1, high);//element from pi+1 to high will be greater they also sorted using recursion
    }
    public static int partition(int[] arr, int pivot, int low, int high){
        int i=low;
        int j=low;
        while(i<=high){
            if(arr[i]>pivot){
                i++;
            }
            else{
                swap(arr, i, j);
                i++;
                j++;
            }
        }
        System.out.println("pivot index is -> "+ (j-1));
        return (j-1);
    }
    public static void swap(int[] arr, int i, int j){
        System.out.println("swapping "+ arr[i]+" and "+arr[j]);
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
