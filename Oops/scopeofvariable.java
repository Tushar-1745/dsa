import java.io.*;
import java.util.*;
public class scopeofvariable{
    public static void main(String[] args) { 
        double latitude=-15.5;
        SimpleLocation lima = new SimpleLocation(latitude, -77.0);
        latitude=-12.0;
        System.out.println(lima.latitude);
    }
}
//The Scope of a variable is the area where it is defined to have a value
//Local variables are declared inside a method and their scope is inside only method
//parameters behave like local variables
//memeber variables are declared outside any method and their scope is entire class
//changing value of variable after passing it as parameter(after constructer is destructed)
//will not change anything means value passed before sending in constructor matters
class SimpleLocation{
    public double latitude;
    public double longitude;

    public SimpleLocation(double latIn, double lonIn){
        this.latitude=latIn;
        this.longitude=lonIn;
    }
    
}