


package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.WebDriver;

import com.inmarkit.qa.framework.mh.model.CorporateInfoPageModel;

public class CorporateInfoPageController extends MHControllerBase{

	private CorporateInfoPageModel corporateInfo = null;
	public CorporateInfoPageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		corporateInfo = new CorporateInfoPageModel(driver);
	}
	
	public String getPageTitle(){
		String page = corporateInfo.pageHeader().getText();
		return page;
	}
	
	public void clickEditCorporateInfoButton(){
		corporateInfo.editCorporateInfoButton().click();
		delayFor(2000);
	}
	
	
	public Boolean isEditBillingButtonVisible(){
		Boolean button = false;
		if(corporateInfo.editBillingButton().isDisplayed() == true){
			button = true;
		}
		return button;
	}
	
	public Boolean isEditCorporateInfoButtonVisible(){
		Boolean button = false;
		if(corporateInfo.editCorporateInfoButton().isDisplayed() == true){
			button = true;
		}
		return button;
	}


}
