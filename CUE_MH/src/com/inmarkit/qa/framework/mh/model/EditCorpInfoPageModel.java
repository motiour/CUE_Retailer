package com.inmarkit.qa.framework.mh.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditCorpInfoPageModel extends MHModelBase{

	
	private WebElement pageHeader = null;
	private WebElement merchantNameEditbox = null;
	private WebElement homePageEditbox = null;
	private WebElement faqEditbox = null;
	private WebElement uploadLogoEditbox = null;
	private WebElement browseButton = null;
	private WebElement logoUrlEditbox = null;
	private WebElement twitterHandleEditbox = null;
	private WebElement fbPageUrlEditbox = null;
	private WebElement defaultRadioButton = null;
	private WebElement textRadioButton = null;
	private WebElement someTextEditbox = null;
	private WebElement imageRadioButton = null;
	private WebElement imageBrowseEditbox = null;
	private WebElement imageBrowseButton = null;
	private WebElement submitButton = null;
	private WebElement googleAnalyticsCheckbox = null;
	
	public EditCorpInfoPageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement pageHeader(){
		pageHeader = driver.findElement(By.xpath("//div[@class='header_gray']//td[@class='header_title']"));
		return pageHeader;
	}
	
	public WebElement merchantNameEditbox(){
		merchantNameEditbox = driver.findElement(By.id("r_name"));
		return merchantNameEditbox;
	}
	
	public WebElement homePageEditbox(){
		homePageEditbox = driver.findElement(By.id("home"));
		return homePageEditbox;
	}
	
	public WebElement faqEditbox(){
		faqEditbox = driver.findElement(By.id("imi_faq_url"));
		return faqEditbox;
	}
	
	public WebElement uploadLogoEditbox(){
		uploadLogoEditbox = driver.findElement(By.id("custom_logo"));
		return uploadLogoEditbox;
	}
	
	public WebElement browseButton(){
		browseButton = driver.findElement(By.id("custom_logo"));
		return browseButton;
	}
	
	public WebElement logoUrlEditbox(){
		logoUrlEditbox = driver.findElement(By.id("logo_url"));
		return logoUrlEditbox;
	}
	
	public WebElement twitterHandleEditbox(){
		twitterHandleEditbox = driver.findElement(By.id("twitter_name"));
		return twitterHandleEditbox;
	}
	
	public WebElement fbPageUrlEditbox(){
		fbPageUrlEditbox = driver.findElement(By.id("facebook_page"));
		return fbPageUrlEditbox;
	}
	
	public WebElement defaultRadioButton(){
		defaultRadioButton = driver.findElement(By.id("greeting_type_default"));
		return defaultRadioButton;
	}
	
	public WebElement textRadioButton(){
		textRadioButton = driver.findElement(By.id("greeting_type_text"));
		return textRadioButton;
	}
	
	public WebElement someTextEditbox(){
		someTextEditbox = driver.findElement(By.id("greeting_text"));
		return someTextEditbox;
	}
	
	public WebElement imageRadioButton(){
		imageRadioButton = driver.findElement(By.id("greeting_type_img"));
		return imageRadioButton;
	}
	
	public WebElement imageBrowseEditbox(){
		imageBrowseEditbox = driver.findElement(By.id("greeting_image"));
		return imageBrowseEditbox;
	}
	
	public WebElement imageBrowseButton(){
		imageBrowseButton = driver.findElement(By.id("greeting_image"));
		return imageBrowseButton;
	}
	
	public WebElement googleAnalyticsCheckbox(){
		googleAnalyticsCheckbox = driver.findElement(By.id("analytics_service_ga"));
		return googleAnalyticsCheckbox;
	}
	
	public WebElement submitButton(){
		submitButton = driver.findElement(By.id("submit"));
		return submitButton;
	}
	

}
