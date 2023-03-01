package polymorphism;

class class4 {
    final int limit = 30;

    // can be inherited
    final void method() {
        System.out.println("method");
        // invalid
//        limit = 4;
    }

    // overloading allowed
    final void method(int a) {}
}

final class class5 extends class4 {
    //invalid
    // void method() {}
}

// invalid
//class class6 extends class5 {}

public class FinalVariable {
    public static void main(String[] args) {

        class4 object = new class4();

        System.out.println(object.limit);

        object.method();
    }
}
