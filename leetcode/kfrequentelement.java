import java.io.*;
import java.util.*;
public class kfrequentelement {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] ans = topKFrequent(nums, k);
        print(ans);
    }
    public static int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int of = hm.get(nums[i]);
                int nf=of+1;
                hm.put(nums[i], nf);
            }
            else{
                hm.put(nums[i], 1);
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(nums[0]);
 
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){

                while(pq.size()!=k){
                    pq.add(nums[i]);
                }

                if(hm.get(nums[i])>hm.get(pq.peek())){
                    pq.remove();
                    pq.add(nums[i]);
                }
            }
        }
        
        int[] ans = new int[k];   
        for(int i=0;i<ans.length;i++){
            ans[i]=pq.peek();
            pq.remove();
        }     
        return ans;
    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
