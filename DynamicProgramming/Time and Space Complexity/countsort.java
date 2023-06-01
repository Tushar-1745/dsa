import java.io.*;
import java.util.*;
public class countsort {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        // System.out.print("enter the n: ");
        // int n=scn.nextInt();
        // int[] arr=new int[n];
        int[] arr = {9, 6, 3, 5, 3, 4, 3, 9, 6, 4, 6, 6, 8, 9, 9};
        // for(int i=0;i<arr.length;i++){
        //     System.out.print("enter the element of array: ");
        //     arr[i]=scn.nextInt();
        // }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        countsort(arr, min, max);
        print(arr);
        //count sort is useful when there is no much different elements(to count the frequency)
        //same element with great frequence
        //ex. jee exam lakhs of student sits but result is between 0 to 360
        //first we have to find min and max of array
        //now frequency array will be of size max-min+1
        //in frequency array at each position we will put frequency of input array element
        //now will create prefix sum array of size frequency size(prefix==adding last +curr value)
        //now answer array will be size of input array
        //answer will be filled while looping in input array from end
        //ex.9 6 3 5 3 4 3 9 6 4 6 6 8 9 9
    }
    public static void countsort(int[] arr, int min, int max){
        int range=max-min+1;

        //frequency array
        //   0[3] 1[4] 2[5] 3[6] 4[7] 5[8] 6[9]
        //     3    2    2    3    0    1    4
        int[] farr = new int[range];
        for(int i=0;i<arr.length;i++){
            int idx=arr[i]-min;
            farr[idx]++;
        }

        //prefix array (note the change= frequency array changes here)
        //   0[3] 1[4] 2[5] 3[6] 4[7] 5[8] 6[9]
        //     3    5    7    10   10   11   15
        //here till 3 there will be 3 till 5 there will be 4 till 7 there will be 5
        for(int i=1;i<farr.length;i++){
            farr[i]=farr[i]+farr[i-1];
        }

        //answer array
        int[] ans = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int val=arr[i];   //suppose here we get val=9;
            int pos=farr[val-min]; //here pos of 9 in prefix array is 15
            int idx=pos-1;   //so index will be 14 for 9
            ans[idx]=val;    //now in array at index 14, 9 will be placed
            farr[val-min]--;
        }

        //filling original with answer array
        for(int i=0;i<ans.length;i++){
            arr[i]=ans[i];
        }
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
