package tests.day12_xmlFiles;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C03_RaporluPositiveLoginTesti extends TestBaseRapor {

    @Test
    public void pozitifLoginTesti(){

        extentTest = extentReports.createTest("Pozitif Login Testi","Gecerli bilgilerle giris yapilabilmeli");

        // qd anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        extentTest.info("Qualitydemy anasayfaya gidildi");

        // login linkine tiklayin
        QdPage qdPage = new QdPage();
        qdPage.ilkLoginLinki.click();
        extentTest.info("ilk login linkine tiklandi");

        // gecerli kullanici adi ve password ile giris yapin
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        extentTest.info("gecerli email yazildi");
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        extentTest.info("gecerli password yazildi");
        qdPage.loginButonu.click();
        extentTest.info("login butonuna tiklandi");

        // basarili bir sekilde test yapildigini test edin
        Assert.assertTrue(qdPage.basariliGirisElementi.isDisplayed());
        extentTest.pass("basrili sekilde giris yapildigi test edildi");



}
}
