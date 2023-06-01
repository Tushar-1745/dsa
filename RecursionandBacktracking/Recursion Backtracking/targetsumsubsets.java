import java.io.*;
import java.util.*;
public class targetsumsubsets {
    public static void main(String[] args) {
        //if you are given an array 10,20,30,40,50 and the target is 60. 
        //Then all the valid subsets are [10,20,30],[10,50] and [20,40].
        int n=5;
        int[] arr = {10, 20, 30, 40, 50};
        int target=60;
        targtsubsets(arr, 0, "", 0,target);
    }
    public static void targtsubsets(int[] arr, int idx, String set, int sos, int target){
        if(idx==arr.length){
            if(sos==target){
                System.out.println(set+".");
            }
            return;
        }
        //element has two choices. 1)can it be part of set 2)or not
        targtsubsets(arr, idx+1, set+arr[idx]+",", sos+arr[idx], target); //to be part of set
        targtsubsets(arr, idx+1, set, sos, target); //not part of set
    }
}
