package DSA;
public class operator {
    public static void main(String[] args){



        // Arithmetic Operators
        int a = 20, b = 10;

        // Addition
        System.out.println("a + b = " + (a + b));

        // Subtraction
        System.out.println("a - b = " + (a - b));

        // Multiplication
        System.out.println("a * b = " + (a * b));

        // Division
        System.out.println("a / b = " + (a / b));

        // Remainder
        System.out.println("a % b = " + (a % b));


        
        // Unary Operators

         a = 10;

        // Unary plus
        System.out.println(+a);

        // Unary minus
        System.out.println(-a);

        // Pre-increment: increase first, then use
        System.out.println(++a);

        // Post-increment: use first, then increase
        System.out.println(a++);

        // Value after post-increment
        System.out.println(a);

        // Pre-decrement: decrease first, then use
        System.out.println(--a);

        // Post-decrement: use first, then decrease
        System.out.println(a--);

        // Value after post-decrement
        System.out.println(a);



        // Assignment Operators
        
        a = 10;

        // a = a + 5
        a += 5;
        System.out.println(a);

        // a = a - 3
        a -= 3;
        System.out.println(a);

        // a = a * 2
        a *= 2;
        System.out.println(a);

        // a = a / 4
        a /= 4;
        System.out.println(a);

        // a = a % 3
        a %= 3;
        System.out.println(a);


        // Relational Operators

        a = 10 ;
        b = 20;

        // Equal to
        System.out.println(a == b);

        // Not equal to
        System.out.println(a != b);

        // Greater than
        System.out.println(a > b);

        // Less than
        System.out.println(a < b);

        // Greater than or equal to
        System.out.println(a >= b);

        // Less than or equal to
        System.out.println(a <= b);



        // Logical Operators

        int age = 20;
        int marks = 80;

        // Both conditions must be true
        System.out.println(age > 18 && marks > 75);

        // At least one condition true
        System.out.println(age > 18 || marks > 90);

        // Reverse the result
        System.out.println(!(age > 18));



        // Bitwise Operators

         // Bitwise AND
        System.out.println(a & b);

        // Bitwise OR
        System.out.println(a | b);

        // Bitwise XOR
        System.out.println(a ^ b);

        // Bitwise Complement
        System.out.println(~a);



        //  Shift Operators

        a = 20;

        // Left shift (multiply by 2)
        System.out.println(a << 1);

        // Right shift (divide by 2)
        System.out.println(a >> 1);

        // Unsigned right shift
        System.out.println(a >>> 1);



        //  Ternary Operator

        age = 20;

        // Short form of if-else
        String result = (age >= 18) ? "Adult" : "Minor";

        System.out.println(result);


        // instanceof Operator

        String name = "Java";

        // Check object type
        System.out.println(name instanceof String);







        // All Operators in One Program


        a = 10;
        b = 5;

        // Arithmetic
        System.out.println("Addition = " + (a + b));

        // Relational
        System.out.println("a > b = " + (a > b));

        // Logical
        System.out.println("a>b && b>0 = " + (a > b && b > 0));

        // Assignment
        a += 5;
        System.out.println("a = " + a);

        // Unary
        System.out.println("++a = " + (++a));

        // Bitwise
        System.out.println("a & b = " + (a & b));

        // Shift
        System.out.println("a << 1 = " + (a << 1));

        // Ternary
        String result1 = (a > b) ? "a is greater" : "b is greater";
        System.out.println(result1);

        // instanceof
        String str = "Java";
        System.out.println(str instanceof String);


    }
}
 