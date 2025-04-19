package StepDefinitions;

import PageObject.Login;
import Utils.BrowserChoice;
import Utils.SnapShot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base
{
    BrowserChoice browserChoice = new BrowserChoice();

    final WebDriver driver = browserChoice.BrowserC("https://www.saucedemo.com/"," ");

    SnapShot snapShot = PageFactory.initElements(driver,SnapShot.class);

    Login login = PageFactory.initElements(driver, Login.class);
}
