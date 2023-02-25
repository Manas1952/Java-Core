package Inheritance;

class Grand {
    int age = 80;

    static void parentMethod() {
        System.out.println("parent method");
    }

    void walk() {
        System.out.println("Grand is walking");
    }
}

class Parent extends Grand{
    int age = 50;

    void walk() {
        System.out.println("Parent is walking");
    }

    // method overloading
    void walk (String action) {
        System.out.println("Parent is walking " + action);
    }

    // invalid
//    int walk () {
//        return 1;
//    }
    final void method2() {
        System.out.println("private parent method");
    }
}

class Child extends Parent{
    int age = 20;

    void walk() {
        System.out.println("child walking");
    }

    static void parentMethod() {
        System.out.println("static parent method overriden");
    }
}
public class Multilevel_inheritance {
    void method1 () {

    }
    public static void main(String[] args) {

        Child child = new Child();

        child.walk();

        child.walk("fastly");

        child.parentMethod();


        Child object = new Child();

        object.parentMethod();


    }
}
