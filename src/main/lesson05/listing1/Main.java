package lesson05.listing1;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
     //   String s = "2";
        ArrayList s = new ArrayList();
        //ArrayList<String> s = new ArrayList<String>();
        s.add("Car");
       // int s = 2;
        Car car = new Car();
        car.testInstanceOf(s);
        System.out.println(s);

    }

}