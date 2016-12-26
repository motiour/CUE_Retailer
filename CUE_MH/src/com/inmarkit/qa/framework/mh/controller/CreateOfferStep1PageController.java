package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.WebDriver;

import com.inmarkit.qa.framework.mh.model.CreateOfferStep1PageModel;

public class CreateOfferStep1PageController extends MHControllerBase{

	CreateOfferStep1PageModel offerStep1 = null;
	public CreateOfferStep1PageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		offerStep1 = new CreateOfferStep1PageModel(driver);
	}
	

	public String getPageTitle(){
		String page = offerStep1.pageTitle().getText();
		return page;
	}
	
	public void enterOfferDescriptionInfo(String offername, String desc, String tag, boolean yesSharable,
			boolean uselocaid, String attachImagePath, String offerCode, String barcodeImagePath, String encodeTxt,
			boolean generateCode, String url, String dateFrom, String dateTo){
		
		if(offername != null){
			offerStep1.offerName().sendKeys(offername);
			delayFor(200);
		}
		
		if(desc != null){
			offerStep1.offerDescription().sendKeys(desc);
			delayFor(200);
		}
		
		if(tag != null){
			offerStep1.offerTag().sendKeys(tag);
			delayFor(200);
		}
		
		if(yesSharable != false){
			offerStep1.yesSharableCheckbox().click();
			delayFor(200);
		}
		
		if(uselocaid != false){
			offerStep1.useLocaidCheckbox().click();
			delayFor(200);
		}
		
		if(attachImagePath != null){
			offerStep1.attachImageEditbox().sendKeys(attachImagePath);
			delayFor(200);
		}
		
		if(offerCode != null){
			offerStep1.offerCodeEditbox().sendKeys(offerCode);
			delayFor(200);
		}
		
		if(barcodeImagePath != null){
			offerStep1.barcodeImageEditbox().sendKeys(barcodeImagePath);
			delayFor(200);
		}
		
		if(encodeTxt != null){
			offerStep1.barcodeEncodeBox().sendKeys(encodeTxt);
			delayFor(200);
		}
		
		if(generateCode != false){
			offerStep1.generateBarcodeCheckbox().click();
			delayFor(200);
		}
		
		if(url != null){
			offerStep1.offerUrlEditbox().sendKeys(url);
			delayFor(200);
		}
		
		if(dateFrom != null){
			offerStep1.dateFromEditbox().sendKeys(dateFrom);
			delayFor(200);
		}
		
		if(dateTo != null){
			offerStep1.dateToEditbox().sendKeys(dateTo);
			delayFor(200);
		}
		
		offerStep1.nextStepButton().click();
		delayFor(2000);
		
	}

}
