import java.util.*;
// Imports all classes from the java.util package, including Scanner.

public class Program35BinaryToDecimal {
    // Declares the class Program35BinaryToDecimal.

    public static int binaryToDecimal(String binary) {
        // Method to convert a binary number into its decimal equivalent.

        int decimal = 0;
        // Stores the final decimal value.

        int pow = 1;
        // Stores the power of 2: 1, 2, 4, 8, and so on.

        int len = binary.length() - 1;
        // Stores the index of the last character in the binary String.

        while (len >= 0) {
            // Processes each binary digit from right to left.

            int rem = binary.charAt(len) - '0';
            // Gets the character at index len and converts it into an integer.
            // For example, '1' becomes 1 and '0' becomes 0.

            decimal = decimal + pow * rem;
            // Adds the value of the current binary digit to the decimal number.

            pow *= 2;
            // Moves to the next power of 2: 1 → 2 → 4 → 8 → ...

            len--;
            // Moves to the previous binary digit.
        }

        return decimal;
        // Returns the decimal equivalent.
    }

    public static void main(String[] args) {
        // Main method where program execution starts.

        Scanner sc = new Scanner(System.in);
        // Creates a Scanner object to take input from the user.

        System.out.print("Enter a binary number to convert it to decimal: ");
        // Asks the user to enter a binary number.

        String binary = sc.next();
        // Reads the binary number as a String.

        int decimal = binaryToDecimal(binary);
        // Calls the binaryToDecimal() method and stores the result.

        System.out.println(
            "The decimal representation of the given binary number is: "
            + decimal
        );
        // Displays the decimal equivalent.

        sc.close();
        // Closes the Scanner object.
    }
}

/*

Binary → Decimal
What it is: Convert a binary (base 2) number into decimal (base 10).
Example:
Binary = 1010
Decimal = 10

*/