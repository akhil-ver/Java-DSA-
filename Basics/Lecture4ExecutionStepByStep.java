package Basics;
/*

# Step-by-Step Execution of a Java Program

        Let's take a simple Java program:

        ```java
        public class HelloWorld {
            public static void main(String[] args) {
                System.out.println("Hello, World!");
            }
        }
        ```

        ---

        ## Step 1: Write the Source Code

        The programmer writes the Java code and saves it in a file named:

        ```text
        HelloWorld.java
        ```

        This file is called the **source file**.

        ---

        ## Step 2: Compilation

        The Java compiler (`javac`) compiles the source code.

        **Command:**

        ```bash
        javac HelloWorld.java
        ```

        ### What happens?

        * The compiler checks for syntax errors.
        * If there are no errors, it converts the source code into **bytecode**.

        A new file is created:

        ```text
        HelloWorld.class
        ```

        This `.class` file contains bytecode.

        ---

        ## Step 3: Bytecode Generation

        Bytecode is neither machine code nor source code.

        ```text
        HelloWorld.java
            |
            | javac
            V
        HelloWorld.class (Bytecode)
        ```

        Bytecode is platform-independent.

        This is why Java follows:

        > Write Once, Run Anywhere

        ---

        ## Step 4: JVM Starts

        When we run:

        ```bash
        java HelloWorld
        ```

        The **Java Virtual Machine (JVM)** starts.

        ### JVM Responsibilities

        * Loads class files
        * Verifies bytecode
        * Allocates memory
        * Executes the program

        ---

        ## Step 5: Class Loader Loads the Class

        The **Class Loader Subsystem** loads:

        ```text
        HelloWorld.class
        ```

        into memory.

        ### Types of Class Loaders

        1. Bootstrap Class Loader
        2. Extension Class Loader
        3. Application Class Loader

        For our program, the Application Class Loader loads the class.

        ---

        ## Step 6: Bytecode Verification

        Before execution, JVM verifies the bytecode.

        Checks include:

        * Illegal code
        * Security violations
        * Stack overflows
        * Invalid memory access

        If verification fails:

        ```text
        java.lang.VerifyError
        ```

        is thrown.

        ---

        ## Step 7: Memory Allocation

        JVM creates memory areas:

        ```text
        JVM Memory
        │
        ├── Method Area
        ├── Heap Area
        ├── Stack Area
        ├── PC Register
        └── Native Method Stack
        ```

        ### Method Area

        Stores:

        * Class information
        * Method information
        * Static variables

        ### Heap Area

        Stores:

        * Objects

        ### Stack Area

        Stores:

        * Method calls
        * Local variables

        ---

        ## Step 8: Find `main()` Method

        JVM searches for:

        ```java
        public static void main(String[] args)
        ```

        This is the entry point of every Java application.

        ### Breakdown

        ```java
        public
        ```

        Accessible everywhere.

        ```java
        static
        ```

        Can be called without creating an object.

        ```java
        void
        ```

        Returns nothing.

        ```java
        String[] args
        ```

        Stores command-line arguments.

        ---

        ## Step 9: Create Main Thread

        JVM creates a thread called:

        ```text
        main thread
        ```

        Execution begins from:

        ```java
        main()
        ```

        ---

        ## Step 10: Execute Statements

        JVM executes:

        ```java
        System.out.println("Hello, World!");
        ```

        ### Breakdown

        ```java
        System
        ```

        A predefined class.

        ```java
        out
        ```

        A static object of `PrintStream`.

        ```java
        println()
        ```

        Method that prints output and moves to the next line.

        ---

        ## Step 11: JIT Compilation

        Modern JVMs use the **Just-In-Time (JIT) Compiler**.

        ### Without JIT

        ```text
        Bytecode
        ↓
        Interpreter
        ↓
        Machine Code
        ```

        Every line is interpreted repeatedly.

        ### With JIT

        Frequently executed code is converted into native machine code.

        ```text
        Bytecode
        ↓
        JIT Compiler
        ↓
        Machine Code
        ```

        This increases performance significantly.

        ---

        ## Step 12: Output Displayed

        Console shows:

        ```text
        Hello, World!
        ```

        ---

        ## Step 13: Program Terminates

        After all statements are executed:

        * `main()` finishes.
        * Stack memory is released.
        * JVM shuts down.

        Program ends.

        ---

        # Complete Flow Diagram

        ```text
        HelloWorld.java
            │
            ▼
        javac Compiler
            │
            ▼
        HelloWorld.class
        (Bytecode)
            │
            ▼
            JVM
            │
        ┌─────────────┐
        │Class Loader │
        └─────────────┘
            │
            ▼
        Bytecode Verifier
            │
            ▼
        Memory Allocation
            │
            ▼
        Find main()
            │
            ▼
        Execute Statements
            │
            ▼
        JIT Compilation
            │
            ▼
        Display Output
            │
            ▼
        Program Ends
        ```

        ### Viva Question

        **Q: What are the main stages in Java program execution?**

        **Answer:**

        1. Writing source code (`.java`)
        2. Compilation using `javac`
        3. Bytecode generation (`.class`)
        4. Class loading by JVM
        5. Bytecode verification
        6. Memory allocation
        7. Execution of `main()` method
        8. JIT compilation
        9. Output generation
        10. Program termination.





*/