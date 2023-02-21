package Arrays;

public class Arrays {
    public static void main(String[] args) {
        // 1-D Array
        int array1[] = new int[5], i = 1;

        // invalid
//        for (int element: array1) {
//            element = i++;
//        }
        for (int j = 0; j < 5; j++) {
            array1[j] = j;
        }
        for (int element: array1) {
            System.out.println(element);
        }

        // 2-D array
        int []array2[] = new int[5][];
        int[][] array3 = {{1, 2, 3}, {4, 5}, {7}};

        // string array
        String[] str = {"a", "b"};

        for (int[] array: array3) {
            for (int element: array) {
                System.out.print(element + " ");
            }
        }
    }
}
