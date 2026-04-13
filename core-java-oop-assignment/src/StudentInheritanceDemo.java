/*User Story:
As an admin, I want to distinguish between general students and college students so that I can reuse common student details.

Task to Perform:
Create Student as parent class and CollegeStudent as child class using extends.

Concepts to Use:
Inheritance, Parent Class, Child Class

Expected Output:
Parent and child class properties displayed correctly */


//step 1: Create parent class Student
class Student {

    int rollNo;
    String name;

    // Method to set student details
    void setStudent(int r, String n) {
        rollNo = r;
        name = n;
    }

    // Method to display student details
    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}


//step 2: Create child class CollegeStudent using inheritance
class CollegeStudent extends Student {

    String collegeName;

    // Method to set college details
    void setCollege(String c) {
        collegeName = c;
    }

    // Method to display all details
    void displayAll() {
        displayStudent(); // calling parent method
        System.out.println("College Name: " + collegeName);
    }
}


//step 3: Main class
public class StudentInheritanceDemo {

    public static void main(String[] args) {

        CollegeStudent s1 = new CollegeStudent();

        // Setting values
        s1.setStudent(101, "Amrit");
        s1.setCollege("AKTU University");

        // Display details
        s1.displayAll();
    }
}


/*Output
Roll No: 101
Name: Amrit
College Name: AKTU University
*/