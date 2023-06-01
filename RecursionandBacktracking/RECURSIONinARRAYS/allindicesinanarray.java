import java.util.Scanner;
public class allindicesinanarray {
    public static void main(String[]args){   
        Scanner scn =new Scanner(System.in);         
        // System.out.print("enter the n: ");    
        // int n=scn.nextInt();
 
        // int[] arr = new int[n];    
        int[] arr = {15, 11, 4, 4, 4, 9}; 

        // for(int i=0;i<n;i++){
        //     System.out.println("enter the element: ");  
        //     arr[i]=scn.nextInt();
        // }

        // System.out.print("enter the x: ");    
        // int x=scn.nextInt();
        int x=4;

        int[] iarr = allindices(arr, x, 0, 0);

        if(iarr.length==0){
            System.out.println();
            return;
        }

        for(int i=0;i<iarr.length;i++){
            System.out.println(iarr[i]);
        }
        
    }
    public static int[] allindices(int[] arr, int x, int idx, int fsf){
        if(idx==arr.length){
            return new int[fsf];   //here we declare array of size fsf means how many times we get the x;
        }                          

        if(arr[idx]==x){
            int[] iarr = allindices(arr, x, idx+1, fsf+1);
            iarr[fsf]=idx;     // while traversing back we fill the return array with the indices in fsf position
            return iarr;
        }
        else{
            int[] iarr =allindices(arr, x, idx+1, fsf);
            return iarr;
        }
    }
}

