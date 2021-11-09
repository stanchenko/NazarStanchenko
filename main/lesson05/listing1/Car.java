package lesson05.listing1;

import java.util.ArrayList;


public class Car
{

    public void testInstanceOf(Object objecet)
    {
        if (objecet instanceof String)
        {
            System.out.println("Object equals " + objecet);
        }

        if (objecet instanceof ArrayList)
        {
            System.out.println(((ArrayList<?>) objecet).contains("Car"));
        }

        if (objecet instanceof Integer) {
            System.out.println(objecet.toString());
        }
        /*else {
            System.out.println("Object somsing else");
        }*/
    }

}