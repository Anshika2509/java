public class ConditionalStatements {
    public static void main(String[] args) {
       //Decisional logic
       int age = 80;
       if(age >= 18 && age <= 60){
        System.out.println("Eligible for voting");
       }
       else{
        System.out.println("Not Eligible for voting");
       }

       //Greatest of the two
       int x= 93;
       int y = 67;
       if(x>y){
        System.out.println("x is greater with value: " + x);
       }
       else{
        System.out.println("y is greater with value: " + y);
       }

       //Greatest of the three
       int z = 900;
       if(x>y && x>z){
            System.out.println("x is greatest with value: " + x);
        }
       else if(y>z){  //with the first if condition, it is clear that x is smaller, so no sense of comparing x here
            System.out.println("y is greatest with value: " + y);
        }
       else{
            System.out.println("z is greatest with value: " + z);
        }


        //Ternary operator

        int num = 23;
        String result = (num % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(result);

        //NESTED TERNARY
        int time = 22;
        String message = (time<12) ? "Good Morning!"
                        : (time < 18) ? "Good Afternoon!"
                        : "Good Evening!";
        System.out.println(message);


        //SWITCH STATEMENT
        int day = 7;
        switch (day) { // switch allows only integer parameter till Java 5, but after that Strings are also supported
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturady");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: // default can be skipped too
                System.out.println("INVALID DAY");
                break;
        }


        // Updates in SWITCH in newver Java verions = 
        // 1 - No need of break by using arrow ->
        // 2 - Return expression from switch

        // ************* Day based alarm *************
        String d = "Monday";

        switch (d) {
            case "Saturday", "Sunday" -> System.out.println("6am");
            case "Monday" -> System.out.println("8am");
            default -> System.out.println("7am");
        }

        // returning expression
        String r = "";
        switch (d){
            case "Saturday", "Sunday" -> r = "It's " + d + ", Wake up at 6am";
            case "Monday" -> r = "It's " + d + ", Wake up at 8am";
            default -> r = "It's " + d + ", Wake up at 7am";
        }
        System.out.println(r);

       
        // rerurn value from switch
        String res = "";
        res = switch (d){
            case "Saturday", "Sunday" -> "It's " + d + ", Wake up at 6am";
            case "Monday" -> "It's " + d + ", Wake up at 8am";
            default -> "It's " + d + ", Wake up at 7am";
        }; // semi colon needed here

        System.out.println(res);

        //Result from switch using : and not -> ----- need to yield keyword

        String statement = "";
        statement = switch (d){
            case "Saturday", "Sunday": yield "It's " + d + ", Alarm set up at 6am";
            case "Monday": yield  "It's " + d + ", Alarm set up at 8am";
            default: yield "It's " + d + ", Alarm set up at 7am";
        }; // semi colon needed here

        System.out.println(statement);
    }
    
}