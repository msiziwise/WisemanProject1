package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Login
{
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement xpath_username;

    @FindBy(xpath = "//input[@id='password']")
    WebElement xpath_password;

    @FindBy(xpath = "//div[@class='login_logo']")
    WebElement xpath_verify;

    @FindBy(xpath = "//input[@id='login-button']")
    WebElement xpath_btnlogin;

    public static WebDriver driver= null;

    public Login(WebDriver driver)
    {
        this.driver = driver;
    }

    public void username(String Username)
    {
        new WebDriverWait(driver, Duration.ofSeconds(3000)).until(ExpectedConditions.visibilityOf(xpath_username));
        xpath_username.clear();
        xpath_username.sendKeys(Username);
    }
    public void password(String Password)
    {
        xpath_password.clear();
        xpath_password.sendKeys(Password);
    }
    public void btnlogin()
    {
       xpath_btnlogin.click();
    }
    public void verify()
    {
        Assert.assertEquals(xpath_verify.getText(),"Swag Labs");
    }
}
