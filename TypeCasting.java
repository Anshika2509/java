public class TypeCasting {
    public static void main(String[] args) {
        byte b = 127;
        int a = 256;
        // b = a; =>  will throw error because cannot convert int to byte   ==>  cannot put bigger item in small box
        a = b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        byte c;
        int d = 12;
        c = (byte)d; // explicit type conversion => called casting
        System.out.println("c: " + c);
        System.out.println("d: " + d);

        // int to byte when greater than range uses modulus operation: 257 int = 257 mod 256 (range of byte = -128 to 127 => 256 numbers in total) = 1

        d= 257;
        c = (byte)d;
        System.out.println("c: 257 % 256 =  " + c);

        //float to int conversion => looses digits after decimal
        float f = 5.6f;
        int x = (int)f;

        System.out.println("float to int looses digits after point: " + x);


        //TYPE PROMOTION

        byte num1 = 40;
        byte num2 = 30;
        int res = num1 * num2;
        System.out.println("Product of two bytes converted into int: " + res);
    }
}
