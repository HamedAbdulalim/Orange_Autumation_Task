package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public static WebDriver driver ;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void clearUpEnvironment() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
