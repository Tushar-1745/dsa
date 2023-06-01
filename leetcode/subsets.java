import java.io.*;
import java.util.*;
public class subsets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // System.out.print("enter the n: ");
        // int n = scn.nextInt();

        // int[] arr = new int[n];
        // for(int i=0;i<n;i++){
        //     System.out.print("enter the element: ");
        //     arr[i]=scn.nextInt();
        // }
        int[] arr={1,2,3};
        subsets(arr);

    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> alist = new ArrayList<>();
        int limit=(int)Math.pow(2, nums.length);

        for(int i=0;i<limit;i++){
            ArrayList<Integer> al = new ArrayList<>();
            int temp=i;
            for(int j=nums.length-1;j>=0;j--){
                int r=temp%2;
                temp=temp/2;

                if(r!=0){
                    al.add(nums[j]);
                }
            }
            alist.add(al);
        }

        return alist;
        for(int i=0;i<)
    }
}
