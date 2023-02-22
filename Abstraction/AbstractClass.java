package Abstraction;

abstract class Bike{
    static int integer = 1;

    Bike(){
        System.out.println("bike is created");
    }

    abstract void run();

    void changeGear(){
        System.out.println("gear changed");
    }
}

class Honda extends Bike{

    static int integer = 1;

    void run(){
        System.out.println("running safely..");
    }
}

public class AbstractClass {
    public static void main(String args[]) {
        Bike object = new Honda();

        object.run();

        object.changeGear();
    }
}
