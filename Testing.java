import java.io.FileNotFoundException;
import java.io.FileReader;

abstract class Test {
    public final void m1() {
        System.out.println("m1()");
    }

    public static void main(String[] args)  {
        try {
            FileReader fileReader = new FileReader("");
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.out.println("handled...");
        }
    }
}
public class Testing {

    public static void main(String[] args) throws Exception {
        try {
            int value = 1 / 0;
        }
        catch (ArithmeticException arithmeticException) {

            System.out.println("handled");
        }
    }
}

