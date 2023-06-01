import java.io.*;
import java.util.*;
public class coinchangepermutation {
    public static void main(String[] args) {
        //ex. arr  = 2 3 5 6 target = 10
        //ans 25, 52, 223, 232, 322

        int[] arr={2,3,5,6};
        int target=10;

        int[] dp = new int[target+1];
        dp[0]=1;

        for(int i=1;i<dp.length;i++ ){
            for(int j=0;j<arr.length;j++){
                if(i>=arr[j]){
                    dp[i]=dp[i]+dp[i-arr[j]];
                }
            }
        }

        System.out.println(dp[target]);
    }
}
