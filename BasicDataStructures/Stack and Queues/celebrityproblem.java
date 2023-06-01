import java.io.*;

import java.util.*;

import javax.swing.Popup;

public class celebrityproblem {
    
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);
    }

    public static void findCelebrity(int[][] arr) {
        //celebrity is the person who doesn't know anyone but everyone knows him
        //can't be two celebrity
        //suppose 2 is celebrity then in row no. 2 there will be only 0's and 
        // in column no. 2 there will be only 1's
        //make stack push 0,1,2,3
        //pop 2 and 3, now if 3 knows 2 then 3 can't be celebrity so 2 is pushed in stack again
        //now if 1 knows 2, 1 cannot be celebrity and so on
        //now st.peek() is a potential celebrity
        //so check the row and columnof st.peek() no. if he knows no one and everyone knows it
        // then it is definitely celebrity

        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            st.push(i);
        }

        while(st.size()>=2){
            int i=st.pop();
            int j=st.pop();

            if(arr[i][j]==1){
                // if i knows j  -> i is not celebrity
                st.push(j);
            }
            else{
                // if i doesn't know j  -> j is not celebrity
                st.push(i);
            }
        }

        //here we get potential celebrity.
        int pot=st.pop();

        //now check its row and column

        for(int i=0;i<arr.length;i++){
            if(i!=pot){
                //if any i doesn't know pot or pot know any i so pot can't be celebrity
                if(arr[i][pot]==0||arr[pot][i]==1){
                    System.out.println("none");
                }
            }
        }

        System.out.println(pot);


    }

}
