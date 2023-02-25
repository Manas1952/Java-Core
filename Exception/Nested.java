package Exception;

import java.io.IOException;

public class Nested {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        try {
            try {
                try {
                    int array[] = { 1, 2, 3, 4 };

                    System.out.println(array[10]);
                }
                catch (ArithmeticException arithmeticException) {
                    System.out.println("Arithmetic exception");

                    System.out.println(" inner try block 2");
                }
            }
            catch (ArithmeticException arithmeticException) {
                System.out.println("Arithmetic exception");

                System.out.println("inner try block 1");
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("-->" + arrayIndexOutOfBoundsException);

            System.out.println(" outer (main) try block");
        }
        catch (NullPointerException exception) {
            System.out.println("Exception");

            System.out.println(" handled in main try-block");
        }
    }
}
