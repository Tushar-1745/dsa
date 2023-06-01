import java.io.*;
import java.util.*;
public class onetwotwoone {
    public static void main(String[] args) {
        String str = "LLLLRRRR";

        int count=0;
        int ans=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='R'){
                count++;
            }
            else{
                count--;
            }

            if(count==0){
                ans++;
            }
        }

        System.out.println(ans);

    }

    
}
