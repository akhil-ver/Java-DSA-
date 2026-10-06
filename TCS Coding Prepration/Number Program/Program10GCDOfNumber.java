import java.util.*; // Imports utility classes, including the Scanner class.

public class Program10GCDOfNumber { // Declares the class Program10GCDOfNumber.

    // This method calculates and returns the GCD of two numbers using recursion.
    public static int GCDNumber(int a, int b) {

        // Base case: when b becomes 0, a is the GCD.
        if (b == 0) {
            return a;
        }

        // Recursively calculates the GCD.
        return GCDNumber(b, a % b);
    }

    public static void main(String[] args) { // Main method where program execution starts.

        Scanner sc = new Scanner(System.in); // Creates a Scanner object to take user input.

        // Asks the user to enter two numbers.
        System.out.print("Enter two numbers to find their GCD: ");

        int num1 = sc.nextInt(); // Reads the first number.
        int num2 = sc.nextInt(); // Reads the second number.

        // Handles the edge case where both numbers are 0.
        if (num1 == 0 && num2 == 0) {
            System.out.println("GCD is undefined when both numbers are 0.");
            sc.close(); // Closes the Scanner object.
            return; // Terminates the program.
        }

        // Converts negative numbers to positive numbers.
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        // Calls the GCDNumber method and stores the result.
        int gcd = GCDNumber(num1, num2);

        // Displays the GCD of the given numbers.
        System.out.println("The GCD of the given numbers is: " + gcd);

        sc.close(); // Closes the Scanner object.
    }
}