package Inheritance;

class Grand {
    int age = 80;

    void walk() {
        System.out.println("Grand is walking");
    }
}

class Parent {
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
}

class Child extends Parent{
    int age = 20;


}
public class Multilevel_inheritance {
    public static void main(String[] args) {

        Child child = new Child();

        child.walk();

        child.walk("fastly");
    }
}
