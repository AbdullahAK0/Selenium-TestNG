package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OtomasyonPage {
    public OtomasyonPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//a[text()='Shop']")
    public WebElement shopbox;
    @FindBy(xpath = "//span[text()='Close']")
    public WebElement cookies;
    @FindBy(xpath = "//a[normalize-space()='Home']")
    public WebElement homebutton;
    @FindBy(xpath = "//div[contains(@class,'n2-ss-slider-')]")
    public WebElement kayanresimler;
    @FindBy(xpath = "//span[@class='ns-1ctvy-e-21']")
    public WebElement homeCookies;
    @FindBy(id = "dismiss-button")
    public WebElement ilkCookies;
    @FindBy(xpath = "//a[normalize-space()='My Account']")
    public WebElement myAccountbutton;
    @FindBy(id = "username")
    public WebElement usernameBox;
    @FindBy(id = "password")
    public WebElement passwordBox;
    @FindBy (xpath ="//input[@value='Login']" )
    public WebElement loginBox;
    @FindBy(xpath = "//*[name()='path' and contains(@d,'M38 12.83L')]")
    public WebElement getMyAccountCookies;
    @FindBy(xpath = "//a[text()='Sign out']")
    public WebElement girisKontrol;
    @FindBy(xpath = "//a[text()='Orders']")
    public WebElement ordersButton;
    @FindBy(xpath = "//span[@class='cartcontents']")
    public WebElement wiewButton;
    @FindBy(xpath = "//img[@width='300']")
    public WebElement herhangbirUrun;

    @FindBy(xpath = "//*[@class='orderby']")
    public WebElement ddmButton;

    @FindBy(xpath = "//*[@class='woocommerce-Price-amount amount']")
    public WebElement fiyatListesi;
}