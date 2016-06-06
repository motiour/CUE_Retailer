package com.cucumber.com.cue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageHeadingTest {
	
	
	@Test
	public void shouldCheckMainPage() throws IOException{
		WebDriver driver = new FirefoxDriver();
		WebDriverUtils util = new WebDriverUtils(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.cueconnect.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement signInButton = driver.findElement(By.xpath("//*[@id='imi-opensignin']"));
		signInButton.click();

		WebElement emailTextBox = driver.findElement(By.xpath("//*[@id='signin-email']"));
		
		emailTextBox.sendKeys("berkbowen@yahoo.com");

		WebElement passWordBox = driver.findElement(By.xpath("//*[@id='signin-password']"));
		
		passWordBox.sendKeys("specr351");

		WebElement button = driver.findElement(By.xpath("//*[@id='signin-submit']"));
		
		button.click();
		//ScreenShot Function implement here
		util.takeScreenShot("welcomepage");

		
	}

}
