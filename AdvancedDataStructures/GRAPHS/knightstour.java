import java.util.Scanner;
public class knightstour {
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        System.out.print("enter the N: ");
        int n=scn.nextInt();
        System.out.print("enter the r: ");
        int r=scn.nextInt();
        System.out.print("enter the c: ");
        int c=scn.nextInt();

        int[][] chess= new int[n][n];
        printknighttour(chess, r, c, 1);
    }

    // knight in chess means horse  and knight tour means horse's move in chess
    // knight(horse) move two and half moves
    // we need to create chessboard of 2d array
    // it has to traverse all the boxes without visiting more than once
    public static void publishboard(int[][] chess){
        for (int i=0;i<chess.length;i++){
            for (int j=0;j<chess[0].length;j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println( );
        }
        System.out.println( );
    }
    public static void printknighttour(int[][] chess, int r, int c, int move){
        if(r<0||c<0||r>=chess.length||c>=chess[0].length||chess[r][c]>0){ //chess[r][c]>0 if it is already filled with another soldier
            return;
        }
        else if(move==chess.length*chess.length){
            chess[r][c]=move;
            publishboard(chess);
            chess[r][c]=0;                     // we have to mark it 0 again to for next moves
            return;
        }

        chess[r][c]=move;
        // here we will get eight moves from the original positions with each move we have to increase move by one
        printknighttour(chess, r-2, c+1, move+1);
        printknighttour(chess, r-1, c+2, move+1);
        printknighttour(chess, r+1, c+2, move+1);
        printknighttour(chess, r+2, c+1, move+1);
        printknighttour(chess, r+2, c-1, move+1);
        printknighttour(chess, r+1, c-2, move+1);
        printknighttour(chess, r-1, c-2, move+1);
        printknighttour(chess, r-2, c-2, move+1);
        chess[r][c]=0;                             // we have to mark it 0 again to for next moves
    }
}
