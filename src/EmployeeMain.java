class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return name;
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.name = "Rabin";
        E1.salary = 12345;
        System.out.println("Salary of the employee is  " + E1.getSalary());
        System.out.println("Name of employee is " + E1.getName());
        System.out.println("Name of new employee is " + E1.setName("sabin"));

    }
}
