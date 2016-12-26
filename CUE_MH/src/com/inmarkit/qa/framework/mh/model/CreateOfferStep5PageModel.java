package com.inmarkit.qa.framework.mh.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateOfferStep5PageModel extends MHModelBase{

	private WebElement bothRadioButton = null;
	private WebElement maleRadioButton = null;
	private WebElement femaleRadioButton = null;
	private WebElement ageFromEditbox = null;
	private WebElement ageToEditbox = null;
	private WebElement regionCombobox = null;
	private WebElement cityNameEditbox = null;
	private WebElement nextButton = null;
	private WebElement prevButton = null;
	
	public CreateOfferStep5PageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement bothRadioButton(){
		bothRadioButton = driver.findElement(By.id("gender_B"));
		return bothRadioButton;
	}
	
	public WebElement maleRadioButton(){
		maleRadioButton = driver.findElement(By.id("gender_M"));
		return maleRadioButton;
	}
	
	public WebElement femaleRadioButton(){
		femaleRadioButton = driver.findElement(By.id("gender_F"));
		return femaleRadioButton;
	}
	
	public WebElement ageFromEditbox(){
		ageFromEditbox = driver.findElement(By.id("age_from"));
		return ageFromEditbox;
	}
	
	public WebElement ageToEditbox(){
		ageToEditbox = driver.findElement(By.id("age_to"));
		return ageToEditbox;
	}
	
	public WebElement regionCombobox(){
		regionCombobox = driver.findElement(By.xpath("//select[@id='selected_region']"));
		return regionCombobox;
	}
		
	public WebElement cityNameEditbox(){
		cityNameEditbox = driver.findElement(By.id("cities"));
		return cityNameEditbox;
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
