import java.util.ArrayList;
import java.util.List;

class Employee {
    String name;
    int employeeId;
    double salary;

    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }
}

class EmployeeManagementSystem {
    List<Employee> employees = new ArrayList<>();

    void addEmployee(Employee employee) {
        employees.add(employee);
    }

    void displayEmployeeDetails() {
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.employeeId +
                               ", Name: " + employee.name +
                               ", Salary: $" + employee.salary);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        Employee employee1 = new Employee("John Doe", 101, 50000);
        Employee employee2 = new Employee("Jane Smith", 102, 60000);

        ems.addEmployee(employee1);
        ems.addEmployee(employee2);

        ems.displayEmployeeDetails();
    }
}
