import java.util.*; // Imports utility classes, including the Scanner class.

public class Program12ArmstrongNumber { // Declares the class Program12ArmstrongNumber.

    // This method counts and returns the number of digits in a given number.
    public static int digitCount(int num) {

        // Handles the edge case where the number is 0.
        // 0 has exactly one digit.
        if (num == 0) {
            return 1;
        }

        int count = 0; // Stores the total number of digits.

        // Continues until all digits are processed.
        while (num > 0) {
            count++; // Increases the digit count by 1.
            num /= 10; // Removes the last digit from the number.
        }

        return count; // Returns the total number of digits.
    }

    // This method calculates and returns the Armstrong sum of a number.
    public static int armstrongNumber(int num) {

        // Stores the original number because num will be modified.
        int originalNumber = num;

        // Finds the total number of digits.
        int countDigit = digitCount(num);

        int sum = 0; // Stores the sum of each digit raised to the power of countDigit.

        // Processes each digit of the number.
        while (num > 0) {

            int rem = num % 10; // Extracts the last digit.

            // Adds the digit raised to the power of the total number of digits.
            sum += (int) Math.pow(rem, countDigit);

            num /= 10; // Removes the last digit.
        }

        // Handles the case where the original number is 0.
        if (originalNumber == 0) {
            return 0;
        }

        return sum; // Returns the calculated Armstrong sum.
    }

    public static void main(String[] args) { // Main method where program execution starts.

        Scanner sc = new Scanner(System.in); // Creates a Scanner object to take user input.

        // Asks the user to enter a number.
        System.out.print("Enter a number to check whether it is an Armstrong number: ");

        int number = sc.nextInt(); // Reads the number entered by the user.

        // Armstrong numbers are normally defined for non-negative integers.
        if (number < 0) {
            System.out.println("Please enter a non-negative number.");
            sc.close(); // Closes the Scanner object.
            return; // Terminates the program.
        }

        // Calculates the Armstrong sum of the given number.
        int arm = armstrongNumber(number);

        // Checks whether the calculated Armstrong sum is equal to the original number.
        if (number == arm) {
            System.out.println("The given number is an Armstrong number.");
        } else {
            System.out.println("The given number is not an Armstrong number.");
        }

        sc.close(); // Closes the Scanner object.
    }
}
/*

An **Armstrong number** (also called a **narcissistic number**) is a number that is equal to the sum of its own digits, where each digit is raised to the power of the total number of digits in the number.

### Formula

For an (n)-digit number:

[
\text{Number} = d_1^n + d_2^n + \cdots + d_n^n
]

where (d_1, d_2, \ldots, d_n) are the digits of the number.

### Example 1: 153

153 has 3 digits.

[
1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
]

Since the sum equals the original number, **153 is an Armstrong number**.

### Example 2: 370

370 has 3 digits.

[
3^3 + 7^3 + 0^3 = 27 + 343 + 0 = 370
]

So, **370 is also an Armstrong number**.

### Example 3: 123

123 has 3 digits.

[
1^3 + 2^3 + 3^3 = 1 + 8 + 27 = 36
]

Since 36 is not equal to 123, **123 is not an Armstrong number**.

### Common Armstrong numbers

* 0
* 1
* 153
* 370
* 371
* 407

In simple terms, an **Armstrong number is a number that is equal to the sum of its digits, each raised to the power of the number of digits.**



*/