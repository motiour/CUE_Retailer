

package com.inmarkit.qa.framework.mh.model;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;


public class CorporateInfoPageModel extends MHModelBase
{

	private WebElement editCorporateInfoButton = null;
	
private WebElement pageHeader = null;
	
private WebElement editBillingButton = null;

	
	public CorporateInfoPageModel(WebDriver driver) 
{
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public WebElement editCorporateInfoButton()
{
		editCorporateInfoButton = driver.findElement(By.xpath("(//div[@class='partner_info_box']//a[@class='img_btn']/img)[1]"));
		return editCorporateInfoButton;
	}
	
	public WebElement editBillingButton(){
		editBillingButton = driver.findElement(By.xpath("(//div[@class='partner_info_box']//a[@class='img_btn']/img)[2]"));
		return editBillingButton;
	}
	
	public WebElement pageHeader(){
		pageHeader = driver.findElement(By.xpath("//div[@class='header_gray']//td[@class='header_title']"));
		return pageHeader;
	}

}
