import java.io.*;
import java.util.*;
public class removeduplicatesfromsortedarray {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
        // int ans = removeDuplicates(nums);
        // System.out.println(ans);
    }
    public static void removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        
        System.out.println(set);

        Integer[] ans = new Integer[set.size()];
        set.toArray(ans);

        for(int val: ans){
            System.out.println(val);
        }

        int[] res = new int[set.size()];
        for(int i=0;i<ans.length;i++){
            res[i]=ans[i];
        }

        for(int val: res){
            System.out.println(val);
        }
        
    }
}
