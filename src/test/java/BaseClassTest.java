import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BaseClassTest {
    public WebDriver driver;
    private String baseUrl;

//    @Test
//    public void SampleTest(){
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("https://www.google.com");
//        System.out.println("Successful!");
//        driver.quit();
//    }
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        baseUrl = "http://automationpractice.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testSeleniumTestCase(){
        driver.get(baseUrl);
        driver.get(baseUrl + "/index.php");
        driver.findElement(By.linkText("Women")).click();
        driver.findElement(By.linkText("Tops")).click();
        driver.findElement(By.cssSelector("a.product_img_link > img.replace-2x.img-responsive")).click();
        driver.findElement(By.name("Submit")).click();
        driver.findElement(By.cssSelector("a[title='Proceed to checkout']")).click();
        driver.findElement(By.cssSelector("a.ajax_cart_block_remove_link")).click();
    }

    @AfterClass
    public void teardown(){
        if(driver!=null)
        driver.quit();
    }


}
