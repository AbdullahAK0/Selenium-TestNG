package tests.day10_TestNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_Priority {

    /*
        TestNG test methodlarini calistiriken standart olarak harf sirasina bakar.
        Ancak TestNG siralamayi bizim kontrol etmemize olanak tanir.

        istedigimiz test methoduna istedigimiz onceligi priority ile tanimlayabiliriz.
        Selenium test methodlarini priority'si kucukten buyuge olacak sekilde calistirir.

        Priority degeri ayni olan test methodlari harf sirasina gore calisir.

        Priority degeri yazilmazsa default olarak priority=0 olarak kabul edilir.
     */


    @Test(priority = 45)
    public void amazonTesti() throws InterruptedException {
        // Amazon ana sayfaya gidip, amazona gittigimizi test edelim
        Driver.getDriver().get("https://www.amazon.com");
        Thread.sleep(2000);
        Driver.getDriver().navigate().refresh();

        // url amazon iceriyor mu test edelim
        String expectedIcerik = "amazon";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualUrl.contains(expectedIcerik));
        Driver.closeDriver();
    }

    @Test(priority = 20)
    public void wiseTesti() {
        // wisequarter ana sayfaya gidip, wisequarter'a gittigimizi test edelim
        Driver.getDriver().get("https://www.wisequarter.com");

        // url wisequarter iceriyor mu test edelim
        String expectedIcerik = "wisequarter";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualUrl.contains(expectedIcerik));
        Driver.closeDriver();

    }


    @Test()
    public void youtubeTesti () {
            // youtube ana sayfaya gidip, youtube gittigimizi test edelim

            Driver.getDriver().get("https://www.youtube.com");

            // url youtube iceriyor mu test edelim
            String expectedIcerik = "youtube";
            String actualUrl = Driver.getDriver().getCurrentUrl();

            String actualTitle = Driver.getDriver().getTitle();

            Assert.assertTrue(actualUrl.contains(expectedIcerik));
            Driver.closeDriver();

        }
    }
