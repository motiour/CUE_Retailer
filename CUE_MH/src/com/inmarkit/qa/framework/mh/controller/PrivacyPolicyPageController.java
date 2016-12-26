package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.WebDriver;

import com.inmarkit.qa.framework.mh.model.PrivacyPolicyPageModel;

public class PrivacyPolicyPageController extends MHControllerBase{

	PrivacyPolicyPageModel privacyPolicy = null;
	public PrivacyPolicyPageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		privacyPolicy = new PrivacyPolicyPageModel(driver);
	}
	
	public String getPageTitle(){
		String page = privacyPolicy.pageTitle().getText();
		return page;
	}

}
