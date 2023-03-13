package tests.practices;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OtomasyonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Q5 {

    //1) Open the browser
    //2) Enter the URL “http://practice.automationtesting.in/”

    //3) Click on My Account Menu
    //4) Enter registered username in username textbox
    //5) Enter password in password textbox
    //6) Click on login button
    //7) User must successfully login to the web page
    //8) Click on Myaccount link
    //9) Click on Orders link
    //10) Click view button
    //11) User must view his Order details,customer details and billing details on clicking view button

    OtomasyonPage otomasyonPage = new OtomasyonPage();
    @Test
    public void test01(){

        //2) Enter the URL “http://practice.automationtesting.in/”

        Driver.getDriver().get(ConfigReader.getProperty("practiceUrl"));
        otomasyonPage.myAccountbutton.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().forward();
        otomasyonPage.usernameBox.sendKeys(ConfigReader.getProperty("practiceEmail"));
        otomasyonPage.passwordBox.sendKeys(ConfigReader.getProperty("practicePassword"));
        otomasyonPage.loginBox.click();
        Assert.assertTrue(otomasyonPage.girisKontrol.isDisplayed());
        otomasyonPage.ordersButton.click();
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().forward();
        Assert.assertTrue(otomasyonPage.wiewButton.isDisplayed());
        System.err.println("COOKİES GEÇME HATIRLATMALI TESTCase");
        Driver.getDriver().close();


    }

}

