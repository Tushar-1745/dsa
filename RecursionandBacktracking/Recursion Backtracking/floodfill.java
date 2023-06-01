import java.io.*;
import java.util.*;

public class floodfill {
    public static void main(String[] args) {
        // maze is given of 0 and 1. 1 means obstacle and 0 means path
        // we have to print all the paths from first cell to last cell
        // int n=3;
        // int m=3;
        // int[][] maze = {{0,0,0}, {1,0,1}, {0,0,0}};

        int n = 6;
        int m = 7;
        int[][] maze = { { 0, 1, 0, 0, 0, 0, 0 }, { 0, 1, 0, 1, 1, 1, 0 }, { 0, 0, 0, 0, 0, 0, 0 },
                { 1, 0, 1, 1, 0, 1, 1 }, { 1, 0, 1, 1, 0, 1, 1 }, { 1, 0, 0, 0, 0, 0, 0 } };

        boolean[][] visited = new boolean[n][m];
        floodfill(maze, 0, 0, " ", visited);

    }

    public static void floodfill(int[][] arr, int r, int c, String psf, boolean[][] visited ){
        if(r<0||c<0||r==arr.length||c==arr[0].length||arr[r][c]==1||visited[r][c]==true){
            return;
        }

        if(r==arr.length-1&&c==arr[0].length-1){
            System.out.println(psf);
            return;
        }

//         ttrtttrrrrr
//  ttrrddrrrrttlltttrr
//  ttrrrrtttrr
        visited[r][c]=true;
        floodfill(arr, r-1, c, psf+"t", visited);
        floodfill(arr, r+1, c, psf+"d", visited);
        floodfill(arr, r, c-1, psf+"l", visited);
        floodfill(arr, r, c+1, psf+"r", visited);

        visited[r][c]=false;
    }

}