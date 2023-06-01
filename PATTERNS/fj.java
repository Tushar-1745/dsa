public class fj {
    public static void main(String[] args) {
        //     1
        //   2 3 2
        // 3 4 5 4 3
        //   2 3 2
        //     1
        int n=5;
        int val=1;
        int space=n/2;
        int star=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("   ");
            }
            int cval=val;
            for(int j=1;j<=star;j++){
                System.out.print(cval+"  ");
                if(j<=star/2){
                    cval++;
                }
                else{
                    cval--;
                }
            }
            if(i<=n/2){
                star+=2;
                space--;
                val++;
            }
            else{
                star-=2;
                space++;
                val--;
            }
            System.out.println();
        }

    }
}
