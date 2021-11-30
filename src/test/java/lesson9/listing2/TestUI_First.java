package lesson9.listing2;

import io.github.bonigarcia.wdm.WebDriverManager;
import lesson04.professions.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.lang.reflect.WildcardType;

public class TestUI_First
{
    WebDriver webDriver;
    private static final String URL = "https://demoqa.com/";

    @BeforeMethod
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

    }

    @Test(enabled = false)
    public void test1()
    {
        webDriver = new ChromeDriver();
        webDriver.get(URL);
        System.out.println("Page: " + webDriver.getCurrentUrl());
        webDriver.navigate().forward();
        System.out.println("Page: " + webDriver.getCurrentUrl());
        webDriver.navigate().back();
        System.out.println("Page: " + webDriver.getCurrentUrl());

        webDriver.navigate().refresh();
        System.out.println("Page: " + webDriver.getCurrentUrl());

    }

    @Test(enabled = false)
    public void test2()
    {

        webDriver.get(URL); //open url  same ->webDriver.navigate().to("https://demoqa.com");
        System.out.println("Actual result: " + webDriver.getCurrentUrl());
        Assert.assertEquals(webDriver.getCurrentUrl(), URL);

        String title = webDriver.getTitle();
        System.out.println(title);


        String hangle = webDriver.getWindowHandle(); //каждая открытая вкладка имеет свой уникальный номер
        System.out.println("Before " + webDriver.getWindowHandle()); // выводим уникальный хэндел открытой вкладки

        webDriver.switchTo().newWindow(WindowType.TAB); // открываем новую табу
        System.out.println("After " + webDriver.getWindowHandle()); //получаем хэндел открытой вкладки

        // в результате получаем два уникальных хэндла каждой вкладки
        // webDriver.switchTo().window(hangle);

        webDriver.switchTo().newWindow(WindowType.WINDOW);  //открытие нового окна браузера
        System.out.println("Хэндел нового окна " + webDriver.getWindowHandle());


         // переход на конкретную вкладку
         // webDriver.switchTo().frame(); переход на фрейм - как бы отдельная страница внутра страницы и чтобы работать с
         // элементами фрейма необходимо сначало в него перейти
    }
    @Test(enabled = false)
    public void test3()
    {
        webDriver.get(URL);

        //  $x("//*[@class = 'body-height']"); пример xpath
        //  $x("//*[contains(@class, 'top-card')]"); пример xpath
        //  $x("//*[contains(@class, 'top-card')]//*[contains(text(), 'Elements')]");
        //  $x("//*[contains(@class, 'top-card')][3]");
        webDriver.findElement(By.xpath("//*[contains(@class, 'top-card')]//*[contains(text(), 'Elements')]")).click();

        webDriver.findElement(By.id("app"));
        webDriver.findElement(By.className("body-height"));

       // webDriver.findElement(By.cssSelector());

       // webDriver.findElement(By.name());

    }

    @Test(enabled = false)
    public void test4()
    {
        webDriver.get(URL);
        WebElement element = webDriver.findElement(By.xpath("//*[contains(@class, 'top-card')]//*[contains(text(), 'Elements')]"));
        System.out.println(element.getText());
        element.click();
    }

    @Test(enabled = false)
    public void test5() throws InterruptedException {
        webDriver.get(URL);
        WebElement cardElement = webDriver.findElement(By.xpath("//*[contains(@class, 'top-card')]//*[contains(text(), 'Elements')]"));
        cardElement.click();

        Thread.sleep(7000);
        WebElement textBox = webDriver.findElement(By.xpath("//*[@class='element-group']//*[contains(@class, 'show')]//*[@id='item-0']"));
        String text = textBox.getText();
        textBox.click();
        Thread.sleep(7000);
        WebElement tabElements = webDriver.findElement(By.xpath("//div[@class='header-text'])[1]"));
        tabElements.click();
        Thread.sleep(7000);

        //  $x("//*[@class='element-group']//*[contains(@class, 'show')]//*[@id='item-0']");

        System.out.println(text);

        WebElement inputName = webDriver.findElement(By.id("userName"));
        //inputName.click();
        inputName.sendKeys("Dmitro");
        inputName.submit();

    }

    @Test(enabled = true)
    public void firstUITest() throws InterruptedException
    {
        webDriver.get(URL); // open url
        WebElement cardElements = webDriver.findElement(By.xpath("//*[contains(@class, 'top-card')]//*[contains(text(), 'Elements')]"));

        cardElements.click();
        WebElement tabElements = webDriver.findElement(By.xpath("(//div[@class='header-text'])[1]"));
// tabElements.click();
        Thread.sleep(7000);

        WebElement textBox = webDriver.findElement(By.xpath("//*[@class='element-group']//*[contains(@class, 'show')]//*[@id='item-0']"));
        String text = textBox.getText();
        textBox.click();

        WebElement inputName = webDriver.findElement(By.id("userName"));
        WebElement submitButton = webDriver.findElement(By.id("submit"));
        inputName.sendKeys("Dmytro");

        submitButton.submit();

        System.out.println(text);
    }

    @AfterMethod(enabled = false)
    public void teardown()
    {
        webDriver.quit();
    }
}
