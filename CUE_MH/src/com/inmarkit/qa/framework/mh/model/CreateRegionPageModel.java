package com.inmarkit.qa.framework.mh.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateRegionPageModel extends MHModelBase{

	private WebElement pageTitle = null;
	private WebElement stateSelectionBox = null;
	private WebElement regionDetailsBox = null;
	private WebElement zipCodeEditbox = null;
	private WebElement addRegionButton = null;
	private WebElement removeRegionButton = null;
	private WebElement saveAsEditbox = null;
	private WebElement submitButton = null;
	private WebElement browseButton = null;
	
	public CreateRegionPageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		
	
	public WebElement pageTitle(){
		pageTitle = driver.findElement(By.xpath("//div[@class='header_gray']//td[@class='header_title']"));
		return pageTitle;
	}
	
	public WebElement stateSelectionBox(){
		stateSelectionBox = driver.findElement(By.xpath("//select[@id='states']"));
		return stateSelectionBox;
	}
		
	public WebElement regionDetailsBox(){
		regionDetailsBox = driver.findElement(By.xpath("//select[@id='selected_regions']"));
		return regionDetailsBox;
	}
	
	public WebElement zipCodeEditbox(){
		zipCodeEditbox = driver.findElement(By.id("zipcode"));
		return zipCodeEditbox;
	}
	
	public WebElement saveAsEditbox(){
		saveAsEditbox = driver.findElement(By.id("region_name"));
		return saveAsEditbox;
	}
	
	public WebElement addRegionButton(){
		addRegionButton = driver.findElement(By.id("add_region"));
		return addRegionButton;
	}
	
	public WebElement removeRegionButton(){
		removeRegionButton = driver.findElement(By.id("remove_region"));
		return removeRegionButton;
	}
	
	public WebElement submitButton(){
		submitButton = driver.findElement(By.xpath("//form[@id='upform']//input[@name='commit']"));
		return submitButton;
	}
	
	public WebElement browseButton(){
		browseButton = driver.findElement(By.id("zipfile"));
		return browseButton;
	}

}
