package lesson09.listing1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumStart
{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
      //  WebDriverManager.chromedriver().setup(); // при таком сетапе нет необходимости следить за версией хромдрайвера
       // WebDriverManager.safaridriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com");
        //driver.close(); //закрывает одну вкладку
       driver.quit();  // закрывает окно открытое драйвером в не зависимости от количества  вкладок
        
    }
}
