package ex_20_OOPS_polymorphism.methodoverloading;

public class MathOperation {
    public static void main(String[] args) {
        //In same class ,when you have a method with same name but different arguments&different return type
MathOperation m=new MathOperation();
int r1=m.add(2,7);
        System.out.println(r1);
int r2=m.add(9,6,45);
        System.out.println(r2);
double r3=m.add(8.9,9.7);
        System.out.println(r3);
String r4=m.add("savita","Nikshita");
        System.out.println(r4);

    }
    int add(int a,int b){
      return a+b;
    }
int add(int a,int b,int c){
       return a+b+c;
}
double add(double a,double b){
     return a+b;
}
String add(String a,String b){
      return a+b;
}

}
