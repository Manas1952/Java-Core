package Inheritance;

class Parent3 {
    void method1() {
        System.out.println("parent method1()");
    }

    void method2() {
        System.out.println("parent method2()");
    }
}

class Child3 extends Parent3{

    void method1() {
        System.out.println("child method1()");
    }

    void method3() {
        System.out.println("child method3()");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Parent3 object = new Child3();

        object.method1();

        object.method2();

        // error
//        object.method3();
    }
}
