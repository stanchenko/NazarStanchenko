package lesson8.lucky;

import lesson08.listing3.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LuckyTestNG {

    Lucky lucky = new Lucky();

    @DataProvider
    public Object[][] integerLuckyDataProvider()
    {
        int[] array1 = {155, 84, 244, 441, 94, 844};
        int[] array2 = {145, 83, 224, 471, 97, 824};
        int[] array3 = {135, 86, 284, 41, 91, 4};
        int[] array4 = {15, 8, 24, 41, 9, 84};
        return new Object[][]
                {
                        {array1,3,false},
                        {array2,4,false},
                        {array3,5,true},
                        {array4,2,true},
                };
    }

    @Test(dataProvider = "integerLuckyDataProvider")
    public void isIntegerLucky(int[] array, int index, boolean result) throws LengthArrayException, CustomLengthException, WrongTypeException, NegativeValueException
        {
            Assert.assertEquals(lucky.ckeckInteger(array, index), result);
        }

}