package com.inmarkit.qa.framework.mh.model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MHHomeTabModel extends MHModelBase{

	private WebElement pageTitle = null;
	private WebElement aboutInmarkitLink = null;
	private WebElement userGuideLink = null;
	private WebElement helpLink = null;
	private WebElement contactUsLink = null;
	private WebElement logoutLink = null;
	private WebElement manageItemLink = null;
	private WebElement manageAssortmentLink = null;
	private WebElement manageOffersLink = null;
	private WebElement quickStartGuideLink = null;
	private WebElement corporateUserAccountLink = null;
	private WebElement viewHelpLink = null;
	private WebElement customerServiceLink = null;
	private List<WebElement> menuLinks = null;
	private List<WebElement> bodyLinks = null;
	private List<WebElement> pageLinks = null;
	private WebElement headerTab = null;
	
	public MHHomeTabModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement headerTab(String tabName){
		headerTab = driver.findElement(By.xpath("//div[@class='topbutton']/a/img[@alt='"+ tabName +"']"));
		return headerTab;
	}
	
	public List<WebElement> pageLinks(){
		pageLinks = driver.findElements(By.xpath("//div[@class='wrap']/a"));
		return pageLinks;
	}
	
	public List<WebElement> menuLinks(){
		menuLinks = driver.findElements(By.xpath("//div[@class='topright']/a"));
		return menuLinks;
	}
	
	public List<WebElement> bodyLinks(){
		bodyLinks = driver.findElements(By.xpath("//div[@class='rcol']/a"));
		return bodyLinks;
	}
	
	public WebElement pageTitle(){
		pageTitle = driver.findElement(By.xpath("//div[@class='header_gray']//td[@class='header_title']"));
		return pageTitle;
	}
	
	public WebElement aboutInmarkitLink(){
		aboutInmarkitLink = driver.findElement(By.linkText("About InMarkit"));
		return aboutInmarkitLink;
	}
	
	public WebElement userGuideLink(){
		userGuideLink = driver.findElement(By.linkText("User Guide"));
		return userGuideLink;
	}
	
	public WebElement helpLink(){
		helpLink = driver.findElement(By.linkText("Help"));
		return helpLink;
	}
	
	public WebElement contactUsLink(){
		contactUsLink = driver.findElement(By.linkText("Contact Us"));
		return contactUsLink;
	}
	
	public WebElement logoutLink(){
		logoutLink = driver.findElement(By.linkText("Logout"));
		return logoutLink;
	}
	
	public WebElement manageItemLink(){
		manageItemLink = driver.findElement(By.linkText("Manage Items"));
		return manageItemLink;
	}
	
	public WebElement manageAssortmentLink(){
		manageAssortmentLink = driver.findElement(By.linkText("Manage Assortments"));
		return manageAssortmentLink;
	}
	
	public WebElement manageOffersLink(){
		manageOffersLink = driver.findElement(By.linkText("Manage Offers"));
		return manageOffersLink;
	}
	
	public WebElement quickStartGuideLink(){
		quickStartGuideLink = driver.findElement(By.linkText("Quick Start Guide"));
		return quickStartGuideLink;
	}
	
	public WebElement corporateUserAccountLink(){
		corporateUserAccountLink = driver.findElement(By.linkText("Manage Your Corporate User Accounts"));
		return corporateUserAccountLink;
	}
	
	public WebElement viewHelpLink(){
		viewHelpLink = driver.findElement(By.linkText("View Help / FAQ"));
		return viewHelpLink;
	}
	
	public WebElement customerServiceLink(){
		customerServiceLink = driver.findElement(By.linkText("Contact Customer Service"));
		return customerServiceLink;
	}

}
