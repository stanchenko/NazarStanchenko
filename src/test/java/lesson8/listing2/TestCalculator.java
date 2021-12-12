package lesson8.listing2;

import lesson07.listing1.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCalculator
{
    public Calculator calculator = new Calculator();

    @BeforeSuite
    public void beforeSuit() //будит запускаться перед каждым методом тестового класса
    {
        System.out.println("BeforeSuit");
    }

    @BeforeTest
     public void beforeTest() //будит запускаться перед каждым методом тестового класса
    {
        System.out.println("BeforeTest");
    }
    @BeforeClass
    public void beforeClass() //будит запускаться перед каждым методом тестового класса
    {
        System.out.println("BeforeClass");
    }

    @BeforeGroups
    public void beforeGroups()
    {
        System.out.println("BeforeGroup");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("BeforeMethod");
    }

    @AfterTest
    public void afterTest(){System.out.println("AfterTest");}

    @AfterMethod
    public void afterMethod(){System.out.println("AfterMethod");}

    @AfterGroups
    public void afterGroup(){System.out.println("AfterGroup");}

    @AfterClass
    public void afterClass(){System.out.println("AfterClass");}

    @AfterSuite
    public void afterSuit(){System.out.println("AfterSuit");}


    //при наличии одинакового приоритета тесты будут выполнятся в порядке их написания по строкам кода
    //@Test(enabled = false, description = "девы поломали тест") //отключение теста
    @Test(priority = 1)  // приоритетность выполнения тестов
    public void testSum1()
    {
        // Assert.assertTrue();
        //Assert.assertEquals();
        //Assert.assertFalse();

        Assert.assertEquals(calculator.sum(7,3), 10);
        System.out.println("testSum1: 7 и 3 = "+calculator.sum(7,3));
    }
    @Test(priority = 1)  //анотация default prioriti = 0 и он будит выполняться первым
    public void testSum2()
    {Assert.assertEquals(calculator.sum(4,6), 10);
        System.out.println("testSum2: 4 и 6 = "+calculator.sum(4,6));
    }

    @Test(timeOut = 3000) // таймаут 3 сек
    public void testSum3()
    {
        Assert.assertEquals(calculator.sum(5,15), 20);
        System.out.println("Sum = "+calculator.sum(5,15));
    }

    @Test(dependsOnMethods = "testSum1") //выполнение 4 теста будит зависить от того выполнится ли основной тест
    public void testSum4()
    {
        Assert.assertEquals(calculator.sum(4,6), 10);
    }

    @Test(groups = {"a", "b"}) //
    public void testSum5()
    {
        Assert.assertEquals(calculator.sum(4,6), 10);
    }

    @Test(alwaysRun = true) // параметр указывает на то что тест должен выполняться в любом случаи
    public void testSum6()
    {
        Assert.assertEquals(calculator.sum(4,6), 10);
    }
}


