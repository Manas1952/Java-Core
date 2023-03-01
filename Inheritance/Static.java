package Inheritance;

class Parent4 {
    static void method1() {
        System.out.println("parent m1()");
    }

    void method2() {
        System.out.println("parent m2()");
    }
}

public class Static extends Parent4 {
    static void method1() {
        System.out.println("child m1()");
    }

    // error
//    static void method2() {
//        System.out.println("child m2()");
//    }

    public static void main(String[] args) {
        Parent4 object = new Static();

        object.method1();
    }
}
