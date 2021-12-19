package lesson10.listing5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumStart5 {

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
    public void test5() throws InterruptedException {
        webDriver.get(URL);
        WebElement cardElements = webDriver.findElement(By.xpath("//*[contains(h5, 'Elements')]"));
        cardElements.click();
        WebElement tabWebTable = webDriver.findElement(By.xpath("//*[contains(text(), 'Web Tables')]"));
        tabWebTable.click();
        WebElement selectElement = webDriver.findElement(By.cssSelector("select"));
        selectElement.click();
        Select select = new Select(selectElement);
        select.selectByIndex(1);
        Thread.sleep(3000);
        select.selectByValue("50");
        Thread.sleep(3000);
        select.selectByVisibleText("100 rows");
        Thread.sleep(3000);
    }

    @AfterMethod(enabled = true)
    public void teardown()
    {
        webDriver.quit();
    }
}
