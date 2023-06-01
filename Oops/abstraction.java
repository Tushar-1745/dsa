public class abstraction {
    public static void main(String[] args) {
        horse horse1 = new horse();
        horse1.walk();
        horse1.eats();
    }
}

abstract class animals{
    abstract void walk();
    public void eats(){
        System.out.println("animal eats");
    }
}

class horse extends animals{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

class chicken extends animals{
    public void walk(){
        System.out.println("walk on two legs");
    }
}
