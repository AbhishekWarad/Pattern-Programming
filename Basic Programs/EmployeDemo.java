/**
 * Employee
 */
class Employee{

    String name;
    int age;
    int salary;
    String empID;
}

/**
 * EmployeDemo
 */
public class EmployeDemo {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 , e4;
        e3 = e2;
        e4 = e2;
        e1.name = "Abhishek Warad";
        e1.age = 23;
        e1.salary = 50000;
        e2.name = "Adarsh Jange";
        e3.age = 45;
        e4.salary = 100000;
        System.out.println(e1.age);
        System.out.println(e2.age);
        System.out.println(e3.age);
        System.out.println(e4.age);
        e3.age = 60;
        System.out.println(e1.age);
        System.out.println(e2.age);
        System.out.println(e3.age);
        System.out.println(e4.age);
        e1=e2;
        System.out.println(e1.age);
        System.out.println(e1.age);
        System.out.println(e1.age);
        System.out.println(e1.age);
    }
}