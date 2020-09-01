import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day01_DriverKomutlari {





  @Test
    public void test1(){


//WebDriver kurulumu yaptik
      WebDriverManager.chromedriver().setup();
//driver olusturduk
      WebDriver driver = new ChromeDriver();
//driveri tam ekran modu yaptik
      driver.manage().window().maximize();
//driver bekleme modu komutu verdik (10 saniye bekle dedik)
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//web sayfasina gider
    driver.get("http://google.com");


    //NAVIGATE METOTLARI(Google sayfasinda yapabilecegimiz islemler)

    //bir onceki web sayfasina geri doner
    driver.navigate().back();
//herhangi bir websayfasina gider
    driver.navigate().to("http://amazon.com");
//ileri sayfaya gider
    driver.navigate().forward();
//sayfayi yeniler
    driver.navigate().refresh();
//driveri kapatmak icin kullanilir (tum sekmeleri kapatir)
    driver.quit();
//acik olan sekmeyi kapatir
    driver.close();





    }





}
