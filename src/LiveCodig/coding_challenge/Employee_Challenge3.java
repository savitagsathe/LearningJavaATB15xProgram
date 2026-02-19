package LiveCodig.coding_challenge;

public class Employee_Challenge3 {
    /*
    Implement encapsulation in a class "Employee" with private attributes "id", "name", and "salary".
    Add getter and setter methods.
    Input:
    Employee with id=1, name="John Doe", salary=50000
    Output:
    Employee ID: 1 Employee Name: John Doe Employee Salary: 50000.0
     */
    private int id;
    private String name;
    private double salary;

    public static void main(String[] args) {
        Employee_Challenge3 e1 = new Employee_Challenge3();

        e1.setId(1);
        e1.setName("John Doe");
        e1.setSalary(50000);

        System.out.println("Employee ID: " + e1.getId());
        System.out.println("Employee Name: " + e1.getName());
        System.out.println("Employee Salary: " + e1.getSalary());
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

}
