import java.util.Scanner;
import java.util.*;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        //NESTED ARRAYS => Multidimensional arrays
        Scanner sc = new Scanner(System.in);
        int multiNum[][] = new int[3][4];
        for(int i=0; i<multiNum.length; i++){
            for(int j=0; j<multiNum[0].length; j++){
                multiNum[i][j] = (int)(Math.random()*10);
            }
        }

        //printing values
        for(int i=0; i<multiNum.length; i++){
            for(int j=0; j<multiNum[0].length; j++){
                System.out.print( multiNum[i][j]  + " ");
            }
            System.out.println();
        }
        
        //enhanced for loop
        System.out.println("Printing array using enhanced for loop: ");

        for(int n[]: multiNum)  //Traverse multiNum => each n is an array
        {
            for(int m: n) // m is each element of n 
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}
