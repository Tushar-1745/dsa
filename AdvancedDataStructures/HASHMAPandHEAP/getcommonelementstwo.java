import java.io.*;
import java.util.*;
public class getcommonelementstwo {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the n1: ");
        int n1=scn.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<n1;i++){
            System.out.print("enter the elements: ");
            arr1[i]=scn.nextInt();
        }  

        // this program is almost same as previous one
        // here we have to print the same elements as number of their similarity instead of just once and removing them
        // so in arr2 instead of removing val after printing we will reduce its frequency 
        // here value of element doesn't matter
        System.out.print("enter the n2: ");
        int n2=scn.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0;i<n2;i++){
            System.out.print("enter the elements: ");
            arr2[i]=scn.nextInt();
        }

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int val: arr1){       
            if(hm.containsKey(val)){
                int of = hm.get(val);
                int nf = of + 1;
                hm.put(val, nf);
            }
            else{
                hm.put(val,1);
            }
        }

        for(int val: arr2){        
            if(hm.containsKey(val) && hm.get(val)>0){     
                System.out.println(val);
                int of = hm.get(val);
                int nf = of - 1;
                hm.put(val, nf);
            }
        }
    }
}
