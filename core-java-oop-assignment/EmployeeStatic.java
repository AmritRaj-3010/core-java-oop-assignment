/*User Story:
As an admin, I want to use the same institute/company name for all employees so that it is shared across all objects.

Task to Perform:
Create a shared company name using static variable.

Concepts to Use:
static Keyword, Shared Data

Expected Output:
Same company name displayed for multiple employee objects */


//step 1: Create a class named EmployeeStatic
public class EmployeeStatic {

    int empId;
    String empName;

    //step 2: Declare static variable for company name (shared by all objects)
    static String companyName = "Tech Solutions Pvt Ltd";

    //step 3: Constructor to initialize employee details
    EmployeeStatic(int id, String name) {
        empId = id;
        empName = name;
    }

    //step 4: Method to display details
    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Company Name: " + companyName);
        System.out.println();
    }

    //step 5: Main method to create multiple objects
    public static void main(String[] args) {

        EmployeeStatic e1 = new EmployeeStatic(101, "Amrit");
        EmployeeStatic e2 = new EmployeeStatic(102, "Rahul");

        // Display details
        e1.displayDetails();
        e2.displayDetails();
    }
}


/*Output
Employee ID: 101
Employee Name: Amrit
Company Name: Tech Solutions Pvt Ltd

Employee ID: 102
Employee Name: Rahul
Company Name: Tech Solutions Pvt Ltd
*/