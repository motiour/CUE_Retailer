package com.cucumber.com.cue;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CUEAddContactTest {
	
	
	


	public WebDriver driver = null;
	

	
    @Before
    public void beforeTest() throws SecurityException, IOException {

    	

    	 System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
         driver = new ChromeDriver();
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
 
    
    

public void hoverItem(WebElement element) {
	Actions actions = new Actions(driver);
	actions.moveToElement(element);
	actions.perform();
}

public void hoverItem(By by) {
	WebElement element = driver.findElement(by);
	hoverItem(element);
}

public void hoverItemEx(WebElement element) {
	Locatable hoverItem = (Locatable) element;
	Mouse mouse = ((HasInputDevices) driver).getMouse();
	mouse.mouseMove(hoverItem.getCoordinates());
}

public void hoverItemEx(By by) {
	WebElement element = driver.findElement(by);
	hoverItemEx(element);
}


public void mouseClick(WebElement element) {
    String code = "var fireOnThis = arguments[0];"
                + "var evObj = document.createEvent('MouseEvents');"
                + "evObj.initEvent( 'click',true,false );"
                + "fireOnThis.dispatchEvent(evObj);";
    ((JavascriptExecutor) driver).executeScript(code, element);
}





public void mouseOver(WebElement element) {
    String code = "var fireOnThis = arguments[0];"
                + "var evObj = document.createEvent('MouseEvents');"
                + "evObj.initEvent( 'mouseover', true, true );"
                + "fireOnThis.dispatchEvent(evObj);";
    ((JavascriptExecutor) driver).executeScript(code, element);
}


	
    @Test
	public void contactList() {
    	

		WebElement signInButton = driver.findElement(By.xpath("//*[@id='imi-opensignin']"));
		delayFor(2000);
		signInButton.click();

		WebElement emailTextBox = driver.findElement(By.xpath("//*[@id='signin-email']"));
		delayFor(2000);
		emailTextBox.sendKeys("mrahman3555@yahoo.com");

		WebElement passWordBox = driver.findElement(By.xpath("//*[@id='signin-password']"));
		delayFor(2000);
		passWordBox.sendKeys("123456");

		WebElement button = driver.findElement(By.xpath("//*[@id='signin-submit']"));
		delayFor(2000);
		button.click();

		


		WebElement profileTab = driver.findElement(By.xpath("//*[@id='imi-menu-profile']/span[1]"));
		mouseClick(profileTab);
		delayFor(20000);
		
		
		

		WebElement addConatctTab = driver.findElement(By.xpath("//*[@id='imi-menu-right-menu-profile']/li[2]/a"));
		hoverItem(addConatctTab);
		delayFor(20000);
		
		
		
		
		
		
		
		
		
/*
 

		WebElement rightTab = driver.findElement(By.xpath("//*[@id='imi-menu-right-menu-profile']"));
													           //*[@id='imi-menu-right-menu-profile']/li[2]/a
		mouseOver(rightTab);
		delayFor(20000);
		
		
	WebElement searchButton = driver.findElement(By.xpath("//*[@class='search']"));
		delayFor(2000);
		mouseClick(searchButton);
		delayFor(5000);
		
		
		
		WebElement addConatctTab = driver.findElement(By.xpath("//*[@id='menu-profile']/li[2]/a"));
		delayFor(2000);
		hoverItemEx(addConatctTab);
*/
		driver.close();
			
			}
    
    
    
    
    
    
    
    
}
	
	
	
	
	


