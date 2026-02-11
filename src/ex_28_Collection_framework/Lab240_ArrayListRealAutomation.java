package ex_28_Collection_framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Lab240_ArrayListRealAutomation {
    static void main(String[] args) {
        APIAutomation appVvwoLogin=new APIAutomation("vwo","https://app.vwo.com");
        APIAutomation katlonStudio=new APIAutomation("katlonStudio","https://app.katlon.com");
        APIAutomation ttBank=new APIAutomation("ttBank","https://app.ttBank.com");

        List<APIAutomation>apiAutomationList=new ArrayList<>();
        apiAutomationList.add(appVvwoLogin);
        apiAutomationList.add(katlonStudio);
        apiAutomationList.add(ttBank);

        appVvwoLogin.printDetails();
        katlonStudio.printDetails();
        ttBank.printDetails();
    }
}
class APIAutomation{
    private String appName;
    private String urls;

    public APIAutomation(String appName, String urls) {
        this.appName = appName;
        this.urls = urls;
    }

    public String getUrls() {
        return urls;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }



    public void printDetails(){
        System.out.println("Infomation"+this.appName+"-"+this.urls);
    }
}