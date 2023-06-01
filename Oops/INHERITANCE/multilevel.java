import java.rmi.dgc.VMID;

import javax.sound.sampled.SourceDataLine;

public class multilevel {
    public static void main(String[] args) {
        //When a class extends a class, which extends another class then this is called multilevel inheritance. 
        //For example class C extends class B and class B extends class A 
        //then this type of inheritance is known as multilevel inheritance.

        Maruti800 m1 = new Maruti800();
        m1.model("maruti800");
        m1.companyName("maruti");
        m1.vehicleType("fourwheeler");

        System.out.println("                             ");

        Maruti m2 = new Maruti();
        m2.companyName("maruti");
        m2.vehicleType("car");

        System.out.println("                        ");

        car m3 = new car();
        m3.vehicleType("fourwheeler");
        
    }

   
}
class car{
    public void vehicleType(String abc){
        System.out.println("Vehicle type is: "+abc);
    }
}

class Maruti extends car{
    public void companyName(String abc){
        System.out.println("Comapany name is: "+abc);
    }
}

class Maruti800 extends Maruti{
    public void model(String abc){
        System.out.println("Model name is Maruti800: "+abc);
    }
}
