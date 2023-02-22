package Polymorphism;
class Parent{
    Parent(){
        System.out.println("parent class constructor invoked");
    }

    void m1(){
        System.out.println("m1()");
    }
}
public class InstanceBlock extends Parent{
    InstanceBlock(){

        // super() is called by default, so first constructor is invoked, then instance block is executed, then constructor is executed

//        super();
        System.out.println("child class constructor invoked");
        m1();
    }

    {
        System.out.println("instance initializer block ");
    }

    public static void main(String args[]){
        InstanceBlock object = new InstanceBlock();
    }
}