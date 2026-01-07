import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        //NESTED ARRAYS => Multidimensional arrays
        Scanner sc = new Scanner(System.in);
        int multiNum[][] = new int[3][4];
        for(int i=0; i<multiNum.length; i++){
            for(int j=0; j<multiNum[0].length; j++){
                System.out.println("enter value for " + i + ", " + j);
                multiNum[i][j] = sc.nextInt();
            }
        }

        //printing values
        for(int i=0; i<multiNum.length; i++){
            for(int j=0; j<multiNum[0].length; j++){
                System.out.println("value for " + i + ", " + j + " = " + multiNum[i][j]);
            }
        }
    }
}
