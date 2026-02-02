package ex_21_OOPS_encapsulation;

public class Lab191_Wcap_Demo {
    static void main(String[] args) {
        VWOLogin vwoLogin=new VWOLogin("admin","abc564");
        System.out.println(vwoLogin.username);//this should not allow

        GoodVWOLogin goodVWOLogin=new GoodVWOLogin("admin1","abcd123");
        //System.out.println(goodVWOLogin.username);//this is encapsulaion private member cannot  be accessible allow it by using setter and getter



    }
}

class VWOLogin{
    public String username;//should be private
    public String password;

    VWOLogin(String username,String password){
       this.password=password;
       this.username=username;
    }
}
class GoodVWOLogin{
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    GoodVWOLogin(String username,String password){
        this.username=username;
        this.password=password;
    }

}