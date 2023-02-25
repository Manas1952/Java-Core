package Buffered_Reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_reader {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("/home/manas/Manas/JAVA/Notes.txt");

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int iterator;

        while ((iterator = bufferedReader.read()) != -1) {
            System.out.print((char)iterator);
        }

        bufferedReader.close(); // throws IO Exception

        fileReader.close();
    }
}
