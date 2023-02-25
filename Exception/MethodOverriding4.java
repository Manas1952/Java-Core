package Exception;

class Parent4 {
    void method() throws RuntimeException{
        System.out.println("parent method");
    }
}

public class MethodOverriding4 extends Parent4 {
    // must handle exception when subclass exception is declared
    // if it doesn't declare exception, then also should handle object.method()
    void method()   {
        System.out.println("child method");
    }

    public static void main(String[] args) {
        Parent4 object = new MethodOverriding4();

//        try {
            object.method();
//        }

        // must handle same exception or parent exception
//        catch (Exception exception){
//            System.out.println("handled Exception, not ArithmeticException");
//        }
    }
}
