package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.WebDriver;

import com.inmarkit.qa.framework.mh.model.NewUserFormPageModel;

public class NewUserFormPageController extends MHControllerBase{

	NewUserFormPageModel newUserForm = null;
	public NewUserFormPageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		newUserForm = new NewUserFormPageModel(driver);
	}
	
	public String getPageTitle(){
		String page = newUserForm.pageTitle().getText();
		return page;
	}
	
	public void enterNewUserInformation(String name, String title, String email){
		if(name != null){
			newUserForm.nameEditbox().sendKeys(name);
			delayFor(100);
		}
		
		if(title != null){
			newUserForm.titleEditbox().sendKeys(title);
			delayFor(100);
		}
		
		if(email != null){
			newUserForm.emailEditbox().sendKeys(email);
			delayFor(100);
		}
		
		newUserForm.submitButton().click();
		delayFor(3000);
		
	}
	
	public String getSentMessage(){
		String message = newUserForm.sentMessage().getText();
		return message;
	}
	

}
