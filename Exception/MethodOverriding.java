package Exception;

import java.io.IOException;

class Parent {
    void method() {
        System.out.println("parent method");
    }
}

public class MethodOverriding extends Parent{
    // error since can't declare checked exception while parent method doesn't throws an exception
//    void method() throws IOException {
//        System.out.println("child method");
//    }

    public static void main(String[] args) {

    }
}
