import java.io.*;
import java.util.*;
public class introduction{
    //hashset doesn't allow duplication
        //help in reducing complexity
        // add  -  0(1) (time complexity)
        // contains - 0(1),
        // remove  -  0(1)
        // there is no index in hashset, so we cannot use for loop
        //it has iterator that helps in traversing
        //it doesn't guarantee order of element
    public static void main(String[] args) {
        
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

        
    }
}