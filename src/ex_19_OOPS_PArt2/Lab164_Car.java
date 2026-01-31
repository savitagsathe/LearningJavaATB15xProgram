package ex_19_OOPS_PArt2;

public class Lab164_Car {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.name);

        Car p1=new Car("xuv");
        Car p2=new Car("Tesla","2016");
        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p2.model);

        LoginPage l1=new LoginPage("savita@gmail.com","savita123");
    }

}

class Car {
    String name;
    int age;
    String model;

    Car() {
        name = "Unknown car";
        age = 1991;
        model = "xyz";

    }

    Car(String name){
        this.name=name;
    }
    Car(String nameGiven, String modelGiven) {
        this.name = nameGiven;
        this.model = modelGiven;

    }

}
