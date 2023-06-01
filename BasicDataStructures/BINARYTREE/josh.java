import java.io.*;
import java.util.*;

public class josh {
    public static void main(String[] args) {
        int[] arr = {-7, -5, -2, 0, 1};

        int idx = 0;
        while(idx!=arr.length-1){
            arr[idx]=arr[idx]*arr[idx];
            idx++;
        }
        System.out.println(Arrays.toString(arr));



        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }

        int[] yog = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            yog[i]=pq.peek();
            pq.remove();
        }

        for(int temp: yog){
            System.out.println(temp);
        }
    }
}
