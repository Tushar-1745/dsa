import java.util.Scanner;

public class climbingstairswithvariablejumps {

    //it is similar to previous program but we can have variable jumps(climbing stairs with limited steps)
    //we wil do it with tabulation  ( 1) STORAGE AND MEANING 2)DIRECTION 3)TRAVEL AND SOLVE);
    //we have to find step from 0 to Nth stair, so we have to travel from last to first
    // here we will add each steps from i in new array
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int[] array = new int[n+1];
        for(int i=0;i<n;i++){
            array[i]=scn.nextInt();
        }

        int[] dp = new int[n+1];
        dp[n]=1;          // last cell of array 

        for(int i=n-1;i>=0;i--){
            for(int j=1;j<=array[i] && i+j<dp.length;j++){
                dp[i]+=dp[i+j];       //we have added each steps value for ieach array[i]
            }
        }
        System.out.println(dp[0]);
    }
    
}
