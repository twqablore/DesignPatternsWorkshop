package com.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects {
    @FindBy(id = "htmlcontent_home")
    public WebElement header;

    @FindBy(className = "login")
    public WebElement signInButton;
}
