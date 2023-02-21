package Control_Statement;

public class For_each {
    public static void main(String[] args) {
        String[] names = {"Manas","Purohit","loves","Java"};

        System.out.println("Printing the content of the array names:\n");

        for(String name:names) {
            System.out.println(name);
        }
    }
}
