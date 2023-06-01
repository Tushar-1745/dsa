public class pl {
    public static void main(String[] args) {
        int n=815;
        int ans =rec(n);
        System.out.println(ans);
    }
    public static int  rec(int n){
        if(n==0){
            return 0;
        }
        int j = rec(n/10);
        
        // k=k+k;
        return j+n%10;
    }
}
