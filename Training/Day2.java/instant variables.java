//wap in java to show how instant variables diffrent from user variables 
/*public class StudentThisDemo {

    // Step 1: instance variables
    int rollNo;
    String name;
    // Step 2: constructor
    StudentThisDemo(int rollNo, String name) {
        // Step 3: use this keyword
        this.rollNo = rollNo;
        this.name = name;
    }
    // Step 4: display method
    void display() {
        System.out.println("Student Roll No: " + rollNo);
        System.out.println("Student Name: " + name);
    }
    // Step 5: main method
    public static void main(String[] args) {
        // Step 6: create objects
        StudentThisDemo s1 = new StudentThisDemo(1, "Amit");
        StudentThisDemo s2 = new StudentThisDemo(2, "Riya");
        // Step 7: display details
        s1.display();
        s2.display();
    }
}*/


//wap in java to show how instant variables diffrent from user variables

// step 1: declare instance variables
class Student {
    int rollNo;
    String name;
    // step 2: create constructor with same variable name as instance variables
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    // step 3: create method to display student details
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
    // step 4: create main method to create student objects and display their details
    public static void main(String[] args) {
        // step 5: create student objects and display their details
        Student s1 = new Student(1, "Abc");
        Student s2 = new Student(2, "Def");
        // step 6: display student details
        s1.display();
        s2.display();
    }
}