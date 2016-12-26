

package com.inmarkit.qa.framework.mh.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;


public class AboutInMarkitPageModel extends MHModelBase{

	private WebElement pageTitle = null;
	private WebElement assortmentTabs = null;
	public AboutInMarkitPageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement pageTitle(){
		pageTitle = driver.findElement(By.xpath("//div[@class='header_gray']//td[@class='header_title']"));
		return pageTitle;
	}

}
