package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_OrderConfirmation {

//	WebElement card = driver.findElement(By.className("payment_module"));
//	card.click();
//	 	
//	WebElement ConfirmMyOrder = driver.findElement(By.xpath("//button[contains(@class,'button btn')]"));
//	ConfirmMyOrder.click();
//	
	
	@FindBy (className ="payment_module" )
	private WebElement paymentMethod ;
	
	@FindBy (xpath ="//button[contains(@class,'button btn')]" )
	private WebElement confirmmyOrder ;

	@FindBy (xpath = "(//button[@type='submit'])[2]")
	private WebElement finalCheckout ;
	
	public WebDriver driver ;
	 
	public Payment_OrderConfirmation(WebDriver driver2) {
		this.driver = driver2 ;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public WebElement getPaymentMethod() {
		return paymentMethod;
	}

	public WebElement getConfirm() {
		return getConfirm();
	}

	public WebElement getFinalCheckout() {
		return finalCheckout;
	}
	
	
}
