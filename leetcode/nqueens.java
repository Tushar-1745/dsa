import java.io.*;
import java.util.*;
public class nqueens {
    public static void main(String[] args) {
        int n=4;
    }
    public List<List<String>> solveNQueens(int n) {

        
        int[][] chess = new int[n][n];

        List<List<String>> list = new ArrayList<>();
        for(int i=0;i<chess.length;i++){
            ArrayList<String> st = new ArrayList<>();
            for(int j=0;j<chess[0].length;j++){
                if(isQueenSafe(chess, i, j)){
                    st.add("Q");
                }
                else{
                    st.add(".");
                }
            }
            list.add(st);
        }

        return list;
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
