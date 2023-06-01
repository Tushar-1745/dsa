import java.util.Scanner;
public class displayarrayinreverse {
    public static void main(String[]args){
        // Scanner scn =new Scanner(System.in);               // displaying array elements using recursion;
        // System.out.print("enter the n: ");
        // int n = scn.nextInt();                        

        // int[] arr = new int[n];                        // just need to adding into the index 
        //                                                // and calling the same function;
        // for(int i=0;i<n;i++){
        //     System.out.println("enter the elements: ");
        //     arr[i]=scn.nextInt();
        // }
        int[] arr = {15, 11, 4, 4, 4, 9};
        display(0, arr);
    }

    public static void display(int idx, int[] arr){
        if(idx==arr.length){
            return;
        }                                      // here it first goes up to max limit i.e. array.length;
        display(idx+1, arr);                   // and then print while decreasing
        System.out.println(arr[idx]);              
    }
}

