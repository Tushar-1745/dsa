import java.util.Scanner;
public class pr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the n: ");
        int n=scn.nextInt();

        int cp = countpaths(n, new int[n+1]);
        System.out.println(cp);
    }
    public static int countpaths(int n, int[] qb){
       
    }
}
