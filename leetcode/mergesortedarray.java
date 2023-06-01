import java.io.*;
import java.util.*;
public class mergesortedarray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}; 
        int m = 3; 
        int[] nums2 = {2,5,6}; 
        int n = 3;
        merge(nums1, m, nums2, n);

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // int i=0;
        // int j=0;

        // while(i<m&&j<n){
        //     if(nums1[i]>nums2[j]){
        //         swap(nums1, i, nums2, j);
        //         j++;
        //     }
        //     i++;
        // }
        
        // for(int k=0;k<n;k++){
        //     nums1[m+k]=nums2[k];
        // }

        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);

        display(nums1);
    }
    public static void swap(int[] nums1, int i, int[] nums2, int j){
        int temp = nums1[i];
        nums1[i]=nums2[j];
        nums2[j]=temp;
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
