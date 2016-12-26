package com.inmarkit.qa.framework.mh.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegionManagerPageModel extends MHModelBase{

	private WebElement pageTitle = null;
	private WebElement existingRegionLink = null;
	private WebElement createRegionLink = null;
		
	public RegionManagerPageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public WebElement pageTitle(){
		pageTitle = driver.findElement(By.xpath("//div[@class='header_gray']//td[@class='header_title']"));
		return pageTitle;
	}
	
	public WebElement existingRegionLink(){
		existingRegionLink = driver.findElement(By.linkText("Load Existing Region"));
		return existingRegionLink;
	}
	
	public WebElement createRegionLink(){
		createRegionLink = driver.findElement(By.linkText("Create Region"));
		return createRegionLink;
	}

}
