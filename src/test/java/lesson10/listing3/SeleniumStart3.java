package lesson10.listing3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumStart3 {

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
    public void test3() throws InterruptedException {
        webDriver.get(URL);
        WebElement cardElements = webDriver.findElement(By.xpath("//*[contains(h5, 'Elements')]"));
        cardElements.click();
        WebElement tabCheckBox = webDriver.findElement(By.xpath("//*[contains(text(), 'Check Box')]"));
        tabCheckBox.click();
        WebElement checkbox = webDriver.findElement(By.className("rct-checkbox"));
        checkbox.click();
        Thread.sleep(3000);


    }

    @AfterMethod(enabled = false)
    public void teardown()
    {
        webDriver.quit();
    }
}
