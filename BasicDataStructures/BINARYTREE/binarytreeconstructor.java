import java.io.*;
import java.util.*;
public class binarytreeconstructor {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }

    //to construct the binary tree we wil get the Integer arr of its element in preorder.
    // In Integer array, we can put null which has no value or it does not take place unlike in int array 0 has value and it take place
    // here we will use stack(LIFO) to push the pair of node and state; thats why we need to create pair class.
    // if top.state is 1 then add left child if 2 then right child if 3 pop it as it has got its left and right child
    public static class Pair{
        Node node;
        int state;

        Pair(Node node, int state){
            this.node=node;
            this.state=state;
        }
    }

    public static void main(String args[]){
        Integer[] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};

        Node rt = new Node(arr[0],null,null);
        Pair rtp = new Pair(rt,1);

        Stack<Pair> st = new Stack<>();

        st.push(rtp);

        int idx=0;

        while(st.size()>0){
            Pair top =st.peek();

            idx++;
            if(top.state==1){
                if(arr[idx]!=null){
                    top.node.left=new Node(arr[idx],null,null);
                    Pair lp=new Pair(top.node.left, 1);

                    st.push(lp);
                }
                else{
                    top.node.left=null;
                }
                top.state++;
            }
            else if(top.state==2){
                if(arr[idx]!=null){
                    top.node.right=new Node(arr[idx],null,null);
                    Pair rp=new Pair(top.node.right, 1);

                    st.push(rp);
                }
                else{
                    top.node.right=null;
                }
                top.state++;
            }
            else{
                st.pop();
            }
        }
    }
}
