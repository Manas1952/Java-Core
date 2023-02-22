package Polymorphism;

class class1{
    class1(){

        System.out.println("parent class constructor invoked");
    }

    {
        System.out.println("class1 instance block");
    }
}

class class2 extends class1{
    class2() {
        System.out.println("class2 constructor");
    }

    {
        System.out.println("class2 instance block");
    }
}

class class3 extends class2{
    class3(){
//        super();
        System.out.println("class3 constructor");
    }

    class3(int a){
        super();

        System.out.println("child class constructor invoked "+a);
    }

    {
        System.out.println("class3 instance block");
    }

    public static void main(String args[]){
        class3 object1 = new class3();
//        class3 b2=new class3(10);
    }
}