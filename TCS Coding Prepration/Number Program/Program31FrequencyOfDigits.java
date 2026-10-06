import java.util.*; 
// Imports all classes from the java.util package, including Scanner and HashMap.

public class Program31FrequencyOfDigits {
    // Declares the class Program31FrequencyOfDigits.

    public static void main(String[] args) {
        // Main method where program execution starts.

        Scanner sc = new Scanner(System.in);
        // Creates a Scanner object to take input from the user.

        System.out.print("Enter a number to check the frequency of its digits: ");
        // Displays a message asking the user to enter a number.

        int number = sc.nextInt();
        // Reads the number entered by the user.

        HashMap<Integer, Integer> map = new HashMap<>();
        // Creates a HashMap to store each digit and its frequency.
        // Key   = digit
        // Value = number of times the digit occurs.

        while (number > 0) {
            // Repeats until all digits of the number are processed.

            int rem = number % 10;
            // Extracts the last digit of the number.

            map.put(rem, map.getOrDefault(rem, 0) + 1);
            // Gets the current frequency of the digit.
            // If the digit is not present, getOrDefault() returns 0.
            // Adds 1 to the frequency and stores the updated value.

            number /= 10;
            // Removes the last digit from the number.
        }

        for (int digit : map.keySet()) {
            // Iterates through each unique digit stored in the HashMap.

            System.out.println(
                digit + " occurs " + map.get(digit) + " time(s)."
            );
            // Displays each digit and the number of times it occurs.
        }

        sc.close();
        // Closes the Scanner object.
    }
}

/*
Frequency of digits
What it is: Count how many times each digit occurs in a number.
Example:
Number = 1223342
1 occurs 1 time
2 occurs 3 times
3 occurs 2 times
4 occurs 1 time
 */