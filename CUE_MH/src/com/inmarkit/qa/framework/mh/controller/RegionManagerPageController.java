package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.WebDriver;

import com.inmarkit.qa.framework.mh.model.RegionManagerPageModel;

public class RegionManagerPageController extends MHControllerBase{

	RegionManagerPageModel regionManager = null;
	public RegionManagerPageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		regionManager = new RegionManagerPageModel(driver);
	}
	
	public String getPageTitle(){
		String page = regionManager.pageTitle().getText();
		return page;
	}
	
	public void clickLoadExistingRegionLink(){
		regionManager.existingRegionLink().click();
		delayFor(2000);
	}
	
	public void clickCreateRegionLink(){
		regionManager.createRegionLink().click();
		delayFor(2000);
	}

}
