package Exception;

class Parent3 {
    void method() throws ArithmeticException{
        System.out.println("parent method");
    }
}

public class MethodOverriding3 extends Parent3 {
    // may or may not declare same exception, but can't declare parent exception
    void method() throws ArithmeticException {
        System.out.println("child method");
    }

    public static void main(String[] args) {
        Parent3 object = new MethodOverriding3();

        object.method();
    }
}
