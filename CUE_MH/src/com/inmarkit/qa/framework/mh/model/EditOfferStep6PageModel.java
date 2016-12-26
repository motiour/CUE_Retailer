package com.inmarkit.qa.framework.mh.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditOfferStep6PageModel extends MHModelBase{

	private WebElement offerName = null;
	private WebElement offerSmsName = null;
	private WebElement offerDesc = null;
	private WebElement offerSmsDesc = null;
	private WebElement offerType = null;
	private WebElement offerUrl = null;
	private WebElement offerTag = null;
	private WebElement dateRange = null;
	private WebElement gender = null;
	private WebElement ageRange = null;
	private WebElement region = null;
	private WebElement confirmButton = null;
	private WebElement previewMobileButton = null;
		
	public EditOfferStep6PageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public WebElement offerName(){
		offerName = driver.findElement(By.xpath("(//div[@class='store_info']//tr[3]//td[1])[1]"));
		return offerName;
	}
	
	public WebElement offerSmsName(){
		offerSmsName = driver.findElement(By.xpath("(//div[@class='store_info']//tr[3]//td[2])[1]"));
		return offerSmsName;
	}
	
	public WebElement offerDesc(){
		offerDesc = driver.findElement(By.xpath("//div[@class='store_info']//tr[6]/td[1]"));
		return offerDesc;
	}
	
	public WebElement offerSmsDesc(){
		offerSmsDesc = driver.findElement(By.xpath("//div[@class='store_info']//tr[6]/td[2]"));
		return offerSmsDesc;
	}
	
	public WebElement offerType(){
		offerType = driver.findElement(By.xpath("//div[@class='store_info']//tr[8]/th/b"));
		return offerType;
	}
	
	public WebElement offerUrl(){
		offerUrl = driver.findElement(By.xpath("//div[@class='store_info']//tr[13]/td"));
		return offerUrl;
	}
	
	public WebElement offerTag(){
		offerTag = driver.findElement(By.xpath("//div[@class='store_info']//tr[21]/td"));
		return offerTag;
	}
	
	public WebElement dateRange(){
		dateRange = driver.findElement(By.xpath("//div[@class='store_info']//tr[24]/td"));
		return dateRange;
	}
	
	public WebElement gender(){
		gender = driver.findElement(By.xpath("(//div[@class='store_info']//tr[24]/td)[3]"));
		return gender;
	}
	
	public WebElement ageRange(){
		ageRange = driver.findElement(By.xpath("//div[@class='store_info']//table[5]//tr[3]/td"));
		return ageRange;
	}
	
	public WebElement region(){
		region = driver.findElement(By.xpath("//div[@class='store_info']//table[5]//tr[4]/td"));
		return region;
	}
	
	public WebElement confirmButton(){
		confirmButton = driver.findElement(By.xpath("//div[@class='store_info']//form[@id='w1form']/input[@class='bigbutton']"));
		return confirmButton;
	}
	
	public WebElement previewMobileButton(){
		previewMobileButton = driver.findElement(By.xpath("//div[@class='store_info']//form[@id='w1form']/a[@class='reviewb']"));
		return previewMobileButton;
	}

}
