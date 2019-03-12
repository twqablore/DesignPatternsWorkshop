package com.Pages;

import com.Objects.HomePageObjects;
import com.Utils.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Helpers {
    private HomePageObjects homePageObjects;

    public HomePage(WebDriver driver) {
        super(driver);
        homePageObjects = new HomePageObjects();
        PageFactory.initElements(driver, homePageObjects);
        waitForElement(homePageObjects.header);
    }
    
    public LoginPage clickSignIn() {
        homePageObjects.signInButton.click();
        return new LoginPage(driver);
    }
}
