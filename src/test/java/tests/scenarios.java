package tests;
import Base.BaseTest;
import loginPage.P01_login;
import org.testng.Assert;
import org.testng.annotations.Test;
import registerPage.P02_register;

public class scenarios extends BaseTest {
     P02_register register;
     P01_login login;


     @Test(priority = 0)
     public void userRegister() throws InterruptedException {
         register  = new P02_register(driver);
         register.registerForm("Ahmed","Kamal@user.com","01000000010", "08/20/2007", "Math", "22 home");

         Thread.sleep(50000);
     }
    @Test(priority = 1)
    public void userLogin() throws InterruptedException {
        login  = new P01_login(driver);
        login.openLoginPage();
        login.loginForm("Kamal@user.com","abc123");
        Thread.sleep(5000);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.tutorialspoint.com/selenium/practice/login.php#", "Login was not successful!");

    }
}
