import java.util.*; // Imports utility classes, including the Scanner class.

public class Program17HarshadNumber { // Declares the class Program17HarshadNumber.

    // This method calculates and returns the sum of the digits of a number.
    public static int sumOfDigit(int num) {

        int sum = 0; // Stores the sum of all digits.

        // Continues until all digits are processed.
        while (num > 0) {

            int rem = num % 10; // Extracts the last digit.

            sum += rem; // Adds the extracted digit to sum.

            num /= 10; // Removes the last digit from the number.
        }

        return sum; // Returns the sum of all digits.
    }

    public static void main(String[] args) { // Main method where program execution starts.

        Scanner sc = new Scanner(System.in); // Creates a Scanner object to take user input.

        // Asks the user to enter a number.
        System.out.print("Enter a number to check whether it is a Harshad number: ");

        int number = sc.nextInt(); // Reads the number entered by the user.

        // Handles the edge case of 0 and negative numbers.
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            sc.close(); // Closes the Scanner object.
            return; // Terminates the program.
        }

        // Calculates the sum of the digits of the given number.
        int digitSum = sumOfDigit(number);

        // Checks whether the number is divisible by the sum of its digits.
        boolean result = number % digitSum == 0;

        // Displays whether the number is a Harshad number.
        if (result) {
            System.out.println("The given number is a Harshad number.");
        } else {
            System.out.println("The given number is not a Harshad number.");
        }

        sc.close(); // Closes the Scanner object.
    }
}

/*

# Harshad Number — Full Explanation

### Definition

A **Harshad Number** is a number that is **completely divisible by the sum of its digits**.

It is also called a **Niven Number**.

### Main Condition

[
\boxed{\text{Number} \bmod \text{Sum of its digits} = 0}
]

If the remainder is `0`, it is a **Harshad Number**.

---

## Example 1: 18

First, find the sum of its digits:

[
1 + 8 = 9
]

Now divide the number by the sum:

[
18 \div 9 = 2
]

The remainder is `0`.

Therefore:

[
\boxed{18 \text{ is a Harshad Number}}
]

---

## Example 2: 21

Sum of digits:

[
2 + 1 = 3
]

Now check:

[
21 \div 3 = 7
]

The remainder is `0`.

Therefore, **21 is a Harshad Number**.

---

## Example 3: 19

Sum of digits:

[
1 + 9 = 10
]

Now check:

[
19 \div 10
]

The remainder is:

[
9
]

Since the remainder is not `0`, **19 is not a Harshad Number**.

---

## Simple Steps

To check whether a number is a Harshad Number:

1. Take the number.
2. Find the **sum of its digits**.
3. Divide the original number by the digit sum.
4. If the remainder is `0` → **Harshad Number**.
5. Otherwise → **Not a Harshad Number**.

### Example: 1728

Sum of digits:

[
1 + 7 + 2 + 8 = 18
]

Now:

[
1728 \div 18 = 96
]

Since it is completely divisible:

[
\boxed{1728 \text{ is a Harshad Number}}
]

### Short Exam Definition

> **A Harshad Number is a number that is divisible by the sum of its digits.**

For example:

[
18 \div (1+8) = 18 \div 9 = 2
]

So, **18 is a Harshad Number**.


*/