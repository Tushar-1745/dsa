import java.io.*;
import java.util.*;
public class kkkk {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int m= scn.nextInt();

        int[][] array = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j]=scn.nextInt();
            }
        }

        int[][] dp = new int[n][m];

        for(int i=dp.length-1;i>=0;i--){
            for(int j=dp.length-1;j>=0;j--){
                if(i==dp.length-1 && j==dp[0].length-1){
                    dp[i][j]=array[i][j];
                }
                else if(i==dp.length-1){
                    dp[i][j]=array[i][j]+dp[i][j+1];
                }
                else if(j==dp[0].length-1){
                    dp[i][j]=array[i][j]+dp[i+1][j];
                }
                else{
                    dp[i][j]=array[i][j]+Math.min(dp[i+1][j], dp[i][j+1]);
                }
            }
        }
        System.out.println(dp[1][0]);
    }
}
