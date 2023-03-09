package tests.day11_POM_assertions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C05_SoftAssert extends TestBaseRapor {



    @Test
    public void amazonTesti(){

        extentTest=extentReports.createTest("amazon testi","nutella aramasi sonucu nutella ismi gorunmeli");
        /*
            Genel olarak
            test edin denirse hard assert
            dogrulayin(verify) denirse soft assert kasdedilir
         */

        // amazon anasayfaya gidip, dogru sayfaya gittigimizi DOGRULAYIN (verify)
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        String expectedIcerik= "amazon";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        extentTest.info("amazon anasayfaya gidildi");

        SoftAssert softAssert= new SoftAssert();
        softAssert.assertTrue(actualUrl.contains(expectedIcerik),"url amazon icermiyor");
        extentTest.pass("url testi amazon iceriyor");

        // Nutella icin arama yapip, sonuclarin Nutella icerdigini dogrulayin
        AmazonPage amazonPage= new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        expectedIcerik ="Nutella";
        String actualAramaSonucYazisi= amazonPage.aramaSonucElementi.getText();
        softAssert.assertTrue(actualAramaSonucYazisi.contains(expectedIcerik),"arama sonucu Nutella icermiyor");
        extentTest.pass("arama sonucu nutella iceriyor");


        // ilk urune tiklayip, urun isminde Nutella gectigini dogrulayin

        amazonPage.ilkUrun.click();
        expectedIcerik ="Nutella";
        ReusableMethods.bekle(3);
        String actualIlkUrunIsim= amazonPage.ilkUrunIsimElementi.getText();

        softAssert.assertTrue(actualIlkUrunIsim.contains(expectedIcerik),"ilk urun ismi Nutella icermiyor");

        softAssert.assertAll();
        extentTest.info("nutella aramasi sonucu basarili");

    }
}