public class statickey {
    //static is keyword
    //this variable can be used to refer to the common property of all objects
    // for example. company name of employees, college name of students.
    //jsut writhe static keyword before the property
    //
    public static void main(String args[]){
        
        student.school="sits";
        student.name="tm";
        student s1 = new student();
        
        System.out.println(s1.school);
        s1.name="tushar";
        System.out.println(s1.name);

        // employees e1= new employees();
        // System.out.println(e1.company);
       
    }
}
class student{
    static String name;
    static String school;
}

class employees{
    static String company;
}
