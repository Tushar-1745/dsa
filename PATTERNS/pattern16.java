public class pattern16 {
    public static void main(String[] args) {
        // 1												1	
        // 1	2										2	1	
        // 1	2	3								3	2	1	
        // 1	2	3	4						4	3	2	1	
        // 1	2	3	4	5				5	4	3	2	1	
        // 1	2	3	4	5	6		6	5	4	3	2	1	
        // 1	2	3	4	5	6	7	6	5	4	3	2	1	

        int n=7;
        int space=n*2-3;
        int star=1;
      
        for(int i=1;i<=n;i++){
            int val=1;
            for(int j=1;j<=star;j++){
                System.out.print(val+"  ");
                val++;
            }
            for(int j=1;j<=space;j++){
                System.out.print("   ");
            }
            if(i==n){
                star--;
                val--;
            }
            val--;
            for(int j=1;j<=star;j++){
                System.out.print(val+"  ");
                val--;
            }
            space-=2;
            star++;
            System.out.println();
        }
    }
}
