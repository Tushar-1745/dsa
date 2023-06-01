import java.util.Scanner;
public class firstindex {
    public static void main(String[]args){
        Scanner scn =new Scanner(System.in);           
        System.out.print("enter the n: ");    
        int n=scn.nextInt();

        int[] arr = new int[n];            // in this we will get one(same) element at various indexes(positions);
                                           // we have to find its first index of occurence.
        for(int i=0;i<n;i++){
            System.out.println("enter the element: ");
            arr[i]=scn.nextInt();
        }

        System.out.print("enter the x: ");    
        int x=scn.nextInt();

        int firstindex = getfirstindex(0, arr, x);
        System.out.println("the first index of given x is: " + firstindex);
    } 

    public static int getfirstindex(int idx, int[] arr, int x){
        if(idx==arr.length){       // this is base case  it just gives -1 index nothing else
            return -1;
        }
        if(arr[idx]==x){         // here we use logic of program of elements of array(not reverse)
            return idx;          // first we compare and look for answer if yes then print it
        }
        else{
            int fiisa=getfirstindex(idx+1, arr, x);     // if not first then increases its idx and print it
            return fiisa;
        }
        
    }
}
