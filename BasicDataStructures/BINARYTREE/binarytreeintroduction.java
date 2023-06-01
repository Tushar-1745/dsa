import java.io.*;
import java.util.*;
public class binarytreeintroduction{
    public static class Node{            
        int data;
        Node left;                          // in binary tree, each node can have maximum 2 children
        Node right;                        // no require to have small on left and large on right child

        Node(int data, Node left, Node right){    // it consists of node 
            this.data=data;                        // it has data, left node and right node.
            this.left=left;
            this.right=right;
        }
    }
}