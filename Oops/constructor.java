





public class constructor{ 

    String name;
    int rollno;

    //new keyword is responsible for object creation
    constructor(String name, int rollno){
        this.name=name;
        this.rollno=rollno;
        System.out.println(this.name);
        System.out.println(this.rollno);   
    }

    
    public static void main(String[] args) {
        // student s1 = new student("tushar", 7);
        constructor s2 = new constructor("raj", 2);
        constructor s3 = new constructor("ravi", 3);
    }

    //if we want something to get invoked(means to get result) on creating the object of 
    // the class we use the constructor
    //constructor get automatically invoked on creation of object
    //to call another constructor use this() in constructor
    //here "tushar get printed as result of object creation of that class"
    //constructor does not need object name as referential variable
    //constructor concept is designed to perform initiliazation of object
//     constructor(int a, int b){
//         this();
//         System.out.println(a*b);
//     }

//     constructor(){
//         System.out.println("tushar");
//     }

//     public static void main(String[] args) {

//         constructor cnt = new constructor(2,4);
       
//     }
// }

// class temp{
//     String id;

//     temp(){
//         System.out.println("hello there");
//     }
}