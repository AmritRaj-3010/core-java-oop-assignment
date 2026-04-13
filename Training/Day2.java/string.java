//WAP in java to perform various string operations

/*String input
Length
Uppercase
Lowercase
Reverse*/
import java.util.Scanner;

class StringDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Length
        System.out.println("Length: " + str.length());

        // Uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // Reverse string
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        System.out.println("Reverse: " + reverse);

        sc.close();
    }
}