import lesson07.calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTest
{
    private Calculator calculator = new Calculator();

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


    @Test(priority = 1)
    public void testSum()
    {
       // Assert.assertTrue();
        //Assert.assertEquals();
        //Assert.assertFalse();

        Assert.assertEquals(calculator.sum(4,6), 1);
    }

    @Test(dependsOnMethods = "testSum")
    public void testSum2()
    {
        Assert.assertEquals(calculator.sum(4,6), 10);
    }
    @Test(timeOut = 3000)
    public void testSum3()
    {
        Assert.assertEquals(calculator.sum(4,6), 10);
    }

    @Test(groups = {"a", "b"})
    public void testSum4()
    {
        Assert.assertEquals(calculator.sum(4,6), 10);
    }
    @Test(alwaysRun = true)
    public void testSum5()
    {
        Assert.assertEquals(calculator.sum(4,6), 10);
    }
}
