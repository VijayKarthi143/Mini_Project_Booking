package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T_shirt {

	public WebDriver driver;

	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	private WebElement tshirt;
	
	@FindBy(xpath = "//img[@itemprop='image']")
	private WebElement img ;
	

	public T_shirt(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	
	}


	public WebElement getTshirt() {
		return tshirt;
	}
	
	
	public WebElement getImg() {
		return img;
	}
	
	
	
	
	
	
	
}
