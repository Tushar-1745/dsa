import java.io.*;
import java.util.*;
public class coinchangecombination {
    public static void main(String[] args) {
        //have to tell coin's combination
        //ex. arr =  2 3 5  target = 7
        // ans  2 2 3,  2 5  means count=2
        //make array of target+1. in each cell there will be count of combination of that cell no.
        //then will make iteration for each array element
        //there is always one combination to pay 0 thats not to give

        int[] arr = {2,3,5};
        int target=7;

        int[] dp = new int[target+1];
        dp[0]=1;

        for(int i=0;i<arr.length;i++){
            for(int j=arr[i];j<dp.length;j++){
                dp[j] =  dp[j] + dp[j-arr[i]];
            }
        }

        System.out.println(dp[target]);
    }
}
