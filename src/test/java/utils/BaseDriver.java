package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class BaseDriver {

   private static WebDriver driver;

    public static WebDriver getDriver(){

        if (driver==null){
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();

            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void driverQuit(){

        Parent.waiting(3);

        if (driver!=null){
            driver.quit();
            driver=null;
        }

    }

    @AfterClass
    public void  lastTransactions()
    {
        driverQuit();
    }

}
