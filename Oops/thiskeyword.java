


// instance variable = declared within class (not method), can be accessible in any method
// local variable = scope within only method
//if instance variable and local varible are same then need to specified this.instance variable
//        now we can take the value to instance variable from local variable
public class thiskeyword{

    public void show(){
        System.out.println(this);
    }
    public static void main(String[] args) {
        re t = new re();
        t.setvalues(10);
        t.show();
    }
}

class re{
    int i;
    void setvalues(int i){
        this.i=i;
    }
    void show(){
        System.out.println(i);
    }
}