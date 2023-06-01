import java.util.Scanner;
public class climbingstairs1 {

    //Climbing Stairs using Tabulation
    //assume the structure like array of size n+1;
    //in each cell we will have the count paths of that n to reach 0;
    //suppose, now in cell 0 cnt will be 1 and and in cell 1, cnt will be the addition of previous 3 cells
    //as limit is upto 3 stepsb means for 4th cell, cnt will be addition of cnt's of 3,2,1 cells
    //three stages = 1) Storage and meaning
    //               2) Direction (<,>)
    //               3) Travel and Solve
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the n: ");
        int n=scn.nextInt();

        int cp = countpaths(n);
        System.out.println(cp);
    }
    public static int countpaths(int n){
        int[] qb = new int[n+1];

        qb[0]=1;     //this is ground stair
        for(int i=1;i<=n;i++){
            if(i==1){          // this is because call for i-2 and i-3 goes out  of the array
                qb[i]=qb[i-1];     
            }
            else if(i==2){        // this is because call for i-2 goes out  of the array
                qb[i]=qb[i-1]+qb[i-2];
            }
            else{
                qb[i]=qb[i-1]+qb[i-2]+qb[i-3];   //we have taken cnt of last 3 cells as limit is of 3 steps
            }
        }
        return qb[n];
    }
}
