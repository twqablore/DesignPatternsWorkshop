package com.Pages;

import com.Objects.MyAccountPageObjects;
import com.Utils.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MyAccountPage extends Helpers{
    private MyAccountPageObjects myAccountPageObjects;

    public MyAccountPage(WebDriver driver) {
        super(driver);
        myAccountPageObjects = new MyAccountPageObjects();
        PageFactory.initElements(driver,myAccountPageObjects);
    }


    public void validateMyAccoutPage() {
        waitForElement(myAccountPageObjects.signOutLink);
        System.out.println("In My account Page of Desktop");
    }

    public void validateMyAccoutPageForResponsive() {
        waitForElement(myAccountPageObjects.signOutLink);
        Assert.assertEquals(myAccountPageObjects.categoryLink.getText(),"CATEGORIES","View might not be responsive");
        System.out.println("In My account Page of Mobile");
    }
}
