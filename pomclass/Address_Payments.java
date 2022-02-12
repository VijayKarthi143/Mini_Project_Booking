package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Payments {
	
//	WebElement address = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//	address.click();
//	
//	WebElement checkbox = driver.findElement(By.xpath("//input[@id='cgv']"));
//	checkbox.click();
//	
//	WebElement payment = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//	payment.click();
//	
	
	@FindBy (xpath = "(//button[@type='submit'])[2]")
	private WebElement address ;
	
	@FindBy (xpath = "//input[@id='cgv']")
	private WebElement shipping_checkbox ;
	
	@FindBy (xpath = "(//button[@type='submit'])[2]")
	private WebElement payment ;
	
	public WebDriver driver ; 
	
	public Address_Payments(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public WebElement getAddress() {
		return address;
	}

	public WebElement getShipping_checkbox() {
		return shipping_checkbox;
	}

	public WebElement getPayment() {
		return payment;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
