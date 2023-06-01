import java.io.*;
import java.util.*;
public class kreverseinlinkedlist {
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
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        public int size() {
            return size;
        }

        public void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }

        public void removeFirst() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }

        public int getFirst() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return head.data;
            }
        }

        public int getLast() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return tail.data;
            }
        }

        public int getAt(int idx) {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else if (idx < 0 || idx >= size) {
                System.out.println("Invalid arguments");
                return -1;
            } else {
                Node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                return temp.data;
            }
        }

        public void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;

            if (size == 0) {
                tail = temp;
            }

            size++;
        }

        public void addAt(int idx, int val) {
            if (idx < 0 || idx > size) {
                System.out.println("Invalid arguments");
            } else if (idx == 0) {
                addFirst(val);
            } else if (idx == size) {
                addLast(val);
            } else {
                Node node = new Node();
                node.data = val;

                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                node.next = temp.next;

                temp.next = node;
                size++;
            }
        }

        public void removeLast() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                Node temp = head;
                for (int i = 0; i < size - 2; i++) {
                    temp = temp.next;
                }

                tail = temp;
                tail.next = null;
                size--;
            }
        }

        public void removeAt(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid arguments");
            } else if (idx == 0) {
                removeFirst();
            } else if (idx == size - 1) {
                removeLast();
            } else {
                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }

                temp.next = temp.next.next;
                size--;
            }
        }

        private Node getNodeAt(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp;
        }
        //we have to following in program
        //example 1 2 3 4 5 6 7 8 9 10 11  if k=3
        //answer  3 2 1 6 5 4 9 8 7 10 11

        //create two lists prev and curr
        //take first k(3) elements as addFirst in order means 1 2 3 will be added as 3 2 1 in curr list
        //now make curr list as prev and denote head, tail and size of prev linked list
        //now again take next three elements in addFirst order 
        //again add these curr list element in prev 
        //now list prev list will be 3 2 1 6 5 4 point head as prev's head and prev.tail.next to curr.head and increase size of prev
        //
        public void kReverse(int k) {
            LinkedList prev = null;
            while(this.size()>0){ 
                LinkedList curr = new LinkedList();

                if(this.size()>=k){   //this is for elements if input list size is greater than k
                    for(int i=0;i<k;i++ ){  //take first k elements
                        int val=this.getFirst();
                        this.removeFirst();
                        curr.addFirst(val); //addFirst because we have to add in reverse order
                    }
                }
                else{   //this is for remaining elements if size is input list is less than k
                    int sz = this.size();
                    for(int i=0;i<sz;i++){  //take remained less than k elements
                        int val = this.getFirst();
                        this.removeFirst();
                        curr.addLast(val);  //addLast because remaining elements are to be stored in same order 
                    }
                }
                if(prev!=null){
                    prev.tail.next=curr.head;  //pointed 
                    prev.tail=curr.tail;
                    prev.size += curr.size;
                }
                else{
                    prev=curr;
                }
            }
            this.head=prev.head;
            this.tail=prev.tail;
            this.size=prev.size;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br.readLine());
        LinkedList l1 = new LinkedList();
        String[] values1 = br.readLine().split(" ");
        for (int i = 0; i < n1; i++) {
            int d = Integer.parseInt(values1[i]);
            l1.addLast(d);
        }

        int k = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        l1.display();
        l1.kReverse(k);
        l1.display();
        l1.addFirst(a);
        l1.addLast(b);
        l1.display();
    }
}
