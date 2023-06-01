import java.io.*;
import java.util.*;
public class permutations {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = permute(nums);
        System.out.println(ans);
    }
    public static List<List<Integer>> permute(int[] nums) {

        int n=nums.length;
        int f= factorial(n);
        System.out.println(f);

        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<f;i++){

            List<Integer> st = Arrays.asList(nums);

            int temp=i;

            for(int j=n;j>=1;j--){

                // int q= temp/div;
                // int r= temp%div;
                // System.out.print(sb.charAt(r)); //char at 0th position will be print
                // sb.deleteCharAt(r);
                // temp=q;
                int q = temp/j;
                int r= temp%j;

                st.add([r]);
                st.remove(r);
                temp=q;
            }

            ans.add(st);
        }
        return ans;
    }

    public static int factorial(int n){
        int val=1;
        for(int i=2;i<=n;i++){
            val*=i;
        }
        return val;
    }
}
