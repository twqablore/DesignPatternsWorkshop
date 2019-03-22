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
	
	
	
	
	//#center_column > div > div:nth-child(1) > ul > li:nth-child(1) > a > i
	
	//*[@id="center_column"]/div/div[1]/ul/li[1]/a/i
	
	//*[@id="center_column"]/div/div[1]/ul/li[1]/a/i
	
	//findElement(By.tagName("HTML Tag Name"))
	//river.findElement(By.xpath("//a[contains(.,'About')]")).click();
	
//	"//span[contains(text(), "Pending Verification")]"))
	
}
