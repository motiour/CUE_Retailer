
package com.inmarkit.qa.framework.mh.model;

import java.util.List;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;


public class MHHomePageModel extends MHModelBase{

	private WebElement pageTitle = null;
	private WebElement aboutInmarkitUpper = null;
	private WebElement userGuideUpper = null;
	private WebElement helpLinkUpper = null;
	private WebElement contactUsUpper = null;
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
	private WebElement aboutInmarkitLower = null;
	private WebElement inmarkitBlog = null;
	private WebElement contactUsLower = null;
	private WebElement privacyPolicy = null;
	private WebElement termsOfUse = null;
	private WebElement helpLinkLower = null;
	
	public MHHomePageModel(WebDriver driver) {
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
	
	public WebElement aboutInmarkitUpper(){
		aboutInmarkitUpper = driver.findElement(By.xpath("//div[@class='topright']/a[1]"));
		return aboutInmarkitUpper;
	}
	
	public WebElement userGuideUpper(){
		userGuideUpper = driver.findElement(By.xpath("//div[@class='topright']/a[2]"));
		return userGuideUpper;
	}
	
	public WebElement helpLinkUpper(){
		helpLinkUpper = driver.findElement(By.xpath("//div[@class='topright']/a[3]"));
		return helpLinkUpper;
	}
	
	public WebElement contactUsUpper(){
		contactUsUpper = driver.findElement(By.xpath("//div[@class='topright']/a[4]"));
		return contactUsUpper;
	}
	
	public WebElement logoutLink(){
		logoutLink = driver.findElement(By.xpath("//div[@class='topright']/a[5]"));
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
	
	public WebElement aboutInmarkitLower(){
		aboutInmarkitLower = driver.findElement(By.xpath("//div[@class='foot']//a[2]"));
		return aboutInmarkitLower;
	}
	
	public WebElement inmarkitBlog(){
		inmarkitBlog = driver.findElement(By.xpath("//div[@class='foot']//a[3]"));
		return inmarkitBlog;
	}
	
	public WebElement contactUsLower(){
		contactUsLower = driver.findElement(By.xpath("//div[@class='foot']//a[4]"));
		return contactUsLower;
	}
	
	public WebElement privacyPolicy(){
		privacyPolicy = driver.findElement(By.xpath("//div[@class='foot']//a[5]"));
		return privacyPolicy;
	}
	
	public WebElement termsOfUse(){
		termsOfUse = driver.findElement(By.xpath("//div[@class='foot']//a[6]"));
		return termsOfUse;
	}
	
	public WebElement helpLinkLower(){
		helpLinkLower = driver.findElement(By.xpath("//div[@class='foot']//a[7]"));
		return helpLinkLower;
	}

}
