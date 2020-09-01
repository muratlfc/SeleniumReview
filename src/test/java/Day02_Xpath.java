import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class Day02_Xpath {
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        // driver nesnesi oluşturduk.
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test1() {
        driver.get("http://a.testaddressbook.com/");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

        WebElement signInLinki = driver.findElement(By.linkText("Sign in"));
        signInLinki.click();

        //ipucu :findElements kullanabilirsiniz
        //ipucu : tagName ' i  a olan webelemtler linktir
        //ipucu : bir sayfadaki tum webelementleri bulmak istiyorsaniz findElements


        List<WebElement> tumlinkler = driver.findElements(By.tagName("a"));
        for (WebElement w : tumlinkler) {
        System.out.println(w.getText());

        }

        WebElement kullaniciAdi = driver.findElement(By.cssSelector(".form-control"));
        kullaniciAdi.sendKeys("testtechproed@gmail.com");

        WebElement sifre = driver.findElement(By.cssSelector("#session_password"));
        sifre.sendKeys("Test1234!");

        WebElement girisYap = driver.findElement(By.cssSelector(".btn.btn-primary"));
        girisYap.click();

      //  List<WebElement> tumelementler =driver.findElements(By.xpath("//*"));
       // for (WebElement w : tumelementler) {
      //      System.out.println(w.getText());

WebElement tumYazilar = driver.findElement(By.tagName("body"));
        System.out.println(tumYazilar.getText());



    }
        @AfterClass
        public static void tearDown() {
            //driver.quit();

        }
}