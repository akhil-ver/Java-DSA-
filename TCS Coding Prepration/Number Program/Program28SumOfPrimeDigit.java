import java.util.*; // Imports all classes from the java.util package, including Scanner.

public class Program28SumOfPrimeDigit { // Declares the class Program28SumOfPrimeDigit.

    public static boolean isPrime(int num) { // Method to check whether a number is prime.

        if (num <= 1) // 0 and 1 are not prime numbers.
            return false; // Returns false if the number is 0 or 1.

        for (int i = 2; i * i <= num; i++) { // Checks divisibility from 2 up to √num.

            if (num % i == 0) { // Checks if num is completely divisible by i.
                return false; // If divisible, num is not a prime number.
            }
        }

        return true; // Returns true if no divisor is found, so num is prime.
    }

    public static int sumPrimeDigit(int num) { // Method to find the sum of prime digits.

        int sum = 0; // Stores the sum of all prime digits.

        while (num > 0) { // Continues until all digits are processed.

            int rem = num % 10; // Extracts the last digit of the number.

            if (isPrime(rem)) { // Checks whether the extracted digit is prime.
                sum += rem; // Adds the prime digit to sum.
            }

            num /= 10; // Removes the last digit from the number.
        }

        return sum; // Returns the final sum of prime digits.
    }

    public static void main(String[] args) { // Main method where program execution begins.

        Scanner sc = new Scanner(System.in); // Creates a Scanner object to take input.

        System.out.print(
            "Enter a number to find the sum of its prime digits: "
        ); // Displays a message asking the user to enter a number.

        int number = sc.nextInt(); // Reads the number entered by the user.

        int sum = sumPrimeDigit(number);
        // Calls sumPrimeDigit() and stores the returned sum.

        System.out.println(
            "The sum of the prime digits in the given number is: " + sum
        ); // Displays the sum of prime digits.

        sc.close(); // Closes the Scanner object.
    }
}

/*

Sum of prime digits
What it is: Add only the digits that are prime numbers: 2, 3, 5, 7.
Example:
Number = 1234567
Prime digits = 2, 3, 5, 7
Sum = 2 + 3 + 5 + 7 = 17

*/
