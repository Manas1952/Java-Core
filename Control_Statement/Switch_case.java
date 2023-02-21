package Control_Statement;

public class Switch_case {
    static void method() {
        return;

        // error: unreachable statement
//        int a= 3+3;
    }

    public static void main(String[] args) {
        int num = 1;

        //error
//        System.out.println(method());

        // Once the switch statement has found a case that matches the passed variable, it proceeds to execute case code until either the first break keyword is encountered or the end of the switch block itself.
        switch (num) {
            case 0:
                System.out.println("number is 0");
                break;
            case 1:
                System.out.println("number is 1");
                break;
            case 2:
                System.out.println("number is 2");
                break;
            default:
                System.out.println(num);
        }
    }
}
