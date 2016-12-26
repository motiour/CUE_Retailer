package com.inmarkit.qa.framework.mh.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditOfferStep1PageModel extends MHModelBase{

	private WebElement pageTitle = null;
	private WebElement nextStepButton = null;
	private WebElement offerName = null;
	private WebElement smsofferName = null;
	private WebElement offerDescription = null;
	private WebElement smsOfferDescription = null;
	private WebElement offerTag = null;
	private WebElement yesSharableCheckbox = null;
	private WebElement useLocaidCheckbox = null;
	private WebElement attachImageEditbox = null;
	private WebElement offerCodeEditbox = null;
	private WebElement barcodeImageEditbox = null;
	private WebElement barcodeEncodeBox = null;
	private WebElement generateBarcodeCheckbox = null;
	private WebElement offerUrlEditbox = null;
	private WebElement dateFromEditbox = null;
	private WebElement dateToEditbox = null;
	
	public EditOfferStep1PageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement pageTitle(){
		pageTitle = driver.findElement(By.xpath("//div[@class='header_gray']//td[@class='header_title']"));
		return pageTitle;
	}
	
	public WebElement nextStepButton(){
		nextStepButton = driver.findElement(By.xpath("//div[@class='sub_floatright']/input"));
		return nextStepButton;
	}
	
	public WebElement offerName(){
		offerName = driver.findElement(By.id("promo_name"));
		return offerName;
	}
	
	public WebElement smsofferName(){
		smsofferName = driver.findElement(By.id("promo_sms_name"));
		return smsofferName;
	}
	
	public WebElement offerDescription(){
		offerDescription = driver.findElement(By.id("promo_description"));
		return offerDescription;
	}
	
	public WebElement smsOfferDescription(){
		smsOfferDescription = driver.findElement(By.id("promo_sms_desc"));
		return smsOfferDescription;
	}
	
	public WebElement offerTag(){
		offerTag = driver.findElement(By.id("tags"));
		return offerTag;
	}
	
	public WebElement yesSharableCheckbox(){
		yesSharableCheckbox = driver.findElement(By.id("shareable"));
		return yesSharableCheckbox;
	}
	
	public WebElement useLocaidCheckbox(){
		useLocaidCheckbox = driver.findElement(By.id("locaid"));
		return useLocaidCheckbox;
	}
	
	public WebElement attachImageEditbox(){
		attachImageEditbox = driver.findElement(By.id("promo_primary_img"));
		return attachImageEditbox;
	}
	
	public WebElement offerCodeEditbox(){
		offerCodeEditbox = driver.findElement(By.id("promo_promo_code"));
		return offerCodeEditbox;
	}
	
	public WebElement barcodeImageEditbox(){
		barcodeImageEditbox = driver.findElement(By.id("promo_barcode_img"));
		return barcodeImageEditbox;
	}
	
	public WebElement barcodeEncodeBox(){
		barcodeEncodeBox = driver.findElement(By.id("barcode_data"));
		return barcodeEncodeBox;
	}
	
	public WebElement generateBarcodeCheckbox(){
		generateBarcodeCheckbox = driver.findElement(By.id("generate_barcode"));
		return generateBarcodeCheckbox;
	}

	public WebElement offerUrlEditbox(){
		offerUrlEditbox = driver.findElement(By.id("promo_url"));
		return offerUrlEditbox;
	}
	
	public WebElement dateFromEditbox(){
		dateFromEditbox = driver.findElement(By.id("daterange_from"));
		return dateFromEditbox;
	}
	
	public WebElement dateToEditbox(){
		dateToEditbox = driver.findElement(By.id("daterange_to"));
		return dateToEditbox;
	}
	
	

}
