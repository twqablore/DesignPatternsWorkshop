package com.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPageObjects {
    @FindBy(className = "logout")
    public WebElement signOutLink;

    @FindBy(className = "cat-title")
    public WebElement categoryLink;


}
