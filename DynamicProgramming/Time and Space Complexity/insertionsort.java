import java.io.*;
import java.util.*;
public class insertionsort {
    public static void main(String[] args) {
        //unlike bubble and selection, it needs isGreater function
        //need arr.length-1 iteration
        //in first iteration first 2 elmenets will be sorted(first element need not to be sorted)
        //in second it. 3 will be sorted and so on 
        //ex 2] 9 5 1 3    == oth iteration
        //   2 9] 5 1 3    == 1st iteration
        //   2 5 9] 1 3    == 2nd iteration
        //   1 2 5 9] 3    == 3rd iteration
        //   1 3 3 5 9]    == 4th iteration
        Scanner scn =new Scanner(System.in);
        System.out.print("enter the n: ");
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the element of array: ");
            arr[i]=scn.nextInt();
        }
        insertionsorting(arr);
        print(arr);
    }
    public static void insertionsorting(int[] arr){
        for(int i=1;i<arr.length;i++){  //here i=1 starts as i=0 position element is assumed to be sorted
            for(int j=i-1;j>=0;j--){   // suppose 0, 1 position elements are taken 2nd pos ele. has to be taken
                //but if 1 elemnt is greater then 1 and 2 will be swapped but now if 0th pos ele is greater than 
                //1st pos. ele. then they will be swapped means first 2nd and 3rd will be swapped then 1st and 2nd 
                //will be swapped thats why j--;
                if(isGreater(arr, j, j+1)){
                    swap(arr, j, j+1);
                }
                else{
                    break;
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
    public static boolean isGreater(int[] arr, int i, int j){
        if(arr[i]>arr[j]){
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
