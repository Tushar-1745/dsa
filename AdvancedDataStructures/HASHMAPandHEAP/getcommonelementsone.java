import java.io.*;
import java.util.*;
public class getcommonelementsone {
    public static void main(String args[]){       
        Scanner scn = new Scanner(System.in);

        System.out.print("enter the n1: ");
        int n1=scn.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<n1;i++){
            System.out.print("enter the elements: ");
            arr1[i]=scn.nextInt();
        }

        // in this program we will get two arrays we have to give the common elements of the arrays
        // we will create the hashmap of integer and integer to store the integer and its frequency of 1st array
        // then we will run the loop in second array if val in second array is present in first array
        // then we will print it and then remove it from hashmap
        System.out.print("enter the n2: ");
        int n2=scn.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0;i<n2;i++){
            System.out.print("enter the elements: ");
            arr2[i]=scn.nextInt();
        }

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int val: arr1){       // here we run loop in first array to store the integer and its frequency
            if(hm.containsKey(val)){
                int of = hm.get(val);
                int nf = of + 1;
                hm.put(val, nf);
            }
            else{
                hm.put(val,1);
            }
        }

        for(int val: arr2){         // here we have just verified that val of second array is present in hashmap
            if(hm.containsKey(val)){     // if present then print it and remove it from the 
                System.out.println(val);
                hm.remove(val);
            }
        }
    }
    
}
