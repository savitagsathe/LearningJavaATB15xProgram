package ex_20_OOPS_polymorphism.methodoverloading;

public class Lab188_Real_MOverloading {
    public static void main(String[] args) {
        Webautomation t1=new Webautomation();
        t1.openBrowser();
        t1.openBrowser("firefox");
    }



}
 class Webautomation{
    public void openBrowser(){
        System.out.println("Default browser");
    }
    public void openBrowser(String browser){
        System.out.println("starting browser!!"+browser);
    }
}
