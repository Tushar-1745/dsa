import java.io.*;
import java.util.*;
public class mergeoverlapingintervals {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }
        mergeOverlappingIntervals(arr);
    }
    //ex. 22 28, 1 8, 25 27, 14 19, 27 30, 5 12
    // ans 1 12, 14 19, 22 30
    //we will need Pair class
    // first sort the array on starting integer.  //1 8, 5 12, 14 19, and so on
    //make stack and push first ele. now if startin time of second is less than first's 
    //end then merge them (end of second will now be end of first)
    //else push it into stack
    public static void mergeOverlappingIntervals(int[][] arr) {
        Pair[] pairs = new Pair[arr.length];
        for(int i=0;i<arr.length;i++){
            pairs[i]=new Pair(arr[i][0], arr[i][1]);
        }

        Arrays.sort(pairs);

        Stack<Pair> st = new Stack<>();
        for(int i=0;i<pairs.length;i++){
            if(i==0){
                st.push(pairs[i]);
            }
            else{
                Pair top = st.peek();
                if(pairs[i].st<top.et){
                    top.et=Math.max(top.et, pairs[i].et);
                }
                else{
                    st.push(pairs[i]);
                }
            }
        }
        Stack<Pair> ans = new Stack<>();
        while(st.size()>0){
            ans.push(st.pop());
        }
        while(ans.size()>0){
            Pair p = ans.pop();
            System.out.println(p.st+" "+p.et);
        }
    }

    public static class Pair implements Comparable<Pair>{
        int st;
        int et;

        Pair(int st, int et){
            this.st=st;
            this.et=et;
        }

        public int compareTo(Pair other){
            if(this.st!=other.st){
                return this.st-other.st;
            }
            else{
                return this.et-other.et;
            }
        }
    }

}