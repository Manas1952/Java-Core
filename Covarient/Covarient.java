package Covarient;

// method overriding using different return type(non-primitive)

class Parent {
    Parent method() {
        System.out.println("parent method()");
        return this;
    }
}

class Child extends Parent{
    Child method() {
        System.out.println("child method()");
        return this;
    }

    void method1() {
        System.out.println("child method1()");
    }
}

public class Covarient {

    public static void main(String[] args) {
        Parent object1 = new Parent();

        object1.method();

        Parent object2 = new Child();

        object2.method();

        new Child().method().method1();

        String string1 = "ManasPurohit";

        String string2 = "Manas";
        string2.concat("Purohit");

        String string3 = new String("ManasPurohit");

        System.out.println(string1 == string3);

        StringBuilder stringBuilder = new StringBuilder("ManasPurohit");

        System.out.println(string3.equals(string1));

        System.out.println(stringBuilder.equals(string1));
    }
}
