package com.Tests;


import org.testng.annotations.Test;

import com.Objects.MyAccountPageObjects;
import com.Objects.PaymentPageObjects;
import com.Pages.HomePage;
import com.Pages.MyAccountPage;
import com.Pages.PaymentPage;
import com.Utils.BaseClass;

public class PaymentPageTest extends BaseClass {
	
	
	PaymentPageObjects paymentPageObjects;
	MyAccountPageObjects MyAccountPageObjects;
	 

	    
	 
    @Test
    public void PaymentTest() throws InterruptedException {
    	
    	HomePage homePage = new HomePage(driver);
        
        homePage.clickSignIn().enterCredentials("chandana.yellapu@thoughtworks.com", "hello123");
        
    
       
        MyAccountPage myaccountPage = new MyAccountPage(driver);
  
        myaccountPage.validateOrderHistory();
        myaccountPage.validateReorder();
        
        PaymentPage myPaymentPage = new PaymentPage(driver);
        myPaymentPage.checkout();
        myPaymentPage.addresscheckout();
        
        myPaymentPage.agreement();
   
        myPaymentPage.shipping();
        
        myPaymentPage.bankwire();
        
      
        driver.getPageSource().contains("wire");
        driver.getPageSource().contains("cheque");

        
        
        
        
       
       
    }

}
