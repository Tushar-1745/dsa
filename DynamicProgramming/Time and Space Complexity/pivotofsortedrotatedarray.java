import java.io.*;
import java.util.*;
public class pivotofsortedrotatedarray{
    public static void main(String[] args) {
        //we will be given sorted array and find the pivot(lowestc) after rotating it
        //use binary search
        //we will find the pivot in the side where drop is occuring
        //ex. 10 20 30 40
        //ex. rotate=1 40 10 20 30, rotate=2 30 40 10 20 
        //if value is increasing from mid to high then pivot is in mid to low region
        //if value is decreasing from mid to high then pivot is in mid to high region
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the n: ");
        int n=scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the ele.: ");
            arr[i]=scn.nextInt();
        }
        int ans=findPivot(arr);
        System.out.println(ans);

    }
    public static int findPivot(int[] arr){
        int low=0;
        int high=arr.length-1;

        while(low<high){
            int mid = (low+high)/2;
            if(arr[mid]<arr[high]){ //arr[mid] is less than arr[high] means array is increasing from
                high=mid;//mid to high. pivot is on low to mid region so move left
            }
            else{//arr[mid] is greater than arr[high] means array is decreasing from mid to high
                low=mid+1;//so pivot is in mid to high region so move right
            }

        }
        return arr[high];
    }
}