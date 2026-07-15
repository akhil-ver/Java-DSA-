import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static Character firstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find the first non-repeating character
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return null; // No non-repeating character
    }

    public static void main(String[] args) {
        String str = "swiss";
        Character result = firstNonRepeatingChar(str);

        if (result != null) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}