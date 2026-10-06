import java.util.*; // Imports utility classes, including the Scanner class.

public class Program14PerfectNumber { // Declares the class Program14PerfectNumber.

    // This method calculates and returns the sum of the proper divisors of a number.
    public static int numberDivisorSum(int num) {

        int sum = 0; // Stores the sum of the proper divisors.

        // Checks every number from 1 up to num - 1.
        for (int i = 1; i < num; i++) {

            // Checks whether i is a divisor of num.
            if (num % i == 0) {

                // Adds the divisor to sum.
                sum += i;
            }
        }

        return sum; // Returns the sum of all proper divisors.
    }

    public static void main(String[] args) { // Main method where program execution starts.

        Scanner sc = new Scanner(System.in); // Creates a Scanner object to take user input.

        // Asks the user to enter a number.
        System.out.print("Enter a number to check whether it is a perfect number: ");

        int number = sc.nextInt(); // Reads the number entered by the user.

        // Handles invalid inputs such as 0 and negative numbers.
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            sc.close(); // Closes the Scanner object.
            return; // Terminates the program.
        }

        // Calculates the sum of the proper divisors.
        int divisorSum = numberDivisorSum(number);

        // Checks whether the number is equal to the sum of its proper divisors.
        if (number == divisorSum) {

            // Executes if the number is perfect.
            System.out.println("The given number is a perfect number.");

        } else {

            // Executes if the number is not perfect.
            System.out.println("The given number is not a perfect number.");
        }

        sc.close(); // Closes the Scanner object.
    }
}
/*
## Perfect Number — Full Explanation

### Definition

A **Perfect Number** is a positive number that is equal to the **sum of all its proper divisors**, excluding the number itself.

### What are proper divisors?

Proper divisors are the numbers that **divide the given number completely**, but **do not include the number itself**.

---

## Example 1: 6

The divisors of **6** are:

```text
1, 2, 3, 6
```

Proper divisors of 6:

```text
1, 2, 3
```

Now add them:

[
1 + 2 + 3 = 6
]

The sum of its proper divisors is equal to the original number.

[
\boxed{6 = 6}
]

Therefore, **6 is a Perfect Number**.

---

## Example 2: 28

The divisors of **28** are:

```text
1, 2, 4, 7, 14, 28
```

Proper divisors:

```text
1, 2, 4, 7, 14
```

Add them:

[
1 + 2 + 4 + 7 + 14 = 28
]

Since:

[
\boxed{28 = 28}
]

**28 is a Perfect Number.**

---

## Example 3: 12

Proper divisors of 12:

```text
1, 2, 3, 4, 6
```

Their sum:

[
1 + 2 + 3 + 4 + 6 = 16
]

Since:

[
16 \neq 12
]

**12 is not a Perfect Number.**

---

## Main Condition

[
\boxed{\text{Sum of Proper Divisors} = \text{Original Number}}
]

If the condition is true → **Perfect Number**
If the condition is false → **Not a Perfect Number**

### Common Perfect Numbers

```text
6, 28, 496, 8128
```

### Short Exam Definition

> **A perfect number is a positive number that is equal to the sum of its proper divisors, excluding the number itself.**

**Example:** `6` is a perfect number because:

[
1 + 2 + 3 = 6
]

*/