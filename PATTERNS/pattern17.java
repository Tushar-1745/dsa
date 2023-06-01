public class pattern17 {
    public static void main(String[] args) {
        //     *
        //     * *
        // * * * * *
        //     * *
        //     *

        int n = 5;
        int space = n / 2;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=space;j++){
                if(i==n/2+1){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            for(int j=1;j<=st;j++){
                System.out.print("*  ");
            }
            if(i<=n/2){
                st++;
            }
            else{
                st--;
            }
            System.out.println();
            
            // for(int j = 1;j<=space;j++){

            //     if(i==n/2+1){
            //         System.out.print("*  ");
            //     }{
                    
            //     }
            // }
            // for(int j = 1;j<=st;j++){
            //     System.out.print("*  ");
            // }
            // if(i<=n/2){
            //     st++;
            // }else{
            //     st--;
            // }
            // System.out.println();

           
            // System.out.print("*");
        }
    }
}
