package Basics;
public class Lecture7DataTypeDemo {
    public static void main(String[] args) {

        // Primitive Data Types
        byte b = 127;
        short s = 32000;
        int i = 100000;
        long l = 1234567890L;

        float f = 3.14f;
        double d = 99.999;

        char c = 'A';
        boolean bool = true;

        // Non-Primitive Data Type
        String str = "Hello Java";

        // Printing Values
        System.out.println("Byte Value    : " + b);
        System.out.println("Short Value   : " + s);
        System.out.println("Int Value     : " + i);
        System.out.println("Long Value    : " + l);

        System.out.println("Float Value   : " + f);
        System.out.println("Double Value  : " + d);

        System.out.println("Char Value    : " + c);
        System.out.println("Boolean Value : " + bool);

        System.out.println("String Value  : " + str);


  

        // Decimal
        byte decimal = 10;

        // Binary (prefix 0b)
        byte binary = 0b1010;

        // Octal (prefix 0)
        byte octal = 012;

        // Hexadecimal (prefix 0x)
        byte hexadecimal = 0xA;

        System.out.println("Decimal     : " + decimal);
        System.out.println("Binary      : " + binary);
        System.out.println("Octal       : " + octal);
        System.out.println("Hexadecimal : " + hexadecimal);
    }
}

