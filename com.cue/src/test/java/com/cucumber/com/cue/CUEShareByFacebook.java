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

public class CUEShareByFacebook {
	


	
public WebDriver driver = null;
	
    @Before
    public void beforeTest() {

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
    

	public void mouseClick(WebElement element) {
		String code = "var fireOnThis = arguments[0];" + "var evObj = document.createEvent('MouseEvents');"
				+ "evObj.initEvent( 'click',true,false );" + "fireOnThis.dispatchEvent(evObj);";
		((JavascriptExecutor) driver).executeScript(code, element);
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
	public void shareByFacebook() {
    	
    	 WebElement signInButton = driver.findElement(By.xpath("//*[@id='imi-opensignin']"));
         delayFor(2000);
         signInButton.click();

         WebElement emailTextBox = driver.findElement(By.xpath("//*[@id='signin-email']"));
         delayFor(2000);
         emailTextBox.sendKeys("b.stuart0101@gmail.com");

         WebElement passWordBox = driver.findElement(By.xpath("//*[@id='signin-password']"));
        delayFor(2000);
         passWordBox.sendKeys("123456");

         WebElement button = driver.findElement(By.xpath("//*[@id='signin-submit']"));
        delayFor(2000);
         button.click();


         WebElement Item = driver.findElement(By.xpath("//*[@id='item-115049']/div[2]/a"));
        
         delayFor(2000);
      
         mouseClick(Item);

         
         
         WebElement ShareTab = driver.findElement(By.xpath("//*[@id='item-detail-navbar-collapse']/ul/li[2]/a"));
         ShareTab.click();
         delayFor(2000);


         WebElement TwitterShareButton = driver.findElement(By.xpath("//*[@id='post-facebook']"));
         TwitterShareButton.click();
         delayFor(2000);
         
         WebElement CommentsBox = driver.findElement(By.xpath("//*[@id='imi-after-post-network-select']/div[1]/textarea"));
         CommentsBox.sendKeys("This is Facebook Great post!!");

         WebElement SendButton = driver.findElement(By.xpath("//*[@id='post-submit']"));
         delayFor(5000);
         SendButton.click();

    	

			}
	

	

}
