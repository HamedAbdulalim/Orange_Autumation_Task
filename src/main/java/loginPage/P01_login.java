package loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_login {
    private WebDriver driver;
    P01_login login;

    public P01_login(WebDriver driver) {
        this.driver = driver;
    }
    //----------locators----------
    private By loginTab = By.xpath("//a[@href='login.php']");
    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By loginBtn = By.xpath("//input[@type='submit']");
    //-----------Action Methods --------
    public void openLoginPage(){
        driver.findElement(loginTab).click();
    }
    public void loginForm(String email, String password){
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginBtn).click();
    }









}
