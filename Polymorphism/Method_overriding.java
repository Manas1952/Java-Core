package Polymorphism;
class Vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle{
    void run(){
        System.out.println("Bike is running safely");
    }
}
public class Method_overriding {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        vehicle.run();

        Bike bike = new Bike();

        bike.run();
    }
}
