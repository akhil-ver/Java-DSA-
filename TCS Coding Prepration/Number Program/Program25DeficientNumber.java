import java.util.*; // Imports utility classes, including the Scanner class.

public class Program25DeficientNumber {

    // This method calculates and returns the sum of the proper divisors
    // of the given number using an optimized approach.
    public static int sumDivisor(int num) {

        // 0 and 1 do not have any proper divisors.
        if (num <= 1) {
            return 0;
        }

        // 1 is a proper divisor of every number greater than 1.
        int sum = 1;

        // Checks divisors only up to the square root of num.
        for (int i = 2; i * i <= num; i++) {

            // Checks whether i divides num completely.
            if (num % i == 0) {

                // Adds i as a proper divisor.
                sum += i;

                // Finds the corresponding divisor pair.
                int pairDivisor = num / i;

                // Avoids adding the same divisor twice for perfect squares.
                if (pairDivisor != i) {
                    sum += pairDivisor;
                }
            }
        }

        // Returns the sum of all proper divisors.
        return sum;
    }

    public static void main(String[] args) {

        // Creates a Scanner object for user input.
        Scanner sc = new Scanner(System.in);

        // Asks the user to enter a number.
        System.out.print(
                "Enter a number to check whether it is a Deficient Number: "
        );

        // Reads the number entered by the user.
        int number = sc.nextInt();

        // Handles 0 and negative numbers.
        // Deficient Numbers are positive integers.
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");

            sc.close(); // Closes the Scanner object.
            return; // Terminates the program.
        }

        // Calculates the sum of the proper divisors.
        int sum = sumDivisor(number);

        // Checks whether the sum of proper divisors is less than the number.
        if (sum < number) {

            // Executes if the number is a Deficient Number.
            System.out.println("The given number is a Deficient Number.");

        } else {

            // Executes if the number is not a Deficient Number.
            System.out.println(
                    "The given number is not a Deficient Number."
            );
        }

        // Closes the Scanner object.
        sc.close();
    }
}

/*
Deficient Number
Definition
A Deficient Number is a number whose sum of proper divisors is less than the number itself.
Example: 10
Proper divisors:
1,2,5
Their sum:
1+2+5=8
Since:
8<10
10 is a Deficient Number.
Main Condition
Sum of proper divisors<Number
​	
 
*/