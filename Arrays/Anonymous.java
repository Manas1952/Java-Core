package Arrays;

public class Anonymous {
     static void printArray(int[] array) {
        for (int element: array) {
            System.out.print(" " + element);
        }
    }

    public static void main(String[] args) {
        printArray(new int[] {1, 2, 3});
    }
}
