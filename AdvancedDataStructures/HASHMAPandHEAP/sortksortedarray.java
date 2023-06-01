import java.io.*;
import java.util.*;
public class sortksortedarray{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        // in this program we will be given k sorted array means if k=2 unsorted element will be 2 no. away from its
        // original position either left or right
        //ex. 2 3 1 4 6 7 5 8 9    here 1 and 5 are 2 no. away from their usual position
        // we have to sort it again
        // declaring priority queue we will first add k+1 element in it
        // now from k+1 element the prioritized element i.e. less value will be at peek
        // we will remove it and print it and take the next element in prority queue.

        System.out.print("enter the n: ");
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the element: ");
            arr[i]=scn.nextInt();
        }

        System.out.print("enter the k: ");
        int k=scn.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0;i<=k;i++){      // here we taken k+1 element in the pq
            pq.add(arr[i]);
        }

        for(int i=k+1;i<arr.length;i++){   //now from next k+1 element we will remove less value element and  
            System.out.println(pq.remove()); // add next element from array.
            pq.add(arr[i]);
        }

        while(pq.size()>0){
            System.out.println(pq.remove());
        }
    }
}