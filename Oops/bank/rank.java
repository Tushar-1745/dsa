package bank;

class account{
    public String name;
    protected String email;
    private String password;

    //getters and setters
    public String getpassword(){
        return this.password;
    }
    public void setpassword(String pass){
        this.password=pass;
    }
}
public class rank {
    public static void main(String[] args) {
        account account1 = new account();
        account1.name="apna";
        account1.email="email@gmail.com";
        account1.setpassword("abc");
        System.out.println(account1.getpassword());
    }
}
