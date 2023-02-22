package Polymorphism;

interface Printable { }

class classA implements Printable{

    public void method(){
        System.out.println("a method");
    }
}

class classB implements Printable{

    public void method(){
        System.out.println("b method");
    }
}

class Call{
    void invoke(Printable printable){ //upcasting

        if(printable instanceof classA){
            classA object1=(classA)printable; //Downcasting

            object1.method();
        }

        if(printable instanceof classB){
            classB object2=(classB)printable; //Downcasting

            object2.method();
        }

    }
}

public class InctanceOf {
    public static void main(String args[]){
        Printable printable = new classB();

        Call object = new Call();

        object.invoke(printable);
    }
}
