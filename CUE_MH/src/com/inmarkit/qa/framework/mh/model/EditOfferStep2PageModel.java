package com.inmarkit.qa.framework.mh.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditOfferStep2PageModel extends MHModelBase{

	private WebElement pageTitle = null;
	private WebElement filterByEditbox = null;
	private WebElement storeInfoMessage = null;
	private WebElement selectAllLink = null;
	private WebElement clearAllLink = null;
	private WebElement nextButton = null;
	private WebElement prevButton = null;
	private WebElement storeNameCheckbox = null;
	private WebElement storeName = null;
	private WebElement location = null;
	private WebElement region = null;
	private WebElement zipcode = null;
	private WebElement selectCityComboBox = null;
					
	public EditOfferStep2PageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement pageTitle(){
		pageTitle = driver.findElement(By.xpath("//div[@class='header_gray']//td[@class='header_title']"));
		return pageTitle;
	}
	
	public WebElement selectCityComboBox(){
		selectCityComboBox = driver.findElement(By.id("select_city"));
		return selectCityComboBox;
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
	
	public WebElement prevButton(){
		prevButton = driver.findElement(By.xpath("//div[@class='sub_floatleft']/input"));
		return prevButton;
	}
	
	public WebElement storeNameCheckbox(String storename){
		storeNameCheckbox = driver.findElement(By.xpath("//div[@class='list_data']//tr[contains(@class, 'list_row_')]" +
												"/td[contains(text(), '"+ storename +"')]/..//input"));
												
		return storeNameCheckbox;
	}
	
	public WebElement storeName(String zip){
		storeName = driver.findElement(By.xpath("//div[@class='list_data']//tr[contains(@class, 'list_row_')]" +
												"/td[contains(text(), '"+ zip +"')]/..//td[2]"));											
		return storeName;
	}
	
	public WebElement location(String zip){
		location = driver.findElement(By.xpath("//div[@class='list_data']//tr[contains(@class, 'list_row_')]" +
												"/td[contains(text(), '"+ zip +"')]/..//td[3]"));
												
		return location;
	}
	
	public WebElement region(String zip){
		region = driver.findElement(By.xpath("//div[@class='list_data']//tr[contains(@class, 'list_row_')]" +
												"/td[contains(text(), '"+ zip +"')]/..//td[4]"));
												
		return region;
	}
	
	public WebElement zipcode(String storename){
		zipcode = driver.findElement(By.xpath("//div[@class='list_data']//tr[contains(@class, 'list_row_')]" +
												"/td[contains(text(), '"+ storename +"')]/..//td[5]"));
												
		return zipcode;
	}

}

