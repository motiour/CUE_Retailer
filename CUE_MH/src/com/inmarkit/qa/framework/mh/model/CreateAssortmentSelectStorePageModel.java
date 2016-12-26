package com.inmarkit.qa.framework.mh.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAssortmentSelectStorePageModel extends MHModelBase{

	private WebElement pageTitle = null;
	private WebElement selectStoreTab = null;
	private WebElement assignItemTab = null;
	private WebElement reviewSaveTab = null;
	private WebElement filterByEditbox = null;
	private WebElement storeInfoMessage = null;
	private WebElement selectAllLink = null;
	private WebElement clearAllLink = null;
	private WebElement nextButton = null;
	private WebElement storeNameCheckbox = null;
	
	public CreateAssortmentSelectStorePageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement pageTitle(){
		pageTitle = driver.findElement(By.xpath("//div[@class='header_gray']//td[@class='header_title']"));
		return pageTitle;
	}
	
	public WebElement selectStoreTab(){
		selectStoreTab = driver.findElement(By.xpath("(//div[contains(@class, 'subbox_a_')])[1]"));
		return selectStoreTab;
	}
	
	public WebElement assignItemTab(){
		assignItemTab = driver.findElement(By.xpath("(//div[contains(@class, 'subbox_a_')])[2]"));
		return assignItemTab;
	}
	
	public WebElement reviewSaveTab(){
		reviewSaveTab = driver.findElement(By.xpath("(//div[contains(@class, 'subbox_a_')])[3]"));
		return reviewSaveTab;
	}
	
	public WebElement filterByEditbox(){
		filterByEditbox = driver.findElement(By.id("filter"));
		return filterByEditbox;
	}
	
	public WebElement storeInfoMessage(){
		storeInfoMessage = driver.findElement(By.xpath("//div[@class='store_info']//h2"));
		return storeInfoMessage;
	}
	
	public WebElement selectAllLink(){
		selectAllLink = driver.findElement(By.linkText("Select All"));
		return selectAllLink;
	}
	
	public WebElement clearAllLink(){
		clearAllLink = driver.findElement(By.linkText("Clear All"));
		return clearAllLink;
	}
	
	public WebElement nextButton(){
		nextButton = driver.findElement(By.xpath("//div[@class='sub_floatright']/input"));
		return nextButton;
	}
	
	public WebElement storeNameCheckbox(String zip){
		storeNameCheckbox = driver.findElement(By.xpath("//div[@class='list_data']//tr[contains(@class, 'list_row_')]" +
												"//td[contains(text(), '"+ zip +"')]/..//input"));
		return storeNameCheckbox;
	}

}

