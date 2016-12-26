package com.inmarkit.qa.framework.mh.model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultimediaManagerPageModel extends MHModelBase{

	private WebElement pageTitle = null;
	private WebElement totalMultimdiaFiles = null;
	private WebElement uploadButton = null;
	private WebElement deleteSelectedButton = null;
	private WebElement filterByEditbox = null;
	private WebElement selectAllLink = null;
	private WebElement clearSelectedLink = null;
	private WebElement viewComboSelect = null;
	private WebElement selectAllCheckbox = null;
	private WebElement mediaCheckbox = null;
	private List<WebElement> mediaDescriptions = null;
	
	public MultimediaManagerPageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebElement pageTitle(){
		pageTitle = driver.findElement(By.xpath("//div[@class='header_gray']//td[@class='header_title']"));
		return pageTitle;
	}
	
	public WebElement totalMultimdiaFiles(){
		totalMultimdiaFiles = driver.findElement(By.xpath("//div[@class='store_info']//h2"));
		return totalMultimdiaFiles;
	}
	
	public WebElement uploadButton(){
		uploadButton = driver.findElement(By.xpath("//div[@class='store_info']//input"));
		return uploadButton;
	}
	
	public WebElement deleteSelectedButton(){
		deleteSelectedButton = driver.findElement(By.xpath("//div[@class='list_header_big']//input[@class='search']"));
		return deleteSelectedButton;
	}
	
	public WebElement filterByEditbox(){
		filterByEditbox = driver.findElement(By.xpath("//div[@class='list_header_big']//input[@class='list_filter']"));
		return filterByEditbox;
	}
	
	public WebElement selectAllLink(){
		selectAllLink = driver.findElement(By.xpath("//div[@class='list_header_big']//a[text()='Select All']"));
		return selectAllLink;
	}
	
	public WebElement clearSelectedLink(){
		clearSelectedLink = driver.findElement(By.xpath("//div[@class='list_header_big']//a[text()='Clear Selected']"));
		return clearSelectedLink;
	}
	
	public WebElement viewComboSelect(){
		viewComboSelect = driver.findElement(By.xpath("//div[@class='list_header_big']//select[@class='viewby']"));
		return viewComboSelect;
	}
	
	public WebElement selectAllCheckbox(){
		selectAllCheckbox = driver.findElement(By.xpath("//div[@class='rcol']//table[@class='list']//th/input"));
		return selectAllCheckbox;
	}
	
	public WebElement mediaCheckbox(String desc){
		mediaCheckbox = driver.findElement(By.xpath("//div[@class='list_data']/table/tbody/tr[contains(@class, 'list_row_')]" +
													"/td[contains(text(), '"+ desc +"')]/..//input[@class='mmitems']"));
		return mediaCheckbox;
	}
	
	public List<WebElement> mediaDescriptions(){
        mediaDescriptions = driver.findElements(By.xpath("//div[@class='list_data']//tr[contains(@id, 'row')]/..//td[4]"));
        return mediaDescriptions;
    }

	
	
}
