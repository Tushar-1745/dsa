import java.io.*;
import java.util.*;
public class firstandlastindexofelementinsortedarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the n: ");
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the element: ");
            arr[i]=scn.nextInt();
        }
        System.out.print("enter the data: ");
        int data = scn.nextInt();

        int[] res=firstandlastindex(arr, data);
        
    }
    public static int[] firstandlastindex(int[] arr, int data){
        int[] ans= new int[2];

        int low=0;
        int high=arr.length-1;
        int fi=-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(data<arr[mid]){
                high=mid-1;
            }
            else if(data>arr[mid]){
                low=mid+1;
            }
            else {
                fi=mid;
                high=mid-1;
            }
        }
        ans[0]=fi;

        low=0;
        high=arr.length-1;
        int li=-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(data<arr[mid]){
                high=mid-1;
            }
            else if(data>arr[mid]){
                low=mid+1;
            }
            else {
                li=mid;
                low=mid+1;
            }
        }
        ans[1]=li;

        return ans;
    }
}
