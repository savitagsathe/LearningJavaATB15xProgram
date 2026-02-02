package ex_20_OOPS_polymorphism.methodoverriding;
public class Lab190_MethodOverriding_Automation{
    static void main(String[] args) {
        ChromeTC c1=new ChromeTC();
        c1.openBrowser();

        FireFoxTC f1=new FireFoxTC();
        f1.openBrowser();

        CommonToAll ct1=new CommonToAll();
        ct1.openBrowser();

        CommonToAll c2=new CommonToAll();
        c2.openBrowser();

        CommonToAll c3=new CommonToAll();
        c3.openBrowser();
    }
}

class CommonToAll{
    void openBrowser(){

        System.out.println("Starting the IE browser");
    }


}
class ChromeTC extends CommonToAll{
    void openBrowser(){
        System.out.println("Starting the Chrome browser");
    }
}
class FireFoxTC extends CommonToAll{
    void openBrowser(){
        System.out.println("Starting the Firefox browser");
    }
}