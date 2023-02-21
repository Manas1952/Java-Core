public class Testing {
    public static void main(String[] args) {
        System.out.println("testing");
    }
}
class Testing1{
    public static void main(String[] args) {
        byte b =127;
        char c = (char) 65538;

        // error
//        byte d = (int)234;
        System.out.println(c);
        System.out.println("testing1");

        byte b1 = (byte)1234567;
        System.out.println(b1);

        int[] arr = {1, 2, 3};
        System.out.println(arr);
    }
}