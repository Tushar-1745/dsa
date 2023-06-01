import java.io.*;
import java.util.*;
public class heapsintroductionandusage {
    public static void main(String args[]){
        int[] ranks = {22, 99, 3, 11, 88, 4, 1};  
        
        // heap means priority queue(fifo) usually small value have high priority
        // so heap is used to gives priority but bydefault small value have high priority
        // we cannot control the their sequence in heap
        //it arrange as itself to store priority element at the peek
        // heap can be used to get sorted elements


        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //this is to change the priority to large values
        // // PriorityQueue<Integer> pq = new PriorityQueue<>(); 
        // for(int val: ranks){
        //     pq.add(val);
        // }                                       
        
        // while(pq.size()>0){                  
        //     System.out.println(pq.peek());              
        //     pq.remove();
        // }  
        int k=3;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(29);
        pq.add(50);
        pq.add(60);
        pq.add(88);
        int p=pq.size();
        System.out.println(p);
        while(pq.size()>p-k){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
