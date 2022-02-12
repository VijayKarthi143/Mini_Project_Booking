package com.sdp;

import org.openqa.selenium.WebDriver;

import com.Maven.Login;
import com.pomclass.Address_Payments;
import com.pomclass.Home_page;
import com.pomclass.Login_Page;
import com.pomclass.Payment_OrderConfirmation;
import com.pomclass.Select_Orders;
import com.pomclass.Summery;
import com.pomclass.T_shirt;

public class Page_Object_Manager {

	public WebDriver driver ;
	
	private Home_page hp;
	private Login_Page login;
	private T_shirt tshirt;
	private Select_Orders order ;
	private Summery proceed;
	private Address_Payments address;
	private Payment_OrderConfirmation payment ;
	
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
	
	}
		
	public Home_page getinstancehp() {

		if(hp==null)
		
			hp=new Home_page(driver);
		
		return hp;
		
	}
	
	public Login_Page getinstanceLogin() {

		if(login==null)
		
			login = new Login_Page(driver);
		
		return login;
		
	}
	
	public T_shirt getinstancetshirt() {

		if(tshirt==null)
		
			 tshirt = new T_shirt(driver);
		
		return tshirt;
		
	}
	
	public Select_Orders getinstanceorder() {

		if(order==null)
		
			order = new Select_Orders(driver);
		
		return order;
		
	}
	
	public Summery getinstanceproceed() {

		if(proceed==null)
		
			proceed = new Summery(driver);
		
		return proceed;
		
	}
	
	public Address_Payments getinstanceaddress() {

		if(address==null)
		
			address = new Address_Payments(driver);
		
		return address;
		
	}
	
	public Payment_OrderConfirmation getinstancepayment() {

		if( payment==null)
		
			 payment = new Payment_OrderConfirmation(driver);
		
		return  payment;
		
	}

}
