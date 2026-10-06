import java.util.*; // Imports utility classes, including the Scanner class.

public class Program16AutomorphicNumber { // Declares the class Program16AutomorphicNumber.

    // This method counts and returns the number of digits in a given number.
    public static int digitCount(int num) {

        // Handles the edge case where the number is 0.
        // The number 0 has exactly one digit.
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

    // This method checks whether a number is an Automorphic Number.
    public static boolean automorphicNumber(int num) {

        // Handles the edge case where the number is 0.
        // 0² = 0, which ends with 0.
        if (num == 0) {
            return true;
        }

        // Counts the number of digits in the given number.
        int countDigit = digitCount(num);

        // Calculates the square using long to reduce the risk of integer overflow.
        long square = (long) num * num;

        // Creates a divisor equal to 10 raised to the number of digits.
        int divisor = 1;

        // Calculates 10^countDigit.
        for (int i = 0; i < countDigit; i++) {
            divisor *= 10;
        }

        // Extracts the last countDigit digits from the square
        // and compares them with the original number.
        return square % divisor == num;
    }

    public static void main(String[] args) { // Main method where program execution starts.

        Scanner sc = new Scanner(System.in); // Creates a Scanner object to take user input.

        // Asks the user to enter a number.
        System.out.print("Enter a number to check whether it is an Automorphic number: ");

        int number = sc.nextInt(); // Reads the number entered by the user.

        // Handles negative numbers.
        if (number < 0) {
            System.out.println("Please enter a non-negative number.");
            sc.close(); // Closes the Scanner object.
            return; // Terminates the program.
        }

        // Calls the automorphicNumber method.
        boolean isAutomorphic = automorphicNumber(number);

        // Checks whether the number is Automorphic.
        if (isAutomorphic) {
            System.out.println("The given number is an Automorphic number.");
        } else {
            System.out.println("The given number is not an Automorphic number.");
        }

        sc.close(); // Closes the Scanner object.
    }
}

/*

# Automorphic Number — Full Explanation

### Definition

An **Automorphic Number** is a number whose **square ends with the same digits as the original number**.

### Main Condition

[
\boxed{\text{The square of the number ends with the number itself}}
]

---

## Example 1: 5

Square of 5:

[
5^2 = 25
]

The square **25** ends with **5**.

```text
25
 ↑
 5
```

Therefore, **5 is an Automorphic Number**.

---

## Example 2: 25

Square of 25:

[
25^2 = 625
]

The square **625** ends with **25**.

```text
625
 ↑↑
 25
```

Therefore, **25 is an Automorphic Number**.

---

## Example 3: 76

Square of 76:

[
76^2 = 5776
]

The square **5776** ends with **76**.

Therefore, **76 is an Automorphic Number**.

---

## Example 4: 7

Square of 7:

[
7^2 = 49
]

The square **49** does **not** end with 7.

Therefore, **7 is not an Automorphic Number**.

---

## Simple Steps to Check

For any number:

1. Take the number.
2. Find its square.
3. Check the last digits of the square.
4. If the square ends with the original number → **Automorphic Number**.
5. Otherwise → **Not an Automorphic Number**.

### Short Exam Definition

> **An Automorphic Number is a number whose square ends with the same digits as the original number.**

**Examples:** `1`, `5`, `6`, `25`, `76`, `376`, `625`


*/