package com.inmarkit.qa.framework.mh.model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoadExistingRegionPageModel extends MHModelBase{

	private WebElement pageTitle = null;
	private WebElement selectRegionbox = null;
	private WebElement stateSelectionBox = null;
	private WebElement regionDetailsBox = null;
	private WebElement zipCodeEditbox = null;
	private WebElement addRegionButton = null;
	private WebElement removeRegionButton = null;
	private WebElement saveListButton = null;
	private WebElement deleteListButton = null;
	private WebElement browseButton = null;
	private List<WebElement> regionList = null;
	public LoadExistingRegionPageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		
	public WebElement pageTitle(){
		pageTitle = driver.findElement(By.xpath("//div[@class='header_gray']//td[@class='header_title']"));
		return pageTitle;
	}
	
	public WebElement selectRegionbox(){
		selectRegionbox = driver.findElement(By.xpath("//select[@id='regions']"));
		return selectRegionbox;
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
	
	public WebElement addRegionButton(){
		addRegionButton = driver.findElement(By.id("add_region"));
		return addRegionButton;
	}
	
	public WebElement removeRegionButton(){
		removeRegionButton = driver.findElement(By.id("remove_region"));
		return removeRegionButton;
	}
	
	public WebElement saveListButton(){
		saveListButton = driver.findElement(By.xpath("//form[@id='regionmanager']//input[@value='Save List']"));
		return saveListButton;
	}
	
	public WebElement deleteListButton(){
		deleteListButton = driver.findElement(By.xpath("//form[@id='regionmanager']//input[@value='Delete List']"));
		return deleteListButton;
	}
	
	public List<WebElement> regionList(){
		regionList = driver.findElements(By.xpath("//select[@id='regions']/option"));
		return regionList;
	}
	
	public WebElement browseButton(){
		browseButton = driver.findElement(By.id("zipfile"));
		return browseButton;
	}

}
