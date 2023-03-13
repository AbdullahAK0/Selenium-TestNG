package tests.day12_xmlFiles;

import org.testng.annotations.Test;

public class C01_DriverSingletonPattern {

    @Test
    public void test01(){

        /*
               POM webDriver olarak Driver class'indaki
               getDriver() method'unun kullanilmasi uzerine kurgulanmistir.

               Driver.getDriver();

               Driver class'inin obje olusturularak kullanilmasini engellemek icin
               POM'yi tasarlayanlar bir onlem koymak istemisler.

               Java'da bir class'dan obje olusturulmasini engellemek isterseniz
               SINGLETON PATTERN kullanabilirsiniz.

               Singleton pattern : Bir class'dan obje olusturulmasini engellemek veya sinirlamak
                                   icin kullanilan bir yontemdir.
                                   Temel fikir obje olusturmak icin kullanilan defaul contructor
                                   yerine gorunur parametresiz bir constructor olusturup bu constructor'in
                                   access modifier'ini private yapip kullanilmasini ENGELLEMEKTIR.
         */


        // Driver objeDriver = new Driver();



    }
}
