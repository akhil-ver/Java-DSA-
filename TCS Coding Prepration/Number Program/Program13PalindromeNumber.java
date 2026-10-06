import java.util.*; // Imports utility classes, including the Scanner class.

public class Program13PalindromeNumber { // Declares the class Program13PalindromeNumber.

    // This method reverses and returns the given number.
    public static int reverse(int num) {

        int reversedNumber = 0; // Stores the reversed number.

        // Continues until all digits of the number are processed.
        while (num > 0) {

            int rem = num % 10; // Extracts the last digit of the number.

            num /= 10; // Removes the last digit from the number.

            // Builds the reversed number.
            reversedNumber = reversedNumber * 10 + rem;
        }

        return reversedNumber; // Returns the reversed number.
    }

    public static void main(String[] args) { // Main method where program execution starts.

        Scanner sc = new Scanner(System.in); // Creates a Scanner object to take user input.

        // Asks the user to enter a number.
        System.out.print("Enter a number to check whether it is a palindrome: ");

        int number = sc.nextInt(); // Reads the number entered by the user.

        // Handles negative numbers.
        if (number < 0) {
            System.out.println("Please enter a non-negative number.");
            sc.close(); // Closes the Scanner object.
            return; // Terminates the program.
        }

        // Calls the reverse method and stores the reversed number.
        int reversedNumber = reverse(number);

        // Checks whether the original number and reversed number are equal.
        if (reversedNumber == number) {

            // Executes if the number is a palindrome.
            System.out.println("The given number is a palindrome number.");

        } else {

            // Executes if the number is not a palindrome.
            System.out.println("The given number is not a palindrome number.");
        }

        sc.close(); // Closes the Scanner object.
    }
}
/*

## Palindrome Number — Full Explanation

### Definition

A **palindrome number** is a number that remains **exactly the same when its digits are reversed**.

In simple words:

> **If you read a number from left to right and from right to left, and both are the same, then it is called a palindrome number.**

---

### Example 1: 121

Original number:

```text
121
```

Reverse the digits:

```text
121
```

Both are the same:

```text
Original = 121
Reverse  = 121
```

Therefore:

**121 is a Palindrome Number.**

---

### Example 2: 1221

Original:

```text
1221
```

Reverse:

```text
1221
```

Since:

```text
1221 = 1221
```

**1221 is a palindrome number.**

---

### Example 3: 12321

Read from left to right:

```text
1 → 2 → 3 → 2 → 1
```

Read from right to left:

```text
1 → 2 → 3 → 2 → 1
```

Both are the same.

Therefore, **12321 is a palindrome number**.

---

### Example 4: 123

Original number:

```text
123
```

Reverse:

```text
321
```

Since:

```text
123 ≠ 321
```

**123 is not a palindrome number.**

---

## Important Condition

The main condition is:

[
\boxed{\text{Original Number} = \text{Reversed Number}}
]

If the original number and reversed number are equal → **Palindrome**.

If they are not equal → **Not a Palindrome**.

### Examples

| Number | Reverse | Result         |
| ------ | ------- | -------------- |
| 121    | 121     | Palindrome     |
| 1221   | 1221    | Palindrome     |
| 12321  | 12321   | Palindrome     |
| 11     | 11      | Palindrome     |
| 123    | 321     | Not Palindrome |
| 456    | 654     | Not Palindrome |

### Short Exam Definition

> **A palindrome number is a number that remains the same when its digits are reversed.**

For example, **121, 1221, and 12321** are palindrome numbers because their original and reversed values are the same.



*/