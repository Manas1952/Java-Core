package Exception;

public class Unchecked {
    public static void main(String[] args) {
        try {
            int data = 1/0;

            // it's a empty string, not null
            String string1 = new String("");
            System.out.println("-->" + string1);

            System.out.println(string1.length());

            String string2 = "abc";
            int length = Integer.parseInt(string2);

            int array[] = new int[5];
            array[6] = 10;
        }
        catch (ArithmeticException arithmeticException) {
            System.out.println("Exception: " + arithmeticException);

//            int number = Integer.parseInt("qew");

            System.out.println("rest of code");
        }

        catch (NullPointerException nullPointerException) {
            System.out.println("Exception: " + nullPointerException);
        }

        catch (NumberFormatException numberFormatException) {
            System.out.println("Exception:" + numberFormatException);
        }

        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Exception: " + arrayIndexOutOfBoundsException);
        }
    }
}
