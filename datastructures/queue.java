import java.io.*;
import java.util.*;
public class queue {
    public static void main(String[] args) {
         //queue is first in first out
        //add, remove, peek functions

        Queue<Integer> que = new ArrayDeque<>();

        
        que.add(10);
        que.add(20);
        que.add(30);

        System.out.println(que.contains(40));

        System.out.println(que.remove());
        System.out.println(que.peek());

        Queue<Integer> re = new ArrayDeque<>();

        re.addAll(que);
        System.out.println(re);
    }
}
