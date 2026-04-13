//wap in java to demonstrate inheritance by creating a parent class and a child class that inherits from it
// Inheritance is a fundamental object-oriented programming concept that allows a new class (called a child or subclass) to inherit properties and behaviors (fields and methods) from an existing class (called a parent or superclass). This promotes code reusability and establishes a natural hierarchical relationship between classes. In Java, inheritance is achieved using the "extends" keyword.

class StudentParent {
//step 1: declare parent class variable
    int rollNo = 101;
    String name = "Ram";
    //step 2: create method to display student details
    void showStudentDetails() {
        //step 3: display student details
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}
//step 4: define child class that inherits from parent class
class CollegeStudent extends StudentParent {
    //step 5: create child class variable
    String collegeName = "ABC College";
    //step 6: create method to display college details
    void showCollegeDetails() {
        System.out.println("College Name: " + collegeName);
    }
    //step 7: create main method to create object of child class and access parent and child class methods
    public static void main(String[] args) {
        // step 8: create object of child class
        CollegeStudent obj = new CollegeStudent();
        // step 9: access parent class method
        obj.showStudentDetails();
        // step 10: access child class method
        obj.showCollegeDetails();
    }
}




/*
declare parent class variable
define child class 
create child class method,object of child class 
access parent class */