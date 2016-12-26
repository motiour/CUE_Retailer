/**
 * 
 */
package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.WebDriver;

import com.inmarkit.qa.framework.mh.model.EditOfferManagerPageModel;

/**
 * @author nrislam
 *
 */
public class EditOfferManagerPageController extends MHControllerBase{

	EditOfferManagerPageModel editOfferManager = null;
	public EditOfferManagerPageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		editOfferManager = new EditOfferManagerPageModel(driver);
	}
	
	public String getPageTitle(){
		String page = editOfferManager.pageTitle().getText();
		return page;
	}
	
	public void selectStepNumber(String steps){
		editOfferManager.wizardSteps(steps).click();
		delayFor(3000);
	}
	
	public void clickNextButton(){
		editOfferManager.nextStepButton().click();
		delayFor(2000);
	}
	
	public void clickPrevButton(){
		editOfferManager.prevButton().click();
		delayFor(2000);
	}

}
