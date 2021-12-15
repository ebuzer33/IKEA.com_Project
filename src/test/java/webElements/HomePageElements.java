package webElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import utils.BaseDriver;
import utils.Parent;

import java.util.List;

public class HomePageElements extends Parent {

    public HomePageElements(){
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

    @FindBy(css= "button[data-cy=\"open-region-picker\"]")
    private WebElement searchBtn;

    @FindBy(id = "search-sites")
    private WebElement searchInput;

    @FindBy(css = "ul.svelte-xiw4pw>li")
    private List<WebElement> selectLang;

    @FindBy(css= "a[data-cy=\"go-to-website\"]")
    private WebElement goTo;

    @FindBy(css = "div[class='hnf-banner__actions']>button")
    private WebElement cookies2;

    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonAccept")
    private WebElement cookies3;

    @FindBy(css = "div>a[aria-label=\"dismiss cookie message\"]")
    private WebElement cookies4;

    @FindBy(css = "div>button[class='button accept-cookies']")
    private WebElement cookies5;

    @FindBy(id = "ikeacn-consent-modal__action--secondary")
    private WebElement cookies6;

    @FindBy(xpath = "//div/span/button[@class='cookies-eu-ok js-cookies-eu-ok']")
    private WebElement cookies7;

    @FindBy(css = "div>button[class=\"btn btn--filled js-cookie-accept\"]")
    private WebElement cookies8;

    @FindBy(css = "a[class=\"website-link svelte-xiw4pw\"]")
    private WebElement linkAddress;

    public WebElement getSearchBtn() {
        return searchBtn;
    }

    public WebElement getSearchInput() {
        return searchInput;
    }

    public List<WebElement> getSelectLang() {
        return selectLang;
    }

    public WebElement getGoTo() {
        return goTo;
    }

    public WebElement getCookies2() {
        return cookies2;
    }

    public WebElement getCookies3() {
        return cookies3;
    }

    public WebElement getCookies4() {
        return cookies4;
    }

    public WebElement getCookies5() {
        return cookies5;
    }

    public WebElement getCookies6() {
        return cookies6;
    }

    public WebElement getCookies7() {
        return cookies7;
    }

    public WebElement getCookies8() {
        return cookies8;
    }

    public WebElement getLinkAddress() {
        return linkAddress;
    }
}
