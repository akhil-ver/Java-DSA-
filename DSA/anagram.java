package DSA;
import java.util.Scanner;

public class anagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.next();

        System.out.print("Enter second string: ");
        String t = sc.next();

        boolean result = isAnagram(s, t);

        System.out.println("Output: " + result);

        sc.close();
    }
}

/*
    Dry Run
            Input
            s = "anagram"
            t = "nagaram"
            Frequency Array Updates
            a -> +1, -1
            n -> +1, -1
            a -> +1, -1
            g -> +1, -1
            r -> +1, -1
            a -> +1, -1
            m -> +1, -1
            Final frequency array:
            [0,0,0,0,0,...]
            All values are 0.
            Return:
            true
            Time Complexity
            First Loop
            for (int i = 0; i < s.length(); i++)
            Runs n times.
            Second Loop
            for (int count : freq)
            Runs 26 times.
            Therefore:
            Time Complexity = O(n)
            Space Complexity
            We use:
            int[] freq = new int[26];
            Fixed size array.
            Space Complexity = O(1)
            Alternative Approach: Sorting
            import java.util.Arrays;

            class Solution {
                public boolean isAnagram(String s, String t) {

                    if (s.length() != t.length()) {
                        return false;
                    }

                    char[] a = s.toCharArray();
                    char[] b = t.toCharArray();

                    Arrays.sort(a);
                    Arrays.sort(b);

                    return Arrays.equals(a, b);
                }
            }
            Complexity
            Time Complexity: O(n log n)
            Space Complexity: O(n)
            Interview Answer
            Approach: Use a frequency array of size 26. Increase the count for characters in s and decrease for characters in t. If all counts become zero, both strings contain exactly the same characters with the same frequencies.
            Time Complexity: O(n)
            Space Complexity: O(1) ✅



*/
