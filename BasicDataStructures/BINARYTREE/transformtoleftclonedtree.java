import java.io.*;
import java.util.*;
public class transformtoleftclonedtree {

//in this program we have to create left clone means between every node and its left child we have add the node itself
  //        a                        a
  //    b       c   ====           a         c
  //  d  e    f   g              b         c      d
  //                           b   e     f      g
  //                         d   e     f
  //                       d

  //we will do it with recursion

    public static Node createLeftCloneTree(Node node) {
        if(node==null){
            return null;
        }
        Node lcr = createLeftCloneTree(node.left);     //here we get  left cloned tree
        Node rcr = createLeftCloneTree(node.right);    //here we get right cloned tree
        //here lcr and rcr are the roots of left side cloned tree ans and right side ans cloned tree
        // now we will add rcr to root node as it is as we don't have to create right clone

        node.right = rcr;   //we have add the right cloned tree to right child of root node

        //but for left child we have to create the new node which is same as root node.
        // and its left child will be new left cloned tree i.e. lcr
        // and that new node will be the left child of root node

        Node NN = new Node(node.data, lcr, null);
        node.left=NN;

        return node;
    }
    public static class Node {
        int data;
        Node left;
        Node right;
    
        Node(int data, Node left, Node right) {
          this.data = data;
          this.left = left;
          this.right = right;
        }
      }
    
      public static class Pair {
        Node node;
        int state;
    
        Pair(Node node, int state) {
          this.node = node;
          this.state = state;
        }
      }
    
      public static Node construct(Integer[] arr) {
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);
    
        Stack< Pair> st = new Stack< >();
        st.push(rtp);
    
        int idx = 0;
        while (st.size() > 0) {
          Pair top = st.peek();
          if (top.state == 1) {
            idx++;
            if (arr[idx] != null) {
              top.node.left = new Node(arr[idx], null, null);
              Pair lp = new Pair(top.node.left, 1);
              st.push(lp);
            } else {
              top.node.left = null;
            }
    
            top.state++;
          } else if (top.state == 2) {
            idx++;
            if (arr[idx] != null) {
              top.node.right = new Node(arr[idx], null, null);
              Pair rp = new Pair(top.node.right, 1);
              st.push(rp);
            } else {
              top.node.right = null;
            }
    
            top.state++;
          } else {
            st.pop();
          }
        }
    
        return root;
      }
    
      public static void display(Node node) {
        if (node == null) {
          return;
        }
    
        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);
    
        display(node.left);
        display(node.right);
      }  
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
          if (values[i].equals("n") == false) {
            arr[i] = Integer.parseInt(values[i]);
          } else {
            arr[i] = null;
          }
        }
    
        Node root = construct(arr);
        root = createLeftCloneTree(root);
        display(root);
    }
    
}
