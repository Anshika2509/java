import java.util.*;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        //Execute atlease once even if condition is false
        int i = 5;
        do{
            System.out.println(i);
            i++;
        } while(i<=4);

        //EXERCISE

        //Create an “advice” program. The user asks it a question, then the program will select 1 of 4 random output answers to display.

        String ans;
        do{
            String[] advice = { "Definitely, yes!", "Very likely!", "Sorry, it's unlikely.", "Not this time." };
            System.out.println("Ask me a question: ");
            Scanner sc = new Scanner(System.in);
            String ques = sc.nextLine();
            int index = (int)(Math.random()*4);
            System.out.println(advice[index]);
            System.out.println("Write yes to continue: ");
            ans = sc.nextLine();
        }while(ans.equals("yes"));
    }
}
