public class butterfly {
    public static void main(String[] args) {
        int n=5;
        int star=1;
        int space=n*2-3;
        for(int i=1;i<n*2;i++){
            for(int j=1;j<=star;j++){
               System.out.print("*"); 
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=0;j<star;j++){
                System.out.print("*");
            }
            // if(i==n){

            //     for(int j=1;j<n;j++){
    
            //         System.out.print("*");
            //     }
            // }else{
            //     for(int j=1;j<=star;j++){
            //         System.out.print("*"); 
            //      }
            // }
            
            if(i<n){
                star++;
                space-=2;
            }
            else{
                star--;
                space+=2;
            }
            System.out.println();
        }
    }
}
