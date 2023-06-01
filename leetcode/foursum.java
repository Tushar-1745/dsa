
import java.io.*;
import java.util.*;
public class foursum {
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int  target = 0;
        List<List<Integer>> ans = four(nums, target);
        System.out.println(ans);
    }
    public static List<List<Integer>> four(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0;i<nums.length-4;i++){
            for(int j=i+1;j<nums.length-3;j++){

                int l=j+1;
                int h=nums.length-1;

                while(l<h){
                    int sum=nums[i]+nums[j]+nums[l]+nums[h];

                    if(sum==target){
                        List<Integer> st = new ArrayList<>();
                        st.add(nums[i]);
                        st.add(nums[j]);
                        st.add(nums[l]);
                        st.add(nums[h]);

                        set.add(st);
                    }
                    else if(sum>target){
                        h--;
                    }
                    else{
                        l++;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
