import java.io.*;
import java.util.*;
public class goldmine{

    //path with minimum  gold
    //we will have 2d array. In each cell there will be certain amount of 
    //we will go from left column to right column. only one step is limited 
    //        $
    //      /
    //     $ ---$
    //      \
    //        $
    //small problem is on right side so direction will be from last column to first column
    //gold in second last will be the max of (above three cells) + its own gold
    //at the end give the max of first column

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int m =scn.nextInt();

        int[][] array = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j]=scn.nextInt();
            }
        }

        int[][] dp = new int[n][m];

        for(int j=dp[0].length-1;j>=0;j--){
            for(int i=dp[0].length-1;i>=0;i--){

                if(j==dp[0].length-1){
                    dp[i][j]=array[i][j];
                }
                else if(i==0){
                    dp[i][j]=array[i][j]+Math.max(dp[i+1][j+1], dp[i][j+1]);
                }
                else if(i==dp.length-1){
                    dp[i][j]=array[i][j]+Math.max(dp[i-1][j+1], dp[i][j+1]);
                }
                else{
                    dp[i][j]=array[i][j]+Math.max(dp[i][j+1], Math.max(dp[i-1][j+1],dp[i+1][j+1]));
                }
            }
        }

        //we have to give the max of first colum so vary the first column
        int max = dp[0][0];
        for(int i=0;i<dp.length;i++){
            if(dp[i][0]>max){
                max=dp[i][0];
            }
        }
        System.out.println(max);
    }
}