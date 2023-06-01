import java.io.*;
import java.util.*;
public class heap{
        // heap means priority queue(fifo) usually small value have high priority
        // so heap is used to gives priority but bydefault small value have high priority
        // we cannot control the their sequence in heap
        //it arrange as itself to store priority element at the peek
        // heap can be used to get sorted elements
        //functions same as queue


        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //this is to change the priority to large values
        // PriorityQueue<Integer> pq = new PriorityQueue<>(); 
        for(int val: ranks){
            pq.add(val);
        }                                       
        
        while(pq.size()>0){                  
            System.out.println(pq.peek());              
            pq.remove();
        }  
}