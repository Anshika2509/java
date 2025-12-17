public class hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(3 + 8);
        System.out.println(3 + 9);

        // Creating variable
        int num = 5;
        System.out.println("variable num = " + num);
        int num1 = 2;
        System.out.println("variable num1 = " + num1);
        int add = num + num1;
        System.out.println("num + num1 = " + add);

        // Primitive Data Types:

        // Float: => double(8 bytes [default in java]) and float (4 bytes)
        float marks = 6.5f;
        double m = 6.5;
        System.out.println("Float marks = " + marks);
        System.out.println("Double m = " + m);

        // Integer:
        // byte (1 byte)
        byte b = 125;

        // short (2 bytes)
        short s = 32767;

        // int (4 bytes)
        int i = 2147483645;

        // long (8 bytes) => Write l in last otherwise considers int
        long l = 91212223372031234l;

        System.out.println("byte b = " + b);
        System.out.println("short s = " + s);
        System.out.println("int i = " + i);
        System.out.println("long l = " + l);

        // CHAR => single quotes for character
        char c = 'a';
        System.out.println("character c = " + c);

        // boolean
        boolean t = true;
        System.out.println("boolean t = " + b);

        // literals

        int octal = 010;
        System.out.println("octal: " + octal);

        int hexa = 0X123FACE;
        System.out.println("Hexadecimal integer: " + hexa);

        int binary = 0B101;
        System.out.println("Binary literal: " + binary);

        // we can put underscore between digits to easily count them
        int dig = 1_00_00_000;
        System.out.println(dig);

        // Float literals
        double dubl = 56;
        System.out.println("double: " + dubl);

        double exponential = 12e10;
        System.out.println("exponential: " + exponential);

        // CHAR literal

        char ch = 's';
        System.out.println("single quote character: " + ch);

        char dec = 65;
        System.out.println("char literal as decimal integer: " + dec);

        char d = 'A';
        d++;
        System.out.println("char 65 + 1: " + d);

        // 0101 octal = 65 in decimal, 65 decimal is for A
        char oct = 0101;
        System.out.println("char literal as octal int: " + oct);

        // 0x41 hexadecimal = 65 in decimal, 65 decimal is for A
        char hex = 0x41;
        System.out.println("char literal as hexadecimal int: " + hex);
    }
}