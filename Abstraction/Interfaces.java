package Abstraction;

interface Bank{

    // final not allowed
//    final void m1();
    float rateOfInterest();
}

class SBI implements Bank{
    public float rateOfInterest(){
        return 9.15f;
    }
}

class PNB implements Bank{
    public float rateOfInterest(){
        return 9.7f;
    }
}

public class Interfaces {
    public static void main(String[] args){
        Bank bank = new SBI();

        System.out.println("ROI: " + bank.rateOfInterest());
    }
}
