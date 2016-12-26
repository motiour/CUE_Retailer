package com.paxotech.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest1 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.gecko.driver", "C:\\DevTools\\FireFoxDriver\\geckodriver.exe");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://business.cueconnect.com/");
		
		WebElement signInButton = driver.findElement(By.xpath("//*[@id='imi-opensignin']"));
		//delayFor(2000);
		signInButton.click();

		WebElement emailTextBox = driver.findElement(By.xpath("//*[@id='signin-email']"));
		//delayFor(2000);
		emailTextBox.sendKeys("mrahman3555@yahoo.com");

		WebElement passWordBox = driver.findElement(By.xpath("//*[@id='signin-password']"));
		//delayFor(2000);
		passWordBox.sendKeys("123456");

		WebElement button = driver.findElement(By.xpath("//*[@id='signin-submit']"));
		button.click();
		//delayFor(20000);

		driver.close();
		 

	}

}
