package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mortgageaffordability {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.cars.com/go/advice/financing/calc/loanCalc.jsp?vpLoan=0&dpLoan=0&tvLoan=0&stLoan=0&rateLoan=3.47&termLoan=36&mpLoan=0.00&tcLoan=0&rate=&microsite=false&mode=full&affordability=yes");

		driver.findElement(By.id("mpLoan")).clear();
		driver.findElement(By.id("mpLoan")).sendKeys("20000");
		driver.findElement(By.id("dpLoan")).sendKeys("500");
		driver.findElement(By.id("tvLoan")).sendKeys("300");
		driver.findElement(By.id("stPerLoan")).sendKeys("100");
		driver.findElement(By.id("rateLoan")).sendKeys("4");
		driver.findElement(By.id("termLoan")).sendKeys("24");
		driver.findElement(By.id("vpLoan")).sendKeys("12000");
	}

}
