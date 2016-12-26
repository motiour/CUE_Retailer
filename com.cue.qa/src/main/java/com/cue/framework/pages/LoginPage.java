package com.cue.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage extends PageBase{

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
  
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
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
