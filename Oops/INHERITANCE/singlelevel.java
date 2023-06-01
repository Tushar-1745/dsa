import java.io.*;
import java.util.*;
public class singlelevel {

    //Single Level inheritance - A class inherits properties from a single class.
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        r1.sum(3,5);
        r1.multiplication(4, 6);
    }
}
class rectangle extends shape{
    public void sum(int a, int b){
        System.out.println("Sum of two numbers is: " + (a+b));
    }
}
class shape{
    public void multiplication(int a, int b){
        System.out.println("Multiplication of two numbers is: " + a*b);
    }
}

