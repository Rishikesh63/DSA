package OPPS;

public class Acount {
    public String name;
    private String password;
    protected String email;
    public void setpass(String password){
        this.password=password;
        System.out.println(password);
    }
    public String getpass(){
        return this.password;
    }

    public static void main(String args[]){
      Acount a1 = new Acount();
      a1.setpass("rishi"); 
     String pass= a1.getpass(); 
     System.out.println(pass);
    }

}
