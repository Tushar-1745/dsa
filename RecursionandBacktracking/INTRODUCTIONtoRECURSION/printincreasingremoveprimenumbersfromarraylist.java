import java.io.*;
import java.util.*;
public class printincreasingremoveprimenumbersfromarraylist {
    public  static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the n: ");
        int n =scn.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("enter the element: ");
            list.add(scn.nextInt());
        }

        solution(list);
        System.out.println(list);
    }

    public static void solution(ArrayList<Integer> list){
        for(int i=list.size()-1;i>=0;i--){
            int val = list.get(i);
            if(isPrime(val)==true){
                list.remove(i);
            }
        }
    }
    public static boolean isPrime(int val){
        for(int div=2;div*div<=val;div++){                   // this is to check the no. is prime or not
            if(val%div==0){
                return false;
            }
        }
        return true;
    }
}
