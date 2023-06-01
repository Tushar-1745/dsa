import java.io.*;
import java.util.*;
public class partyinvite {
    public static void main(String[] args) {
        int n=4;
        int ans =party(n);
        System.out.println(ans);
    }
    public static int party(int n){

        if(n<=1){
            return 1;
        }
        int way1 = party(n-1);

        int way2 = (n-1)*(party(n-2));

        return way1+way2;

    }
}
