package Exception;

public class ExceptionClass {
    public static void recursiveMethod(int integer) {

        while (true) {
            integer++;

            recursiveMethod(integer);
        }
    }

    public static void main(String[] args) {
        ExceptionClass.recursiveMethod(3);
    }
}
