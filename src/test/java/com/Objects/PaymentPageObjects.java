package com.Objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public  class PaymentPageObjects {
	
	@FindBy(partialLinkText ="Pay by bank wire")
	 public WebElement bankwire;
	
	@FindBy(partialLinkText ="Pay by check ")
	 public WebElement cheque;
	
	@FindBy(partialLinkText ="I confirm my order")
	 public WebElement confirmOrder;
	
	@FindBy(partialLinkText  ="::after")
	 public WebElement closepopup;
	
	@FindBy(partialLinkText =  "Proceed to checkout") // summary, shipping,
	public WebElement Checkout;
	
	@FindBy(name =  "processCarrier")
	public WebElement shipping;
	
	@FindBy(name =  "processAddress") // summary, shipping,
	public WebElement processAddress;
	
	@FindBy(id="cgv")
	public WebElement aggrement;
	
	@FindBy(partialLinkText = "Women")
	public WebElement women;
	
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span")
	public WebElement orderhistory;
	
	
	@FindBy(partialLinkText = "Reorder")
	public WebElement reorder;
	
	
	
	
}