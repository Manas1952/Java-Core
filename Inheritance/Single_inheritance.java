package Inheritance;

class Animal {

    int avgLifeSpan = 10;

    Animal() {
        System.out.println("Animal constructor");
    }
    static void walk() {
        System.out.println("walking");
    }

    void eat() {
        System.out.println("eating");
    }
}

class Dog extends Animal {

    int lifeSpan = 5;
    Dog() {
        System.out.println("Dog constructor");
    }
    Dog(String name) {
        System.out.println("Dog constructor with name: " + name);
    }
    void bark() {
        System.out.println("barking");
    }

    static void walk() {
        System.out.println("walking...");
    }

    void walk (String name) {
        System.out.println(name + " is walking");
    }
}
public class Single_inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Tom");

        dog.walk("Tom");

        dog.walk();

        dog.bark();

        System.out.println("Average life span of Animal: " + dog.avgLifeSpan);

        System.out.println("Life span of dog: " + dog.lifeSpan);
    }
}