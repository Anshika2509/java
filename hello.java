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

    }
}