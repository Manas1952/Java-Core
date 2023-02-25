package Exception;

import java.io.IOException;

// By default, Checked Exceptions are not forwarded in calling chain (propagated), so handle everytime.
public class PropagationForChecked  {

    void method1() throws IOException {
        throw new java.io.IOException("device error");//checked exception
    }

    void method2() throws IOException {
        method1();
    }
    void method3(){
        try{
            method2();
        }
        catch(Exception e){
            System.out.println("exception handled");
        }

    }
    public static void main(String args[]){
        PropagationForChecked object = new PropagationForChecked();

        object.method3();

        System.out.println("rest of code...");
    }
}
