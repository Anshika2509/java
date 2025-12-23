public class Operators {
    public static void main(String[] args) {

        // ARITHMETIC OPERATORS

        int num1 = 7;
        int num2 = 5;
        // add
        int result = num1 + num2;
        System.out.println("addition: " + result);

        // subtract
        result = num1 - num2;
        System.out.println("subtraction: " + result);

        // product
        result = num1 * num2;
        System.out.println("multiplication: " + result);

        // divide
        result = num1 / num2;
        System.out.println("division: " + result);

        // modulus
        result = num1 % num2;
        System.out.println("modulus: " + result);

        // assignment + operator
        num1 = num1 + 2;
        System.out.println("num1 plus 2: " + num1);
        num1 += 3;
        System.out.println("num1 plus 3: " + num1);

        // post increament op.
        num1++;
        System.out.println("num1 increament: " + num1);

        // post decreament op.
        num1--;
        System.out.println("num1 decreament: " + num1);

        // pre increament => here works same as post increament
        ++num1;
        System.out.println("num1 decreament: " + num1);

        // behaves differently while assignment

        int inc = num1++; // first assigns value then increament
        System.out.println("post inc: " + inc);
        inc = ++num1; // first increament then assign value
        System.out.println("pre inc: " + inc);

        // RELATIONAL OPERATORS
        // <, >, ==, !=, <=, >= :=> return boolean

        int x = 6;
        int y = 5;
        System.out.println("x equals y  " + (x == y));
        System.out.println("x greater than y  " + (x > y));
        System.out.println("x less than y  " + (x < y));
        System.out.println("x not equals y  " + (x != y));
        System.out.println("x greater or equal to y  " + (x >= y));
        System.out.println("x lesser or equal to y  " + (x <= y));

        // LOGICAL OPERATORS
        x = 9;
        y = 10;
        int a = 2;
        int b = 7;
        System.out.println("AND operator: " + (x < y & a > b));
        System.out.println("OR operator: " + (x < y | a > b));
        System.out.println("NOT operator: " + !(x < y | a > b));

        // SHORT CIRCUIT LOGICAL OPERATORS

        System.out.println("AND short circuit operator: " + (x > y && a > b)); // x>y is false => when using &&, doesn't
                                                                               // checks for other condition directly
                                                                               // returns false
        System.out.println("OR short circuit operator: " + (x < y || a > b)); // x<y is true => when using || doesn't
                                                                              // checks for other condition directly
                                                                              // returns true

    }
}