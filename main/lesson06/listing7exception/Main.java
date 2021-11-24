package lesson06.listing7exception;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {

        try
        {
            FileWriter file = new FileWriter("text.text");
            file.close();
            file.write("hello friend");
        }
        catch (IOException e)
        {
            System.out.println("Close file "+e);
        }

        finally {   //в этом блоке указывается обязательное действие
            System.out.println("Open other file or change path to file");
        }




    }
}