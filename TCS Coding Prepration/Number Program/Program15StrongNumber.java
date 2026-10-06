import java.util.*; // Imports utility classes, including the Scanner class.

public class Program15StrongNumber { // Declares the class Program15StrongNumber.

    // This method calculates and returns the factorial of a single digit.
    public static int factorial(int digit) {

        // Handles the edge case because 0! is equal to 1.
        if (digit == 0) {
            return 1;
        }

        int fact = 1; // Stores the factorial of the digit.

        // Multiplies all numbers from 1 up to the given digit.
        for (int i = 1; i <= digit; i++) {
            fact *= i; // Multiplies fact by the current value of i.
        }

        return fact; // Returns the factorial of the digit.
    }

    // This method calculates the sum of the factorials of all digits.
    public static int strongNumberSum(int num) {

        int sum = 0; // Stores the sum of the factorials of the digits.

        // Handles the edge case where the number is 0.
        if (num == 0) {
            return factorial(0);
        }

        // Processes each digit of the number.
        while (num > 0) {

            int rem = num % 10; // Extracts the last digit.

            // Adds the factorial of the extracted digit to sum.
            sum += factorial(rem);

            num /= 10; // Removes the last digit from the number.
        }

        return sum; // Returns the sum of the factorials of all digits.
    }

    public static void main(String[] args) { // Main method where program execution starts.

        Scanner sc = new Scanner(System.in); // Creates a Scanner object to take user input.

        // Asks the user to enter a number.
        System.out.print("Enter a number to check whether it is a strong number: ");

        int number = sc.nextInt(); // Reads the number entered by the user.

        // Handles negative numbers.
        if (number < 0) {
            System.out.println("Please enter a non-negative number.");
            sc.close(); // Closes the Scanner object.
            return; // Terminates the program.
        }

        // Calculates the sum of the factorials of the digits.
        int strongSum = strongNumberSum(number);

        // Checks whether the original number is equal to the calculated sum.
        if (number == strongSum) {

            // Executes if the number is a strong number.
            System.out.println("The given number is a strong number.");

        } else {

            // Executes if the number is not a strong number.
            System.out.println("The given number is not a strong number.");
        }

        sc.close(); // Closes the Scanner object.
    }
}

/*

# Strong Number — Full Explanation

### Definition

A **Strong Number** is a number in which the **sum of the factorials of its individual digits is equal to the original number**.

### Main Condition

[
\boxed{\text{Sum of factorial of each digit} = \text{Original Number}}
]

---

## First, what is Factorial?

The factorial of a number (n) is written as:

[
n!
]

For example:

[
1! = 1
]

[
2! = 2 \times 1 = 2
]

[
3! = 3 \times 2 \times 1 = 6
]

[
4! = 4 \times 3 \times 2 \times 1 = 24
]

[
5! = 5 \times 4 \times 3 \times 2 \times 1 = 120
]

Also:

[
0! = 1
]

---

# Example 1: 145

Take each digit of **145**:

[
1,\ 4,\ 5
]

Find the factorial of each digit:

[
1! = 1
]

[
4! = 24
]

[
5! = 120
]

Now add them:

[
1! + 4! + 5!
]

[
= 1 + 24 + 120
]

[
= 145
]

Since:

[
\boxed{145 = 145}
]

Therefore, **145 is a Strong Number**.

---

# Example 2: 2

The factorial of 2 is:

[
2! = 2
]

Since:

[
\boxed{2 = 2}
]

**2 is also a Strong Number.**

---

# Example 3: 123

Take each digit:

[
1,\ 2,\ 3
]

Find factorials:

[
1! = 1
]

[
2! = 2
]

[
3! = 6
]

Add them:

[
1 + 2 + 6 = 9
]

But:

[
9 \neq 123
]

Therefore, **123 is not a Strong Number**.

---

## Simple Steps to Check a Strong Number

For a number like **145**:

1. Take the last digit → `5`
2. Find its factorial → `5! = 120`
3. Take the next digit → `4`
4. Find its factorial → `4! = 24`
5. Take the next digit → `1`
6. Find its factorial → `1! = 1`
7. Add all factorials:

[
120 + 24 + 1 = 145
]

8. Compare the sum with the original number.

If:

[
\text{Sum} = \text{Original Number}
]

→ **Strong Number**

Otherwise → **Not a Strong Number**

### Short Exam Definition

> **A Strong Number is a number whose sum of the factorials of its individual digits is equal to the original number.**

**Example:**

[
145 = 1! + 4! + 5! = 1 + 24 + 120 = 145
]

So, **145 is a Strong Number**.



*/