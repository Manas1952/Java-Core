package Strings;

public class Replace {
    public static void main(String[] args) {
        String string1 = "strings";

        String string2 = string1.replace("s", "d");

        String string3 = string1.replace('s', 'd');

        System.out.println(string1);

        System.out.println(string2);

        string1 = string1.concat(string2.concat(string3));

        System.out.println(string1);
    }
}
