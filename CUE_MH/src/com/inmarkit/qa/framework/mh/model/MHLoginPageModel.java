

package com.inmarkit.qa.framework.mh.model;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;


public class MHLoginPageModel extends MHModelBase 
{

	
	private WebElement signInButton1 = null;
	private WebElement emailBox = null;
	private WebElement passWordBox = null;
	private WebElement signInButton2 = null;
	private WebElement pageTitle = null;
	
    private WebElement email = null;

	private WebElement password = null;

	private WebElement signInButton = null;

	private WebElement errorMessage = null;

	private WebElement signUpButton = null;

	private WebElement forgotPassword = null;

	
public MHLoginPageModel(WebDriver driver)
{
		super(driver);
	}
	
	
public WebElement pageTitle()
{
pageTitle = driver.findElement(By.xpath("//div[@class='header_gray']//td[@class='header_title']"));
		return pageTitle;
	}
	





public WebElement signInButton1() {
	signInButton1 = driver.findElement(By.id("imi-opensignin"));
    return signInButton1;
}

public WebElement emailBox() {
	emailBox = driver.findElement(By.xpath("//*[@id='signin-email']"));
	return emailBox;
}

public WebElement passWordBox() {
	passWordBox = driver.findElement(By.xpath("//*[@id='signin-password']"));
	return passWordBox;
}

public WebElement signInButton2() {
	signInButton2 = driver.findElement(By.xpath("//*[@id='signin-submit']"));
	return signInButton2;
}




/*
	
	public WebElement errorMessage(){
		errorMessage = driver.findElement(By.xpath("//div[@id='email_error']"));
		return errorMessage;
	}
	
	public WebElement signInButton(){
		signInButton = driver.findElement(By.xpath("//input[@alt='Login']"));
		return signInButton;
	}
	
	public WebElement signUpButton(){
		signUpButton = driver.findElement(By.xpath("//div[@class='psin_det_joinnow']//a/img"));
		return signUpButton;
	}
	
	public WebElement forgotPassword(){
		forgotPassword = driver.findElement(By.xpath("//div[@class='signinbox']//a"));
		return forgotPassword;
	}
	
	*/
	
}


