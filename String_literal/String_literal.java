package String_literal;

public class String_literal {
    public static void main(String[] args) {
        String str1 = "Manas";

        String str2 = "Manas";

        String str3 = new String("Manas");

        String str4 = new String("Manas");

        System.out.println(str2 == str3);

        System.out.println(str2.equals(str3));

        System.out.println(str3.equals(str2));

        System.out.println(str3.equals(str4));

        // .intern() will add str3 to string constant pool
        System.out.println(str4 == str3);

        System.out.println(str1 == str2);


    }
}
