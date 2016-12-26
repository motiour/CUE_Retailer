


package com.inmarkit.qa.framework.ch;


import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.internal.Locatable;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Listeners;

import com.inmarkit.qa.framework.controller.CHLoginPageController;
import com.thoughtworks.selenium.Selenium;




public class CHScriptBase 
{


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


	
	public CHLoginPageController loginPage() {
		return new CHLoginPageController(driver);
	}
	
	
	
	
	
	
	
	
	
	

		
	public void handleWinHandler(){
		String curentWin = driver.getWindowHandle();
		Set<String > win = driver.getWindowHandles();
		for(String s : win){
			System.out.println(s);
			if(!(curentWin.contentEquals(s)))
			{
				driver.switchTo().window(s);
			}
		}
	}
	
	
	public String getDriverHandleWithTitle(String titleName){
        
        String targetHandle = "";
        for (String handle : driver.getWindowHandles()) {      
            if(driver.switchTo().window(handle).getTitle().contains(titleName))
            {
                targetHandle = handle;
                break;
            }        
        }
        
        return targetHandle;
    }

		
	
}
