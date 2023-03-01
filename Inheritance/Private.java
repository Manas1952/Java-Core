package Inheritance;

class Parent2 {
    private void method1() {
        System.out.println("private parent method1()");
    }
}

class Child2 extends Parent2 {
    void method1() {
        System.out.println("child method1()");
    }
}

public class Private {
    public static void main(String[] args) {
        Parent2 object = new Child2();

//        object.method1();
    }
}
