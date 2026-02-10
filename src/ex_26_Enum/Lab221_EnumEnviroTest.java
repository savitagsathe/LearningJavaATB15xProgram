package ex_26_Enum;

public class Lab221_EnumEnviroTest {
    static void main(String[] args) {
        System.out.println(Env.QA.getBaseURL());
        //Here i can write the QA code
        if (Env.QA.getBaseURL().equalsIgnoreCase("https://qa.myapp.com")){
            System.out.println("Start on QA!!");
        }
    }
}
