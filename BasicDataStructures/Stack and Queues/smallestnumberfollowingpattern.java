import java.io.*;
import java.util.*;
public class smallestnumberfollowingpattern {
    // d=decrease i=increase
    // ex. 1 5 4 3 2 9 8 7 6
    // i d d d i d d d
    // split at every i
    // fill from last
    // make stack and push 1 if d comes 2 again d comes push 3
    // now if i comes pop 3,2,1 and push 4 and again if d comes push 5 and so on
    public static void main(String[] args) {
        String str = "ddddiiii";

        Stack<Integer> st = new Stack<>();
        int num=1;

        for(int i=0;i<str.length();i++){
          char ch = str.charAt(i);

          //till we get d add num and increase 
          if(ch=='d'){
            st.push(num);
            num++;
          }
          else{  //if i comes add num and increase it
            st.push(num);
            num++;
            //and also print stack's element and clear it
            while(st.size()>0){
              System.out.print(st.pop());
            }
          }
        }

        st.push(num);
        while(st.size()>0){
          System.out.print(st.pop());
        }
    } 
}
