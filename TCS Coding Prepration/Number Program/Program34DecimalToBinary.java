import java.util.*;
// Imports all classes from the java.util package, including Scanner.

public class Program34DecimalToBinary {
    // Declares the class Program34DecimalToBinary.

    public static String decimalToBinary(int deci) {
        // Method to convert a decimal number into binary and return it as a String.

        if (deci == 0) {
            // Handles the special case because the while loop will not execute for 0.
            return "0";
        }

        boolean isNegative = deci < 0;
        // Checks whether the original decimal number is negative.

        deci = Math.abs(deci);
        // Converts the number to positive for easier processing.

        StringBuilder s = new StringBuilder();
        // Stores the binary digits.

        while (deci > 0) {
            // Repeats until the decimal number becomes 0.

            int rem = deci % 2;
            // Finds the remainder after dividing the number by 2.
            // The remainder will be either 0 or 1.

            s.append(rem);
            // Adds the binary digit.
            // The digits are initially stored in reverse order.

            deci /= 2;
            // Divides the decimal number by 2.
        }

        s.reverse();
        // Reverses the binary digits to get the correct order.

        if (isNegative) {
            // Adds the negative sign if the original number was negative.
            s.insert(0, "-");
        }

        return s.toString();
        // Converts the StringBuilder into a String and returns it.
    }


    /*
     * Alternative Method: Return the binary number as an integer.
     *
     * Note:
     * This method is suitable only for smaller numbers because the binary
     * representation can exceed the range of the int data type.
     */

    public static int decimalToBinaryInteger(int deci) {
        // Method to convert a positive decimal number into binary
        // and return the result as an integer.

        if (deci == 0) {
            // Handles the special case of 0.
            return 0;
        }

        int binary = 0;
        // Stores the binary representation as an integer.

        int pow = 1;
        // Stores the place value: 1, 10, 100, 1000, and so on.

        while (deci > 0) {
            // Repeats until the decimal number becomes 0.

            int rem = deci % 2;
            // Finds the remainder after dividing by 2.

            binary = binary + rem * pow;
            // Places the binary digit at the correct position.

            pow *= 10;
            // Moves to the next decimal place.

            deci /= 2;
            // Divides the decimal number by 2.
        }

        return binary;
        // Returns the binary representation as an integer.
    }


    public static void main(String[] args) {
        // Main method where program execution starts.

        Scanner sc = new Scanner(System.in);
        // Creates a Scanner object to take input from the user.

        System.out.print("Enter a decimal number to convert it to binary: ");
        // Asks the user to enter a decimal number.

        int decimal = sc.nextInt();
        // Reads the decimal number entered by the user.


        // ---------- Returning Binary as a String ----------

        String binaryString = decimalToBinary(decimal);
        // Calls the method that returns the binary value as a String.

        System.out.println(
                "Binary representation in String format: " + binaryString
        );
        // Displays the binary number returned as a String.


        // ---------- Returning Binary as an Integer ----------

        if (decimal >= 0) {
            // The integer method currently handles non-negative numbers.

            int binaryInteger = decimalToBinaryInteger(decimal);
            // Calls the method that returns the binary value as an integer.

            System.out.println(
                    "Binary representation in integer format: " + binaryInteger
            );
            // Displays the binary number returned as an integer.
        } else {
            // Executes if the number is negative.

            System.out.println(
                    "Integer format is not used for negative binary representation."
            );
        }

        sc.close();
        // Closes the Scanner object.
    }
}
/*

Decimal → Binary
What it is: Convert a decimal (base 10) number into binary (base 2).
Example:
Decimal = 10
Binary = 1010
*/