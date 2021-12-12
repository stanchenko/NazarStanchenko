package lesson10.listing1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.jvm.hotspot.runtime.Thread;

public class SeleniumStart {

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
    public void test1()
    {
        webDriver.get(URL);
        //webDriver.navigate().to(URL + "alert");
        WebElement cardElements = webDriver.findElement(By.xpath("//*[contains(h5, 'Alerts, Frame & Windows')]"));
        cardElements.click();
        WebElement tabAlerts = webDriver.findElement(By.xpath("//li[@id='item-1']//*[contains(text(), 'Alerts')]"));
        tabAlerts.click();
        WebElement buttonAlert = webDriver.findElement(By.id("alertButton"));
       // buttonAlert.click();
       // String text = webDriver.switchTo().alert().getText();
       // System.out.println(text);
       // WebElement buttonConfirm = webDriver.findElement(By.id("confirmButton"));
       // buttonConfirm.click();

        WebElement buttonPromt = webDriver.findElement(By.id("promtButton"));
        buttonPromt.click();
        webDriver.switchTo().alert().sendKeys("123");



        //EvaluateExpression from context menu after run debug mod
       // webDriver.switchTo().alert().accept();



    }



    @AfterMethod(enabled = false)
    public void teardown()
    {
        webDriver.quit();
    }
}
