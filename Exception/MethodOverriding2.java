package Exception;

class Parent2 {
    void method() {
        System.out.println("parent method");
    }
}

public class MethodOverriding2 extends Parent2 {
    // valid, i.e. can declare unchecked exception since parent method doesn't declare exception
    void method() throws ArithmeticException {
        System.out.println("child method");
    }

    public static void main(String[] args) {
        Parent2 object = new MethodOverriding2();

        object.method();
    }
}
