package tests.day13_crossBrowserTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C04_NegativeLoginTest {


    /*
        Verilen 5 farkli username ve password'u kullanarak
        qualitydemy uygulamasina girilemedigini test edin.
     */

    @DataProvider
    public static Object[][] kullanicilar() {

        String[][] kullaniciList = {{"hasan", "12345"},
                                    {"mehmet" ,"34567"},
                                    {"sevki", "45678"},
                                    {"ilyas", "67890"},
                                    {"kazim", "45562"}};
        return kullaniciList;
    }

    @Test(dataProvider = "kullanicilar")
    public void negatifLogin1(String username, String password){

        QdPage qdPage = new QdPage();
        ReusableMethods.bekle(3);
        qdPage= new QdPage();
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qdPage.ilkLoginLinki.click();
        qdPage.emailKutusu.sendKeys(username);
        qdPage.passwordKutusu.sendKeys(password);
        qdPage.loginButonu.click();

        Assert.assertTrue(qdPage.emailKutusu.isEnabled());
        Driver.closeDriver();
    }


}
