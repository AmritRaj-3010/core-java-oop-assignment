/*User Story:
As an admin, I want to format the student name so that I can display it in different formats.

Task to Perform:
Print student name in:
Original
Uppercase
Lowercase
Length

Concepts to Use:
Strings, String Methods (length(), toUpperCase(), toLowerCase())

Expected Output:
Name formatted correctly using String methods */



//step 1: Create a class named StudentNameFormat with a main method to demonstrate string manipulation by formatting a student's name in different ways.
public class StudentNameFormat {
    //step 2: In the main method, declare a String variable to store the student's name and use various String methods to display the name in its original form, uppercase, lowercase, and also display the length of the name to demonstrate how we can manipulate and retrieve information from strings in Java.
    public static void main(String[] args) {
        //step 3: Declare a String variable to store the student's name
        String name = "Rahul";

        //step 4: Display different formats
        System.out.println("Original Name: " + name);
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Length: " + name.length());
    }
}


/*Output
Original Name: Rahul
Uppercase: RAHUL
Lowercase: rahul
Length: 5 */