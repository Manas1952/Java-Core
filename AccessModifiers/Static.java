package AccessModifiers;

// static method can access static variables and methods only
public class Static {
    // can't be accessed by child class
    static private int value1 = 1;

    int value2 = 1;

    static int value = 5;

    // can't access value1 as value1 is instance variable
    static void method1() {
        System.out.println("static method1(), " + value);
    }

    private void method2() {
        System.out.println(value1 + ", " + value);
    }

    void method3() {
        method2();
        System.out.println("method3()");
    }
}

class MyClass1 extends Static{

    public static void main(String[] args) {
        // accessible only because value is static, same for method() if declared static
        System.out.println(value);

        Static object = new Static();

        System.out.println(object.value);

        object.method1();

        // can't access private
//        object.method2();

    }
}

