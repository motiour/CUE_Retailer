package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.inmarkit.qa.framework.mh.model.EditOfferStep5PageModel;

public class EditOfferStep5PageController extends MHControllerBase{

	EditOfferStep5PageModel editOfferStep5 = null;
	public EditOfferStep5PageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		editOfferStep5 = new EditOfferStep5PageModel(driver);
	}

	public void enterStep5Information(String gender, String ageFrom, String ageTo, String region){
		if(gender !=null & gender == "both"){
			editOfferStep5.bothRadioButton().click();
			delayFor(200);
		}
		else if(gender !=null & gender == "male"){
			editOfferStep5.maleRadioButton().click();
			delayFor(200);
		}
		else if(gender !=null & gender == "female"){
			editOfferStep5.femaleRadioButton().click();
			delayFor(200);
		}
		
		if(ageFrom !=null){
			editOfferStep5.ageFromEditbox().clear();
			editOfferStep5.ageFromEditbox().sendKeys(ageFrom);
			delayFor(200);
		}
		
		if(ageTo !=null){
			editOfferStep5.ageToEditbox().clear();
			editOfferStep5.ageToEditbox().sendKeys(ageTo);
			delayFor(200);
		}
		
		if(region !=null){
			Select select = new Select(editOfferStep5.regionCombobox());
			select.selectByVisibleText(region); 
			delayFor(2000);
		}
		
		editOfferStep5.nextButton().click();
		delayFor(2000);
	}
	
	public Boolean isNextEnable(){
		boolean next = false;
		if(editOfferStep5.nextButton().isEnabled() != false){
			next = true;
		}
		return next;
	
	}
	
	public Boolean isPreviousEnable(){
		boolean prev = false;
		if(editOfferStep5.prevButton().isEnabled() != false){
			prev = true;
		}
		return prev;
	
	}

}

