public class crown {
   public static void main(String[] args) {
    int n=6;
    int star=1;
    int space=n*2-1;
    int star2=1;
    int space2=n*2-1;
    int star3=1;

    for(int i=0;i<n;i++){
        if(i<=n/2+1){
            for(int j=0;j<star;j++){
                System.out.print("*"+" ");
            }
            for(int j=0;j<space;j++){
                System.out.print("  ");
            }
            for(int j=0;j<star2;j++){
                System.out.print("("+" ");
            }
            for(int j=0;j<space2;j++){
                System.out.print("  ");
            }
            for(int j=0;j<star3;j++){
                System.out.print("* ");
            }

        }
        else{
            for(int j=0;j<n*3-1;j++){
                System.out.print("*"+" ");
            }
        }
        star++;
        space-=2;
        star2+=2;
        space2-=2;
        star3++;
        System.out.println();
    }

   } 
}
