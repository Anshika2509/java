public class JaggedArray {
    public static void main(String[] args) {
        //Jagged array: array with different number of columns  
        // refer to https://github.com/Anshika2509/java/blob/main/jagged-array.png

        int num[][] = new int[3][];
        num[0] = new int[3];
        num[1] = new int[2];
        num[2] = new int[4];

        for(int i = 0; i< num.length; i++){
            for (int j = 0; j<num[i].length; j++) {
                num[i][j] = (int)(Math.random()*10);
            }
        }

        for(int i = 0; i< num.length; i++){
            for (int j = 0; j<num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        //enhanced for loop
        System.out.println("Printing jagged array using enhanced for loop: ");

        for(int[] n: num){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
