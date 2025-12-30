import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int n = 1;

        // while loop => runs while a condition is true
        while (n <= 5){
            System.out.println(n);
            
            // for each n, printing HELLO 3 times => Nested while
            int j = 1;
            while(j<=3){
                System.out.println("HELLO " + j);
                j++;
            }
            n++;
        }

        System.out.println("After loop: " + n);

        //EXERCISE
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int f = sc.nextInt();
        System.out.println("Enter second number: ");
        int s = sc.nextInt();
        System.out.println("*********************");
        int i = f;
        while(i<=s){
            System.out.println(i);
            i++;
        }


        //Finding average of numbers until user enter zero
        int num;
        int count = 0;
        int sum = 0;
        do{
            System.out.println("Enter integer value (0 to end and get average) ");
            num = sc.nextInt();
            count++;
            sum+=num;
        } while(num!=0);
        int avg = (count > 1)? (sum/(count-1)) : (sum/(count)) ;
        System.out.println("Average = " + avg);
        sc.close();



    }
}
