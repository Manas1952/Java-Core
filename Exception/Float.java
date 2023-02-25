package Exception;

public class Float {
    public static void main(String[] args) {
        try {
            float value = (float)1/0;
            System.out.println(value);
        }
        catch (Exception exception){
            System.out.println("exception");
        }

    }
}
