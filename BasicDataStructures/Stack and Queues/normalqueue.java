import java.io.*;

import java.util.*;

public class normalqueue {

  public static class CustomQueue {
    int[] data;
    int front;
    int size;

    public CustomQueue(int cap) {
      //we have to custome a queue of given array
      //use two variables front and size
      data = new int[cap];
      front=0;
      size=0;
    }

    int size() {
      return size;
    }

    void display() {

      for(int i=0;i<size;i++){
        int idx= (front+i)%data.length;
        System.out.print(data[idx]+" ");
      }
      System.out.println();
    }


    void add(int val) {

      if (size == data.length) { //if queue is already full
        System.out.println("Queue overflow");
      }
      else
      {
        //we have to add element in queue at rear position 
        //rear = front+size;
        int rear = (front+size)%data.length;
        data[rear]=val;
        size++;
      }
    }

    int remove() {

      if (size == 0) { //if queue is already empty
        System.out.println("Queue underflow");
        return -1;
      } else {
        int val = data[front];
        front = (front+1)%data.length;
        size--;
        return val;
      }
    }

    int peek() {

      if (size == 0) { //if queue is empty
        System.out.println("Queue underflow");
        return -1;
      } else {
        return data[front];
      }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    CustomQueue qu = new CustomQueue(n);

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
      } else if (str.startsWith("display")) {
        qu.display();
      }
      str = br.readLine();
    }
  }
}