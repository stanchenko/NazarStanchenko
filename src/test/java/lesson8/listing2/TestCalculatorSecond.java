package lesson8.listing2;

import lesson07.listing1.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCalculatorSecond
{
    public Calculator calculator = new Calculator();

    @DataProvider(name = "testSum3DataProvider") // атрибут name не обязательный
    public Object[][] firstTest3Data() {
        Object[][] data = new Object[][]{
                {3, 17, Integer.sum(3,17)},
                {5, 15, Integer.sum(5,15)},
                {10, 10, Integer.sum(10,10)},
                {12, 8, Integer.sum(12,8)},
                {1, 19, Integer.sum(1,19)},
        };
        return data;
    }

    @DataProvider
    public Object[][] secondTest3Data()
    {
        int a = 13;
        int b = 7;

        int a1 = 13;
        int b1 = 7;

        int a2 = 4;
        int b2 = 16;

        int a3 = 15;
        int b3 = 5;

        int a4 = 19;
        int b4 = 1;

        int sum = Integer.sum(a,b);
        int sum1 = Integer.sum(a1,b1);
        int sum2 = Integer.sum(a2,b2);
        int sum3 = Integer.sum(a3,b3);
        int sum4 = Integer.sum(a4,b4);

        return new Object[][]
                {
                        {a,b,sum},
                        {a1,b1, sum1},
                        {a2,b2, sum2},
                        {a3,b3, sum3},
                        {a4,b4, sum4},
                };
    }

    @Test(priority = 1, dataProvider = "secondTest3Data")
    public void testSum21(int a, int b, int sum)
    {
        Assert.assertEquals(calculator.sum(a,b),sum);
        System.out.println("testSum20:"+ calculator.sum(a,b));
    }


    @Test(priority = 1)  //анотация default prioriti = 0 и он будит выполняться первым
    public void testSum20()
    {
        Assert.assertEquals(calculator.sum(4,6), 10);
        System.out.println("testSum20: 4 и 6 = "+calculator.sum(4,6));
    }
}
