package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Objects.PaymentPageObjects;;

public abstract class WirePayment implements PaymentMethod
{
    PaymentPageObjects paymentpageobject = new PaymentPageObjects();

	 public WirePayment(WebDriver driver) {
	        PageFactory.initElements(driver, paymentpageobject);
	    }
	
//	 
	public String confirmationPageMessage()
	{
		paymentpageobject.bankwire.click();
		return "paid through bank wire";
		
	}
	
	
	
}
