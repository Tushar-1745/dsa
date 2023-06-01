import java.util.Arrays;

public class threesumclosest {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4}; 
        int target = 1;
        // Output: 2
        int ans = sumclosest(nums, target);
        System.out.println(ans);
    }
    public static int sumclosest(int[] nums, int target){
        Arrays.sort(nums);
        int currsum = 0;
        int closestsum=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){

            int l=i+1;
            int h=nums.length-1;

            while(l<h){
                currsum = nums[i]+nums[l]+nums[h];
                if(currsum==target){
                    return  currsum;
                }
                else if(Math.abs(target-currsum)<Math.abs(target-closestsum)){
                    closestsum=currsum;
                }
                if(currsum<=target){
                    l++;

                    while(nums[l]==nums[l-1]&&l<h){
                        l++;
                    }
                }
                else{
                    h--;
                }
            }
        }
        return closestsum;
    }
}
