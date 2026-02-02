package ex_23_OOPS_superAbstraction;

public class Lab192_Super {

}
class BaseClass{
    private String browser;
    int aa;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    BaseClass(){
        System.out.println("DC-Parent");
    }
    BaseClass(String browser){
        this.browser=browser;
        System.out.println("parameterized constructor:");
    }
    void openBrowser(){
        System.out.println("Opening browser");
    }
    void closeBrowser(){
        System.out.println("Closing browser");
    }
}
class TestCase extends BaseClass{
    String a;
    void test(){

    }
    TestCase()
    {
       // super();
        super.openBrowser();
        super.closeBrowser();
        System.out.println(super.getBrowser());
        super.setBrowser("firefox");
        System.out.println(super.aa);
        //super("chrome");//we can call only one constructor at a time

        this.test();
        System.out.println(this.a);
    }
}