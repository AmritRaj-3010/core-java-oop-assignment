/*User Story:
As an admin, I want to initialize employee/trainer details directly so that I can avoid assigning values manually.

Task to Perform:
Create an Employee or Trainer class with empId, empName, salary using constructor.

Concepts to Use:
Constructor, Object Initialization

Expected Output:
Employee object initialized directly and displayed */


//step 1: Create a class named Employee
public class Employee {

    int empId;
    String empName;
    double salary;

    //step 2: Create a constructor to initialize values
    Employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    //step 3: Method to display employee details
    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }

    //step 4: Main method to create object using constructor
    public static void main(String[] args) {

        // Object initialization using constructor
        Employee e1 = new Employee(101, "Amrit", 50000);

        // Display details
        e1.displayDetails();
    }
}


/*Output
Employee ID: 101
Employee Name: Amrit
Salary: 50000.0
*/