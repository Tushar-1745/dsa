import java.util.ArrayDeque;
import java.util.Queue;

public class queueintroduction {
    public static void main(String[] args) {
        //queue is first in first out
        //add, remove, peek functions
        //

        Queue<Integer> que = new ArrayDeque<>();

        que.add(10);
        que.add(20);
        que.add(30);
        System.out.println(que);

        System.out.println(que.remove());
        System.out.println(que.peek());
    }
}
