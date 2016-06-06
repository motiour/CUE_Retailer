package com.cucumber.com.cue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class CUEtest {
	
	public WebDriver driver = null;
	
    @Before
    public void beforeTest() {



    	 System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         driver.manage().window().maximize();
         driver.get("https://business.cueconnect.com/");
         
        /*


            FirefoxProfile profile = new FirefoxProfile();
            profile.setPreference("browser.cache.disk.enable", "false");
            driver = new FirefoxDriver(profile);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.navigate().to("https://business.cueconnect.com/");
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            
            
            */


    }
    
    
    public void delayFor(int time) {

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    @After
    public void afterTest() {
    	driver.close();
    }
 
    
    @Test
	public void contactList() {
    	

		WebElement signInButton = driver.findElement(By.xpath("//*[@id='imi-opensignin']"));
		delayFor(2000);
		signInButton.click();

		WebElement emailTextBox = driver.findElement(By.xpath("//*[@id='signin-email']"));
		delayFor(2000);
		emailTextBox.sendKeys("berkbowen@yahoo.com");

		WebElement passWordBox = driver.findElement(By.xpath("//*[@id='signin-password']"));
		delayFor(2000);
		passWordBox.sendKeys("specr351");

		WebElement button = driver.findElement(By.xpath("//*[@id='signin-submit']"));
		delayFor(2000);
		button.click();

		
		WebElement menuTab = driver.findElement(By.xpath("//*[@id='toggling-btn']"));
		delayFor(2000);
		menuTab.click();
		
		WebElement contactTab = driver.findElement(By.xpath("//*[@id='imi-menu-right-menu-profile']/li[2]/a"));
		delayFor(2000);
		contactTab.click();
	
		List<WebElement> links = driver.findElements(By.xpath("//*[@id='imi-contact-list']"));
		for(WebElement link : links){
			String itemText = link.getText(); 
			System.out.println("Contact Found: " + itemText);
		}

		driver.close();
			
			}
	

	

}
