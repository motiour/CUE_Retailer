package com.paxotech.qa;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.internal.Locatable;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Test1 {

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
		

		driver.findElement(By.xpath("//*[@id='imi-opensignin']")).click();
		driver.findElement(By.xpath("//*[@id='signin-email']")).sendKeys("mrahman3555@yahoo.com");
		delayFor(2000);
		driver.findElement(By.xpath("//*[@id='signin-password']")).sendKeys("123456");
		delayFor(2000);
		driver.findElement(By.xpath("//*[@id='signin-submit']")).click();
		String profileName = driver.findElement(By.xpath("//*[@id='imi-menu-profile']/span[2]")).getText();
		Assert.assertEquals("Eric", profileName);

	}

}