class Vehicle{
    public void move(){
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle{
    @Override
    public void move(){
        System.out.println("Car is moving");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.move();  // Prints: Vehicle is moving

        Car c1 = new Car();
        c1.move();  //Prints: Car is moving

        Vehicle v2 = new Car();
        v2.move();  //Prints: Car is moving

       //  Car c2 = new Vehicle(); ---- Would give error, cannot convert vehicle to car, car is subclas of vehicle but vehicle of car
    }
}
