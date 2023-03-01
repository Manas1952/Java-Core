package Inheritance;

class Parent5 {
    protected void method1() {
        System.out.println("parent method1()");
    }
}

public class Protected extends Parent5 {
    // error cause visibility should be same or increase
//    void method1() {
//        System.out.println("child method1()");
//    }

    public static void main(String[] args) {
        Parent5 object = new Protected();

        object.method1();
    }
}
