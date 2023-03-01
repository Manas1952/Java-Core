package Exception.Overriding;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent {
    void method1()  {
        System.out.println("parent method1()");
    }
}

public class MethodOverriding_1 extends Parent {
    @Override
    void method1() throws RuntimeException {
        System.out.println("child method1()");
    }

    public static void main(String[] args) {
        Parent object = new MethodOverriding_1();

        object.method1();
    }
}
