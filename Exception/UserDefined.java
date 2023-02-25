package Exception;

class UserDefinedException extends Exception{
    public UserDefinedException(String exception) {

        super(exception);
    }
}

public class UserDefined {
    public static void main(String[] args) {

        try {
            throw new UserDefinedException("user defined execption");
        }
        catch (UserDefinedException userDefinedException){

            System.out.println("handled" + userDefinedException);
        }
    }
}
