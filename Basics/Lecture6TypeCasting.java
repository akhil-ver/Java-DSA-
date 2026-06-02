package Basics;
/*

# Type Casting in Java (Detailed Notes)

        ## What is Type Casting?

        **Type Casting** is the process of converting a value from one data type to another data type.

        ### Example

        ```java
        int num = 10;
        double value = num;
        ```

        Here, `int` is converted to `double`.

        ---

        # Why Do We Need Type Casting?

        Different variables may have different data types.

        ```java
        int a = 10;
        double b = 20.5;
        ```

        To perform operations between different data types, Java may need to convert one type into another.

        ---

        # Types of Type Casting

        ```text
        Type Casting
        │
        ├── Implicit Casting (Widening)
        │
        └── Explicit Casting (Narrowing)
        ```

        ---

        # 1. Implicit Casting (Widening)

        Also called:

        * Automatic Casting
        * Widening Conversion

        Java automatically converts a smaller data type into a larger data type.

        ### Memory Flow

        ```text
        byte → short → int → long → float → double
                \
                → char → int → long → float → double
        ```

        ### Example 1

        ```java
        int num = 100;
        double value = num;

        System.out.println(value);
        ```

        Output:

        ```text
        100.0
        ```

        ### What Happens?

        ```text
        int (4 bytes)
            ↓
        double (8 bytes)
        ```

        No data loss occurs.

        ---

        ### Example 2

        ```java
        char grade = 'A';
        int ascii = grade;

        System.out.println(ascii);
        ```

        Output:

        ```text
        65
        ```

        Because ASCII/Unicode value of 'A' is 65.

        ---

        ### Example 3

        ```java
        byte b = 10;
        int i = b;

        System.out.println(i);
        ```

        Output:

        ```text
        10
        ```

        ---

        # Why is Widening Safe?

        Because larger data types can hold all values of smaller data types.

        Example:

        ```text
        byte range
        -128 to 127

        int range
        -2,147,483,648 to 2,147,483,647
        ```

        Every byte value easily fits inside an int.

        ---

        # 2. Explicit Casting (Narrowing)

        Also called:

        * Manual Casting
        * Narrowing Conversion

        Java cannot do this automatically because data may be lost.

        ### Syntax

        ```java
        targetType variable = (targetType)value;
        ```

        ---

        ### Example 1

        ```java
        double price = 99.99;

        int num = (int)price;

        System.out.println(num);
        ```

        Output:

        ```text
        99
        ```

        ### What Happened?

        ```text
        99.99
        ↓
        (int)
        ↓
        99
        ```

        Decimal part is removed.

        ---

        ### Example 2

        ```java
        long population = 8000000000L;

        int p = (int)population;

        System.out.println(p);
        ```

        Output:

        ```text
        Unexpected value
        ```

        Because data is too large for int.

        ---

        # Data Loss in Narrowing

        ```java
        double d = 123.456;

        int i = (int)d;

        System.out.println(i);
        ```

        Output:

        ```text
        123
        ```

        Lost:

        ```text
        .456
        ```

        ---

        # Real Memory Representation

        ### Widening

        ```text
        byte
        8 bits
        ↓

        int
        32 bits
        ```

        No loss.

        ---

        ### Narrowing

        ```text
        double
        64 bits
        ↓

        int
        32 bits
        ```

        Possible data loss.

        ---

        # Character Type Casting

        ### Character to Integer

        ```java
        char ch = 'A';

        int x = ch;

        System.out.println(x);
        ```

        Output:

        ```text
        65
        ```

        ---

        ### Integer to Character

        ```java
        int x = 65;

        char ch = (char)x;

        System.out.println(ch);
        ```

        Output:

        ```text
        A
        ```

        ---

        ### Example

        ```java
        int x = 97;

        char ch = (char)x;

        System.out.println(ch);
        ```

        Output:

        ```text
        a
        ```

        ---

        # Floating Point to Integer

        ```java
        float marks = 89.75f;

        int m = (int)marks;

        System.out.println(m);
        ```

        Output:

        ```text
        89
        ```

        Fractional part is removed.

        ---

        # Integer to Floating Point

        ```java
        int num = 100;

        float value = num;

        System.out.println(value);
        ```

        Output:

        ```text
        100.0
        ```

        Automatic conversion.

        ---

        # Overflow Example

        ```java
        int num = 130;

        byte b = (byte)num;

        System.out.println(b);
        ```

        Output:

        ```text
        -126
        ```

        ### Why?

        Range of byte:

        ```text
        -128 to 127
        ```

        130 exceeds the byte range, causing overflow.

        ---

        # Type Promotion in Expressions

        Java automatically promotes smaller types during calculations.

        ### Example

        ```java
        byte a = 10;
        byte b = 20;

        int result = a + b;

        System.out.println(result);
        ```

        Output:

        ```text
        30
        ```

        ### Important

        Even though both variables are byte:

        ```java
        a + b
        ```

        becomes:

        ```java
        int + int
        ```

        Result type is int.

        ---

        # Example

        ```java
        char c1 = 'A';
        char c2 = 'B';

        int result = c1 + c2;

        System.out.println(result);
        ```

        Output:

        ```text
        131
        ```

        Because:

        ```text
        A = 65
        B = 66

        65 + 66 = 131
        ```

        ---

        # Object Type Casting

        Used in Inheritance.

        ### Upcasting

        Child → Parent

        ```java
        class Animal {}

        class Dog extends Animal {}

        Animal a = new Dog();
        ```

        Automatic and safe.

        ---

        ### Downcasting

        Parent → Child

        ```java
        Animal a = new Dog();

        Dog d = (Dog)a;
        ```

        Requires explicit cast.

        ---

        # Complete Example

        ```java
        public class TypeCastingDemo {
            public static void main(String[] args) {

                // Widening
                int num = 100;
                double d = num;

                System.out.println(d);

                // Narrowing
                double price = 99.99;
                int p = (int)price;

                System.out.println(p);

                // Char to int
                char ch = 'A';
                int ascii = ch;

                System.out.println(ascii);

                // Int to char
                int x = 66;
                char c = (char)x;

                System.out.println(c);
            }
        }
        ```

        Output:

        ```text
        100.0
        99
        65
        B
        ```

        ---

        # Comparison: Widening vs Narrowing

        | Feature              | Widening      | Narrowing     |
        | -------------------- | ------------- | ------------- |
        | Conversion           | Small → Large | Large → Small |
        | Automatic            | Yes           | No            |
        | Data Loss            | No            | Possible      |
        | Cast Operator Needed | No            | Yes           |
        | Safe                 | Yes           | Risky         |

        ### Examples

        Widening:

        ```java
        int x = 10;
        double y = x;
        ```

        Narrowing:

        ```java
        double x = 10.5;
        int y = (int)x;
        ```

        ---

        # Frequently Asked Interview Questions

        ### Q1. What is type casting?

        Type casting is converting one data type into another data type.

        ### Q2. How many types of type casting are there in Java?

        Two:

        1. Widening (Implicit)
        2. Narrowing (Explicit)

        ### Q3. Which casting is automatic?

        Widening casting.

        ### Q4. Which casting may cause data loss?

        Narrowing casting.

        ### Q5. Why is explicit casting required?

        Because Java wants the programmer to acknowledge the risk of data loss.

        ### Q6. What is the output?

        ```java
        double d = 12.9;
        int x = (int)d;
        System.out.println(x);
        ```

        Output:

        ```text
        12
        ```

        ### Q7. What is the output?

        ```java
        char ch = 'A';
        int x = ch;
        System.out.println(x);
        ```

        Output:

        ```text
        65
        ```

        ### Q8. What is upcasting?

        Converting a child class reference to a parent class reference automatically.

        ### Q9. What is downcasting?

        Converting a parent class reference back to a child class reference using an explicit cast.

        ### Q10. Is narrowing casting always safe?

        No. It can cause data loss or overflow.




*/
