import java.io.*;
import java.util.*;
public class mergesortedarray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,0,0,0};
        int m=3;
        int[] arr2={2,5,6};
        int n=3;
        mergesortedarray(arr1, arr2, m, n);
    }
    public static void mergesortedarray(int[] arr1, int[] arr2, int m, int n){
        int[] ans=new int[m+n];
        for(int i=0;i<m;i++){
            ans[i]=arr1[i];
        }
        for(int i=0;i<n;i++){
            ans[m+i]=arr2[i];
        }

        Arrays.sort(ans);
        for(int val: ans){
            System.out.print(val+" ");
        }
    }
}
