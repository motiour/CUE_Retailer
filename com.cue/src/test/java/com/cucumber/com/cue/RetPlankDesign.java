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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.internal.Locatable;

public class RetPlankDesign {
	



	
public WebDriver driver = null;
	
    @Before
    public void beforeTest() {


   	    System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.plankdesigns.com/");
       
         
       
   
         
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
	public void spXMakeup () {
    	
         
        WebElement CUElInk = driver.findElement(By.xpath("//div[@class='cue-stream']"));
 		delayFor(2000);
 		mouseClick(CUElInk);
 		delayFor(5000);
 		
 		driver.switchTo().defaultContent();

		driver.switchTo().frame(driver.findElement(By.id("streamIFrame")));
	
		WebElement menu = driver.findElement(By.xpath("//*[@id='browserWelcome']/div[4]/div/span/span")); // the triger event element

 	    Actions build = new Actions(driver); // heare you state ActionBuider
 	    build.moveToElement(menu).build().perform(); // Here you perform hover mouse over the needed elemnt to triger the visibility of the hidden
 	    WebElement m2m= driver.findElement(By.xpath("//*[@id='browserWelcome']/div[4]/div/span/span"));//the previous non visible element
 	    m2m.click();
 		
 	    

 		WebElement CUEEmail = driver.findElement(By.xpath("//*[@id='signin-email']"));
 		CUEEmail.sendKeys("nick45555@yahoo.com");
  		delayFor(2000);
  		
  		WebElement CUEPassword = driver.findElement(By.xpath("//*[@id='signin-password']"));
  		CUEPassword.sendKeys("123456");
  		delayFor(2000);
  		
  		WebElement CUELoginButton = driver.findElement(By.xpath("//*[@id='signin-submit']"));
  		CUELoginButton.click();
 		delayFor(2000);
 		
 		

        WebElement Item = driver.findElement(By.xpath("//*[@id='item-111888']/div[2]/a"));
        delayFor(10000);
        mouseClick(Item);
        
        
        WebElement ShareTab = driver.findElement(By.xpath("//*[@id='item-detail-navbar-collapse']/ul/li[2]/a"));
        delayFor(2000);
        mouseClick(ShareTab);
        delayFor(10000);


        WebElement TwitterShareButton = driver.findElement(By.xpath("//*[@id='post-twitter']"));
        TwitterShareButton.click();
        delayFor(2000);
        
        WebElement CommentsBox = driver.findElement(By.xpath("//*[@id='imi-after-post-network-select']/div[1]/textarea"));
        CommentsBox.sendKeys("This is  nice item!!");

       
        

        WebElement SendButton = driver.findElement(By.xpath("//*[@id='post-submit']"));
      
        SendButton.click();
        delayFor(10000);
        
        
        
		driver.close();
		
        
    }




}
