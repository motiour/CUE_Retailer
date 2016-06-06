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

public class OBShareByTwitter {
	
	
	

	
public WebDriver driver = null;
	
    @Before
    public void beforeTest() {


   	    System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.at60inches.com/romy-owens/i-have-a-scheme-for-stopping-war-its-this-no-nation-is-allowed-to-enter-a-war-until-they-have-paid-for-the-last-one-2");
       
         
        /*

    	
    	
            FirefoxProfile profile = new FirefoxProfile();
            profile.setPreference("browser.cache.disk.enable", "false");
            driver = new FirefoxDriver(profile);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.navigate().to("http://www.at60inches.com/romy-owens/i-have-a-scheme-for-stopping-war-its-this-no-nation-is-allowed-to-enter-a-war-until-they-have-paid-for-the-last-one-2");
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            
            */


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
	public void shareByOB() {
    	
    	driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("oneButtonButtonIFrame415436303635343230")));
        WebElement OBButton = driver.findElement(By.xpath("//*[@id='ob-button']"));
        OBButton.click();
 		delayFor(2000);
 		
 		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("oneButtonIFrame")));
		
 		WebElement OBLogin = driver.findElement(By.xpath("//*[@id='imi-ob-signin']"));
 		delayFor(2000);
 		hoverItemEx(OBLogin);
 		
 		WebElement menu = driver.findElement(By.xpath("//*[@id='imi-ob-signin']")); // the triger event element

 	    Actions build = new Actions(driver); // heare you state ActionBuider
 	    build.moveToElement(menu).build().perform(); // Here you perform hover mouse over the needed elemnt to triger the visibility of the hidden
 	    WebElement m2m= driver.findElement(By.xpath("//*[@id='imi-ob-signin']"));//the previous non visible element
 	    m2m.click();
 		
 		
 		WebElement OBEmail = driver.findElement(By.xpath("//*[@id='signin-email']"));
 		//OBEmail.clear();
 		delayFor(20000);
 		OBEmail.sendKeys("nick45555@yahoo.com");
  	
  		
  		WebElement OBPassword = driver.findElement(By.xpath("//*[@id='signin-password']"));
  		OBPassword.sendKeys("123456");
  		delayFor(2000);
  		
  		WebElement OBLoginButton = driver.findElement(By.xpath("//*[@id='signin-submit']"));
  		OBLoginButton.click();
 		delayFor(2000);
 		
 		WebElement FBShareIcon = driver.findElement(By.xpath("//*[@id='post-twitter']"));
 		mouseClick(FBShareIcon);
 		delayFor(10000);
 		
 		WebElement FBShareComments = driver.findElement(By.xpath("//*[@id='imi-after-post-network-select']/div[1]/textarea"));
 		FBShareComments.sendKeys("Oww this is nice picture, I like this for my new aprtment. What do u think!!");
  		delayFor(10000);
 		
  		
  		WebElement PostButton = driver.findElement(By.xpath("//*[@id='post-submit']"));
  		PostButton.click();
 		delayFor(2000);
 			

         
    }

    	
	
	
	

}
