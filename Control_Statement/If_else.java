package Control_Statement;

public class If_else {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        if(x+y < 20) {
            int a = 10/0;
            System.out.println("x + y is less than 20");
        }

        else if (x + y == 20) {
            int a = 10/0;
            System.out.println("x+y is equal to 20");
        }

        else {
            System.out.println("x+y is greater than 20");
        }
    }
}
