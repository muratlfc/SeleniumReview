import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day01_OrnekAmazon {
    //1.Amazon.com'a gidecegiz
    //2.Arama kutusuna "baby stroller"
    //3.2. siradaki urune tiklayacagiz
    //4.Urun sayfasina gittikten sonra, urunun toplam fiyatini alacagiz
    //5.Urunun ortalama puanini (5 uzerinden) alacagiz.


@Test
    public void test1(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://amazon.com");


    WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
    aramaKutusu.sendKeys("baby stroller"+ Keys.ENTER);



    WebElement ikinciSiradakiUrun = driver.findElement(By.xpath("//a[@class='a-link-normal a-text-normal'] )[2]"));
    ikinciSiradakiUrun.click();

}







}
