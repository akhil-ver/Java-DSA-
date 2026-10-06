import java.util.*; // Imports utility classes, including Scanner and HashSet.

public class Program20HappyNumber { // Declares the class Program20HappyNumber.

    // This method calculates and returns the sum of the squares of the digits.
    public static int digitSquareSum(int num) {

        int sum = 0; // Stores the sum of the squares of the digits.

        // Continues until all digits are processed.
        while (num > 0) {

            int rem = num % 10; // Extracts the last digit.

            // Adds the square of the digit to sum.
            sum += rem * rem;

            num /= 10; // Removes the last digit from the number.
        }

        return sum; // Returns the sum of the squares of the digits.
    }

    // This method checks whether a number is a Happy Number.
    public static boolean happyNumber(int num) {

        // Creates a HashSet to store numbers that have already appeared.
        Set<Integer> visited = new HashSet<>();

        // Continues until the number becomes 1
        // or a previously visited number appears.
        while (num != 1 && !visited.contains(num)) {

            // Stores the current number to detect a cycle.
            visited.add(num);

            // Replaces num with the sum of the squares of its digits.
            num = digitSquareSum(num);
        }

        // Returns true if the number eventually becomes 1.
        return num == 1;
    }

    public static void main(String[] args) { // Main method where program execution starts.

        Scanner sc = new Scanner(System.in); // Creates a Scanner object for user input.

        // Asks the user to enter a number.
        System.out.print("Enter a number to check whether it is a Happy Number: ");

        int number = sc.nextInt(); // Reads the number entered by the user.

        // Handles 0 and negative numbers.
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");

            sc.close(); // Closes the Scanner object.
            return; // Terminates the program.
        }

        // Checks whether the given number is a Happy Number.
        boolean result = happyNumber(number);

        // Displays the result.
        if (result) {
            System.out.println("The given number is a Happy Number.");
        } else {
            System.out.println("The given number is not a Happy Number.");
        }

        sc.close(); // Closes the Scanner object.
    }
}
/*
Happy Number
Definition
A Happy Number is a number that eventually becomes 1 when you repeatedly replace the number with the sum of the squares of its digits.
Example: 19
19→1 
2
 +9 
2
 
=1+81=82
Now repeat:
82→8 
2
 +2 
2
 =64+4=68
68→6 
2
 +8 
2
 =36+64=100
100→1 
2
 +0 
2
 +0 
2
 =1
Since it finally becomes 1:
19 is a Happy Number.

*/