import java.util.Scanner;
public class maxofanarray {
    public static void main(String[]args){
        // Scanner scn =new Scanner(System.in);        
        // System.out.print("enter the n: ");
        // int n = scn.nextInt();                        

        // int[] arr = new int[n];                        
                                                       
        // for(int i=0;i<n;i++){
        //     System.out.println("enter the elements: ");
        //     arr[i]=scn.nextInt();
        // }
        int[] arr = {15, 11, 4, 4, 4, 9};
        int max = maxofarray(0, arr);
        System.out.println(max);
    }

    public static int maxofarray(int idx, int[] arr){
        if(idx==arr.length-1){    // here we are on the last element. it says if i am on last idx and still cheking
            return arr[idx];      // for max element so i am max because there is no furthure element
        }

        int misa = maxofarray(idx+1, arr);  // misa= this will give the max of faith array means idx+1
        if(misa>arr[idx]){                // here we will compare the max. char. of faith array with first idx char.
            return misa;
        }
        else{
            return arr[idx];
        }
    }
}

