import java.io.*;
import java.util.*;

public class heap {
    public static void main(String[] args) {
        // heap means priority queue(fifo) usually small value have high priority
        // so heap is used to gives priority but bydefault small value have high priority
        // we cannot control the their sequence in heap
        //it arrange as itself to store priority element at the peek
        // heap can be used to get sorted elements
        //functions = 1) add 2)remove 3)peek  4)size
        //Collections.reverseorder()  to make high value priority

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(49);
        
        System.out.println(pq.size());

        System.out.println(pq.peek());
        System.out.println(pq.remove());

        // while(pq.size()>0){
        //     System.out.println(pq.remove());
        // }

        
    }
}
