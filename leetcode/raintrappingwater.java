import java.io.*;
import java.util.*;
public class raintrappingwater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        // 9
        int ans = rainwater(height);
        System.out.println(ans);
    }

    public static int rainwater(int[] height){

        int[] anslge = lge(height);
        int[] ansrge = rge(height);
        int ans = 0;
        for(int i=0;i<height.length;i++){
            ans += (Math.min(anslge[i], ansrge[i])-height[i]);
        }
        return ans;
    }
    public static int[] lge(int[] height){
        int[] lge= new int[height.length];

        lge[0]=height[0];

        for(int i=1;i<height.length;i++){
            lge[i]=Math.max(lge[i-1], height[i]);
        }
        return lge;
    }
    public static int[] rge(int[] height){
        int[] rge= new int[height.length];

        rge[height.length-1]=height[height.length-1];

        for(int i=height.length-2;i>=0;i--){
            rge[i]=Math.max(rge[i+1], height[i]);
        }
        return rge;
    }
   
    
}
