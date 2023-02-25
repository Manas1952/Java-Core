package Exception;

class Parent1 {
    static void method1() throws Exception{
        throw new Exception();
    }
}

class Child1 extends Parent1 {
    static void method1() {
        System.out.println("child method1()");
    }

    // should be handled
    void method2() throws Exception{
        Parent1.method1();
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Parent1 object1 = new Child1();

        try {
            object1.method1();
        }
        catch (Exception exception) {
            System.out.println("handled");
        }

        Child1 child1 = new Child1();

        try {
            child1.method2();
        }
        catch (Exception exception) {
            System.out.println("handled...");
        }
    }
}
