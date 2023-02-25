package Exception;

public class Finally {

    public static void main(String[] args) throws Exception{
        try {
            System.out.println("Inside the try block");

            int data=25/0;

            System.out.println(data);

        }

        catch (ArithmeticException arithmeticException){
            throw new Exception("catch exception");

            // finally doesn't get executed
//            System.exit(0);
        }

        catch(NullPointerException nullPointerException){


            System.out.println(nullPointerException);
        }

        finally {
            System.out.println("finally block is always executed");

            throw new Exception("finally exception");

            //statements written here are unreachable, so CTE
        }

//        System.out.println("rest of the code...");
    }
}
