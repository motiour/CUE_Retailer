package com.paxotech.qa;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class Test2 {
	

	
	
	
	public WebDriver driver = null;

	@BeforeClass
	public void beforeTest() throws SecurityException, IOException {


		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.cache.disk.enable", "false");
		driver = new FirefoxDriver(profile);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://business.cueconnect.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public void delayFor(int time) {

		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@AfterClass
	public void afterTest() {

		driver.close();
		driver.quit();
	}

	

	
	@Test
	public void LoginTest() {
		

		WebElement signLink = driver.findElement(By.xpath("//*[@id='imi-opensignin']"));
		signLink.click();
		
		WebElement emailBox = driver.findElement(By.xpath("//*[@id='signin-email']"));
		emailBox.sendKeys("mrahman3555@yahoo.com");
		delayFor(2000);
		
		WebElement passwordBox = driver.findElement(By.xpath("//*[@id='signin-password']"));
		passwordBox.sendKeys("123456");
		delayFor(2000);
		
		WebElement submitBotton = driver.findElement(By.xpath("//*[@id='signin-submit']"));
		submitBotton.click();
		
		WebElement profile = driver.findElement(By.xpath("//*[@id='imi-menu-profile']/span[2]"));
		String profileName = profile.getText();
		AssertJUnit.assertEquals("Eric", profileName);


	}
	
	
		    

}
