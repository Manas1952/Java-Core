public class Testing {
    static{
        System.out.println("Static");
    }
    {
        System.out.println("Instance");
    }
    public void Testing(){
        System.out.println("Constructor");
    }
    public static void main(String[] args) {

        Testing t = new Testing();
    }
}

