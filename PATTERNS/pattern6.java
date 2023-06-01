public class pattern6 {
    public static void main(String[] args) {
        
        // * * *  * * *
        // * *      * *
        // *          *
        // * *      * *
        // * * *  * * *

        int n=5;
        int space=1;
        int star=n/2+1;

        for(int i=0;i<n;i++){
            for(int j=0;j<star;j++){
                System.out.print("* ");
            }
            for(int j=0;j<space;j++){
                System.out.print("  ");
            }
            for(int j=0;j<star;j++){
                System.out.print("* ");
            }
            if(i<n/2){
                space+=2;
                star--;
            }
            else{
                space-=2;
                star++;
            }
            System.out.println();
        }
    }
}
