import java.io.*;
import java.util.*;
public class climbingstairswithminimummovs {

    //giving minimum steps to reach the destination stair
    //we will do it using tabulation
    //here use Integer array cause we have to deal with null
    //solve from array.length to 0 
    //just like the previous program, for three calls we need to take minimum from that three and adding 1 to it
    //suppose we are at 6th cell, then in 6th value will be min(7th, 8th, 9th cell)+1;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int[] array = new int[n];
        for(int i=0;i<array.length;i++){
            
            array[i]=scn.nextInt();
        }

        Integer[] dp = new Integer[n+1];
        dp[n]=0;

        for(int i=n-1;i>=0;i--){   //we started loop form end;
            if(array[i]>0){      //we will take only those values which are greater than 0
                int min = Integer.MAX_VALUE;

                for(int j=1;j<=array[i] && i+j<dp.length;j++){  //this loop tells how many steps we can go from i
                    if(dp[i+j]!=null){      //in ans array we will take those steps which are not null
                        min = Math.min(min, dp[i+j]);    //here is min of the steps from i
                    }
                }
                if(min != Integer.MAX_VALUE){    
                    dp[i]=min+1;         //adding self value to min; 
                }
            }
        }
        System.out.println(dp[0]);
    }
    
}
