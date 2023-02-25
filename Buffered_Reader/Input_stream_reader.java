package Buffered_Reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input_stream_reader  {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Enter name: ");

        String name = bufferedReader.readLine();

        System.out.println("Name is '" + name + "'");
    }
}
