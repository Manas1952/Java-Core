package Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throw {
    public static void method() throws FileNotFoundException{
        FileReader fileReader = new FileReader("nothing");

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        throw new FileNotFoundException();

    }

    public static void main(String[] args) {
        try {
            method();
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found: " + fileNotFoundException);
        }
        System.out.println("rest of code...");
    }
}
