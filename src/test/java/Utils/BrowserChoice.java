package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserChoice
{
    public static  WebDriver driver = null;
    public WebDriver BrowserC(String Url , String Browserc)
    {
        if("chrome".equalsIgnoreCase(Browserc))
        {
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote allow-origion=*");
            driver = new ChromeDriver(chromeOptions);
        } else if ("firefox".equalsIgnoreCase(Browserc)) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions  firefoxOptions = new FirefoxOptions();
            firefoxOptions.addArguments("--remote allow-origion=*");
            driver = new FirefoxDriver(firefoxOptions);
        }
        else {
            WebDriverManager.edgedriver().setup();
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.addArguments("--remote allow-origion=*");
            driver = new EdgeDriver(edgeOptions);
        }
        driver.get(Url);
        driver.manage().window().maximize();
        return driver;
    }
}
