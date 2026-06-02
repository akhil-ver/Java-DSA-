package Basics;
/*

# Java Variables and Data Types (Detailed Notes)

## What is a Variable?

    A **variable** is a named memory location used to store data that can change during program execution.

    ### Syntax

    ```java
    dataType variableName = value;
    ```

    ### Example

    ```java
    int age = 21;
    String name = "Akhil";
    double salary = 50000.50;
    ```

    Here:

    * `int`, `String`, `double` → Data Types
    * `age`, `name`, `salary` → Variables
    * `21`, `"Akhil"`, `50000.50` → Values

    ---

    # Why Do We Need Variables?

    Without variables:

    ```java
    System.out.println(21);
    System.out.println("Akhil");
    ```

    With variables:

    ```java
    int age = 21;
    String name = "Akhil";

    System.out.println(age);
    System.out.println(name);
    ```

    Variables make programs:

    * Easy to understand
    * Reusable
    * Easy to modify

    ---

    # Rules for Naming Variables

    ### Valid Names

    ```java
    int age;
    int studentAge;
    int _count;
    int $salary;
    ```

    ### Invalid Names

    ```java
    int 1age;      // Starts with number
    int student-age; // Hyphen not allowed
    int class;     // Reserved keyword
    ```

    ### Naming Conventions

    ```java
    int studentAge;
    double accountBalance;
    String firstName;
    ```

    Use **camelCase**.

    ---

    # Types of Variables in Java

    There are 3 types:

    ## 1. Local Variable

    Declared inside a method.

    ```java
    public class Demo {
        public static void main(String[] args) {
            int age = 21;
            System.out.println(age);
        }
    }
    ```

    ### Characteristics

    * Created when method starts.
    * Destroyed when method ends.
    * Must be initialized before use.

    ---

    ## 2. Instance Variable

    Declared inside a class but outside methods.

    ```java
    public class Student {
        int age = 21;
    }
    ```

    ### Characteristics

    * Belongs to object.
    * Each object gets its own copy.

    ---

    ## 3. Static Variable

    Declared using `static`.

    ```java
    public class Student {
        static String college = "SIT";
    }
    ```

    ### Characteristics

    * Shared by all objects.
    * Only one copy exists.

    ---

    # Data Types in Java

    A **data type** specifies:

    * What kind of value can be stored.
    * How much memory is required.
    * What operations can be performed.

    ---

    # Classification of Data Types

    ```text
    Data Types
    │
    ├── Primitive
    │
    └── Non-Primitive
    ```

    ---

    # Primitive Data Types

    Java has **8 primitive data types**.

    | Data Type | Size            | Range                 |
    | --------- | --------------- | --------------------- |
    | byte      | 1 byte          | -128 to 127           |
    | short     | 2 bytes         | -32,768 to 32,767     |
    | int       | 4 bytes         | -2³¹ to 2³¹-1         |
    | long      | 8 bytes         | Very large integers   |
    | float     | 4 bytes         | Decimal values        |
    | double    | 8 bytes         | Larger decimal values |
    | char      | 2 bytes         | Single character      |
    | boolean   | 1 bit (logical) | true/false            |

    ---

    # 1. byte

    Smallest integer type.

    ```java
    byte age = 25;
    ```

    ### Memory

    ```text
    1 Byte = 8 Bits
    ```

    ### Range

    ```text
    -128 to 127
    ```

    ### Use

    When memory optimization is important.

    ---

    # 2. short

    ```java
    short marks = 32000;
    ```

    ### Size

    ```text
    2 Bytes
    ```

    ### Range

    ```text
    -32768 to 32767
    ```

    ---

    # 3. int

    Most commonly used integer type.

    ```java
    int salary = 50000;
    ```

    ### Size

    ```text
    4 Bytes
    ```

    ### Range

    ```text
    -2,147,483,648 to 2,147,483,647
    ```

    ---

    # 4. long

    Used for very large numbers.

    ```java
    long population = 8000000000L;
    ```

    ### Size

    ```text
    8 Bytes
    ```

    ### Note

    Must use `L` suffix.

    ```java
    long num = 12345L;
    ```

    ---

    # 5. float

    Stores decimal values.

    ```java
    float percentage = 89.5f;
    ```

    ### Size

    ```text
    4 Bytes
    ```

    ### Note

    Must use `f` suffix.

    ```java
    float pi = 3.14f;
    ```

    ---

    # 6. double

    Most commonly used decimal type.

    ```java
    double price = 999.99;
    ```

    ### Size

    ```text
    8 Bytes
    ```

    ### More Precision

    ```java
    double value = 123.456789;
    ```

    ---

    # 7. char

    Stores a single character.

    ```java
    char grade = 'A';
    ```

    ### Size

    ```text
    2 Bytes
    ```

    ### Unicode Support

    ```java
    char symbol = '@';
    char letter = 'K';
    ```

    ---

    # 8. boolean

    Stores logical values.

    ```java
    boolean isPassed = true;
    ```

    ### Values

    ```java
    true
    false
    ```

    ### Example

    ```java
    boolean isLoggedIn = false;
    ```

    ---

    # Non-Primitive Data Types

    Also called **Reference Types**.

    Examples:

    ```java
    String
    Array
    Class
    Object
    Interface
    ```

    ---

    # String

    Stores text.

    ```java
    String name = "Akhil";
    ```

    ### Example

    ```java
    String city = "Lucknow";
    ```

    Unlike primitive types, String is a class.

    ---

    # Array

    Stores multiple values.

    ```java
    int[] marks = {90, 85, 95};
    ```

    ### Memory Representation

    ```text
    marks
    │
    ▼
    [90][85][95]
    ```

    ---

    # Class

    Blueprint for objects.

    ```java
    class Student {
        int age;
    }
    ```

    ---

    # Difference Between Primitive and Non-Primitive

    | Primitive             | Non-Primitive    |
    | --------------------- | ---------------- |
    | Predefined            | User-defined     |
    | Fixed size            | Variable size    |
    | Stores value directly | Stores reference |
    | Faster                | Slightly slower  |
    | Cannot call methods   | Can call methods |

    Example:

    ```java
    int age = 21;
    ```

    ```java
    String name = "Akhil";
    ```

    ---

    # Default Values of Variables

    | Type            | Default Value |
    | --------------- | ------------- |
    | byte            | 0             |
    | short           | 0             |
    | int             | 0             |
    | long            | 0L            |
    | float           | 0.0f          |
    | double          | 0.0           |
    | char            | '\u0000'      |
    | boolean         | false         |
    | Reference Types | null          |

    ---

    # Type Casting

    Converting one data type to another.

    ## Implicit Casting (Widening)

    Smaller → Larger

    ```java
    int num = 100;
    double value = num;
    ```

    ```text
    int → double
    ```

    No data loss.

    ---

    ## Explicit Casting (Narrowing)

    Larger → Smaller

    ```java
    double value = 99.99;
    int num = (int)value;
    ```

    Output:

    ```text
    99
    ```

    Data after decimal is lost.

    ---

    # Example Program Using Different Data Types

    ```java
    public class DataTypesDemo {
        public static void main(String[] args) {

            byte age = 21;
            short marks = 32000;
            int salary = 50000;
            long population = 8000000000L;

            float percentage = 89.5f;
            double price = 999.99;

            char grade = 'A';
            boolean passed = true;

            String name = "Akhil";

            System.out.println(name);
            System.out.println(age);
            System.out.println(price);
            System.out.println(grade);
            System.out.println(passed);
        }
    }
    ```

    ---

    # Interview/Viva Questions

    ### Q1. What is a variable?

    A variable is a named memory location used to store data.

    ### Q2. How many primitive data types are there in Java?

    There are **8 primitive data types**.

    ### Q3. What is the difference between `float` and `double`?

    * `float` = 4 bytes, less precision.
    * `double` = 8 bytes, more precision.

    ### Q4. Why do we use `L` with long values?

    To tell the compiler that the number is of type `long`.

    Example:

    ```java
    long num = 123456789L;
    ```

    ### Q5. Why do we use `f` with float values?

    ```java
    float pi = 3.14f;
    ```

    Because decimal literals are treated as `double` by default.

    ### Q6. Is String a primitive data type?

    No. `String` is a non-primitive (reference) data type.

    ### Q7. What is type casting?

    Converting one data type into another data type.

    ### Q8. What is the default value of boolean?

    `false`.

    ### Q9. Which integer type is most commonly used?

    `int`.

    ### Q10. What is the difference between local, instance, and static variables?

    * Local: Declared inside methods.
    * Instance: Belongs to objects.
    * Static: Shared by all objects.





*/
