package com.inmarkit.qa.framework.mh.model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditOfferStep3PageModel extends MHModelBase{

	private WebElement totalItemMsg = null;
	private WebElement selectAllThisPageLink = null;
	private WebElement clearAllThisPageLink = null;
	private WebElement selectAllAllPageLink = null;
	private WebElement clearAllAllPageLink = null;
	private WebElement uploadToSelectedButton = null;
	private WebElement attachToSelectedButton = null;
	private WebElement filterByEditbox = null;
	private WebElement selectBrandCombobox = null;
	private WebElement checkboxByMarkitcode = null;
	private WebElement nextButton = null;
	private WebElement prevButton = null;
	private WebElement itemName = null;
	private WebElement brandName = null;
	private List<WebElement> checkboxes = null;
	
	public EditOfferStep3PageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebElement totalItemMsg(){
		totalItemMsg = driver.findElement(By.xpath("//div[@class='store_info']//h2"));
		return totalItemMsg;
	}
	
	public List<WebElement> checkboxes(){
		checkboxes = driver.findElements(By.xpath("//div[@class='list_data']//tr[contains(@id, 'row')]" +
																		"//a/../..//input"));
		return checkboxes;
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
	
	public WebElement checkboxByMarkitcode(String markitcode){
		checkboxByMarkitcode = driver.findElement(By.xpath("(//div[@class='list_data']//tr[contains(@id, 'row')]" +
													"//a[contains(text(), '"+markitcode+"')]/../..//input"));
		return checkboxByMarkitcode;
	}
	
	public WebElement itemName(String markitcode){
		itemName = driver.findElement(By.xpath("(//div[@class='list_data']//tr[contains(@id, 'row')]" +
													"//a[contains(text(), '"+markitcode+"')]/../../td[5]"));
		return itemName;
	}
	
	public WebElement brandName(String markitcode){
		brandName = driver.findElement(By.xpath("(//div[@class='list_data']//tr[contains(@id, 'row')]" +
													"//a[contains(text(), '"+markitcode+"')]/../../td[7]"));
		return brandName;
	}
	
	public WebElement filterByEditbox(){
		filterByEditbox = driver.findElement(By.id("filter"));
		return filterByEditbox;
	}
	
	public WebElement selectBrandCombobox(){
		selectBrandCombobox = driver.findElement(By.xpath("//div[@class='list_header_normal']//select[@id='filter_brand']"));
		return selectBrandCombobox;
	}
	
	public WebElement attachToSelectedButton(){
		attachToSelectedButton = driver.findElement(By.xpath("(//input[@class='search'][3]"));
		return attachToSelectedButton;
	}
	
	public WebElement nextButton(){
		nextButton = driver.findElement(By.xpath("(//div[@class='sub_floatright']/input)[1]"));
		return nextButton;
	}
	
	public WebElement prevButton(){
		prevButton = driver.findElement(By.xpath("(//div[@class='sub_floatleft']/input)[2]"));
		return prevButton;
	}

}
