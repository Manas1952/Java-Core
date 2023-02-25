package polymorphism;

class Animal1{

    void eat(){
        System.out.println("animal is eating...");
    }
}
class Dog1 extends Animal1{

    void eat(){
        System.out.println("dog is eating...");
    }
}
class BabyDog1 extends Dog1{
}

public class DynamicMethodDispatch1 {
    public static void main(String[] args) {

        Animal1 animal = new BabyDog1();

        // Since, BabyDog is not overriding the eat() method, so eat() method of Dog class is invoked.
        animal.eat();
    }
}
