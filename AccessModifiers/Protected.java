package AccessModifiers;

import Protected.MyClass1;

class MyClass extends Protected {
    MyClass() {

    }
}

public class Protected extends MyClass1{
    protected Protected() {
        System.out.println("constructor");
    }

    @Override
    // only protected and public are allowed because visibility should increase or be same, not decrease by default and private
    protected void method() {
        System.out.println("method() is overriden, 'value1' from MyClass1 from another pkg: " + value1);
    }

    protected int value = 1;

    void method1() {
        System.out.println(value);
    }

    public static void main(String[] args) {
        MyClass1 myClass1 = new MyClass1();

        Protected object = new Protected();

        object.method();

        System.out.println(object.value);

        int[] array = new int[0];
    }
}
