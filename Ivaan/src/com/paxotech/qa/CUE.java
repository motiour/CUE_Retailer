package com.paxotech.qa;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class CUE {
	
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
	
	 
    @AfterClass
	public void afterTest() {

		driver.close();
		driver.quit();
	}


	public void delayFor(int time) {

		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	

	public WebDriver  driver;
	
	@FindBy(xpath ="//*[@id='imi-opensignin']" )
	public WebElement signLink;
	
	@FindBy(xpath ="//*[@id='signin-email']" )
    public WebElement emailBox;
	
	@FindBy(xpath = "//*[@id='signin-password']")
    public WebElement passwordBox;
    
    @FindBy(xpath = "//*[@id='signin-submit']")
	public WebElement submitBotton;
    
    @FindBy(xpath ="//*[@id='imi-menu-profile']/span[2]")
    public WebElement profile;
    
    
    public CUE (WebDriver driver){
    	this.driver = driver;
    	PageFactory.initElements(new AjaxElementLocatorFactory(driver,20), this);
    	
    }
    
   
    
   
   public void loginTest(String email, String password){
	   
	    signLink.click();
		emailBox.sendKeys(email);
    	delayFor(2000);
    	passwordBox.sendKeys(password);
    	delayFor(2000);
    	submitBotton.click();
  
	   
   }
   

    
    
}
