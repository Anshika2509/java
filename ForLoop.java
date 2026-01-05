public class ForLoop {
    public static void main(String[] args) {
        for(int i = 0; i<5; i++){
            System.out.println("Hi: " + i);
        }


        //PATTERN

        // Print all days and 9-5 of office to schedule tasks in them
        for(int i = 1;i<=7;i++){
            System.out.println("Day:" + i);
            for(int j = 9;j<17;j++){
                System.out.println("    " + (j) + " - " + (j+1));
            }
        }

    }
}
