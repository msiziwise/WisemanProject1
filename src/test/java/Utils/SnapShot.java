package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class SnapShot
{
    public  static  String Directory = System.getProperty("user.dir")+"./Screenshot";

    public void TakeSnapshot(WebDriver driver,String screenshotname)
    {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);

        File destination = new File(Directory,screenshotname+".png");

        try {
            FileUtils.copyFile(src,destination);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


    }
}
