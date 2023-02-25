package polymorphism;

class Vehicle1 {

    int speed = 5;

    void method1() {
        System.out.println("method 1");
    }

    void method2() {
        System.out.println("method 2");
    }

}

class Bike1 extends Vehicle1{

    int speed = 6;

    void method2() {
        System.out.println("method 2 overriden");
    }

    void method3() {
        System.out.println("method 3");
    }
}

public class DynamicMethodDispatch {

    public static void main(String[] args) {

        Vehicle1 bike = new Bike1();

        System.out.println(bike.speed);

        bike.method1();

        // if overrided
        bike.method2();

        // invalid
        // bike.method3();
    }
}
