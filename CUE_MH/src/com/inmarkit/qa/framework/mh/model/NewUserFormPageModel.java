package com.inmarkit.qa.framework.mh.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewUserFormPageModel extends MHModelBase{

	private WebElement pageTitle = null;
	private WebElement nameEditbox = null;
	private WebElement titleEditbox = null;
	private WebElement emailEditbox = null;
	private WebElement sentMessage = null;
	private WebElement submitButton = null;
	public NewUserFormPageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement pageTitle(){
		pageTitle = driver.findElement(By.xpath("//div[@class='header_gray']//td[@class='header_title']"));
		return pageTitle;
	}
	
	public WebElement nameEditbox(){
		nameEditbox = driver.findElement(By.id("name"));
		return nameEditbox;
	}
	
	public WebElement titleEditbox(){
		titleEditbox = driver.findElement(By.id("name"));
		return titleEditbox;
	}
	
	public WebElement emailEditbox(){
		emailEditbox = driver.findElement(By.id("name"));
		return emailEditbox;
	}
	
	public WebElement submitButton(){
		submitButton = driver.findElement(By.xpath("//div[@class='page_content']//input[@name='commit']"));
		return submitButton;
	}
	
	public WebElement sentMessage(){
		sentMessage = driver.findElement(By.xpath("//div[@class='page_content']"));
		return sentMessage;
	}

}
