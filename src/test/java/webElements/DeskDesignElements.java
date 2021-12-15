package webElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import utils.BaseDriver;
import utils.Parent;
import java.util.List;

public class DeskDesignElements extends Parent {

    public DeskDesignElements()
    {
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement cookies1;

    @FindBy(xpath="//div[@id=\"7cc7a2e5-ac0a-11ea-802f-e7a1ba7421a9\"]//h2[text()=\"Design your own desk\"]")
    private WebElement designDeskBtn;

    @FindBy(id="byod-application")
    private WebElement iframe;

    @FindBy(xpath="(//div[@class=\"menu-button\"]/div/i)[1]")
    private WebElement dimensions;

    @FindBy(css="section:first-child>div[class=\"menu-selector active\"]>ul>li")
    private List<WebElement> dimensionsList;

    @FindBy(css="div[id=\"configuration-menu\"]>section:nth-child(2)")
    private WebElement legsAndTrestles;

    @FindBy(css="section:nth-child(2)>div[class=\"menu-selector active\"]>ul>li")
    private List<WebElement> legsList;

    @FindBy(css = "div#top-swiper>div[class=\"swiper-wrapper\"]>div")
    private List<WebElement> topList;

    @FindBy(css = "div[id=\"top-selector\"]>div[class=\"swiper-button next ng-scope\"]>i")
    private WebElement topRightScrollBtn;

    @FindBy(css = "div#bottom-swiper>div[class=\"swiper-wrapper\"]>div")
    private List<WebElement> bottomList;

    @FindBy(css="div[id=\"bottom-selector\"]>div[class=\"swiper-button next ng-scope\"]>i")
    private WebElement bottomRightScrollBtn;

    @FindBy(css = "div[id=\"bottom-selector\"] i[class=\"byox-icon byox-icon-bottom byox-icon-left\"]")
    private WebElement bottomLeftScrollBtn;

    @FindBy(css = "div.page-title>h1")
    private WebElement pageTitle;

    public WebElement getCookies1() {
        return cookies1;
    }

    public WebElement getDesignDeskBtn() {
        return designDeskBtn;
    }

    public WebElement getIframe() {
        return iframe;
    }

    public WebElement getDimensions() {
        return dimensions;
    }

    public List<WebElement> getDimensionsList() {
        return dimensionsList;
    }

    public WebElement getLegsAndTrestles() {
        return legsAndTrestles;
    }

    public List<WebElement> getLegsList() {
        return legsList;
    }

    public List<WebElement> getTopList() {
        return topList;
    }

    public WebElement getTopRightScrollBtn() {
        return topRightScrollBtn;
    }

    public List<WebElement> getBottomList() {
        return bottomList;
    }

    public WebElement getBottomRightScrollBtn() {
        return bottomRightScrollBtn;
    }

    public WebElement getBottomLeftScrollBtn() {
        return bottomLeftScrollBtn;
    }

    public WebElement getPageTitle() {
        return pageTitle;
    }
}
