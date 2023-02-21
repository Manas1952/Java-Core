package Control_Statement;

public class Break {
    public static void main(String[] args) {
        int i = 5;
        while (true) {

            if (i < 0)
                break;

            System.out.println(i);
            i--;
        }
    }
}
