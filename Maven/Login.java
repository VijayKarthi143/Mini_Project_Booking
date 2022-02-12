package com.Maven;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pomclass.Home_page;

public class Login extends baseClassMethods{

	public static void main(String[] args) throws IOException {
		
		browserlaunch();
		
		getUrl("http://automationpractice.com/index.php");
	
		Home_page hp = new Home_page(driver);
//		WebElement pro = driver.findElement(By.xpath("//a[@class='login']"));
		clickElement(hp.getSignin());
		
		WebElement login = driver.findElement(By.id("email"));
//		login.sendKeys("vjkarthi143@gmail.com");
		sendKeys(login, "vjkarthi143@gmail.com");
		
		WebElement password = driver.findElement(By.id("passwd"));
//		password.sendKeys("123456789");
		sendKeys(password, "123456789");
		
		WebElement signin = driver.findElement(By.id("SubmitLogin"));
	//	signin.click();
		clickElement(signin);
		
		WebElement Tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
//		Tshirt.click();
		clickElement(Tshirt);
		
		WebElement product = driver.findElement(By.xpath("//img[@itemprop='image']"));
//		product.click();
		clickElement(product);
		
		WebElement quantity = driver.findElement(By.name("qty"));
		quantity.clear();
//		quantity.sendKeys("3");
		sendKeys(quantity, "3");
		
		WebElement size = driver.findElement(By.id("group_1"));
//		Select si = new Select(size);
//		si.selectByValue("2");
		selectbyvalue("2", size);
		
		WebElement addToCart = driver.findElement(By.name("Submit"));
//		addToCart.click();
		clickElement(addToCart);
		
		WebElement checkout = driver.findElement(By.xpath("(//a[contains(@class,'btn-default')])[2]"));
//		checkout.click();
		clickElement(checkout);
		
		WebElement proceed = driver.findElement(By.xpath("//a[contains(@class,'button btn')]"));
//		proceed.click();
		clickElement(proceed);
		
		WebElement address = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//		address.click();
		clickElement(address);
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='cgv']"));
//		checkbox.click();
		clickElement(checkbox);
		
		WebElement payment = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//		payment.click();
		clickElement(payment);
		
		WebElement card = driver.findElement(By.className("payment_module"));
//		card.click();
		clickElement(card);
		 	
		WebElement ConfirmMyOrder = driver.findElement(By.xpath("//button[contains(@class,'button btn')]"));
//		ConfirmMyOrder.click();
		clickElement(ConfirmMyOrder);
		
		
		
		 
		
		
		
	}

}
