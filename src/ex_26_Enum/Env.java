package ex_26_Enum;

public enum Env {
    DEV("https://dev.myapp.com"),
    QA("https://qa.myapp.com"),
    STAGING("https://staging.myapp.com"),
    UAT("https://uat.myapp.com"),
    PROD("https://prod.myapp.com"),
    PREPROD("https://preprod.myapp.com");

    private String baseURL;

    Env(String baseURL){
        this.baseURL=baseURL;
    }
    public String getBaseURL(){
        return baseURL;
    }
}
