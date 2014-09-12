package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mortgagetest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.cars.com/go/advice/financing/calc/loanCalc.jsp?mode=full");
		
		driver.findElement(By.id("vpLoan")).clear();
	    driver.findElement(By.id("vpLoan")).sendKeys("200000");
		driver.findElement (By.id("dpLoan")).sendKeys("50000");
		driver.findElement (By.id("tvLoan")).sendKeys("3000");
		driver.findElement (By.id("stPerLoan")).sendKeys("1200");
		driver.findElement (By.id("rateLoan")).sendKeys("4");
		driver.findElement (By.id("termLoan")).sendKeys("24");
		driver.findElement (By.id("mpLoan")).sendKeys("00");
		
	}

}
