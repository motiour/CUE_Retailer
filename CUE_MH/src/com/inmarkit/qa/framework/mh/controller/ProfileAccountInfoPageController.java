package com.inmarkit.qa.framework.mh.controller;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.inmarkit.qa.framework.mh.model.ProfileAccountInfoPageModel;

public class ProfileAccountInfoPageController extends MHControllerBase{

	private ProfileAccountInfoPageModel accountInfo = null;
	public ProfileAccountInfoPageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		accountInfo = new ProfileAccountInfoPageModel(driver);
	}
	
	public String getPageTitle(){
		String page = accountInfo.pageTitle().getText();
		return page;
	}
	
	public String getPartnerInfo(){
		String info = accountInfo.partnerInfo().getText();
		return info;
	}
		
	public String getPartnerName(){
		String name = accountInfo.name().getText();
		return name;
	}
	
	public String getPartnerTitle(){
		String title = accountInfo.title().getText();
		return title;
	}
	
	public String getPartnerPhone(){
		String phone = accountInfo.phone().getText();
		return phone;
	}
	
	public String getPartnerMobile(){
		String mobile = accountInfo.mobile().getText();
		return mobile;
	}
	
	public String getPartnerEmail(){
		String email = accountInfo.email().getText();
		return email;
	}
	
	public String getSavedMessage(){
		String msg = accountInfo.savedMsg().getText();
		return msg;
	}
	
	public void clickEditAccount(){
		accountInfo.editButton().click();
		delayFor(2000);
	}
	
	public void verifyAccountInformation(String pInfo){
		Boolean found = false;
		List<WebElement> infotext = accountInfo.yourInformation();
    	for (WebElement info : infotext){
    		String elementText = info.getText();
    		if(elementText.contains(pInfo)){
    			found = true;
    			break;
    		}
    	}
    	
    	Assert.assertTrue(found);
    	delayFor(1000);
	}
	

}
