import java.io.*;
import java.util.*;
public class nqueens {
    public static void main(String[] args) {
        //given chess of n*n
        //have to place  queens in such places no can kill anyone
        //print the set of cells  
        //no two queens can be in same row. only one queen in one row
        int n=4;
        int[][] chess = new int[4][4];
        printnQueens(chess, " ", 0);
    }
    public static void printnQueens(int[][] chess, String psf, int row){
        if(row==chess.length){
            System.out.println(psf+",");
            return;
        }

        //[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
        for(int col=0;col<chess.length;col++){
            if(isQueenSafe(chess, row, col)&&chess[row][col]==0){
                chess[row][col]=1;
                printnQueens(chess, psf+row+"-"+col+",", row+1);
                chess[row][col]=0;
            }
        }
    }
    public static boolean isQueenSafe(int[][] chess, int row, int col){
        //straight vertical
        for(int i=row-1, j=col;i>=0;i--){
            if(chess[i][j]==1){
                return false;
            }
        }

        //left upper diagonal
        for(int i=row-1, j=col-1;i>=0&&j>=0;i--, j--){
            if(chess[i][j]==1){
                return false;
            }
        }

        //right upper diagonal
        for(int i=row-1, j=col+1;i>=0&&j<chess.length;i--, j++){
            if(chess[i][j]==1){
                return false;
            }
        }

        return true;
    }
}
