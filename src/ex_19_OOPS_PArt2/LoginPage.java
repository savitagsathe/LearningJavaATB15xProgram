package ex_19_OOPS_PArt2;

public class LoginPage {
    String email;

    LoginPage() {
        System.out.println("Default Constructor:");
    }

    public LoginPage(String email,String password) {
        this.email = email;
        this.password = password;
    }

    String password;
    String useranme;

    public LoginPage(String useranme, String email, String password) {
        this(email, password);
        //this.useranme = useranme;
        //this.email = email;
        this.password = password;
    }


}
