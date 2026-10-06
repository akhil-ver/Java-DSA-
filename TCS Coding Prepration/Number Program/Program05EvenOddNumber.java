import java.util.*; // Imports utility classes, including the Scanner class.

public class Program05EvenOddNumber { // Declares the class Program05EvenOddNumber.

    public static void main(String[] args) { // Main method where program execution starts.

        Scanner sc = new Scanner(System.in); // Creates a Scanner object to take user input.

        // Asks the user to enter a number.
        System.out.print("Enter a number to check whether it is even or odd: ");

        int number = sc.nextInt(); // Reads the number entered by the user.

        // Checks whether the number is divisible by 2.
        if (number % 2 == 0) {

            // Executes if the number is even.
            System.out.println("The given number is even.");

        } else {

            // Executes if the number is odd.
            System.out.println("The given number is odd.");
        }

        sc.close(); // Closes the Scanner object.
    }
}