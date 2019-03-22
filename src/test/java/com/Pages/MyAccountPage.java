package com.Pages;

import com.Objects.MyAccountPageObjects;
import com.Utils.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends Helpers{
    private MyAccountPageObjects myAccountPageObjects;

    public MyAccountPage(WebDriver driver) {
        super(driver);
        myAccountPageObjects = new MyAccountPageObjects();
        PageFactory.initElements(driver,myAccountPageObjects);
    }


    public void validateMyAccoutPage() {
       waitForElement(myAccountPageObjects.signOutLink);
        System.out.println("In My account Page");
    }
    
    public void logout() {
    	//myAccountPageObjects = new MyAccountPageObjects();
   	 	myAccountPageObjects.logout.click();
     }
    
    
    public void contact() {
    	//myAccountPageObjects = new MyAccountPageObjects();
   	 	myAccountPageObjects.contact.click();
   	 System.out.println("In My contact Page");
     }
    public void validateOrderHistory() {
    	 //myAccountPageObjects = new MyAccountPageObjects();
    	 myAccountPageObjects.orderhistory.click();
        System.out.println("In My account Page order History"+ myAccountPageObjects.orderhistory);
     }
    
    public void validateReorder() {
   	 //myAccountPageObjects = new MyAccountPageObjects();
   	 myAccountPageObjects.reorder.click();
       System.out.println("In My account re order page"+ myAccountPageObjects.orderhistory);
    }
}
