package com.Objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPageObjects {
    @FindBy(className = "logout")
    public WebElement signOutLink;

    
    
   
	@FindBy(className   = "icon-list-ol")
	public WebElement orderhistory;
	
	
	@FindBy(className   = "logout")
	public WebElement logout;
	
	
	@FindBy(id   = "contact-link")
	public WebElement contact;
	
	@FindBy(partialLinkText   = "Reorder")
	public WebElement reorder;
	
	


    @FindBy(className = "cat-title")
    public WebElement categoryLink;

}
