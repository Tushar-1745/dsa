import java.io.*;
import java.util.*;
public class medianoftwosortedarrays{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the n1: ");
        int n1=scn.nextInt();
        int[] arr1= new int[n1];
        for(int i=0;i<n1;i++){
            System.out.print("enter the ele.: ");
            arr1[i]=scn.nextInt();
        }
        System.out.print("enter the n2: ");
        int n2=scn.nextInt();
        int[] arr2= new int[n2];
        for(int i=0;i<n2;i++){
            System.out.print("enter the ele.: ");
            arr2[i]=scn.nextInt();
        }

        double median = medianoftwosortedarrays(arr1, arr2);
        System.out.println("The median is: " + median);
    }
    public static double medianoftwosortedarrays(int[] arr1, int[] arr2){
        
        int[] ans = new int[arr1.length+arr2.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                i++;
            }
            else{
                ans[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length){
            ans[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            ans[k]=arr2[j];
            j++;
            k++;
        }

        double median=0.0;
        
        int mid = ans.length/2;

        if(ans.length%2==0){
            median=(ans[mid]+ans[mid-1])/2.0;
        }
        else{
            median=ans[mid];
        }
        return median;
    }
}