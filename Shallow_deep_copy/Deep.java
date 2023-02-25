package Shallow_deep_copy;

class Parent1 {
    int value = 1;
}

class Child1 extends Parent1{

}

public class Deep {
    public static void main(String[] args) {
        Parent1 object1 = new Parent1();
        object1.value = 2;

        Parent1 object2 = new Parent1();
        object2.value = 3;

        System.out.println(object1.value);

        System.out.println();
    }
}
