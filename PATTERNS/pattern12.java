public class pattern12 {
    public static void main(String[] args) {
        // 0
        // 1 1
        // 2 3 5
        // 8 13 21 34
        // 55 89 144 233 377

        int n=5;
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(a+" ");
                int c=a+b;
                a=b;
                b=c;
            }
            System.out.println();
        }
    }
}
