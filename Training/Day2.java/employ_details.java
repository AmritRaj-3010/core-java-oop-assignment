//wap in java to create constructor of employee class to initialize employ data
/*public class EmployeeData{
    //step 1 declare employee detail
    int empId;
    string empName;
    double empSalary;
    // step2 constructor
    EmployeeData(int id, string name, double salary){
        empId = id;
        empName = name;
        empSalary = salary;
    }
    //step 3 display employee details
    void displayEmployee()
    {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + empSalary);
    }
    public static void main(String[] args) {
        //step 4 create object and pass value directly
        EmployeeData emp1 = new EmployeeData(101, "John Doe", 50000);
        //step 5 display employee details
        emp1.displayEmployee();
    }
}*/




//wap in java to create constructor of employee class to initialize employ data for user friendly input


import java.util.Scanner;
public class employ_details{

    private static int intid;

    //step 1 declare employee detail
    int empId;
    String empName;
    double empSalary;

    // step2 constructor
    public employ_details(int id, String name, double salary) {
        empId = id;
        empName = name;
        empSalary = salary;
    }
    //step 3 display employee details
    void displayEmployee()
    {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + empSalary);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //step 4 get user input
        System.out.print("Enter Employee ID: ");
        scanner.nextLine();
         // consume the newline character
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();
        //step 5 create object and pass user input
        employ_details emp1 = new employ_details(intid, name, salary);
        //step 6 display employee details
        emp1.displayEmployee();
    }
}