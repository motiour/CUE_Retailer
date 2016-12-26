package com.inmarkit.qa.framework.mh.controller;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.inmarkit.qa.framework.mh.model.MHHelpPageModel;

public class MHHelpPageController extends MHControllerBase{

	MHHelpPageModel mhHelpPage = null;
	public MHHelpPageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		mhHelpPage = new MHHelpPageModel(driver);
	}
	
	public String getPageTitle(){
		String page = mhHelpPage.pageTitle().getText();
		return page;
	}
	
	public String getLinkText(String hname) {
    	
		String helpName = "Help link not found";
		List<WebElement> elements = mhHelpPage.totalLinks();
    	for(WebElement name : elements){
    		String linkText = name.getText(); 
    		System.out.println("Link Found: " + linkText);
    		if (linkText.contains(hname)){
    			helpName = linkText;
    			break;
    		}
    	}
    	return helpName;
    }

	public void verifyAncorLinkExistByText(String linkText){
		Boolean found = false;
		List<WebElement> links = mhHelpPage.totalLinks();
    	for (WebElement link : links){
    		String elementText = link.getText();
    		if(elementText.contains(linkText)){
    			link.click();
    			delayFor(1000);
    			String linkTag = link.getAttribute("href");
    			System.out.println(linkTag);
    			String acId =  linkTag.substring(linkTag.lastIndexOf("#") + 1);
    			 WebElement acLink =  driver.findElement(By.id(acId));
    			 if(acLink != null){
    				 found = true;
    			 }
    			break;
    		}
    	}
    	
    	Assert.assertTrue(found);
    	delayFor(1000);
	}
}
