


package com.inmarkit.qa.framework.mh.controller;


import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.RemoteWebElement;

import org.testng.Assert;

import com.inmarkit.qa.framework.mh.model.MHHomePageModel;


public class MHHomePageController extends MHControllerBase{

	MHHomePageModel homeTabPage = null;

	public MHHomePageController(WebDriver driver) {
		super(driver);
	
	// TODO Auto-generated constructor stub
		homeTabPage = new MHHomePageModel(driver);

	}
	
	public String getPageTitle(){
		String page = homeTabPage.pageTitle().getText();
		return page;
	}
	
	public void verifyLinkExistByText(String linkText){
		
		List<WebElement> links = homeTabPage.pageLinks();
    	for (WebElement link : links){
    		String elementText = link.getText();
    		if(elementText.contains(linkText)){
    			Assert.assertTrue(true);
    		}
    	}
	}
	
	public void verifyLinkExistByT(String linkText){
		Boolean found = false;
		List<WebElement> links = homeTabPage.pageLinks();
    	for (WebElement link : links){
    		String elementText = link.getText();
    		if(elementText.contains(linkText)){
    			found = true;
    			break;
    		}
    	}
    	
    	Assert.assertTrue(found);
	}
	
	
	
	public void clickAboutInmarkitUpperMenu(){
		homeTabPage.aboutInmarkitUpper().click();
		delayFor(2000);
	}
	
	public void logoutApplication(){
		homeTabPage.logoutLink().click();
		delayFor(2000);
	}
	
	public void clickHelpUpperMenu(){
		homeTabPage.helpLinkUpper().click();
		delayFor(2000);
	}
	
	public void clickContactUsUpperMenu(){
		homeTabPage.contactUsUpper().click();
		delayFor(2000);
	}

	
	public void clickUserGuideUpperMenu(){
		homeTabPage.userGuideUpper().click();
		delayFor(2000);
	}
	
	public void clickManageItemslink(){
		homeTabPage.manageItemLink().click();
		delayFor(3000);
	}
	
	public void clickManageAssortmentlink(){
		homeTabPage.manageAssortmentLink().click();
		delayFor(3000);
	}
	
	public void clickManageOfferslink(){
		homeTabPage.manageOffersLink().click();
		delayFor(3000);
	}
	
	public void clickQuickStartGuideLink(){
		homeTabPage.quickStartGuideLink().click();
		delayFor(3000);
	}
	
	public void clicManageCorporateUserAccountLink(){
		homeTabPage.corporateUserAccountLink().click();
		delayFor(3000);
	}
	
	public void clicViewHelpFAQLink(){
		homeTabPage.viewHelpLink().click();
		delayFor(3000);
	}
	
	public void clicContactCustomerServiceLink(){
		homeTabPage.customerServiceLink().click();
		delayFor(3000);
	}
	
	public void clickHeaderTab(String tabname){
		homeTabPage.headerTab(tabname).click();
		delayFor(3000);
	}
	
	public void waitForObject(String objId){
		long end = System.currentTimeMillis() + 5000;
		while (System.currentTimeMillis() < end) {
		    // Browsers which render content (such as Firefox and IE) return "RenderedWebElements"
		    RemoteWebElement resultsDiv = (RemoteWebElement) driver.findElement(By.id(objId));

		    // If results have been returned, the results are displayed in a drop down.
		    if (resultsDiv.isDisplayed()) {
		      break;
		    }
		}

	}
	
	public String getLinkNameByText(String linkname){
		
		List<WebElement> links = homeTabPage.pageLinks();
    	//String value = ((WebElement) connection).getAttribute("className");
    	for (WebElement link : links){
    		String value = link.getAttribute("className");
//    		if(value.trim().contentEquals("imi-provider connected")){
//    			nConn.click(); 
//        		delayFor(4000);
//        		driver.switchTo().alert().accept();
//        		delayFor(2000);
//        		
//        	}
    	}
		return linkname;
    	
    }
	
	public void clickAboutInmarkitLowerMenu(){
		homeTabPage.aboutInmarkitLower().click();
		delayFor(2000);
	}
	
	public void inmarkitBlog(){
		homeTabPage.inmarkitBlog().click();
		delayFor(2000);
	}
	
	public void clickContactUsLowerMenu(){
		homeTabPage.contactUsLower().click();
		delayFor(2000);
	}
	

	public void clickPrivacyPolicy(){
		homeTabPage.privacyPolicy().click();
		delayFor(2000);
	}
	

	public void clickTermsOfUse(){
		homeTabPage.termsOfUse().click();
		delayFor(2000);
	}
	
	
	public void clickHelpLowerMenu(){
		homeTabPage.helpLinkLower().click();
		delayFor(2000);
	}
	

}
