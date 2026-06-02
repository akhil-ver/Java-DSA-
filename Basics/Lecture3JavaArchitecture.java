package Basics;

        /*
        
        
        # Java Architecture: JDK, JVM, JRE, JSE, JEE, and JME

                These are some of the most important terms in Java. Many interviewers and viva examiners ask about them.

                ---

                # 1. JVM (Java Virtual Machine)

                ### Definition

                JVM is a virtual machine that executes Java bytecode and converts it into machine code for the operating system.

                ### Main Functions

                * Loads Java classes
                * Verifies bytecode
                * Executes bytecode
                * Manages memory
                * Performs garbage collection

                ### Working

                ```text
                Java Program
                    ↓
                Bytecode (.class)
                    ↓
                JVM
                    ↓
                Machine Code
                    ↓
                Output
                ```

                ### Advantages

                * Platform independence
                * Security
                * Automatic memory management

                ### Example

                ```java
                System.out.println("Hello");
                ```

                The JVM executes this statement and displays the output.

                ### Interview Question

                **Q: Can JVM run Java source code directly?**

                **Answer:** No. JVM executes bytecode (`.class` files), not `.java` source files.

                ---

                # 2. JRE (Java Runtime Environment)

                ### Definition

                JRE provides the environment required to run Java applications.

                ### Components of JRE

                ```text
                JRE
                │
                ├── JVM
                ├── Core Libraries
                └── Supporting Files
                ```

                ### Formula

                ```text
                JRE = JVM + Libraries
                ```

                ### Purpose

                Used only for running Java programs.

                ### Example

                If a user only wants to run a Java application, JRE is sufficient.

                ### Interview Question

                **Q: Can we compile Java code using JRE?**

                **Answer:** No. JRE only runs Java programs.

                ---

                # 3. JDK (Java Development Kit)

                ### Definition

                JDK is a complete package used for developing, compiling, and running Java programs.

                ### Components

                ```text
                JDK
                │
                ├── JRE
                │    └── JVM
                │
                ├── Compiler (javac)
                ├── Debugger
                ├── Documentation Tools
                └── Development Utilities
                ```

                ### Formula

                ```text
                JDK = JRE + Development Tools
                ```

                ### Important Tools

                | Tool    | Purpose           |
                | ------- | ----------------- |
                | javac   | Compiler          |
                | java    | Program Execution |
                | javadoc | Documentation     |
                | jdb     | Debugger          |
                | jar     | Package Tool      |

                ### Interview Question

                **Q: Which component is required for Java development?**

                **Answer:** JDK.

                ---

                # Relationship Among JDK, JRE, and JVM

                ```text
                JDK
                │
                └── JRE
                    │
                    └── JVM
                ```

                Or

                ```text
                JDK = JRE + Development Tools

                JRE = JVM + Libraries
                ```

                ### Diagram

                ```text
                +----------------------------------+
                |              JDK                 |
                |                                  |
                |  +----------------------------+  |
                |  |            JRE             |  |
                |  |                            |  |
                |  |  +----------------------+  |  |
                |  |  |         JVM          |  |  |
                |  |  +----------------------+  |  |
                |  +----------------------------+  |
                +----------------------------------+
                ```

                ---

                # 4. JSE (Java Standard Edition)

                ### Definition

                JSE provides the basic core Java platform used for general-purpose applications.

                ### Includes

                * OOP concepts
                * Collections Framework
                * Exception Handling
                * Multithreading
                * JDBC
                * Networking

                ### Applications

                * Desktop applications
                * Console applications
                * Basic software development

                ### Examples

                * Calculator
                * Banking System
                * Student Management System

                ### Common Packages

                ```java
                java.lang
                java.util
                java.io
                java.net
                java.sql
                ```

                ---

                # 5. JEE (Java Enterprise Edition)

                ### Definition

                JEE is used for developing large-scale enterprise and web applications.

                Today it is known as **Jakarta EE**.

                ### Features

                * Web applications
                * Distributed systems
                * Enterprise-level security
                * Transaction management

                ### Technologies

                * Servlet
                * JSP
                * EJB
                * JPA
                * Web Services

                ### Applications

                * E-commerce websites
                * Banking systems
                * ERP systems
                * Corporate applications

                ### Example

                Websites like online shopping portals often use enterprise Java technologies on the backend.

                ---

                # 6. JME (Java Micro Edition)

                ### Definition

                JME was designed for small and resource-constrained devices.

                ### Devices

                * Old mobile phones
                * Set-top boxes
                * Embedded devices
                * PDAs

                ### Features

                * Small memory footprint
                * Lightweight libraries
                * Optimized for limited hardware

                ### Example

                Classic Java games on feature phones were commonly built using JME.

                ### Note

                JME is much less common today because modern smartphones mainly use Android and other modern platforms.

                ---

                # Comparison Table

                | Feature                      | JVM | JRE | JDK | JSE | JEE | JME |
                | ---------------------------- | --- | --- | --- | --- | --- | --- |
                | Executes Java Code           | ✅   | ✅   | ✅   | ❌   | ❌   | ❌   |
                | Provides Runtime Environment | ❌   | ✅   | ✅   | ❌   | ❌   | ❌   |
                | Compiles Java Code           | ❌   | ❌   | ✅   | ❌   | ❌   | ❌   |
                | Development Tools            | ❌   | ❌   | ✅   | ❌   | ❌   | ❌   |
                | Desktop Applications         | ❌   | ❌   | ❌   | ✅   | ❌   | ❌   |
                | Enterprise Applications      | ❌   | ❌   | ❌   | ❌   | ✅   | ❌   |
                | Mobile/Embedded Devices      | ❌   | ❌   | ❌   | ❌   | ❌   | ✅   |

                ---

                # Quick Revision

                ### JVM

                Executes Java bytecode.

                ### JRE

                Provides runtime environment to run Java programs.

                ### JDK

                Provides tools to develop, compile, and run Java programs.

                ### JSE

                Used for standard desktop and console applications.

                ### JEE (Jakarta EE)

                Used for enterprise and web applications.

                ### JME

                Used for embedded and small devices.

                ### One-Line Formula

                ```text
                JDK = JRE + Development Tools

                JRE = JVM + Libraries
                ```


                        
        
        
        
        */
