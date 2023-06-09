import java.io.*;
import java.util.*;
public class diameterofbinarytree {

    //diameter is maximum edges betweem two farthest nodes
    // 1) lh+rh+2 = maximum distance between left's deepest and right's deepest
    //2) left diameter ld = maximum distance between two nodes on lhs
    // 3) right diameter rd = maximum distance between two nodes on rhs
    // get answers of these three functions and then compare the answers of  three functions

  // public static int diameter1(Node node){

  //   if(node==null){
  //     return 0;
  //   }
  //   int ld = diameter1(node.left);
  //   int rd = diameter1(node.right);
  //   int h= height(node.left)+height(node.right)+2;

  //   int dia = Mat.max(h, Math.max(ld, rd));
  //   return dia;
  // }
    

    static class Dpair{
      int ht;
      int dia;
    }

    public static Dpair diameter1(Node node){
      if(node==null){
        Dpair bp = new Dpair();
        bp.ht=-1;
        bp.dia=0;
        return bp;
      }

      Dpair lp = diameter1(node.left);
      Dpair rp = diameter1(node.right);

      Dpair mp = new Dpair();

      mp.ht = Math.max(lp.ht, rp.ht)+1;

      int h = lp.ht+rp.ht+2;

      mp.dia=Math.max(h, Math.max(lp.dia, rp.dia));
      return mp;
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

    public static int height(Node node) {
      if (node == null) {
        return -1;
      }

      int lh = height(node.left);
      int rh = height(node.right);

      int th = Math.max(lh, rh) + 1;
      return th;
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

      Dpair result = diameter1(root);
      System.out.println(result.dia);
    }

}
