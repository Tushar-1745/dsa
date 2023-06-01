class account{
    //private member property's scope is only within class
    //so to get the property we have to use get and set functions
    //create set function in that class with parameter and make given parameter as private memeber
    //now make get function to return the private variable
    
    public String name;
    protected String email;
    private String password;

    //getters and setters
    public void setpassword(String pass){
        this.password=pass;
    }
    public String getpassword(){
        return this.password;
    }
    
}
public class gettersandsetters {
    public static void main(String[] args) {
        account account1 = new account();
        account1.name="apna";
        account1.email="email@gmail.com";
        // account.password="tushar";
        System.out.println(account1.name);
        System.out.println(account1.email);
        // System.out.println(account1.password);
        account1.setpassword("tushar");
        String abc=account1.getpassword();
        System.out.println(abc);
        // account1.setpassword("abc");
        // System.out.println(account1.getpassword());
    }
}
