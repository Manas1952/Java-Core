package Abstraction;

interface Printable {
    void print();

    void show();
    // void print(int a); // allowed
}

interface Showable {
    static int x = 5;

    void show();
}

public class MultipleInterfaces implements Showable, Printable {
    public void print() {
        System.out.println("print");
    }

    public void show() {
        System.out.println("show");
    }

    public static void main(String[] args) {
        MultipleInterfaces object = new MultipleInterfaces();

        object.print();

        object.show();


    }
}
