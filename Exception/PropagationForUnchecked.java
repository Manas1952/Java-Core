package Exception;

// By default Unchecked Exceptions are forwarded in calling chain (propagated).
public class PropagationForUnchecked {
    void method1() {
        int data = 1/0;
    }

    void method2() {
        method1();
    }

    void method3() {
        try {
            method2();
        }
        catch (Exception exception) {
            System.out.println("exception: " + exception);
        }
    }

    public static void main(String[] args) {
        PropagationForUnchecked propagation = new PropagationForUnchecked();

        propagation.method3();

        System.out.println("rest of code...");
    }
}
