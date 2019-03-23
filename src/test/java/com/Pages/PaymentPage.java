package com.Pages;

import com.Objects.LoginPageObjects;
import com.Objects.PaymentPageObjects;
import com.Utils.Helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends Helpers{
	
	 private final PaymentPageObjects paymentPageObjects;

	 
    public PaymentPage(WebDriver driver) {
		super(driver);
		paymentPageObjects= new PaymentPageObjects();
		PageFactory.initElements(driver,paymentPageObjects);
	}


    public void validatePaymentPage() {
        waitForElement(paymentPageObjects.bankwire);
        waitForElement(paymentPageObjects.cheque);
        System.out.println("In Payment Page");
    }  
    
    public void checkout() {
    	paymentPageObjects.Checkout.click();
      	 System.out.println("summary click --> after address");
		
	}
    
    public void addresscheckout() {
    	paymentPageObjects.processAddress.click();
      	 System.out.println("summary click --> after address");
		
	}
    
    
    //need to add correct one
    public void agreement() throws InterruptedException  {
    	driver.manage().window().maximize();
    	JavascriptExecutor executor = (JavascriptExecutor)driver;
    	executor.executeScript("arguments[0].click()", paymentPageObjects.aggrement);
    	//paymentPageObjects.aggrement.click();
      	 System.out.println("click agreement");
		
	}
    
    public void shipping() {
    	paymentPageObjects.shipping.click();
      	 System.out.println("click shipping");
		
	}
    
    public void bankwire() {
    	paymentPageObjects.bankwire.click();
      	 System.out.println("click bankwire");
		
	}
    
    public void cheque() {
    	paymentPageObjects.cheque.click();
      	 System.out.println("click cheque");
		
	}

    public void closepopup() {
    	paymentPageObjects.closepopup.click();
      	 System.out.println("click cheque");
		
	}
	
    

    public WebElement bankwireConfirmation() {
    	WebElement bankwire=paymentPageObjects.bankwireconfirmation;
      	 System.out.println("bank wire confirmation page");
      	 return bankwire;
		
	}
    
    public WebElement chequeConfirmation() {
    	WebElement cheque=paymentPageObjects.chequeconfirmation;
    	return cheque;
      	 
		
	}
    
    
}





