package lesson08.listing2;

import java.util.Random;

public class Lucky {
    public static void main(String[] args) {
        int[] array1 = {15, 8, 24, 41, 9, 84};
        Random random = new Random();
        int index = random.nextInt(array1.length);
        System.out.println(index);

        int indexRandom = array1[index];
        System.out.println(indexRandom);
        if((indexRandom % 2)==0)
        {System.out.println("I am lucky");}
        else
        {System.out.println("Try again");}
    }
}
