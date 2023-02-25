package Shallow_deep_copy;

class Parent {
    int value = 1;
}

class Child extends Parent{

}
public class Shallow {
    public static void main(String[] args) {
        Parent object1 = new Parent();
        object1.value = 2;

        Parent object2 = object1;
        object2.value = 3;

        System.out.println(object1.value);

        System.out.println();
    }
}
