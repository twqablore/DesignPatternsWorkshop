package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.Objects.PaymentPageObjects;
import com.Utils.Helpers;

public abstract class Cheque  extends Helpers implements PaymentMethod {
    PaymentPageObjects paymentpageobject = new PaymentPageObjects();

	 public Cheque(WebDriver driver) {
		 	super(driver);
	        PageFactory.initElements(driver, paymentpageobject);
	    }
	 
	public String confirmationPageMessage(String message)
	{
		WebElement cheque=paymentpageobject.cheque;
		paymentpageobject.confirmOrder.click();
		return cheque.toString();
		
	}
	
	
}
