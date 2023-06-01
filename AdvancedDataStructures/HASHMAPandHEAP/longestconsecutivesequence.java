import java.io.*;
import java.util.*;
public class longestconsecutivesequence {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);  
        System.out.print("enter the n: ");     
        int n=scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the elements: ");
            arr[i]=scn.nextInt();
        }

        // in this program we will get array of unordered elements
        // we have to give the longest consecutive sequence  just like 5,6,7,8 whatever it may be
        // we will create hashmap of integer and boolean and fill it with array using first loop
        // we will run second loop in array to check if the previous number of current number is present
        // if present then we will mark current number false and if not then mark it true
        // now run third loop for true marked numbers, we will create list of consecutive elements until consecutive
        // sequence end


        HashMap<Integer, Boolean> hm = new HashMap<>();
        
        for(int val: arr){      // this is first loop here we declared that every element is 
            hm.put(val, true);    //starting point of its sequence
        }

        for(int val: arr){
            if(hm.containsKey(val-1)){      // this is second loop, here we check the previous no. of current no. is 
                hm.put(val, false);  // present or not if present, then it can't become starting point of sequence
            }
        }

        int ml=0;   // length of maximum consecutive sequence
        int msp =0;  // starting point of max consecutive sequence
        for(int val: arr){  // this third loop is for those numbers are marked as true means
            if(hm.get(val)==true){   // they can be starting point of the sequence
                int tl=1;
                int tsp = val;

                while(hm.containsKey(tsp+tl)){     // we will increase the total length of sequence until we get consecutive elements
                    tl++;
                }
                if(tl>ml){
                    msp=tsp;          //here starting point of sequence stores in temporary starting point
                    ml=tl;            // length of maximum sequence stores as temporary length
                }
            }
        }

        for(int i=0;i<ml;i++){    // here we print maximum consecutive sequence till its maximum length;
            System.out.println(msp+i);
        }
    }
}
