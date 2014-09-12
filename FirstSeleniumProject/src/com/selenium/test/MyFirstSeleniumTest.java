package com.selenium.test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumTest {
	public static void main (String[]args){
		FirefoxDriver Selenium = new FirefoxDriver();
		Selenium.get("http://www.adleads.com");
		
		Selenium.findElementByLinkText("Sign Up").click();
		Selenium.findElementById("first_name").sendKeys("paul");
		Selenium.findElementById("last_name").sendKeys("shri");
		Selenium.findElementById("company").sendKeys("cvs pharmacy");
		Selenium.findElementById("email").sendKeys("abc@gmail.com");
		Selenium.findElementById("phone").sendKeys("800-456-456");
		Selenium.findElementById("country").sendKeys("united state");
		Selenium.findElementById("companyUrl").sendKeys("http://example.net");
		Selenium.findElementById("checkbox small").sendKeys("Terms and Conditions");
		Selenium.findElementById("submit").sendKeys("button");
	}

}
