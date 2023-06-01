public class pr {
    public static void main(String[]args){
        int n=5;
        int kj =ans(n);
        System.out.println(kj );
        
    }
    public static int ans(int n){
        if(n==1){
            return 1;
        }

        int nm= ans(n-1);
        int fn = n+nm;

        return fn;

    }

}
