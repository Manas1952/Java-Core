package String_literal;

public class String_buffer {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer();
        StringBuffer str2 = new StringBuffer("3cstring");

        str1.append(3);

        str1.append('c');

        str1.append("string");

        System.out.println(str2 == str1);

        str1.insert(1, 'd');

        str1.replace(1, 3, " substring ");

        str1.delete(0, 2);

        str1.reverse();
        System.out.println(str1);
    }
}
