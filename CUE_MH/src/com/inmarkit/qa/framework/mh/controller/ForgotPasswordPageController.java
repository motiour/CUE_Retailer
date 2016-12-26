package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.WebDriver;

import com.inmarkit.qa.framework.mh.model.ForgotPasswordPageModel;

public class ForgotPasswordPageController extends MHControllerBase{

	ForgotPasswordPageModel forgotPassword = null;
	public ForgotPasswordPageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		forgotPassword = new ForgotPasswordPageModel(driver);
	}
	
	public String getPageTitle(){
		String page = forgotPassword.pageTitle().getText();
		return page;
	}
	
	public String getErrorMessage(){
		String msg = forgotPassword.errorMessage().getText();
		return msg;
	}
	
	public void enterEmailAndSend(String email){
		if(email != null){
			forgotPassword.emailEditbox().sendKeys(email);
		}
		
		forgotPassword.sendMeButton().click();
		delayFor(2000);
	}

}
