import java.io.*;
import java.util.*;
public class pra{
    public static void main(String[] args) {
        int n=5;
        int[] arr = {10, 20, 30, 40, 50};
        int target=60;
        targtsubsets(arr, 0, " ", 0, target);
    }
    public static void targtsubsets(int[] arr, int idx, String set, int sos, int target){
        if(idx==arr.length){
            if(sos==target){
                System.out.println(set+".");
            }
            return;
        }
        targtsubsets(arr, idx+1, set+arr[idx]+",", sos+arr[idx], target);
        // targtsubsets(arr, idx+1, set, sos, target);
    }
   
}