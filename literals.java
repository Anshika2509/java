public class literals{
    public static void main(String[] args) {
        //binary
        int num1 = 0b101; // 0b -> signifies binary
        System.out.println(num1);

        //hexa
        int num2 = 0x7E; // 0x -> signifies hexa
        System.out.println(num2);

        // can put underscores between number, eg for easy coumting of zeroes

        int num3 = 10_00_00_000;
        System.out.println(num3);

        //double
        int num4 = 56;
        System.out.println(num4);

        //char
        char c = 'a';
        System.out.println(c);

        char c1 = 76; // Assigns letter L
        System.out.println(c1);
        c++;
        c1++;
        System.out.println(c);
        System.out.println(c1);


    }
}