import java.io.*;
import java.util.*;
public class overloadingmethod {
    public static void main(String[] args) {
        //overloading also known as compile time
        //we can create many functions with one name in same class
        //and those functions perform different functions
        //to implement method overloading, there are certain rules
        //              1)return type should be different
        //              2)types of parameters should be different 
        //              3)no. of parameters should be different
        student s1 = new student();
        int a = s1.samefunction(6, 3);
        System.out.println(a);

        int b=s1.samefunction(5, 4, 8);
        System.out.println(b);

        String c=s1.samefunction("tushar", "madane");
        System.out.println(c);

        school sc1= new school();
        int d=sc1.samefunction(6, 3);
        System.out.println(d);
    }
}

class student{
    public int samefunction(int a, int b, int c){
        int d=a+b+c;
        return d;
    }

    public String samefunction(String a, String b){
        String c=a+b;
        return c;
    }

    public int samefunction(int a, int b){
        int c=a*b;
        return c;
    }

}

class school{
    public int samefunction(int a, int b){
        int c=a*b;
        return c;
    }
}
