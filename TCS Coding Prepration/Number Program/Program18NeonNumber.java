import java.util.*; // Imports utility classes, including the Scanner class.

public class Program18NeonNumber { // Declares the class Program18NeonNumber.

    // This method calculates and returns the sum of the digits of a number.
    public static int sumOfDigit(long num) {

        // Handles the edge case where the number is 0.
        if (num == 0) {
            return 0;
        }

        int sum = 0; // Stores the sum of all digits.

        // Continues until all digits are processed.
        while (num > 0) {

            int rem = (int) (num % 10); // Extracts the last digit.

            sum += rem; // Adds the extracted digit to sum.

            num /= 10; // Removes the last digit from the number.
        }

        return sum; // Returns the sum of all digits.
    }

    public static void main(String[] args) { // Main method where program execution starts.

        Scanner sc = new Scanner(System.in); // Creates a Scanner object to take user input.

        // Asks the user to enter a number.
        System.out.print("Enter a number to check whether it is a Neon Number: ");

        int number = sc.nextInt(); // Reads the number entered by the user.

        // Handles negative numbers because Neon Numbers are non-negative.
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");

            sc.close(); // Closes the Scanner object.
            return; // Terminates the program.
        }

        // Calculates the square of the given number.
        // long is used to reduce the risk of integer overflow.
        long square = (long) number * number;

        // Calculates the sum of the digits of the square.
        int digitSum = sumOfDigit(square);

        // Checks whether the original number is equal to the sum of
        // the digits of its square.
        boolean result = number == digitSum;

        // Displays whether the number is a Neon Number.
        if (result) {
            System.out.println("The given number is a Neon Number.");
        } else {
            System.out.println("The given number is not a Neon Number.");
        }

        sc.close(); // Closes the Scanner object.
    }
}
/*

# Neon Number — Full Explanation

### Definition

A **Neon Number** is a number where the **sum of the digits of its square is equal to the original number**.

### Main Condition

[
\boxed{\text{Sum of digits of }(Number)^2 = Number}
]

---

## Example 1: 9

First, find the square of `9`:

[
9^2 = 81
]

Now add the digits of `81`:

[
8 + 1 = 9
]

The result is equal to the original number:

[
\boxed{9 = 9}
]

Therefore, **9 is a Neon Number**.

---

## Example 2: 1

Square of `1`:

[
1^2 = 1
]

Sum of its digits:

[
1
]

Since:

[
\boxed{1 = 1}
]

**1 is also a Neon Number**.

---

## Example 3: 8

Square of `8`:

[
8^2 = 64
]

Add the digits:

[
6 + 4 = 10
]

Since:

[
10 \neq 8
]

Therefore, **8 is not a Neon Number**.

---

## Simple Steps to Check a Neon Number

1. Take the original number.
2. Find its **square**.
3. Find the **sum of the digits** of the square.
4. Compare the sum with the original number.
5. If both are equal → **Neon Number**.
6. Otherwise → **Not a Neon Number**.

### Short Exam Definition

> **A Neon Number is a number where the sum of the digits of its square is equal to the original number.**

### Example

[
9^2 = 81
]

[
8 + 1 = 9
]

Therefore, **9 is a Neon Number**.



*/