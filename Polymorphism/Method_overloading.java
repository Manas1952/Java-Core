package Polymorphism;

public class Method_overloading {

    static int add(int a,int b){
        return a+b;
    }

    static int add(int a,int b,int c){
        return a+b+c;
    }

    static double add (double a, double b) {
        return a+b;
    }

}
class TestOverloading1{

    public static void main(String[] args){

        System.out.println(Method_overloading.add(11,11));

        System.out.println(Method_overloading.add(11.0,11.1));

        System.out.println(Method_overloading.add(11,11,11));
    }

    public static void main(String args) {
        System.out.println("main method overloaded");
    }
}
