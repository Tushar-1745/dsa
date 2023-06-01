import java.util.Scanner;
public class displayarrays {
    public static void main(String[]args){
        Scanner scn =new Scanner(System.in);        // displaying array elements in reverse order using recursion;
        System.out.print("enter the n: ");
        int n = scn.nextInt();                        

        int[] arr = new int[n];                        // just need to adding into the index 
                                                       // and calling the same function;
        for(int i=0;i<n;i++){
            System.out.println("enter the elements: ");
            arr[i]=scn.nextInt();
        }
        display(0, arr);
    }

    public static void display(int idx, int[] arr){
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);              // here it will first print then will increase
        display(idx+1, arr);
    }
}
