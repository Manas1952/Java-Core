package Exception;


import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Checked {
    public static void main(String[] args) {

        PrintWriter printWriter;

        try {
            printWriter = new PrintWriter("file.txt"); //will throw exception

            printWriter.println("saved");
        }

        catch (FileNotFoundException e) {

            System.out.println("File not found..." + e);
        }
        System.out.println("File saved successfully");
    }
}
