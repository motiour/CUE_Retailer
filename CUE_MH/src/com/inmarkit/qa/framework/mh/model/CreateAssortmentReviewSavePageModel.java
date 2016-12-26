package com.inmarkit.qa.framework.mh.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAssortmentReviewSavePageModel extends MHModelBase{

	private WebElement pageTitle = null;
	private WebElement prevButton = null;
	private WebElement storeName = null;
	private WebElement location = null;
	private WebElement region = null;
	private WebElement zipcode = null;
	private WebElement confirmButton = null;
	
	public CreateAssortmentReviewSavePageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
			
	public WebElement pageTitle(){
		pageTitle = driver.findElement(By.xpath("//div[@class='header_gray']//td[@class='header_title']"));
		return pageTitle;
	}
	
	public WebElement confirmButton(){
		confirmButton = driver.findElement(By.xpath("//div[@class='store_info']//a/img"));
		return confirmButton;
	}
	
	public WebElement prevButton(){
		prevButton = driver.findElement(By.xpath("//div[@class='sub_floatleft']/input"));
		return prevButton;
	}
	
	public WebElement storeName(){
		storeName = driver.findElement(By.xpath("//div[@class='store_info']//tr[3]/td[1]"));
		return storeName;
	}
	
	public WebElement location(){
		location = driver.findElement(By.xpath("//div[@class='store_info']//tr[3]/td[2]"));
		return location;
	}

	public WebElement region(){
		region = driver.findElement(By.xpath("//div[@class='store_info']//tr[3]/td[3]"));
		return region;
	}
	
	public WebElement zipcode(){
		zipcode = driver.findElement(By.xpath("//div[@class='store_info']//tr[3]/td[4]"));
		return zipcode;
	}

	
}
