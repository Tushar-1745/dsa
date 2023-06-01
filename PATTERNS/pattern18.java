public class pattern18 {
    public static void main(String[] args) {
        
        // *  *  *  *  *  *  *
        //    *           *
        //       *     *
        //          *
        //       *  *  *
        //    *  *  *  *  *
        // *  *  *  *  *  *  *

        int n=7;
        int space=0;
        int star=n;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("   ");
            }
            for(int j=1;j<=star;j++){
                if(i>1&&i<=n/2&&j>1&&j<star){
                    System.out.print("   ");
                }
                else{
                    System.out.print("*  ");
                }
            }
            if(i<=n/2){
                space++;
                star-=2;
            }
            else{
                space--;
                star+=2;
            }
            System.out.println();
        }    
    }
}
