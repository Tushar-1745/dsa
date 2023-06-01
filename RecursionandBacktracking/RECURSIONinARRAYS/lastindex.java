import java.util.Scanner;
public class lastindex {
    public static void main(String[]args){   // in this we will get one(same) element at various indexes(positions);
        Scanner scn =new Scanner(System.in);   // we have to find its last index of occurence.        
        System.out.print("enter the n: ");    
        int n=scn.nextInt();
 
        int[] arr = new int[n];         // for getting first we start comparing from first element       
                            // but to get last index we start comparing from last index and print it as we get it
        for(int i=0;i<n;i++){
            System.out.println("enter the element: ");  
            arr[i]=scn.nextInt();
        }

        System.out.print("enter the x: ");    
        int x=scn.nextInt();

        int lastindex = getlastindex(0, arr, x);
        System.out.println("the last index of given x is: " + lastindex);
    } 

    public static int getlastindex(int idx, int[] arr, int x){
        if(idx==arr.length){       // this is base case  it just gives -1 index nothing else
            return -1;
        }

        int liisa=getlastindex(idx+1, arr, x);    // here we will go to the end then will compare with x
        if(liisa==-1){             // we get -1 from base case as it goes till the end
            if(arr[idx]==x){       // while traversing back from end if we get idx of required x then print its idx;
                return idx; 
            }
            else{
                return -1;
            }
        }
        else{
            return liisa;
        }
    }
}
