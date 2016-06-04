package com.cucumber.com.cue;

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
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CUEHomePageLink {
	
public WebDriver driver = null;
	
    @Before
    public void beforeTest() {
    	
    	
    	/*
    	  System.setProperty("webdriver.ie.driver", "C:/Drivers/IEDriverServer.exe");
          InternetExplorerDriver IEDriver=new InternetExplorerDriver();
          IEDriver.get("http://localhost:8888");
    	
    	*/
    	

    	
    	
    	    	 
    	
    	
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
 
    
    @Test
	public void homePageHeaderLinks() {
    	

		WebElement howItWorks = driver.findElement(By.xpath("//*[@id='main-menu']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a"));
		delayFor(2000);
		howItWorks.click();
		
		WebElement features = driver.findElement(By.xpath("//*[@id='main-menu']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/a"));
		delayFor(2000);
		features.click();
		
		WebElement pricing = driver.findElement(By.xpath("//*[@id='main-menu']/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/a"));
		delayFor(2000);
		pricing.click();
		
		WebElement about = driver.findElement(By.xpath("//*[@id='main-menu']/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/a"));
		delayFor(2000);
		about.click();
		
		WebElement blogs = driver.findElement(By.xpath("//*[@id='main-menu']/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/a"));
		delayFor(2000);
		blogs.click();
		
		WebElement forShoppers = driver.findElement(By.xpath("//*[@id='cue-i-am-shopper-dsk']"));
		delayFor(2000);
		forShoppers.click();
		
		
		driver.close();
			
			}
    
    
    
    
    @Test
	public void homePageFooterLinks() {
    	

		WebElement howItWorks = driver.findElement(By.xpath("//*[@id='imi-app-content']/div[1]/div[3]/div[1]/div[2]/a[1]"));
		delayFor(2000);
		howItWorks.click();
		
		WebElement features = driver.findElement(By.xpath("//*[@id='imi-app-content']/div[1]/div[3]/div[1]/div[2]/a[2]"));
		delayFor(2000);
		features.click();
	
		WebElement pricing = driver.findElement(By.xpath("//*[@id='imi-app-content']/div[1]/div[3]/div[1]/div[2]/a[3]"));
		delayFor(2000);
		pricing.click();
		
		
		
		WebElement about = driver.findElement(By.xpath("//*[@id='imi-app-content']/div[1]/div[3]/div[1]/div[3]/a[1]"));
		delayFor(2000);
		about.click();
		
	
		WebElement blogs = driver.findElement(By.xpath("//*[@id='main-menu']/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/a"));
		delayFor(2000);
		blogs.click();
		
		WebElement privacy = driver.findElement(By.xpath("//*[@id='imi-app-content']/div[1]/div[3]/div[1]/div[4]/a[1]"));
		delayFor(2000);
		privacy.click();
		
		WebElement shopper = driver.findElement(By.xpath("//*[@id='cue-i-am-shopper-fot']"));
		delayFor(2000);
		shopper.click();
		
		WebElement twitter = driver.findElement(By.xpath("//*[@id='Layer_1']/path"));
		delayFor(2000);
		twitter.click();
		
		WebElement facebook = driver.findElement(By.xpath("//*[@id='imi-app-content']/div[1]/div[3]/div[1]/div[5]/div[2]/a/svg/path"));
		delayFor(2000);
		facebook.click();
		
		driver.close();
			
			}
	

	

}
