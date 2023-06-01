import java.io.*;
import java.util.*;
public class addlast {
    public static class Node {
        int data;
        Node next;
    }
    
    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        Node no = new Node();
        void addLast(int val) {
           Node temp = new Node();
           temp.data=val;
           temp.next=null;
           if(size==0){  //this is for the first element in linked list
            head=tail=temp;
           }
           else{
            tail.next=temp;  //here we change the tail of last node
            tail=temp;   //here we declare it as tail
           }
           size++;
        }
    }
    
    public static void testList(LinkedList list) {
        for (Node temp = list.head; temp != null; temp = temp.next) {
          System.out.println(temp.data);
        }
        System.out.println(list.size);
    
        if (list.size > 0) {
          System.out.println(list.tail.data);
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList list = new LinkedList();
    
        String str = br.readLine();
        while (str.equals("quit") == false) {
          if (str.startsWith("addLast")) {
            int val = Integer.parseInt(str.split(" ")[1]);
            list.addLast(val);
          }
          str = br.readLine();
        }
    
        testList(list);
    }
}
