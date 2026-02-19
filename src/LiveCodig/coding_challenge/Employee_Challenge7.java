package LiveCodig.coding_challenge;

/*Employee Hierarchy with Salary Calculation
Create an Employee base class and Manager, Developer subclasses. Each should have different salary calculation methods.
Examples:
Input:
Manager with base salary 60000 and bonus 10000, Developer with hourly rate 50 and 160 hours
Output:
Manager Salary: 70000.0 Developer Salary: 8000.0
 💡 Explanation:Implement inheritance with specialized behavior in subclasses for different salary calculation logic.*/

//base class
public class Employee_Challenge7 {
    public double calculateSalary() {

        return 0;// default implementation
    }
}



//subclass1
class Manager extends Employee_Challenge7  {
    private double baseSalary;
    private double bonus;


    Manager(double baseSalary,double bonus) {

        this.baseSalary=baseSalary;
        this.bonus=bonus;
    }
@Override
    public double calculateSalary(){

    return baseSalary+bonus;
}

}

//subclass2
class DeveloperSalary extends Employee_Challenge7 {
    private double hourlyrate;
    private double hours;

    DeveloperSalary(double hourlyrate,double hours){
        this.hourlyrate=hourlyrate;
        this.hours=hours;
    }
    @Override
    public double calculateSalary() {

        return hourlyrate * hours;
    }

}

class TestSalary{
    static void main(String[] args) {
        Employee_Challenge7 manager=new Manager(60000,10000);
        System.out.println("Manager Salary: " +manager.calculateSalary());

        Employee_Challenge7 developer=new DeveloperSalary(50,160);
        System.out.println("Developer Salary: " +developer.calculateSalary());
    }
}