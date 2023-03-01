package Inheritance;

class Parent1 {
    Parent1() {
        System.out.println("Parent1()");
    }

    void method() {
        System.out.println("parent method()");
    }

    final void method1() {
        System.out.println("final parent method1");
    }

    final void method2() {
        System.out.println("final parent method2");
    }

    final void method2(int a) {
        System.out.println("final parent method2 with int: " + a);
    }
}

class Child1 extends Parent1{
    Child1(){}

    // can't be overridden
//    void method1() {
//        System.out.println("final child method1");
//    }
//
//    final void method2() {
//        System.out.println("final child method2");
//    }

    final void method() {
        System.out.println("child method()");
    }
}

public class Final {
    public static void main(String[] args) {

        Parent1 object1  = new Parent1();

        object1.method1();

        Parent1 object2 = new Child1();
        object2.method();

        Child1 object3 = new Child1();
    }
}
