package Literals;

public class TypeCasting {
    public static void main(String[] args) {
        // widening / upcasting / implicit casting
        // byte -> short -> char -> int -> long -> float -> double
        byte b = -127;
        short s = b;
        char c = (char) s; // compile time error since char cannot hold -ve values if given (like -128)
        int i = c;
        long l = i;
        float f = l;
        double d = f;

        System.out.println(b);
        System.out.println(s);
        System.out.println(c);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println((short)c);
        System.out.println((int)c); // gets converted to -127 because int can easily hold it. (2^16-127)
        System.out.println("----------------------");


        // narrowing / downcasting / exlicit casting
        // double -> float -> long -> int -> char -> short -> byte
        double d1 = 0b11111111111111110;
        float f1 = (float) d1;
        long l1 = (long) f1;
        int i1 = (int) l1;
        char c1 = (char) i1;
        short s1 = (short) c1;
        byte b1 = (byte) s1;

        System.out.println(d1);
        System.out.println(s1);
        System.out.println(c1);
        System.out.println(i1);
        System.out.println(l1);
        System.out.println(f1);
        System.out.println(d1);
    }
}
