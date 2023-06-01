public class pattern7 {
    public static void main(String[] args) {
        // *
        //   *
        //     *
        //       *
        //         *

        int n=5;
        int space =0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++){
                System.out.print("  ");
            }
            for(int j=0;j<1;j++){
                System.out.print("*");
            }
            space++;
            System.out.println();
        }
    }
}
