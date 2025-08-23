package lesson08.listing3;

import java.util.Random;
//     int[] array1 = {15, 8, 24, 41, 9, 84};
//  int index = random.nextInt(array1.length);
public class Lucky {

    public boolean ckeckInteger(int[] array1, int index) throws WrongTypeException, LengthArrayException, NegativeValueException, CustomLengthException {


        if (array1 == null)
            throw new WrongTypeException();

        if (index > array1.length)
            throw new LengthArrayException();

        if (index < 0)
            throw new NegativeValueException();
        if (array1.length != 6)
            throw new CustomLengthException();

        Random random = new Random();
        System.out.println(index);
        int indexRandom = array1[index];
        System.out.println(indexRandom);
        if ((indexRandom % 2) == 0) {
            System.out.println("I am lucky");
            return true;
        } else {
            System.out.println("Try again");
            return false;
        }

    }
}