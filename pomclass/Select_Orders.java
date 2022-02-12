package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Orders {

	
	@FindBy(name = "qty")
	private WebElement quantity ;

	@FindBy(id="group_1")
	private WebElement size;
	

	@FindBy(name = "Submit")
	private WebElement cart;
	
	@FindBy (xpath ="(//a[contains(@class,'btn-default')])[2]" )
	private WebElement checkout;

	public WebDriver driver;
		
	
	public Select_Orders(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	
	
	
	
	
	
	
	
	
	
	
}
