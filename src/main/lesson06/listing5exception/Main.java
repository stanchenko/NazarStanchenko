package lesson06.listing5exception;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        FileWriter file = null;
        try {
            file = new FileWriter("text.text");
            file.write("hello my friend");
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
