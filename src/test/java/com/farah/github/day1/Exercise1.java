package com.farah.github.day1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise1 extends Hooks{

	public static void main(String args []) throws InterruptedException {
		
		
		
		setUp("edge");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		WebElement userName = driver.findElement(By.name("username")); 
		userName.sendKeys("admin");
		
		
		Thread.sleep(3000);
		
		
		WebElement password = driver.findElement(By.name("password")); 
		
		Thread.sleep(3000);
		
		
		password.sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		loginButton.click();
		
		WebElement headerElement = driver.findElement(By.tagName("h1"));
	    String headerText = headerElement.getText();
	    
	    if(headerText.equals("Dashboard")){
	    	System.out.println("Header text is verified successfully");
	    }else {
	    	System.out.println("Test failed Expected 'Dashboard' but got '" + headerText);
	    }
	    
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		tearDown();
	}
}
