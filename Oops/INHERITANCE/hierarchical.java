public class hierarchical {
    public static void main(String[] args) { 
        //multiple child classes inherit the methods and properties of the same parent class. 
        //it not only reduces the code length but also increases the code modularity.

        childclass1 ch1 = new childclass1();
        childclass2 ch2 = new childclass2();
        childclass3 ch3 = new childclass3();

        ch1.display();
        ch1.product(3,4);
        ch2.display();
        ch2.product(6, 9);
        ch3.display();
        ch3.product(2, 34);
    }
}

class baseclass{
    public void product(int a, int b){
        int c=a*b;
        System.out.println(c);
    }
}

class childclass1 extends baseclass{
    public void display(){
        System.out.println("method of childclass1");
    }
}

class childclass2 extends baseclass{
    public void display(){
        System.out.println("method of childclass2");
    }
}

class childclass3 extends baseclass{
    public void display(){
        System.out.println("method of childclass3");
    }
}
