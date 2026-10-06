import java.util.*; // Imports utility classes, including the Scanner class.

public class Program27SpecialNumber {

    // This method calculates and returns the product of the digits
    // of a given number.
    public static int productOfDigit(int num) {

        int product = 1; // Stores the product of all digits.

        // Continues until all digits are processed.
        while (num > 0) {

            int rem = num % 10; // Extracts the last digit.

            product *= rem; // Multiplies the product by the digit.

            num /= 10; // Removes the last digit.
        }

        return product; // Returns the product of all digits.
    }

    // This method calculates and returns the sum of the digits
    // of a given number.
    public static int sumOfDigit(int num) {

        int sum = 0; // Stores the sum of all digits.

        // Continues until all digits are processed.
        while (num > 0) {

            int rem = num % 10; // Extracts the last digit.

            sum += rem; // Adds the digit to the sum.

            num /= 10; // Removes the last digit.
        }

        return sum; // Returns the sum of all digits.
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creates a Scanner object for user input.

        // Asks the user to enter a number.
        System.out.print(
                "Enter a number to check whether it is a Special Number: "
        );

        int number = sc.nextInt(); // Reads the number entered by the user.

        // Handles negative numbers.
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");

            sc.close(); // Closes the Scanner object.
            return; // Terminates the program.
        }

        // Handles the edge case where the number is 0.
        if (number == 0) {
            System.out.println("0 is not considered a Special Number.");

            sc.close(); // Closes the Scanner object.
            return; // Terminates the program.
        }

        // Calculates the sum of the digits.
        int sum = sumOfDigit(number);

        // Calculates the product of the digits.
        int product = productOfDigit(number);

        // Checks whether the sum and product together equal the original number.
        if (number == sum + product) {

            System.out.println(
                    "The given number is a Special Number."
            );

        } else {

            System.out.println(
                    "The given number is not a Special Number."
            );
        }

        sc.close(); // Closes the Scanner object.
    }
}
/*
Special Number
A Special Number can have different definitions depending on the syllabus or programming question. A common definition is:
Definition
A Special Number is a two-digit number where the sum of its digits plus the product of its digits is equal to the original number.
Example: 59
Sum of digits:
5+9=14
Product of digits:
5×9=45
Now add them:
14+45=59
Since:
59=59
​	
 
59 is a Special Number.
*/