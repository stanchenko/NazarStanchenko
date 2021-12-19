package lesson10.listing2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumStart2 {

    WebDriver webDriver;
    private static final String URL = "https://demoqa.com/";

    @BeforeMethod
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @Test(enabled = true)
    public void test2()
    {
        webDriver.get(URL);
        //webDriver.navigate().to(URL + "alert");
        WebElement cardElements = webDriver.findElement(By.xpath("//*[contains(h5, 'Alerts, Frame & Windows')]"));
        cardElements.click();
        //WebElement tabAlerts = webDriver.findElement(By.xpath("//li[@id='item-1']//*[contains(text(), 'Alerts')]"));
        WebElement tabFrame = webDriver.findElement(By.xpath("//li[@id='item-2']//*[contains(text(), 'Frames')]"));
        tabFrame.click();

        WebElement frame = webDriver.findElement(By.id("frame2"));
        webDriver.switchTo().frame(frame);

        WebElement elementInFrame = webDriver.findElement(By.id("sampleHeading"));

        System.out.println(elementInFrame.getText());
    }

    @AfterMethod(enabled = false)
    public void teardown()
    {
        webDriver.quit();
    }
}
