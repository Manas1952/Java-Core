package Control_Statement;

public class Continue {
    public static void main(String[] args) {
        int i = 5;
        while (i-- > 0) {
            if (i == 3)
                continue;

            System.out.println(i);
        }
    }
}
