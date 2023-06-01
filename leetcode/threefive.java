import java.io.*;
import java.util.*;
public class kit {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int tar=5;

        int low=0;
        int high = nums.length-1;
        

        while(low<=high){
            int mid=(low+high)/2;

            if(tar>nums[mid]){
                low=mid+1;
            }
            else if(tar<nums[mid]){
                high=mid-1;
            }
            else{
                System.out.println(mid);
                return;
            }
        }

        System.out.println(low);
       
    }
}
