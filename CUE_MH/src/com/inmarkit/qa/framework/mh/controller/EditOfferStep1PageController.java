package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.WebDriver;

import com.inmarkit.qa.framework.mh.model.EditOfferStep1PageModel;

public class EditOfferStep1PageController extends MHControllerBase{

	EditOfferStep1PageModel editOfferStep1 = null;
	public EditOfferStep1PageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		editOfferStep1 = new EditOfferStep1PageModel(driver);
	}
	
	public String getPageTitle(){
		String page = editOfferStep1.pageTitle().getText();
		return page;
	}
	
	public void enterOfferDescriptionInfo(String offername, String desc, String tag, boolean yesSharable,
			boolean uselocaid, String attachImagePath, String offerCode, String barcodeImagePath, String encodeTxt,
			boolean generateCode, String url, String dateFrom, String dateTo){
		
		if(offername != null){
			editOfferStep1.offerName().clear();
			editOfferStep1.offerName().sendKeys(offername);
			delayFor(200);
		}
		
		if(desc != null){
			editOfferStep1.offerDescription().clear();
			editOfferStep1.offerDescription().sendKeys(desc);
			delayFor(200);
		}
		
		if(tag != null){
			editOfferStep1.offerTag().clear();
			editOfferStep1.offerTag().sendKeys(tag);
			delayFor(200);
		}
		
		if(yesSharable != false){
			editOfferStep1.yesSharableCheckbox().click();
			delayFor(200);
		}
		
		if(uselocaid != false){
			editOfferStep1.useLocaidCheckbox().click();
			delayFor(200);
		}
		
		if(attachImagePath != null){
			editOfferStep1.attachImageEditbox().clear();
			editOfferStep1.attachImageEditbox().sendKeys(attachImagePath);
			delayFor(200);
		}
		
		if(offerCode != null){
			editOfferStep1.offerCodeEditbox().clear();
			editOfferStep1.offerCodeEditbox().sendKeys(offerCode);
			delayFor(200);
		}
		
		if(barcodeImagePath != null){
			editOfferStep1.barcodeImageEditbox().sendKeys(barcodeImagePath);
			delayFor(200);
		}
		
		if(encodeTxt != null){
			editOfferStep1.barcodeEncodeBox().sendKeys(encodeTxt);
			delayFor(200);
		}
		
		if(generateCode != false){
			editOfferStep1.generateBarcodeCheckbox().click();
			delayFor(200);
		}
		
		if(url != null){
			editOfferStep1.offerUrlEditbox().clear();
			editOfferStep1.offerUrlEditbox().sendKeys(url);
			delayFor(200);
		}
		
		if(dateFrom != null){
			editOfferStep1.dateFromEditbox().clear();
			editOfferStep1.dateFromEditbox().sendKeys(dateFrom);
			delayFor(200);
		}
		
		if(dateTo != null){
			editOfferStep1.dateToEditbox().click();
			editOfferStep1.dateToEditbox().sendKeys(dateTo);
			delayFor(200);
		}
		
		editOfferStep1.nextStepButton().click();
		delayFor(5000);
		
	}

}
