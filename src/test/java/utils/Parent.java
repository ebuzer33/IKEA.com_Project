package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.Random;

public class Parent {

    static WebDriverWait wait;

    public Parent()
    {
        wait =new WebDriverWait(BaseDriver.getDriver(), 10);
    }

    public void sendKeysFunction(WebElement element, String value)
    {
        waitUntilVisible(element);
        element.clear();
        element.sendKeys(value);
    }

    public void clickFunction(WebElement element)
    {
        waitUntilClickable(element);
        element.click();
    }

    public static void waitUntilVisible(WebElement element)
    {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element)
    {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waiting(int second)
    {
        try {
            Thread.sleep(1000 *second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void randomClick (List<WebElement> element)
    {
        Random rnd = new Random();
        int index = rnd.nextInt(element.size());
        element.get(index).click();
    }

    public void randomSendKeys (List<String> element,WebElement element1)
    {
        Random rnd = new Random();
        int index = rnd.nextInt(element.size());
        sendKeysFunction(element1,String.valueOf(element.get(index)));
    }
}
