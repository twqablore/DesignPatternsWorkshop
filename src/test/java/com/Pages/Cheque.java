package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Objects.PaymentPageObjects;

public abstract class Cheque implements PaymentMethod {
    PaymentPageObjects paymentpageobject = new PaymentPageObjects();

	 public Cheque(WebDriver driver) {
	        PageFactory.initElements(driver, paymentpageobject);
	    }
//	 
	public String confirmationPageMessage()
	{
		paymentpageobject.cheque.click();
		return "paid through cheque ";
		
	}
	
	
}
