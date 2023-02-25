package Shallow_deep_copy;

public class Strings {
    public static void main(String argvs[])
    {
        String string1 = new String("string1");

        String string2 = string1;

        System.out.println(string1 == string2);

        string2 = "string2";

        System.out.println("The hash code is: " + string1.hashCode());

        System.out.println("The string is: " + string1 + "\n");

        System.out.println("The hash code is: " + string2.hashCode());

        System.out.println("The string is: " + string2);

        // because string is immutable
    }
}
