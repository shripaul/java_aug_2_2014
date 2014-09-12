package com.selenium.test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MySecondSeleniumTest {

	public static void main(String[] args) {
		FirefoxDriver Selenium = new FirefoxDriver();
		Selenium.get("http://www.facebook.com");
		
		Selenium.findElementByLinkText("Sign Up").click();

		

	}

}
