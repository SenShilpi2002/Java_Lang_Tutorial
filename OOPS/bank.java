package bank;

class Account{
    public String name;
    protected String email;
    private String password;

    //getters and setters
    public String getpassword(){
        setpassword(randompass);
       return this.password;
    }
    private void setpassword(String pass){
        this.password=pass;
    }
}

public class bank{
    public static void main(String arg[]){
        Account a1=new Account();
        a1.name="Sen creation";
        a1.email="agniswar@gmail.com";
        //a1.setpassword("abcde");
        System.out.println(a1.getpassword());
        }
}
