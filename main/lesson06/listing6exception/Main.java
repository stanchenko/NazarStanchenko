package lesson06.listing6exception;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        FileWriter file = new FileWriter("text.text");
        file.write("hello friend");





    }
}