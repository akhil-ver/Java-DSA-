import java.util.*; // Imports utility classes, including the Scanner class.

public class Program11LCMOfTwoNumber { // Declares the class Program11LCMOfTwoNumber.

    public static void main(String[] args) { // Main method where program execution starts.

        // Creates a Scanner object to take input from the user.
        Scanner sc = new Scanner(System.in);

        // Asks the user to enter two numbers.
        System.out.print("Enter two numbers to find their LCM: ");

        // Reads the first number.
        int num1 = sc.nextInt();

        // Reads the second number.
        int num2 = sc.nextInt();

        // Checks whether either number is 0.
        if (num1 == 0 || num2 == 0) {

            // The LCM of 0 and any number is considered 0.
            System.out.println("The LCM is 0 because one of the numbers is 0.");

            // Closes the Scanner object.
            sc.close();

            // Terminates the program.
            return;
        }

        // Converts num1 to a positive number if it is negative.
        num1 = Math.abs(num1);

        // Converts num2 to a positive number if it is negative.
        num2 = Math.abs(num2);

        // Starts checking from the larger of the two numbers.
        // The LCM cannot be smaller than the larger number.
        int lcm = Math.max(num1, num2);

        // Continues checking numbers until the LCM is found.
        while (true) {

            // Checks whether the current value of lcm is divisible by both numbers.
            if (lcm % num1 == 0 && lcm % num2 == 0) {

                // Stops the loop because the LCM has been found.
                break;
            }

            // Increases lcm by 1 to check the next number.
            lcm++;
        }

        // Displays the LCM of the two given numbers.
        System.out.println("The LCM of the given two numbers is: " + lcm);

        // Closes the Scanner object.
        sc.close();
    }
}