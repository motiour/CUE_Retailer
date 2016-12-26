package com.inmarkit.qa.framework.mh.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemManagerPageModel extends MHModelBase{

	private WebElement pageTitle = null;
	private WebElement totalItemMsg = null;
	private WebElement selectAllThisPageLink = null;
	private WebElement clearAllThisPageLink = null;
	private WebElement selectAllAllPageLink = null;
	private WebElement clearAllAllPageLink = null;
	private WebElement uploadToSelectedButton = null;
	private WebElement attachToSelectedButton = null;
	private WebElement filterByEditbox = null;
	
	public ItemManagerPageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement pageTitle(){
		pageTitle = driver.findElement(By.xpath("//div[@class='header_gray']//td[@class='header_title']"));
		return pageTitle;
	}
	
	public WebElement totalItemMsg(){
		totalItemMsg = driver.findElement(By.xpath("//div[@class='store_info']//h2"));
		return totalItemMsg;
	}
	
	public WebElement selectAllThisPageLink(){
		selectAllThisPageLink = driver.findElement(By.xpath("(//div[@class='list_header_normal']//a)[1]"));
		return selectAllThisPageLink;
	}
	
	public WebElement clearAllThisPageLink(){
		clearAllThisPageLink = driver.findElement(By.xpath("(//div[@class='list_header_normal']//a)[2]"));
		return clearAllThisPageLink;
	}
	

	public WebElement selectAllAllPageLink(){
		selectAllAllPageLink = driver.findElement(By.xpath("(//div[@class='list_header_normal']//a)[3]"));
		return selectAllAllPageLink;
	}
	
	public WebElement clearAllAllPageLink(){
		clearAllAllPageLink = driver.findElement(By.xpath("(//div[@class='list_header_normal']//a)[4]"));
		return clearAllAllPageLink;
	}
	
	public WebElement uploadToSelectedButton(){
		uploadToSelectedButton = driver.findElement(By.xpath("(//input[@class='search'][2]"));
		return uploadToSelectedButton;
	}
	
	public WebElement attachToSelectedButton(){
		attachToSelectedButton = driver.findElement(By.xpath("(//input[@class='search'][3]"));
		return attachToSelectedButton;
	}
	
	public WebElement filterByEditbox(){
		filterByEditbox = driver.findElement(By.id("filter"));
		return filterByEditbox;
	}

}
