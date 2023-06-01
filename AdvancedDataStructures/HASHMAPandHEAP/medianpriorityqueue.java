import java.io.*;
import java.util.*;

public class medianpriorityqueue {
    // in this program we have to give median of the list element
    // in even no. of elements median middle of left side ex. 10 20 30 40 here
    // median is 20
    // we will declare two priority queues
    // left for smaller half of data. but it will be of max priority queue as it
    // will give max of smaller part
    // right pq will be for larger half data but it will be min priorityque as it
    // will give min of larger part
    // max gap between two pq size must be 1 not greater or lesser than one
    // median will be peek of the pq whose size is greater than others if size is
    // same then peek of left pq will be median
    // we will send element in second pq peek of second pq is less than current
    // element
    // balancing factor = if left pq has two elements more than right pq then
    // element from left will be removed
    // it will be added into right pq and vice versa
    public static class MedianPriorityQueue {
        PriorityQueue<Integer> left;
        PriorityQueue<Integer> right;

        public MedianPriorityQueue() {
            left = new PriorityQueue<>(Collections.reverseOrder());
            right = new PriorityQueue<>();
        }

        public void add(int val) {
            if (right.size() > 0 && right.peek() < val) {
                right.add(val);
            } else {
                left.add(val);
            }
            handleBalance();
        }

        private void handleBalance() {
            if (left.size() - right.size() == 2) {
                right.add(left.remove());
            } else if (right.size() - left.size() == 2) {
                left.add(right.remove());
            }
        }

        public int remove() {
            if (this.size() == 0) {
                System.out.println("underflow");
                return -1;
            } else if (left.size() >= right.size()) {
                return left.remove();
            } else {
                return right.remove();
            }

        }

        public int peek() {
            if (this.size() == 0) {
                System.out.println("underflow");
                return -1;
            } else if (left.size() >= right.size()) {
                return left.peek();
            } else {
                return right.peek();
            }

        }

        public int size() {
            return left.size() + right.size();
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MedianPriorityQueue qu = new MedianPriorityQueue();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("add")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if (str.startsWith("remove")) {
                int val = qu.remove();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("peek")) {
                int val = qu.peek();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(qu.size());
            }
            str = br.readLine();
        }
    }
}
