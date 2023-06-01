import java.io.*;
import java.util.*;
public class mincostinmazetraversal {
    
    //we will be given 2d matrix. in each cell there will be price to get out of it
    // we have to tell the minimum cost to reach the last cell . minimum step is one either horizontal or vertical
    //we wil create dp 2d array of same size as input array
    //use tabulatin with three stage. In each cell there is min cost to reach the destination from that cell 
    // so direction from last to first cell 
    //the value in cell is min. of its next column cell and horizontal cell plus its own value
    // cost = min(co.cost, hor.cost)+its own value
    //we will divide our operation in four steps 1) last cell = only its own value
    //                        2) last row = as we have to add horizontally
    //                        3) last col = only have to add vertically
    //                        4) remaining part = have to add Min. of horizontal or vertical cell cost

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
            for(int j=dp[0].length-1;j>=0;j--){
                if(i==dp.length-1 && j==dp[0].length-1){     //last cell
                    dp[i][j]=array[i][j];         //in last cell we have to add its own value
                }
                else if(i==dp.length-1){   //lasdp
                    dp[i][j]=array[i][j]+dp[i][j+1];  //here col. changes and we add cost of next col. cell in previous cell with its own cost
                }
                else if(j==dp[0].length-1){   //last column
                    dp[i][j]=array[i][j]+dp[i+1][j];  //here row changes and we add cost of next hori. cell in previous cell withs its own cost
                }
                else{       //remaininig part
                    dp[i][j]=array[i][j]+ Math.min(dp[i+1][j], dp[i][j+1]);
                }             //here both row and column changes, we have to get the min. of them and add its own cost
            }
        }
        System.out.println(dp[0][0]);
    }
}
