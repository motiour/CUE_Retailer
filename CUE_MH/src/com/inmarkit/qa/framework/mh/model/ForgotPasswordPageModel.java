package com.inmarkit.qa.framework.mh.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPageModel extends MHModelBase{


	private WebElement pageTitle = null;
	private WebElement emailEditbox = null;
	private WebElement errorMessage = null;
	private WebElement sendMeButton = null;
		
	public ForgotPasswordPageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement pageTitle(){
		pageTitle = driver.findElement(By.xpath("//div[@class='header_gray']//td[@class='header_title']"));
		return pageTitle;
	}
	
	public WebElement emailEditbox(){
		emailEditbox = driver.findElement(By.id("email"));
		return emailEditbox;
	}
	
	public WebElement errorMessage(){
		errorMessage = driver.findElement(By.xpath("//div[@id='email_error']"));
		return errorMessage;
	}
	
	public WebElement sendMeButton(){
		sendMeButton = driver.findElement(By.xpath("//input[@class='sigin_btn_signin']"));
		return sendMeButton;
	}

}
