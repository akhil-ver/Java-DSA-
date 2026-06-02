package Basics;

/*

        # Keywords in Java

        ## What are Keywords?

        **Keywords** are reserved words in Java that have a predefined meaning and special purpose. They are part of the Java language syntax and **cannot be used as variable names, class names, or method names**.

        ### Example

        ```java
        int age = 21;      // Valid
        ```

        ```java
        int class = 21;    // Invalid
        ```

        Here, `class` is a keyword, so it cannot be used as a variable name.

        ---

        # Characteristics of Keywords

        * Reserved by Java.
        * Have special meanings.
        * Cannot be used as identifiers.
        * Written in lowercase.
        * Form the basic building blocks of Java programs.

        ---

        # Java Keywords List

        Java has **50+ reserved keywords** (depending on the Java version).

        | Keyword      | Purpose                       |
        | ------------ | ----------------------------- |
        | abstract     | Abstract class/method         |
        | assert       | Testing assumptions           |
        | boolean      | Boolean data type             |
        | break        | Exit loop/switch              |
        | byte         | Integer data type             |
        | case         | Switch case                   |
        | catch        | Exception handling            |
        | char         | Character data type           |
        | class        | Declare class                 |
        | continue     | Skip current iteration        |
        | default      | Default case in switch        |
        | do           | Do-while loop                 |
        | double       | Double data type              |
        | else         | Alternative condition         |
        | enum         | Enumeration                   |
        | extends      | Inheritance                   |
        | final        | Constant/final class          |
        | finally      | Exception cleanup             |
        | float        | Float data type               |
        | for          | Loop                          |
        | if           | Conditional statement         |
        | implements   | Interface implementation      |
        | import       | Import packages               |
        | instanceof   | Object type checking          |
        | int          | Integer data type             |
        | interface    | Declare interface             |
        | long         | Long integer data type        |
        | native       | Native method                 |
        | new          | Create object                 |
        | package      | Package declaration           |
        | private      | Private access                |
        | protected    | Protected access              |
        | public       | Public access                 |
        | return       | Return value                  |
        | short        | Short integer type            |
        | static       | Shared member                 |
        | strictfp     | Floating-point precision      |
        | super        | Parent class reference        |
        | switch       | Multiple choice statement     |
        | synchronized | Thread synchronization        |
        | this         | Current object reference      |
        | throw        | Throw exception               |
        | throws       | Declare exception             |
        | transient    | Serialization control         |
        | try          | Exception handling            |
        | void         | No return value               |
        | volatile     | Variable modification control |
        | while        | Loop                          |

        ---

        # Categories of Keywords

        ## 1. Data Type Keywords

        Used to declare variables.

        ```java
        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 10000L;

        float f = 3.14f;
        double d = 10.5;

        char ch = 'A';
        boolean flag = true;
        ```

        Keywords:

        ```text
        byte
        short
        int
        long
        float
        double
        char
        boolean
        ```

        ---

        ## 2. Access Modifier Keywords

        Control visibility.

        ```java
        public class Demo {
            private int age;
            protected int marks;
        }
        ```

        Keywords:

        ```text
        public
        private
        protected
        ```

        ---

        ## 3. Loop Keywords

        ### for Loop

        ```java
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        ```

        ### while Loop

        ```java
        while(true) {
            break;
        }
        ```

        ### do-while Loop

        ```java
        do {
            System.out.println("Hello");
        } while(false);
        ```

        Keywords:

        ```text
        for
        while
        do
        ```

        ---

        ## 4. Decision-Making Keywords

        ### if-else

        ```java
        if(age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }
        ```

        Keywords:

        ```text
        if
        else
        ```

        ---

        ## 5. Jump Keywords

        ### break

        ```java
        for(int i=1;i<=10;i++) {
            if(i==5)
                break;
        }
        ```

        ### continue

        ```java
        for(int i=1;i<=5;i++) {
            if(i==3)
                continue;
        }
        ```

        ### return

        ```java
        return 0;
        ```

        Keywords:

        ```text
        break
        continue
        return
        ```

        ---

        ## 6. OOP Keywords

        ### class

        ```java
        class Student {
        }
        ```

        ### new

        ```java
        Student s = new Student();
        ```

        ### this

        ```java
        this.age = age;
        ```

        ### super

        ```java
        super.display();
        ```

        ### extends

        ```java
        class Dog extends Animal {
        }
        ```

        Keywords:

        ```text
        class
        new
        this
        super
        extends
        ```

        ---

        ## 7. Exception Handling Keywords

        ```java
        try {
            int a = 10/0;
        }
        catch(Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Done");
        }
        ```

        Keywords:

        ```text
        try
        catch
        finally
        throw
        throws
        ```

        ---

        ## 8. Inheritance & Interface Keywords

        ### Interface

        ```java
        interface Shape {
        }
        ```

        ### Implements

        ```java
        class Circle implements Shape {
        }
        ```

        Keywords:

        ```text
        interface
        implements
        extends
        ```

        ---

        # Example Program Using Keywords

        ```java
        public class KeywordDemo {

            public static void main(String[] args) {

                int age = 21;

                if(age >= 18) {
                    System.out.println("Adult");
                }
                else {
                    System.out.println("Minor");
                }

                for(int i=1; i<=3; i++) {
                    System.out.println(i);
                }
            }
        }
        ```

        Output:

        ```text
        Adult
        1
        2
        3
        ```

        ---

        # Keywords vs Identifiers

        | Keywords                         | Identifiers                          |
        | -------------------------------- | ------------------------------------ |
        | Reserved words                   | User-defined names                   |
        | Fixed meaning                    | Custom meaning                       |
        | Cannot be used as variable names | Used for variables, methods, classes |
        | Example: `class`, `int`          | Example: `age`, `studentName`        |

        ### Example

        ```java
        int age = 20;    // age is an identifier
        ```

        ```java
        int int = 20;    // Error
        ```

        Because `int` is a keyword.

        ---

        # Frequently Asked Interview Questions

        ### Q1. What is a keyword in Java?

        A keyword is a reserved word with a predefined meaning in Java.

        ### Q2. Can keywords be used as variable names?

        No.

        ```java
        int class = 10; // Error
        ```

        ### Q3. Is Java case-sensitive for keywords?

        Yes.

        ```java
        int age = 10;   // Correct
        Int age = 10;   // Incorrect (Int is not a keyword)
        ```

        ### Q4. Which keyword is used to create an object?

        ```java
        new
        ```

        Example:

        ```java
        Student s = new Student();
        ```

        ### Q5. Which keyword is used for inheritance?

        ```java
        extends
        ```

        ### Q6. Which keywords are used in exception handling?

        ```text
        try
        catch
        finally
        throw
        throws
        ```

        ### Q7. Which keyword is used to stop a loop?

        ```java
        break;
        ```

        ### Q8. Which keyword refers to the current object?

        ```java
        this
        ```

        ### Q9. Which keyword refers to the parent class?

        ```java
        super
        ```

        ### Q10. What is the difference between a keyword and an identifier?

        Keywords are reserved by Java, whereas identifiers are names given by programmers to variables, methods, classes, etc.



*/
