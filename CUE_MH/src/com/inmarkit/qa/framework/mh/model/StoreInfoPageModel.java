package com.inmarkit.qa.framework.mh.model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StoreInfoPageModel extends MHModelBase{
	
	private WebElement pageHeader = null;
	private WebElement activeStoreInfo = null;
	private List<WebElement> rowInfo = null;
	private WebElement region = null;
	private WebElement zipCode = null;
	private WebElement filterEditbox = null;
	private WebElement offersCombobox = null;
	private WebElement storeName = null;
	private WebElement location = null;
	private List<WebElement> stores = null;

	public StoreInfoPageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebElement pageHeader(){
		pageHeader = driver.findElement(By.xpath("//div[@class='header_gray']//td[@class='header_title']"));
		return pageHeader;
	}
	
	public WebElement activeStoreInfo(){
		activeStoreInfo = driver.findElement(By.xpath("//div[@class='store_info']/center/h2"));
		return activeStoreInfo;
	}
	
	public WebElement storeName(String zip){
		storeName = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[@class='list_data']" +
												"//td[contains(text(), '"+ zip +"')]/..//a"));
		return storeName;
	}
	
	public WebElement location(String zip){
		location = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[@class='list_data']" +
												"//td[contains(text(), '"+ zip +"')]/..//td[2]"));
		return location;
	}
	
	public WebElement region(String zip){
		region = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[@class='list_data']" +
												"//td[contains(text(), '"+ zip +"')]/..//td[3]"));
		return region;
	}
	
	public List<WebElement> rowInfo(){
		rowInfo = driver.findElements(By.xpath("//div[@class='list_data']//tr[contains(@class, 'list_row_')]/td"));
		return rowInfo;
	}
	
	public List<WebElement> stores(){
		stores = driver.findElements(By.xpath("//div[@class='list_data']//tr[contains(@class, 'list_row_')]/td[1]"));
		return stores;
	}
		
	public WebElement filterEditbox(){
		filterEditbox = driver.findElement(By.id("filter"));
		return filterEditbox;
	}
	
	public WebElement offersCombobox(String zipcode){
		offersCombobox = driver.findElement(By.xpath("//div[@class='list_data']//tr[contains(@class, 'list_row_')]" +
												"/td[contains(text(), '"+zipcode+"')]/../td/select"));
		return offersCombobox;
	}
	
	
}
