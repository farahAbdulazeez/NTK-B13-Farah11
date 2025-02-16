package com.farah.github.day1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise2 extends Hooks{
	
	public static void main(String args []) throws InterruptedException {	
	
	setUp("edge");
	
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	Thread.sleep(3000);
	
	
	WebElement firstName = driver.findElement(By.name("firstName"));
	firstName.sendKeys("Farah");
	
	Thread.sleep(3000);
	
	WebElement lastName = driver.findElement(By.name("lastName"));
	lastName.sendKeys("Abdulazeez");
	
	Thread.sleep(3000);
	
	WebElement PhoneNumber = driver.findElement(By.name("phone"));
	PhoneNumber.sendKeys("555-99-78");
	
	Thread.sleep(3000);
	
	WebElement email = driver.findElement(By.id("userName"));
	email.sendKeys("yaraemil@yahoo.com");
	
	Thread.sleep(3000);
	
	WebElement address = driver.findElement(By.name("address1"));
	address.sendKeys("1111 Zach Scott st.");
	
	
	Thread.sleep(3000);
	
	WebElement city = driver.findElement(By.name("city"));
	city.sendKeys("Austin");
	
	
	Thread.sleep(3000);
	
	WebElement state = driver.findElement(By.name("state"));
	state.sendKeys("TX");
	
	
	Thread.sleep(3000);
	
	
	WebElement zipCode = driver.findElement(By.name("postalCode"));
	zipCode.sendKeys("78723");
	
	
	Thread.sleep(3000);
	
	WebElement username = driver.findElement(By.id("email"));
	username.sendKeys("farah.F");
	
	
	Thread.sleep(3000);
	
	
	WebElement password = driver.findElement(By.id("email"));
	password.sendKeys("#Sel.fun11");
	
	
	Thread.sleep(3000);
	
	
	WebElement confirm = driver.findElement(By.name("confirmPassword"));
	confirm.sendKeys("#Sel.fun11");
	
	
	Thread.sleep(3000);
	
	WebElement submit = driver.findElement(By.name("submit"));
	submit.click();
	
	
	Thread.sleep(3000);
	
	
	
	
	tearDown();

}
}