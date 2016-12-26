package com.inmarkit.qa.framework.mh.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditAccountPageModel extends MHModelBase{

	private WebElement nameTextbox = null;
	private WebElement titleTextbox = null;
	private WebElement phoneTextbox = null;
	private WebElement mobileTextbox = null;
	private WebElement emailTextbox = null;
	private WebElement passwordTextbox = null;
	private WebElement newpasswordTextbox = null;
	private WebElement reEnterNewpasswordTextbox = null;
	private WebElement saveChangesButton = null;
	
	public EditAccountPageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebElement nameTextbox(){
		nameTextbox = driver.findElement(By.id("name"));
		return nameTextbox;
	}
	
	public WebElement titleTextbox(){
		titleTextbox = driver.findElement(By.id("title"));
		return titleTextbox;
	}
	
	public WebElement phoneTextbox(){
		phoneTextbox = driver.findElement(By.id("phone"));
		return phoneTextbox;
	}
	
	public WebElement mobileTextbox(){
		mobileTextbox = driver.findElement(By.id("mobile"));
		return mobileTextbox;
	}
	
	public WebElement emailTextbox(){
		emailTextbox = driver.findElement(By.id("email"));
		return emailTextbox;
	}
	
	public WebElement passwordTextbox(){
		passwordTextbox = driver.findElement(By.id("curr_password"));
		return passwordTextbox;
	}
	
	public WebElement newpasswordTextbox(){
		newpasswordTextbox = driver.findElement(By.id("new_password"));
		return newpasswordTextbox;
	}
	
	public WebElement reEnterNewpasswordTextbox(){
		reEnterNewpasswordTextbox = driver.findElement(By.id("new_password2"));
		return reEnterNewpasswordTextbox;
	}
	
	public WebElement saveChangesButton(){
		saveChangesButton = driver.findElement(By.xpath("//input[@class='img_btn']"));
		return saveChangesButton;
	}
}
