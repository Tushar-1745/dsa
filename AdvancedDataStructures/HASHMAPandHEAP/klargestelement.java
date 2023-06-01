import java.io.*;
import java.util.*;
public class klargestelement {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the n: ");   
        int n=scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the elements: ");
            arr[i]=scn.nextInt();
        }

        //in this program we have to give k largest elements in array if k=3 means 3 largest elements
        // we will use priority queue
        // we run the loop in array and take first k elements from array in priorityqueue as requirement
        // but to get next elements, we need to check if it is greater than pq.peek() element
        // if it is greater then we add in pq
        
        System.out.print("enter the k: ");
        int k=scn.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<n;i++){      // these  k elements as requirement
            if(i<k){
                pq.add(arr[i]);
            }
            else{
                if(arr[i]>pq.peek()){    // now on we will check if elements is greater than pq.peek();
                    pq.remove();   // if it is greater then we remove pq.peek() element 
                    pq.add(arr[i]);  // and replace it with new arr[i]
                }
            }
        }
        while(pq.size()>0){
            System.out.println(pq.peek());     //here we print k largest element
            pq.remove();
        }
    }
}
