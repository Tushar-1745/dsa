import java.io.*;

import java.util.*;

public class displaylinkedlist{
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } 
            else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int size() {
            return size;
        }

        public void display() {
           Node temp=head;  //here we declare new variable temp and took head into it
           while(temp!=null){  //now until it becomes null means till data ends we run loop
            System.out.print(temp.data+" "); //print the data 
            temp=temp.next;  //move the temp to next data 
           }
           System.out.println();
        }
        public void removeFirst(){
            if(size()==0){
                System.out.println("list is empty");
            }
            else if(size==1){ //if there is only one node means there will no head and tail for 
                //linked list after removing and size will be zero
                head=tail=null;
                size=0;
            }
            else{
                //if there are more than one node
                //for removing first node, in linked list template change the header of first node to the 
                // header of second node and decrease the size
                head=head.next;
                size--;
                
            }
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
            else if (str.startsWith("size")) {
                System.out.println(list.size());
            } 
            else if (str.startsWith("display")) {
                list.display();
            }
            str = br.readLine();
        }
    }
}
