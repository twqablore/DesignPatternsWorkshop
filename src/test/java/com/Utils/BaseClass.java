package com.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import static io.github.bonigarcia.wdm.DriverManagerType.PHANTOMJS;

public class BaseClass {
    public WebDriver driver;
    private String baseUrl = "http://automationpractice.com/index.php";


    @BeforeClass
    public void setUp() {
        getFireFoxBrowser();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    private void getChromeBrowser() {
        System.out.println("Setting up Chrome Browser");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    private void getFireFoxBrowser() {
        System.out.println("Setting up FireFox Browser");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    private void getPhantomJsBrowser() {
        System.out.println("Setting up PhantomJs Browser");
        WebDriverManager.getInstance(PHANTOMJS).setup();
    }

    @AfterClass
    public void teardown() {
        if (driver != null)
            driver.quit();
    }

}
