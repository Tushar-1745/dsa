import java.io.*;
import java.util.*;
public class partinioningarray {
    //partitioning
    //     - <= pivot, >pivot
    //     -- odd, even
    //     -- 0, 1 separate
    //     -- 0, non-zero separate
    public static void main(String[] args) {
        //we will be given an array and one no.
        //we have to sort an array in such a way that all smaller element than n on one side
        //and greter elements on other side
        //ex. 7 9 4 8 3 6 2 1  and n=5
        //ans  4 3 2 1 9 6 7 8
        //make two pointers i and j. put them on 0 at start
        //if arr[i]>n then i++
        //if arr[i]<=n then swap(arr i, j) and i++; j++;
        Scanner scn =new Scanner(System.in);
        System.out.print("enter the n: ");
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the element of array: ");
            arr[i]=scn.nextInt();
        }
        System.out.print("enter the pivot: ");
        int pivot=scn.nextInt();
        partition(arr, pivot);
        print(arr);
    }
    public static int[]  partition(int[] arr, int n){
        int i=0;
        int j=0;
        while(i<arr.length){
            if(arr[i]>n){
                i++;
            }
            else{
                swap(arr, i, j);
                i++;
                j++;
            }
        }
        return arr;
    }
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println();
        }
    }
}
