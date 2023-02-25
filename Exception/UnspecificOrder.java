package Exception;

public class UnspecificOrder {
    public static void main(String[] args) {
        try{
            int array[] = new int[5];

            array[5] = 0/0;
        }
        catch(Exception e){
            System.out.println("common task completed");
        }

        // already caught so error
//        catch(ArithmeticException e){
//            System.out.println("task1 is completed");
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("task 2 completed");
//        }

        System.out.println("rest of the code...");
    }
}
