/**
 * 
 */
package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.WebDriver;

import com.inmarkit.qa.framework.mh.model.OfferDetailPageModel;

/**
 * @author nazrulislam
 *
 */
public class OfferDetailPageController extends MHControllerBase{

	OfferDetailPageModel offerDetail = null;
	public OfferDetailPageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		offerDetail = new OfferDetailPageModel(driver);
	}
	
	public String getPageTitle(){
		String page = offerDetail.pageTitle().getText();
		return page;
	}
	
	public String getMarkitCode(){
		String code = offerDetail.markitCode().getText();
		return code;
	}

	public String getOfferName(){
		String name = offerDetail.offerName().getText();
		return name;
	}
	
	public String getSmsOfferName(){
		String name = offerDetail.offerSmsName().getText();
		return name;
	}
	
	public String getOfferDescription(){
		String desc = offerDetail.offerDescription().getText();
		return desc;
	}
	
	public String getSmsOfferDescription(){
		String desc = offerDetail.smsOfferDescription().getText();
		return desc;
	}
	
	public String getOfferDateRange(){
		String date = offerDetail.dateRange().getText();
		return date;
	}
	
	public void clickDeleteThisOffer(){
		offerDetail.deleteThisButton().click();
		delayFor(2000);
	}
	
	public void clickEditThisOffer(){
		offerDetail.editThisButton().click();
		delayFor(2000);
	}

}
