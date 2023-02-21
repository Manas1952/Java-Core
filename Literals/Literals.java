package Literals;

import java.util.Scanner;

public class Literals {
    public static void main(String[] args) {
        // 1. integer literal
        int decimal = 5;

        int octal = 055;
        int hexadecimal = 0x123;
        int binary = 0b10001;

        System.out.println("decimal integer: " + decimal);
        System.out.println("octal integer: " + octal);
        System.out.println("hexadecimal integer: " + hexadecimal);
        System.out.println("binary integer: " + binary);

        //to check conversion
        octal = hexadecimal;
        System.out.println(octal);

        // 2. String literal
        String string = "Manas";
        String string1 = "Manas";
        System.out.println(string.hashCode());
        System.out.println(string1.hashCode());

        // 3. Decimal literal
        float var1 = 123.45f;

        // 4. double literal -- 14 decimal after '.'
        double var2 = 123.45678;
        System.out.println(var2);

        // 5. boolean literal
        boolean isVar = true;

        // 6. null literal
        String var3 = null;

        // invalid 'null' assignment
//        int var4 = null;
//        char charVariable = null;
//        double doubleVar = null;

        // 7. Class literal
        Class class1 = Scanner.class;

        // -128 - 0 and 0 - 127
        byte byte1 = -128;
        System.out.println(byte1);


    }
}