package lesson10.listing7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumStart7 {

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
    public void test7() throws InterruptedException {
        webDriver.get(URL);
        WebElement cardElements = webDriver.findElement(By.xpath("//*[contains(h5, 'Elements')]"));
        cardElements.click();

        WebElement tabUploadDownload = webDriver.findElement(By.xpath("//li[@id='item-7']//*[contains(text(), 'Upload and Download')]"));
        tabUploadDownload.click();
        WebElement choose = webDriver.findElement(By.id("uploadFile"));
        choose.sendKeys("/Users/nazar/IdeaProjects/ITEA/NazarStanchenko/src/test/java/lesson10/listing7/screen.png");

    }

    @AfterMethod(enabled = false)
    public void teardown()
    {
        webDriver.quit();
    }
}
