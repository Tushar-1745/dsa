public class overridingmethod {
    //also know as runtime polymorphism
    //when there is same name function in both base and derived class,then when calling this
    //function, the derived class function will be calle dand not the base class function.
    public static void main(String[] args) {
        childclass ch1 = new childclass();
        ch1.display();
        baseclass bs1 = new baseclass();
        bs1.display();
    }
}

class baseclass {
    public void display(){
        System.out.println("this is baseclass");
    }
}
class childclass extends baseclass{
    public void display(){
        System.out.println("this is childclass");
    }
}
