package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summery {

	//WebElement proceed = driver.findElement(By.xpath("//a[contains(@class,'button btn')]"));
//	proceed.click();

	@FindBy(xpath="//a[contains(@class,'button btn')]" )
	private WebElement summery ;

	public WebDriver driver ;
		
	public Summery(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	
	}


	public WebElement getSummery() {
		return summery;
	}
	


}
