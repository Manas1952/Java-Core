package Abstraction;


interface AbstractClass1 {

}
interface Printable1 extends AbstractClass1{

    // automatic converted to 'static final int integer = 1;'
    int integer = 1;

    static int print(int param){
        return param;
    }

    // automatic converted to 'abstract void print()'
    //can't be private, final, static
    void print();

    // can't implement
    default void message () {
        System.out.println("default method with variable in interface: " + integer);
    }

}
interface Showable1 extends Printable1{
    void show();
}
class InterfaceInheritance implements Showable1{

    public void print(){
        System.out.println("Hello");
    }

    public void show(){
        System.out.println("Welcome");
    }

    public static void main(String args[]){
        InterfaceInheritance object = new InterfaceInheritance();

        object.print();

        object.show();

        object.message();

        System.out.println(Printable1.print(5));
    }
}