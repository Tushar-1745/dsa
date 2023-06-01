public class polymorphismintro {
    public static void main(String[] args) {
        //polymorphism = doing same work in different ways 
        //creating same name function in same class
        //types = 1)overloading(compile time)  2)overriding(run time)
        //overloading = there could be many functions but can have one name
        student s1 = new student();
        s1.name="aman";
        s1.age=40;
        System.out.println(s1.name);
        System.out.println(s1.age);
        s1.printinfo(s1.name, s1.age);

    }
}
class student{
    String name;
    int age;

    public void printinfo(String name){
        System.out.println(name);
    }

    public void printinfo(int age){
        System.out.println(age);
    }

    public void printinfo(String name, int age){
        System.out.println(name+" "+age);
    }
}
