package com.inmarkit.qa.framework.mh.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MHProfileTabPageModel extends MHModelBase{

	private WebElement pageTitle = null;
	private WebElement profileTabs = null;
		
	public MHProfileTabPageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement pageTitle(){
		pageTitle = driver.findElement(By.xpath("//div[@class='header_gray']//td[@class='header_title']"));
		return pageTitle;
	}
	
	public WebElement profileTabs(String tabName){
		profileTabs = driver.findElement(By.xpath("//div[@class='submenu2']//img[@alt='"+ tabName +"']"));
		return profileTabs;
	}

}
