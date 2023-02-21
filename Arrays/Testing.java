package Arrays;

public class Testing {
    public static void main(String[] args) {
        int array [] = {1, 2, 3};
        int array1[];
        array1 = new int[] {4, 5, 6};
        array = new int[]{7, 8, 9};
        for(int elem: array1) {
            System.out.println(elem);
        }
        System.out.println(array.getClass().getClass().getClass().getClass());
    }
}
