import java.util.Scanner;
public class climbingstairs {
    //Dynamic Programming using memoization
    //we are using recursion
    //in this lecture, we have to tell the paths from Nth stair to 0
    //just to tell the count of how many paths are there 
    //limit is up to 3 steps
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the n: ");
        // int n=scn.nextInt();
        int n=5;

        int cp = countpaths(n, new int[n+1]);
        System.out.println(cp);

    
    }

    // as previous code has so much duplicacy
    //we will use array which might avoid duplicacy by saving answer of n and it will give the answer when same n 
    // comes again. That's how it will reduce computation and save time and space
    public static int countpaths(int n, int[] qb){
        if(n==0){
            return 1;
        }
        else if(n<0) {
            return 0;
        }
        else if(qb[n]>0){ 
            return qb[n];
        }
        int x = countpaths(n-1, qb); //these are recursive calls up to n-3;
        int y = countpaths(n-2, qb);
        int z = countpaths(n-3, qb);
        int cnt = x+y+z;
        
        qb[n]=cnt;
        return cnt;
    }
}
