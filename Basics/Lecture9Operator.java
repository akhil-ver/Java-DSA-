        package Basics;

        /*

        # Operators in Java (Complete Detailed Explanation)

        ## What is an Operator?

        An **operator** is a symbol that performs an operation on one or more operands (variables or values).

        Example:

        ```java
        int a = 10;
        int b = 5;

        int sum = a + b;
        ```

        Here:

        * `+` is an operator.
        * `a` and `b` are operands.

        Output:

        ```
        15
        ```

        ---

        # Types of Operators in Java

        Java operators are divided into:

        1. Arithmetic Operators
        2. Unary Operators
        3. Assignment Operators
        4. Relational (Comparison) Operators
        5. Logical Operators
        6. Bitwise Operators
        7. Shift Operators
        8. Ternary Operator
        9. instanceof Operator

        ---

        # 1. Arithmetic Operators

        Used for mathematical calculations.

        | Operator | Meaning             |
        | -------- | ------------------- |
        | +        | Addition            |
        | -        | Subtraction         |
        | *        | Multiplication      |
        | /        | Division            |
        | %        | Modulus (Remainder) |

        ## Example

        ```java
        public class ArithmeticDemo {
            public static void main(String[] args) {

                int a = 20;
                int b = 10;

                System.out.println("Addition = " + (a + b));
                System.out.println("Subtraction = " + (a - b));
                System.out.println("Multiplication = " + (a * b));
                System.out.println("Division = " + (a / b));
                System.out.println("Remainder = " + (a % b));
            }
        }
        ```

        ### Output

        ```
        Addition = 30
        Subtraction = 10
        Multiplication = 200
        Division = 2
        Remainder = 0
        ```

        ---

        # 2. Unary Operators

        Work on a single operand.

        ## Unary Plus (+)

        ```java
        int a = 10;
        System.out.println(+a);
        ```

        Output:

        ```
        10
        ```

        ---

        ## Unary Minus (-)

        ```java
        int a = 10;
        System.out.println(-a);
        ```

        Output:

        ```
        -10
        ```

        ---

        ## Increment Operator (++)

        Increases value by 1.

        ### Pre Increment

        ```java
        int a = 10;
        System.out.println(++a);
        ```

        ### Execution

        ```
        a = 10
        a = a + 1
        a = 11
        print 11
        ```

        Output:

        ```
        11
        ```

        ---

        ### Post Increment

        ```java
        int a = 10;
        System.out.println(a++);
        System.out.println(a);
        ```

        ### Execution

        ```
        Print 10 first
        Then increment
        a becomes 11
        ```

        Output:

        ```
        10
        11
        ```

        ---

        ## Decrement Operator (--)

        ### Pre Decrement

        ```java
        int a = 10;
        System.out.println(--a);
        ```

        Output:

        ```
        9
        ```

        ---

        ### Post Decrement

        ```java
        int a = 10;
        System.out.println(a--);
        System.out.println(a);
        ```

        Output:

        ```
        10
        9
        ```

        ---

        # 3. Assignment Operators

        Used to assign values.

        ## Simple Assignment (=)

        ```java
        int a = 10;
        ```

        ---

        ## Add and Assign (+=)

        ```java
        int a = 10;

        a += 5;
        ```

        Equivalent to:

        ```java
        a = a + 5;
        ```

        Output:

        ```
        15
        ```

        ---

        ## Subtract and Assign (-=)

        ```java
        a -= 3;
        ```

        Equivalent:

        ```java
        a = a - 3;
        ```

        ---

        ## Multiply and Assign (*=)

        ```java
        a *= 2;
        ```

        Equivalent:

        ```java
        a = a * 2;
        ```

        ---

        ## Divide and Assign (/=)

        ```java
        a /= 2;
        ```

        Equivalent:

        ```java
        a = a / 2;
        ```

        ---

        ## Modulus and Assign (%=)

        ```java
        a %= 3;
        ```

        Equivalent:

        ```java
        a = a % 3;
        ```

        ---

        ## Complete Example

        ```java
        public class AssignmentDemo {
            public static void main(String[] args) {

                int a = 10;

                a += 5;
                System.out.println(a);

                a -= 3;
                System.out.println(a);

                a *= 2;
                System.out.println(a);

                a /= 4;
                System.out.println(a);

                a %= 3;
                System.out.println(a);
            }
        }
        ```

        Output:

        ```
        15
        12
        24
        6
        0
        ```

        ---

        # 4. Relational Operators

        Compare two values and return boolean result.

        | Operator | Meaning               |
        | -------- | --------------------- |
        | ==       | Equal To              |
        | !=       | Not Equal To          |
        | >        | Greater Than          |
        | <        | Less Than             |
        | >=       | Greater Than or Equal |
        | <=       | Less Than or Equal    |

        ---

        ## Example

        ```java
        public class RelationalDemo {
            public static void main(String[] args) {

                int a = 10;
                int b = 20;

                System.out.println(a == b);
                System.out.println(a != b);
                System.out.println(a > b);
                System.out.println(a < b);
                System.out.println(a >= b);
                System.out.println(a <= b);
            }
        }
        ```

        Output:

        ```
        false
        true
        false
        true
        false
        true
        ```

        ---

        # 5. Logical Operators

        Used with boolean values.

        | Operator | Meaning     |
        | -------- | ----------- |
        | &&       | Logical AND |
        | ||       | Logical OR  |
        | !        | Logical NOT |

        ---

        ## Logical AND (&&)

        Both conditions must be true.

        ```java
        int age = 20;
        int marks = 80;

        System.out.println(age > 18 && marks > 75);
        ```

        Output:

        ```
        true
        ```

        ---

        ## Logical OR (||)

        At least one condition must be true.

        ```java
        System.out.println(age > 18 || marks > 90);
        ```

        Output:

        ```
        true
        ```

        ---

        ## Logical NOT (!)

        Reverses result.

        ```java
        boolean result = true;

        System.out.println(!result);
        ```

        Output:

        ```
        false
        ```

        ---

        # 6. Bitwise Operators

        Operate on binary bits.

        | Operator | Meaning     |
        | -------- | ----------- |
        | &        | Bitwise AND |
        | |        | Bitwise OR  |
        | ^        | XOR         |
        | ~        | Complement  |

        ---

        ## Bitwise AND (&)

        ```java
        int a = 5;
        int b = 3;

        System.out.println(a & b);
        ```

        Binary:

        ```
        5 = 0101
        3 = 0011
        -----------
            0001
        ```

        Output:

        ```
        1
        ```

        ---

        ## Bitwise OR (|)

        ```java
        System.out.println(5 | 3);
        ```

        Binary:

        ```
        0101
        0011
        -----
        0111
        ```

        Output:

        ```
        7
        ```

        ---

        ## Bitwise XOR (^)

        ```java
        System.out.println(5 ^ 3);
        ```

        Output:

        ```
        6
        ```

        ---

        ## Bitwise Complement (~)

        ```java
        System.out.println(~5);
        ```

        Output:

        ```
        -6
        ```

        ---

        # 7. Shift Operators

        Move bits left or right.

        | Operator | Meaning              |
        | -------- | -------------------- |
        | <<       | Left Shift           |
        | >>       | Right Shift          |
        | >>>      | Unsigned Right Shift |

        ---

        ## Left Shift

        ```java
        System.out.println(5 << 1);
        ```

        Binary:

        ```
        5 = 00000101

        Shift Left 1

        00001010
        ```

        Output:

        ```
        10
        ```

        ---

        ## Right Shift

        ```java
        System.out.println(20 >> 2);
        ```

        Output:

        ```
        5
        ```

        ---

        ## Unsigned Right Shift

        ```java
        System.out.println(20 >>> 2);
        ```

        Output:

        ```
        5
        ```

        ---

        # 8. Ternary Operator (? :)

        Short form of if-else.

        ### Syntax

        ```java
        condition ? value1 : value2;
        ```

        ---

        ## Example

        ```java
        int age = 20;

        String result = (age >= 18) ? "Adult" : "Minor";

        System.out.println(result);
        ```

        Output:

        ```
        Adult
        ```

        ---

        ## Equivalent If-Else

        ```java
        if(age >= 18)
        {
            System.out.println("Adult");
        }
        else
        {
            System.out.println("Minor");
        }
        ```

        ---

        # 9. instanceof Operator

        Checks whether an object belongs to a class.

        ```java
        String name = "Java";

        System.out.println(name instanceof String);
        ```

        Output:

        ```
        true
        ```

        ---

        # Operator Precedence (Important for Interviews)

        | Priority | Operators        |
        | -------- | ---------------- |
        | Highest  | ++ -- !          |
        | 2        | * / %            |
        | 3        | + -              |
        | 4        | << >> >>>        |
        | 5        | < <= > >=        |
        | 6        | == !=            |
        | 7        | &                |
        | 8        | ^                |
        | 9        | |                |
        | 10       | &&               |
        | 11       | ||               |
        | 12       | ?:               |
        | Lowest   | = += -= *= /= %= |

        ---

        ## Example

        ```java
        int result = 10 + 5 * 2;
        System.out.println(result);
        ```

        Execution:

        ```
        5 * 2 = 10
        10 + 10 = 20
        ```

        Output:

        ```
        20
        ```

        ---

        # Interview Questions

        ### Q1. Difference between `a++` and `++a`?

        **a++ (Post Increment)**

        * Use value first
        * Increment later

        **++a (Pre Increment)**

        * Increment first
        * Use value later

        ---

        ### Q2. Difference between `&&` and `&`?

        `&&`

        * Logical AND
        * Short-circuit evaluation

        `&`

        * Bitwise AND
        * Evaluates both sides

        ---

        ### Q3. Difference between `>>` and `>>>`?

        `>>`

        * Signed right shift
        * Preserves sign bit

        `>>>`

        * Unsigned right shift
        * Fills left side with 0

        ---

        ### Q4. Which operator returns remainder?

        ```
        %
        ```

        (Modulus Operator)

        ---

        ### Q5. Which operator is used as a shortcut for if-else?

        ```
        ? :
        ```

        (Ternary Operator)

        These are all major Java operators that are commonly asked in exams, viva, and software internship interviews.








        */
