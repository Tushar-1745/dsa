import java.io.*;
import java.util.*;
public class hashset{
    public static void main(String[] args) {
        //hashset doesn't allow duplication
        //help in reducing complexity
        // add  -  0(1) (time complexity)
        // contains - 0(1),
        // remove  -  0(1)
        // there is no index in hashset, so we cannot use for loop
        //it has iterator that helps in traversing
        //it doesn't guarantee order of element

        HashSet<Integer> set = new HashSet<>();

        //add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        //size
        System.out.println("size of the set is: " + set.size());


        //display all elements
        System.out.println(set);

        //contains
        if(set.contains(1)){
            System.out.println("set contains 1");
        }

        if(!set.contains(6)){
            System.out.println("does not contain 6");
        }

        //remove
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("we have deleted 1");
        }

        set.add(1);
        //Iterator
        Iterator  it = set.iterator();

        //has two function 1)next  2)hasNext
        
        while(it.hasNext()){
            System.out.println(it.next());
        }

        HashSet<String> ret = new HashSet<>();

        ret.add("tm");
        ret.add("jj");
        ret.add("khn");
        ret.add("ion");

        if(ret.contains("tm")){
            System.out.println("it contains");
        }
        if(!ret.contains("rahul")){
            System.out.println("it doesn't contain ");
        }

        ret.remove("ion");
        Iterator rt = ret.iterator();

        while(rt.hasNext()){
            System.out.println(rt.next());
        }

        System.out.println(ret.size());
    }
}