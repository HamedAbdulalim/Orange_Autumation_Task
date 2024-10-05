package registerPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class P02_register {
    private WebDriver driver;

    public P02_register(WebDriver driver) {
        this.driver = driver;
    }

    //------------------------- locators --------------------
    private By nameField = By.id("name");
    private By emailField = By.id("email");
    private By Gender = By.xpath("(//input[@type='radio'])[1]");
    private By mobileNum = By.id("mobile");
    private By birthDateDrop = By.id("dob");
    private By subjectField = By.id("subjects");
    private By Hobbies = By.xpath("(//input[@type='checkbox'])[2]");
    private By pictureFile = By.xpath("//input[@type='file' and @ name = 'picture']");
    private By AddressField = By.xpath("//textarea[@placeholder='Currend Address']");
    private By stateMenu = By.xpath("//*[@id=\"state\"]/option[4]");
    private By scityMenu = By.xpath("//*[@id=\"city\"]/option[3]");
    private By loginBtn = By.xpath("//input[@type = 'submit']");
    String imagePath = "C:\\Users\\Hamed Abdulalim\\IdeaProjects\\Orange_Autumation_Task\\src\\main\\resources\\sweet.jpg";

    //-----------Action Methods-------------

    public void registerForm(String name ,String email, String mobileN, String birthDate, String subject, String address){
    driver.findElement(nameField).sendKeys(name);
    driver.findElement(emailField).sendKeys(email);
    driver.findElement(Gender).click();
    driver.findElement(mobileNum).sendKeys(mobileN);
    driver.findElement(birthDateDrop).sendKeys(birthDate);
    driver.findElement(subjectField).sendKeys(subject);
    driver.findElement(Hobbies).click();
    driver.findElement(pictureFile).sendKeys(imagePath);
    driver.findElement(AddressField).sendKeys(address);
    driver.findElement(stateMenu).click();
    driver.findElement(scityMenu).click();
    driver.findElement(loginBtn).click();

    }

}



