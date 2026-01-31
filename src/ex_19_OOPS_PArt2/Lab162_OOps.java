package ex_19_OOPS_PArt2;

public class Lab162_OOps {

    public static void main(String[] args) {
Baby b1=new Baby();
Baby b2=new Baby("Savita");
Baby b3=new Baby("Nikshita",1);

    }
}
    class Baby{
        String name;
        int age;

        Baby( ){
            System.out.println("Default constructor");
        }
        Baby(String name){
            System.out.println("Parameterized constructor-name");
        }
        Baby(String name,int age){
            System.out.println("Parameterized constructor-Age,name");
        }

}
