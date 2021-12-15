package testNGPages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.ExcelUtility;
import webElements.DeskDesignElements;
import webElements.HomePageElements;
import org.testng.annotations.Test;
import utils.BaseDriver;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomePageIkea extends BaseDriver {

    DeskDesignElements dp = new DeskDesignElements();
    HomePageElements   hp = new HomePageElements();
    List<String> countryList = ExcelUtility.getListData("src/test/java/resource/countryList.xlsx",
            "countryName",1);
    Random rnd = new Random();

    @Test
    public void homePageIkea(){

        getDriver().get("https://www.ikea.com");

        String firstUrl=getDriver().getCurrentUrl();

        dp.clickFunction(dp.getCookies1());
        hp.clickFunction(hp.getSearchBtn());
        hp.randomSendKeys(countryList,hp.getSearchInput());
        hp.randomClick(hp.getSelectLang());
        int index = rnd.nextInt(hp.getSelectLang().size());
        hp.clickFunction(hp.getSelectLang().get(index));

        String selectCountry = hp.getSelectLang().get(index).getText();
        String expectedUrl = hp.getLinkAddress().getAttribute("href");

        hp.clickFunction(hp.getGoTo());

        String lastUrl =getDriver().getCurrentUrl();

        if (selectCountry.contains("International")){

            String expected="https://about.ikea.com/en/contact/how-to-buy-ikea-products-from-a-different-country?ref=gwp-start";

            Assert.assertEquals(lastUrl,expected);
        }
        else {
            Assert.assertEquals(lastUrl,expectedUrl);
        }

        Assert.assertNotEquals(firstUrl,lastUrl);

        List<WebElement> cookiesList = new ArrayList<>();
        cookiesList.add(dp.getCookies1());
        cookiesList.add(hp.getCookies2());
        cookiesList.add(hp.getCookies3());
        cookiesList.add(hp.getCookies4());
        cookiesList.add(hp.getCookies5());
        cookiesList.add(hp.getCookies6());
        cookiesList.add(hp.getCookies7());
        cookiesList.add(hp.getCookies8());

        for (WebElement element : cookiesList) {

            try {
                if (element.isDisplayed() && element.isEnabled()) {
                    hp.clickFunction(element);
                    break;
                }
            } catch (Exception ignored) {

            }
        }
    }
}
