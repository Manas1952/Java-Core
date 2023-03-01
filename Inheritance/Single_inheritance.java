package Inheritance;

class Animal {

    static int avgLifeSpan = 10;

    static void m1(){
        System.out.println("m1");
    }

    Animal() {

        System.out.println("Animal constructor");
    }
    static void walk() {
        Animal.avgLifeSpan = 20;

        System.out.println("animal walking");
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

//    static void walk() {
//
//        System.out.println("dog walking...");
//    }

    int eat(int a) {

        return 1;
    }

    void walk (String name) {

        System.out.println(name + " is walking");
    }
}

// IS-A relationship
public class Single_inheritance {

    static void method(String string){
        string.concat("abc");
    }
    public static void main(String[] args) {
        Dog dog = new Dog("Tom");
        dog.avgLifeSpan = 3;

        System.out.println(" " + Animal.avgLifeSpan);

        Dog.walk();
        Animal animal1 = null;
        Dog.avgLifeSpan = 2;
        animal1.m1();

        animal1.avgLifeSpan = 3;

        animal1.walk();

        dog.walk("Tom");

        dog.walk();

        dog.bark();

        System.out.println("Average life span of Animal: " + dog.avgLifeSpan);

        System.out.println("Life span of dog: " + dog.lifeSpan);



    }
}