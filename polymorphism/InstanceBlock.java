package polymorphism;
class Parent{
    static {
        System.out.println("static block of parent");
    }
    {
        System.out.println("instance block of parent");
    }

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

    static {
        System.out.println("static block of child");
    }

    {
        System.out.println("instance initializer block of child ");
    }

    public static void main(String args[]){
//        InstanceBlock object = new InstanceBlock();
    }
}