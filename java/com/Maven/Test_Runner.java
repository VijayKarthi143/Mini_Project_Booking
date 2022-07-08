package com.Maven;

import org.openqa.selenium.WebDriver;

import com.helper.File_Reader_Manager;
import com.pomclass.T_shirt;
import com.sdp.Page_Object_Manager;

public class Test_Runner extends baseClassMethods {
		
	public static WebDriver driver = browserlaunch();
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	
public static void main(String[] args) throws Throwable  {
	
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().url();
	
		getUrl(url);
	
		clickElement(pom.getinstancehp().getSignin());
		
		String email = File_Reader_Manager.getInstanceFRM().getInstanceCR().email();
		
		sendKeys(pom.getinstanceLogin().getEmail(), email);
		
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().password();
		
		sendKeys(pom.getinstanceLogin().getPassword(), password);

		clickElement(pom.getinstanceLogin().getSignin());

		T_shirt tshirt = new T_shirt(driver);
		clickElement(pom.getinstancetshirt().getTshirt());
		
		clickElement(tshirt.getImg());

		String QTY = File_Reader_Manager.getInstanceFRM().getInstanceCR().quantity();
		clear(pom.getinstanceorder().getQuantity(), 0);
		sendKeys(pom.getinstanceorder().getQuantity(), QTY);

		selectbyvalue("2", pom.getinstanceorder().getSize());

		clickElement(pom.getinstanceorder().getCart());

		clickElement(pom.getinstanceorder().getCheckout());

		clickElement(pom.getinstanceproceed().getSummery());
		
		clickElement(pom.getinstanceaddress().getAddress());

		clickElement(pom.getinstanceaddress().getShipping_checkbox());

		clickElement(pom.getinstanceaddress().getPayment());
		
		clickElement(pom.getinstancepayment().getPaymentMethod());

		clickElement(pom.getinstancepayment().getFinalCheckout());
	
		
	}
}
