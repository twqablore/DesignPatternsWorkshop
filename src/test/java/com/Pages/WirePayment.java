package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.Objects.PaymentPageObjects;
import com.Objects.RegistrationPageObjects;
import com.Utils.Helpers;


public abstract class WirePayment extends Helpers implements PaymentMethod
{
		
	PaymentPageObjects myPaymentPageobject = new PaymentPageObjects();
	
	 public WirePayment(WebDriver driver) {
		 super(driver);
	        PageFactory.initElements(driver, myPaymentPageobject);
	        
	    }
	
	 
	public String confirmationPageMessage(String message)
	{
		 driver.getPageSource().contains("wire");
		return "text";
		
		
	}
	
	
	
}
