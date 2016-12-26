


package com.inmarkit.qa.framework.mh.model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssortmentManagerPageModel extends MHModelBase{

	private WebElement pageTitle = null;
	private WebElement assortmentTabs = null;
	private WebElement totalStoreItem = null;
	private WebElement filterByEditbox = null;
	private WebElement uploadAndAddLink = null;
	private WebElement editLink = null;
	private WebElement deleteAssortmentLink = null;
	private List<WebElement> storeName = null;
	private List<WebElement> location = null;
	private List<WebElement> region = null;
	private List<WebElement> zipCode = null;
	
	public AssortmentManagerPageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement pageTitle(){
		pageTitle = driver.findElement(By.xpath("//div[@class='header_gray']//td[@class='header_title']"));
		return pageTitle;
	}
	
	public WebElement assortmentTabs(String tabname){
		assortmentTabs = driver.findElement(By.xpath("//div[@class='tab']//img[@alt='"+tabname+"']"));
		return assortmentTabs;
	}
	
	public WebElement totalStoreItem(){
		totalStoreItem = driver.findElement(By.xpath("//div[@class='store_info']/center/h2"));
		return totalStoreItem;
	}
	
	public WebElement filterByEditbox(){
		filterByEditbox = driver.findElement(By.id("filter"));
		return filterByEditbox;
	}
	
	public WebElement uploadAndAddLink(){
		uploadAndAddLink = driver.findElement(By.xpath("//div[@class='list_header_normal']//a"));
		return uploadAndAddLink;
	}
	
	public WebElement editLink(String zipcode){
		editLink = driver.findElement(By.xpath("//div[@class='list_data']//tr[contains(@id, 'store')]" +
							"/td[contains(text(), '"+zipcode+"')]/../td/a[contains(text(), 'edit')]"));
		return editLink;
	}
	
	public WebElement deleteAssortmentLink(String zipcode){
		deleteAssortmentLink = driver.findElement(By.xpath("//div[@class='list_data']//tr[contains(@id, 'store')]" +
								"/td[contains(text(), '"+zipcode+"')]/../td/a[contains(text(), 'delete')]"));
		return deleteAssortmentLink;
	}
	
	public List<WebElement> storeName(){
		storeName = driver.findElements(By.xpath("//div[@class='list_data']//tr[contains(@id, 'store')]/td[1]/div"));
		return storeName;
	}
	
	public List<WebElement> location(){
		location = driver.findElements(By.xpath("//div[@class='list_data']//tr[contains(@id, 'store')]/td[2]"));
		return location;
	}
	
	public List<WebElement> region(){
		region = driver.findElements(By.xpath("//div[@class='list_data']//tr[contains(@id, 'store')]/td[3]"));
		return region;
	}
	
	public List<WebElement> zipCode(){
		zipCode = driver.findElements(By.xpath("//div[@class='list_data']//tr[contains(@id, 'store')]/td[4]"));
		return zipCode;
	}
	

}
