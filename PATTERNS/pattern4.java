public class pattern4 {
    public static void main(String[] args) {
        // * * * * * 
        //   * * * *
        //     * * *
        //       * *
        //         *

        int n=5;
        int space=0;
        int star=n;

        for(int i=0;i<n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            space++;
            star--;
            System.out.println();
        }
    }
}
