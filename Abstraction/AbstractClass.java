package Abstraction;
abstract class A extends Bike{

}
abstract class Bike {
    static int integer = 1;

    int var1 = 2;

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

    int var2 = 1;

    // must override
    void run(){
        System.out.println("running safely..");
    }
}

public class AbstractClass {

    public static void main(String args[]) {
        Bike object = new Honda();

        System.out.println(object.var1);
        object.run();

        object.changeGear();

        String s1 = "asdf";
        String s2 = "asdf" + "" + "";
        System.out.println(s1 == s2);
    }
}
