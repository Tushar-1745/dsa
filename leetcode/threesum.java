import java.io.*;
import java.util.*;

public class threesum {
    public static void main(String[] args) {
        int[] nums = {-1,0, 1,2,-1,-4};
        List<List<Integer>> ans = three(nums);
        System.out.println(ans);
        // Output: [[-1,-1,2],[-1,0,1]]

    }
    public static List<List<Integer>> three(int[] nums) {

        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet();

        for(int i=0;i<nums.length;i++){
            int l= i+1;
            int h=nums.length-1;

            while(l<h){
                int sum=nums[i]+nums[l]+nums[h];

                if(sum==0){
                    ArrayList<Integer> st = new ArrayList<>();
                    st.add(nums[i]);
                    st.add(nums[l]);
                    st.add(nums[h]);

                    set.add(st);
                    l++;
                }
                if(sum<0){
                    l++;
                }
                else{
                    h--;
                }
            }
            
        }
        return new ArrayList<>(set);
    }
}
