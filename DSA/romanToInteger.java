import java.util.*;
class Solution {
    public int romanToInt(String s) {
         Map<String, Integer> values = new HashMap<>();

        values.put("I", 1);
        values.put("V", 5);
        values.put("X", 10);
        values.put("L", 50);
        values.put("C", 100);
        values.put("D", 500);
        values.put("M", 1000);

        values.put("IV", 4);
        values.put("IX", 9);
        values.put("XL", 40);
        values.put("XC", 90);
        values.put("CD", 400);
        values.put("CM", 900);

        int sum = 0;
        int i = 0;

        while (i < s.length()) {
            if (i < s.length() - 1) {
                String twoSymbols = s.substring(i, i + 2);

                if (values.containsKey(twoSymbols)) {
                    sum += values.get(twoSymbols);
                    i += 2;
                    continue;
                }
            }

            String oneSymbol = s.substring(i, i + 1);
            sum += values.get(oneSymbol);
            i++;
        }

        return sum;
    }
}



/*

Roman to Integer (LeetCode 13) – Detailed Explanation of All Approaches
Problem Statement
Roman numerals are represented by these symbols:
Symbol	Value
I	1
V	5
X	10
L	50
C	100
D	500
M	1000
Special Cases (Subtractive Notation)
Normally Roman numerals are added:
III = 1 + 1 + 1 = 3
VIII = 5 + 1 + 1 + 1 = 8
But sometimes a smaller numeral appears before a larger numeral:
Roman	Value
IV	4
IX	9
XL	40
XC	90
CD	400
CM	900
Example:
MCMXCIV
= M + CM + XC + IV
= 1000 + 900 + 90 + 4
= 1994
Approach 1: HashMap + Checking Two Characters
Idea
Store all Roman combinations in a HashMap.
Map
I  -> 1
V  -> 5
X  -> 10
L  -> 50
C  -> 100
D  -> 500
M  -> 1000

IV -> 4
IX -> 9
XL -> 40
XC -> 90
CD -> 400
CM -> 900
Then:
Check whether current and next character form a special pair.
If yes:
Add pair value.
Move index by 2.
Otherwise:
Add single character value.
Move index by 1.
Code
import java.util.*;

class Solution {
    public int romanToInt(String s) {

        Map<String, Integer> values = new HashMap<>();

        values.put("I", 1);
        values.put("V", 5);
        values.put("X", 10);
        values.put("L", 50);
        values.put("C", 100);
        values.put("D", 500);
        values.put("M", 1000);

        values.put("IV", 4);
        values.put("IX", 9);
        values.put("XL", 40);
        values.put("XC", 90);
        values.put("CD", 400);
        values.put("CM", 900);

        int sum = 0;
        int i = 0;

        while(i < s.length()) {

            if(i < s.length() - 1) {

                String twoSymbols = s.substring(i, i + 2);

                if(values.containsKey(twoSymbols)) {
                    sum += values.get(twoSymbols);
                    i += 2;
                    continue;
                }
            }

            String oneSymbol = s.substring(i, i + 1);
            sum += values.get(oneSymbol);

            i++;
        }

        return sum;
    }
}
Dry Run
Input:
s = "MCMXCIV"
Iteration 1
i = 0

"M"+"C" = "MC"

Not found

Take M = 1000

sum = 1000
Iteration 2
i = 1

"CM"

Found

sum += 900

sum = 1900

i += 2
Iteration 3
i = 3

"XC"

Found

sum += 90

sum = 1990
Iteration 4
i = 5

"IV"

Found

sum += 4

sum = 1994
Output:
1994
Complexity
Time
For every character:
O(n)
Space
HashMap stores values:
O(1)
(Constant size)
Approach 2: Compare Current and Next Value (Optimal)
This is the most commonly asked interview solution.
Observation
Look at:
IV
Values:
I = 1
V = 5
Since:
1 < 5
we should subtract:
5 - 1 = 4
Look at:
VI
Values:
5 > 1
So:
5 + 1 = 6
Rule
If
current < next
Subtract current.
Otherwise

Add current.

Algorithm
For every character:
current = value(s[i])

next = value(s[i+1])
If
current < next
do:
sum -= current;
Else:
sum += current;
Code
class Solution {

    public int romanToInt(String s) {

        int sum = 0;

        for(int i = 0; i < s.length(); i++) {

            int current = value(s.charAt(i));

            if(i < s.length()-1 &&
               current < value(s.charAt(i+1))) {

                sum -= current;
            }
            else {
                sum += current;
            }
        }

        return sum;
    }

    private int value(char ch) {

        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default : return 0;
        }
    }
}
Detailed Dry Run
Input:
MCMXCIV
i = 0
M = 1000

Next = C = 100

1000 > 100

Add
sum = 1000
i = 1
C = 100

Next = M = 1000

100 < 1000

Subtract
sum = 1000 - 100

sum = 900
i = 2
M = 1000

Next = X = 10

Add
sum = 1900
i = 3
X = 10

Next = C = 100

Subtract
sum = 1890
i = 4
C = 100

Next = I = 1

Add
sum = 1990
i = 5
I = 1

Next = V = 5

Subtract
sum = 1989
i = 6
V = 5

Add
sum = 1994
Final Answer:
1994
Approach 3: Right-to-Left Traversal
Another elegant approach.
Idea
Traverse from right to left.
Keep track of:

prevValue
If current value is smaller than previous value:
subtract
Otherwise:
add
Example
MCMXCIV
Traverse:
V → 5
I → 1
C → 100
X → 10
M → 1000
C → 100
M → 1000
Code
class Solution {

    public int romanToInt(String s) {

        int sum = 0;
        int prev = 0;

        for(int i = s.length()-1; i >= 0; i--) {

            int curr = value(s.charAt(i));

            if(curr < prev) {
                sum -= curr;
            }
            else {
                sum += curr;
            }

            prev = curr;
        }

        return sum;
    }

    private int value(char ch) {

        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }

        return 0;
    }
}
Comparison of Approaches
Approach	Time	Space	Interview Preference
HashMap + Pair Check	O(n)	O(1)	Good
Current < Next	O(n)	O(1)	Best
Right to Left	O(n)	O(1)	Excellent
Interview Answer
If an interviewer asks:
"Which solution would you choose?"

Answer:

I would use the Current Value vs Next Value approach because it traverses the string only once, uses constant space, avoids substring creation and HashMap lookups, and is the most efficient and commonly accepted solution for the Roman to Integer problem.
Time Complexity: O(n)
Space Complexity: O(1) ✅



*/