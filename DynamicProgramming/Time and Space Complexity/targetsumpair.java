import java.io.*;
import java.util.*;
public class targetsumpair {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("enter the n: ");
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the element of array: ");
            arr[i]=scn.nextInt();
        }
        System.out.print("enter the target: ");
        int target=scn.nextInt();
        //will be given array and n
        //we have to find the pair of elements whose sum is equal to n
        //first sort the array
        //use two pointers i on 0 and j on arr.length-1;
        //now if 1)arr[i] + arr[j]>n then j--
        //       2)arr[i] + arr[j]<n then i++
        //       3)arr[i] + arr[j]==n then print arr[i] and arr[j] and i++ and j--
        targetsumpair(arr, target);
    }
    public static void targetsumpair(int[] arr, int target){
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(arr[i]+arr[j]>target){  //if sum is coming greater then come toward smaller elements
                j--;
            }
            else if(arr[i]+arr[j]<target){//if sum is coming smaller then come toward greater elements
                i++;
            }
            else{            //as sum reaches n print
                System.out.println(arr[i]+","+arr[j]);
                i++;
                j--;
            }
        }
    }
}
