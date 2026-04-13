/*User Story:
As an admin, I want to store marks of 5 students so that I can display them one by one.

Task to Perform:
Create an array of 5 marks and print them using loop.

Concepts to Use:
Arrays, for loop, Indexing

Expected Output:
All marks displayed one by one */


//step 1: Create a class named StudentMarksArray with a main method
public class MarksArray {

    //step 2: In the main method, create an array and use loop to display values
    public static void main(String[] args) {

        //step 3: Declare and initialize an array of 5 student marks
        int[] marks = {85, 90, 78, 88, 92};

        //step 4: Use for loop to print marks one by one
        System.out.println("Student Marks:");

        for(int i = 0; i < marks.length; i++) {
            System.out.println("Marks of student " + (i+1) + ": " + marks[i]);
        }
    }
}


/*Output
Student Marks:
Marks of student 1: 85
Marks of student 2: 90
Marks of student 3: 78
Marks of student 4: 88
Marks of student 5: 92
*/