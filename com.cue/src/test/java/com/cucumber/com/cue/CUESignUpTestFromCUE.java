package com.cucumber.com.cue;

import java.util.concurrent.TimeUnit;

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
import org.openqa.selenium.support.ui.Select;

public class CUESignUpTestFromCUE {
	
	
	


public WebDriver driver = null;
	
    @Before
    public void beforeTest() {
    	
    	
/*

   	    System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.at60inches.com/romy-owens/i-have-a-scheme-for-stopping-war-its-this-no-nation-is-allowed-to-enter-a-war-until-they-have-paid-for-the-last-one-2");
       
         */
       
   

            FirefoxProfile profile = new FirefoxProfile();
            profile.setPreference("browser.cache.disk.enable", "false");
            driver = new FirefoxDriver(profile);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("http://www.at60inches.com/romy-owens/i-have-a-scheme-for-stopping-war-its-this-no-nation-is-allowed-to-enter-a-war-until-they-have-paid-for-the-last-one-2");
            
             driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       



    }
    

	public void mouseClick(WebElement element) {
		String code = "var fireOnThis = arguments[0];" + "var evObj = document.createEvent('MouseEvents');"
				+ "evObj.initEvent( 'click',true,false );" + "fireOnThis.dispatchEvent(evObj);";
		((JavascriptExecutor) driver).executeScript(code, element);
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
	public void shareByTumblr() {
    	
         
        WebElement CUElInk = driver.findElement(By.xpath("//*[@id='nav-user']/ul/li[3]/a"));
 		delayFor(2000);
 		mouseClick(CUElInk);
 		delayFor(5000);
 		
 		driver.switchTo().defaultContent();

		driver.switchTo().frame(driver.findElement(By.id("streamIFrame")));

 		WebElement menu = driver.findElement(By.xpath("//*[@id='signup']")); // the triger event element

 	    Actions build = new Actions(driver); // heare you state ActionBuider
 	    build.moveToElement(menu).build().perform(); // Here you perform hover mouse over the needed elemnt to triger the visibility of the hidden
 	    WebElement m2m= driver.findElement(By.xpath("//*[@id='signup']"));//the previous non visible element
 	    m2m.click();
 	   
		
		WebElement EmailsignUpButton = driver.findElement(By.xpath("//*[@id='signupModal']/div[2]/div[3]"));
		delayFor(2000);
		EmailsignUpButton.click();

		WebElement NameTextBox = driver.findElement(By.xpath("//*[@id='signup-name']"));
		delayFor(2000);
		NameTextBox.sendKeys("MOhammad Rahman");
		
		WebElement emailTextBox = driver.findElement(By.xpath("//*[@id='signup-email']"));
		delayFor(2000);
		emailTextBox.sendKeys("QA@yahoo.com");

		WebElement passWordBox = driver.findElement(By.xpath("//*[@id='signup-password']"));
		delayFor(2000);
		passWordBox.sendKeys("123456");
		
		Select month = new Select(driver.findElement(By.xpath("//*[@id='signup-birthdate-month']")));
		
		month.selectByVisibleText("October");

		Select day = new Select(driver.findElement(By.xpath("//*[@id='signup-birthdate-day']")));
		
		day.selectByVisibleText("12");
		

		Select year = new Select(driver.findElement(By.xpath("//*[@id='signup-birthdate-year']")));
		
		year.selectByVisibleText("1984");
 	   
		WebElement EmailsignUpsubmitButton = driver.findElement(By.xpath("//*[@id='signup-submit']"));
		delayFor(2000);
		EmailsignUpsubmitButton.click();

 		
 		driver.close();
 		
 	 

        
         
    }

}
