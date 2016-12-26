package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.WebDriver;

import com.inmarkit.qa.framework.mh.model.MHProfileTabPageModel;

public class MHProfileTabPageController extends MHControllerBase{

	MHProfileTabPageModel profileTabPage = null;
	public MHProfileTabPageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		profileTabPage = new MHProfileTabPageModel(driver);
	}
	
	public String getPageTitle(){
		String page = profileTabPage.pageTitle().getText();
		return page;
	}
	
	public void selectTab(String tabName){
		if(tabName != null){
			profileTabPage.profileTabs(tabName).click();
			delayFor(2000);
		}
	}

}
