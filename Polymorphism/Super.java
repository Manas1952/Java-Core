package Polymorphism;

class Animal{
    String color1="white";

    Animal() {
        System.out.println("Animal constructor");
    }

    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    String color="black";

    Dog() {

        // compiler will automatically add it
//        super();

        System.out.println("Dog constructor");
    }

    void printColor(){
        System.out.println(color);

        System.out.println(super.color1);

        super.eat();
    }
}

public class Super {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.printColor();
    }
}
