import java.io.*;
import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        //arraylist is immutable
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.size());

        list.add(10);
        list.add(20);
        list.add(30);
        // System.out.println(list+" "+list.size());

        list.add(1, 1000);
        System.out.println(list);

        // int val=list.get(1);
        // System.out.println(val);

        list.set(1, 2000);
        System.out.println(list+" "+list.size());

        // list.remove(1);
        // System.out.println(list+" "+list.size());

        // for(int val1: list){
        //     System.out.println(val1);
        // }
    }
}
