public class z {
    public static void main(String[] args) {
        // *  *  *  *  *
        //          *
        //       *
        //    *
        // *  *  *  *  *

        int n=7;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n||i==1){
                    System.out.print("* ");
                }
                else{
                    if(i+j==n+1){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
