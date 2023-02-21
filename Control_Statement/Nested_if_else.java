package Control_Statement;

public class Nested_if_else {
    public static void main(String[] args) {
        String address = "Ahmedabad, India";

        if(address.endsWith("India")) {
            
            if(address.contains("ahmedabad")) {
                
                System.out.println("Your city is Ahmedabad");
            }
            else if(address.contains("Noida")) {
                System.out.println("Your city is Noida");
            }
            else {
                System.out.println(address.split(",")[0]);
            }
        }
        
        else {
            System.out.println("You are not living in India");
        }
    }
}
