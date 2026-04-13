/*User Story:
As an admin, I want to create a Student object so that I can store and display student information.

 Task to Perform
Create a Student class
Add fields: rollNo, name, marks
Create a method to display details
Create object and call method */


//step 1: Create a Student class
class Student {
    //step 2: Add fields: rollNo, name, marks
    int rollNo;
    String name;
    float marks;
//step 3: Create a method to display details
    void displayDetails() {
        //step 4: Create object and call method
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
//step 4: Create object and call method
class Main {
    //step 5: Create object and call method
    public static void main(String[] args) {
        Student s1 = new Student();
        //step 6: Create object and call method
        s1.rollNo = 101;
        s1.name = "Rahul";
        s1.marks = 85.5f;
        //step 7: Create object and call method
        s1.displayDetails();
    }
}

//Output:
//Roll No: 101
//Name: Rahul
//Marks: 85.5
