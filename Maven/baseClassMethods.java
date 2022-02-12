package com.Maven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class baseClassMethods {
//	
//	1.	Browser launch()
//	2.	Close()
//	3.	Quit()
//	4.	Navigate to()
//	5.	Navigate back()
//	6.	Navigate forward ()
//	7.	Navigate refresh()
//	8.	Get()
//	9.	Alert()
//	10.	Action(All methods from action class)
//	11.	Frames()
//	12.	Robot()
//	13.	Window handles()
//	14.	Drop down ()
//	15.	Check box()
//	16.	Is enable()
//	17.	Is displayed()
//	18.	Is selected()
//	19.	Get options()
//	20.	Get title()
//	21.	Get current url()
//	22.	Get text()
//	23.	Get attribute()
//	24.	Wait()
//	25.	Take screenshot()
//	26.	Scroll up and down()
//	27.	Sendkeys()
//	28.	Get first selected options()
// 29.	Get all selected options()
// 30.	Is multiple()
// 31.	Click()
// 32.  RadioButton()
	public static WebDriver driver;
		
	public static WebDriver browserlaunch() {

	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void clickElement(WebElement element) {
		element.click();
	}
	
	public static void close() {
			driver.close();
		}
	
	public static void quit() {
			driver.quit();
		}

	public static void navigateTo(String url) {
			driver.navigate().to(url);
		}
	
	public static void navigateBack() {
			driver.navigate().back();
		}
	
	public static void navigateForward() {
			driver.navigate().forward();
		}
	
	public static void refresh() {
			driver.navigate().refresh();
		}
	
	public static void getUrl(String Link) {
			driver.get(Link);
		}
	
	public static void simpleAlert() {
			Alert simpleAlert = driver.switchTo().alert();
			simpleAlert.accept();
		}
	
	public static void confirmAlert(String name) {
		if (name.equalsIgnoreCase("ok")) {
			Alert confirmAlert = driver.switchTo().alert();
			confirmAlert.accept();
		} else {
			Alert confirmAlert = driver.switchTo().alert();
			confirmAlert.dismiss();			
		   }
		}
	
	public static void promptAlert(String comment ,String name) {
			if (comment.equalsIgnoreCase("ok")) {
				Alert promptAlert = driver.switchTo().alert();
				promptAlert.sendKeys(name);
				String text = promptAlert.getText();
				System.out.println(text);
				promptAlert.accept();
			} else if (comment.equalsIgnoreCase("no")) {
				Alert promptAlert = driver.switchTo().alert();
				promptAlert.sendKeys(name);
				String text = promptAlert.getText();
				System.out.println(text);
				promptAlert.dismiss();
			}
		}
	
	public static void click() {
			Actions ac = new Actions(driver);
			ac.click().build().perform();
		}
	
	public static void clear(WebElement element, int i ) {
			element.clear();
	
	
	}
	
	public static void rightClick() {
			Actions ac = new Actions(driver);
			ac.contextClick().build().perform();
		}
	
	public static void doubleClick() {
		Actions ac = new Actions(driver);
		ac.doubleClick().build().perform();
	}
	
	public static void dragAndDrop(WebElement drag, WebElement drop) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(drag, drop).build().perform();
	}
	
	public static void downkey() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
	}
	
	public static void upkey() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
	}	
	
	public static void leftkey() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_LEFT);
	}
	
	public static void rightkey() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_RIGHT);
	}	
	
	public static void enterkey() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}
	
	public static void Frame(String name) {
		driver.switchTo().frame(name);
	}

	public static void sendKeys(WebElement element, String text) {
		element.sendKeys(text);
		
	}
	public static void getAttribute(WebElement element, String name) {
		String attribute1 = element.getAttribute(name);
		System.out.println(attribute1);
	}
	public static void getAttributevalue(WebElement element, String value) {
		String attribute2 = element.getAttribute(value);
		System.out.println(attribute2);
		
	}		
	public static void isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}

	public static void isSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}
	
	public static void isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}
	
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void getCurrentUrl() {
		String Currenturl = driver.getCurrentUrl();
		System.out.println(Currenturl);
	}
	
	public static void selectbyvalue(String value, WebElement element) {
		Select si = new Select(element);
		si.selectByValue(value);
	}
	
	public static void screenShot(String Location) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		 File scr = ts.getScreenshotAs(OutputType.FILE);
		 File dest = new File(Location);
		 FileUtils.copyFile(scr, dest);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
