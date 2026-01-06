//CLASS
class Calculator{
    //method with parameter
    public int add(int n1, int n2){
        System.out.println("added " + n1 + " and " + n2);
        return (n1 + n2);
    }

    //same name of method but different number of parameters
    public int add(int n1, int n2, int n3){
        System.out.println("adding " + n1 + ", " + n2 + " and " + n3);
        return (n1 + n2 + n3);
    }

    //same name of method but different type of parameters and different return type
    public double add(double n1, int n2, int n3){
        System.out.println("adding " + n1 + ", " + n2 + " and " + n3);
        return (n1 + n2 + n3);
    }
}

class Computer{
    //Returning nothing
    public void playMusic(){
        System.out.println("Music playing.");
    }

    //Returning String
    public String getMePen(){
        return "Pen";
    }
    
    public String getPen(int money){
        System.out.println("Money given: " + money);
        if(money >=10){
            return "Have your pen";
        }
        return "Give more money";
        
    }
}
public class Objects {
    public static void main(String[] args) {
        // To use a class => CREATING OBJECT

        Calculator c = new Calculator();
        int a = c.add(1,2);
        System.out.println("Result = "+ a);

        int b = c.add(1, 2, 3);
        System.out.println("Result = "+ b);

        Computer comp = new Computer();
        comp.playMusic();
        System.out.println(comp.getMePen());
        System.out.println(comp.getPen(90));
    }
}
