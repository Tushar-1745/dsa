import java.io.*;
import java.util.*;
public class printnodesKdistanceaway {
    //in this program we have to find the nodes which are 'K' nodes 
    //away from any given node (not from the root node)
    // we have to use last programs prinKleveldown and nodetorootpath
    //using nodetorootpath fun. we will get path of given node
    //suppose we get path 9-e-b-a-10 and we are given k=3;
    //now for each node got by nodetorootpath i.e. for 9  printKleveldown(9,3); 
    //for e printKleveldown(e,2);
    //for b printKleveldown(b,1);
    //for a printKleveldown(a,0);
    // here 9,e,b,a are path.get(i) and 3,2,1,0 are k-i; remember most important
    //but one problem arises for e there's 9, for b there's e and for a there's b 
    //these 9,e,b are not supposed to be print
    // to block these elements we will introduce blocker in printKlevelsdown function
    // for i=0 there is no problem but for onwards every i (i-1) acts as blocker
    // so in printKNodesFar fun we will pass i-1 as blocker

    
    public static void printKNodesFar(Node node, int data, int k) {
        path = new ArrayList<>();
        find(node, data);
        for(int i=0;i<path.size();i++){
            printKLevelsDown(path.get(i),k-i, i==0? null:path.get(i-1));
        }
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
    
    static ArrayList< Node> path;
    public static boolean find(Node node, int data) {
        if (node == null)
          return false;
        if (node.data == data) {
          path.add(node);
          return true;
        }
        boolean filc = find(node.left, data);
        if (filc) {
          path.add(node);
          return true;
        }
        boolean firc = find(node.right, data);
        if (firc) {
          path.add(node);
          return true;
        }
        return false;
    }
      //****************PRINT K LEVELS DOWN****************
    public static void printKLevelsDown(Node node, int k, Node blocker) {
        if (node == null || k < 0 || node == blocker)
          return;
        if (k == 0)
          System.out.println(node.data);
        printKLevelsDown(node.left, k - 1, blocker);
        printKLevelsDown(node.right, k - 1, blocker);
    
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
        int data = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        Node root = construct(arr);
        printKNodesFar(root, data, k);
    }
}
