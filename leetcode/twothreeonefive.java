import java.io.*;
import java.util.*;
public class twothreeonefive {
    public static void main(String[] args) {
        String str  =  "yo|uar|e**|b|e***au|tifu|l";
        
        int count=0;
        int cnt=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch=='|'){
                count++;
            }
            else if(ch=='*'){
                if(count%2==0){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
