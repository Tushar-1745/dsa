public class pattern3 {
    public static void main(String[] args) { 

        //         *
        //       * *
        //     * * *
        //   * * * *
        // * * * * *

        int n=5;
        int space = n-1;
        
        for(int i=1;i<=n;i++){
            for(int j=0;j<space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            space--;
            System.out.println();
        }
    }
}
