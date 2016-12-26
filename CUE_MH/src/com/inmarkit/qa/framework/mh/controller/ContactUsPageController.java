

package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.inmarkit.qa.framework.mh.model.ContactUsPageModel;

public class ContactUsPageController extends MHControllerBase{

	ContactUsPageModel contactUs = null;
	public ContactUsPageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		contactUs = new ContactUsPageModel(driver);
	}
	
	public String getPageTitle(){
		String page = contactUs.pageTitle().getText();
		return page;
	}
	
	public void clickOurFAQLink(){
		contactUs.ourFAQsLink().click();
		delayFor(2000);
	}
	
	public void enterContactUsInformation(String topic, String name, String loginname, 
										String company, String subject, String comments){
		
		if(topic != null){
			Select select = new Select(contactUs.chooseTopicsCombobox());
			select.selectByVisibleText(topic);
		}
		
		if(name != null){
			contactUs.nameEditbox().clear();
			contactUs.nameEditbox().sendKeys(name);
			delayFor(100);
		}
		
		if(loginname != null){
			contactUs.loginNameEditbox().clear();
			contactUs.loginNameEditbox().sendKeys(loginname);
			delayFor(100);
		}
		
		if(company != null){
			contactUs.companyEditbox().clear();
			contactUs.companyEditbox().sendKeys(company);
			delayFor(100);
		}
		
		if(comments != null){
			contactUs.commentsEditbox().clear();
			contactUs.commentsEditbox().sendKeys(comments);
			delayFor(100);
		}
		
		contactUs.submitButton().click();
		delayFor(3000);
		
	}

}
