package com.paxotech.qa;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CUE_Test {
	
	

	
	
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
    public void logTest(){
    	
    	CUE cue = new CUE(driver);
    	cue.signLink.click();
    	delayFor(2000);
    	cue.emailBox.sendKeys("mrahman3555@yahoo.com");
    	delayFor(2000);
    	cue.passwordBox.sendKeys("123456");
    	delayFor(2000);
    	cue.submitBotton.click();
    
    	
    }
	
	
	
	
	 
    @Test
    public void logTest1(){
    	
    	CUE cue = new CUE(driver);
    	cue.loginTest("mrahman3555@yahoo.com", "123456");
    	
    }
	
	


}
