public class pattern10 {
    public static void main(String[] args) {
        //     *
        //   *   *  
        // *       *
        //   *   *
        //     *

        int n=5;
        int os=n/2;
        int is=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<os;j++){
                System.out.print("  ");
            }
            if(i!=n-1){
                System.out.print("* ");
            }
            for(int j=0;j<is;j++){
                System.out.print("  ");
            }
            if(i!=0){
                System.out.print("* ");
            }
            if(i<n/2){
                os--;
                is+=2;
            }
            else{
                os++;
                is-=2;
            }
            System.out.println();
        }
    } 
}
