package String_literal;

public class String_builder {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder();

        StringBuilder str2 = new StringBuilder("strings");

        StringBuilder str3 = new StringBuilder(str2);

        System.out.println(str2);
        System.out.println(str3.capacity());

        System.out.println(1 + 2 + " " + 3 + 4);
    }
}
