import java.io.*;
import java.util.*;
public class isabst {

    // we have to tell if given binary tree is bst
    //bst means each node can have maximum 2 children and left child is small and right child is large
    //immediate left and right are not important we have to figure out that all left nodes of root node are small 
    // and all right nodes are large not only its children but children of children also.
    //to be bst as node nbst =  n.d>=lmax and n.d<=rmin
    // but to be bst as tree tbst = n.d>=lmax and n.d<=rmin and left child and right also must be bst
    //we will run loop in post order. each node will give four things nbst, tbst, min and max
    //parent node require min and max to show isBST

    public static class BSTPair{
        boolean isBST;
        int min;
        int max;
    }

    public static BSTPair isBST(Node node){
        if(node==null){
            BSTPair bp = new BSTPair();      //this is a base case 
            bp.min=Integer.MAX_VALUE;
            bp.max=Integer.MIN_VALUE;
            bp.isBST=true;
            return bp;
        }
        BSTPair lp = isBST(node.left);   //using recursion 
        BSTPair rp = isBST(node.right);

        BSTPair mp = new BSTPair();    // here we have declare main node bstpair
        mp.isBST = lp.isBST && rp.isBST &&(node.data>=lp.max && node.data<=rp.min);//here its tells that it is treebst

        mp.min=Math.min(node.data, Math.min(lp.min, rp.min));  // its min and max are important 
        mp.max=Math.max(node.data, Math.max(lp.max, rp.max));

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

    public static int height(Node node) {
        if (node == null) {
        return -1;
        }

        int lh = height(node.left);
        int rh = height(node.right);

        int th = Math.max(lh, rh) + 1;
        return th;
    }

//   public static class BSTPair {
//     int min;
//     int max;
//     boolean isBST;
//   }

//   public static BSTPair isBST(Node node) {
//     if (node == null) {
//       BSTPair bp = new BSTPair();
//       bp.min = Integer.MAX_VALUE;
//       bp.max = Integer.MIN_VALUE;
//       bp.isBST = true;
//       return bp;
//     }

//     BSTPair lp = isBST(node.left);
//     BSTPair rp = isBST(node.right);

//     BSTPair mp = new BSTPair();
//     mp.min = Math.min(node.data, Math.min(lp.min, rp.min));
//     mp.max = Math.max(node.data, Math.max(lp.max, rp.max));
//     mp.isBST = lp.isBST && rp.isBST && node.data >= lp.max && node.data <= rp.min;

//     return mp;
//   }


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
        BSTPair p = isBST(root);
        System.out.println(p.isBST);
    }

}