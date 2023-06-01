import java.io.*;
import java.util.*;

import javax.swing.text.AbstractDocument.LeafElement;
public class targetsumsubsets {
    public static void main(String[] args) {
        //will be given array and one target
        // have to tell how many subsets are there whose sum is 10
        //make 2d boolean array of column size of target+1 and row of array.length+1
        //in each cell,we put true or false if there is any subset who can make the sum of column till the arr ele
        //empty array has one subset

        int[] arr ={4,2,7,1,3};
        int target = 10;

        boolean[][] dp = new boolean[arr.length+1][target+1];

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0&&j==0){
                    dp[i][j]=true;  //empty array has one subset as it can make sum of 0
                }
                else if(i==0){
                    dp[i][j]=false;  //empty array has not subset to make sum of 1,2,3 and so on till target
                }
                else if(j==0){
                    dp[i][j]=true;  //any length array has subset(empty) that can have sum of 0
                }
                else{
                    if(dp[i-1][j]==true){  //if target is already made by i-1 element
                        dp[i][j]=true;
                    }
                    else{
                        int val=arr[i-1];  //current ele. should be greater than target to add in subset
                        if(j>=val){
                            if(dp[i-1][j-val]==true){
                                dp[i][j]=true;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(dp[arr.length][target]);
    }
}
