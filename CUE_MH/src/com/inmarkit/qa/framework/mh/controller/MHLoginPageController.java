package com.inmarkit.qa.framework.mh.controller;


import junit.framework.Assert;


import org.openqa.selenium.WebDriver;


import com.inmarkit.qa.framework.mh.model.MHLoginPageModel;


public class MHLoginPageController extends MHControllerBase
{

	MHLoginPageModel mhLoginPage = null;



	public MHLoginPageController(WebDriver driver)
 {
		super(driver);
		mhLoginPage = new MHLoginPageModel(driver);
	}
	
	public String getPageTitle(){
		String page = mhLoginPage.pageTitle().getText();
		return page;
	}
	
	public void login(String email, String password){
		mhLoginPage.signInButton1().click();
		delayFor(3000);
		mhLoginPage.emailBox().sendKeys(email);
		delayFor(1000);
		mhLoginPage.passWordBox().sendKeys(password);
		delayFor(1000);
		mhLoginPage.signInButton2().click();
		delayFor(10000);
	}
	
	
	/*
	public void verifyErrorMessage(String msg){
		String error = mhLoginPage.errorMessage().getText();
		Assert.assertEquals(error, msg);
	}
	
	public String getErrorMessage(){
		String msg = mhLoginPage.errorMessage().getText();
		return msg;
	}
	
	public Boolean isSignUpButton(){
		Boolean button = mhLoginPage.signUpButton().isDisplayed();
		return button;
	}
	
	public Boolean isForgotPassword(){
		Boolean forgotpassword = mhLoginPage.forgotPassword().isDisplayed();
		return forgotpassword;
	}
	
	public void verifyForgotPasswordLink(){
		Boolean fPasswordLink = false;
		if(mhLoginPage.signUpButton().isDisplayed()){
			fPasswordLink = true;
		}
		Assert.assertTrue(fPasswordLink);
	}
	
	public void clickForgotPassword(){
		mhLoginPage.forgotPassword().click();
		delayFor(2000);
	}
	
	
	
	*/

}
