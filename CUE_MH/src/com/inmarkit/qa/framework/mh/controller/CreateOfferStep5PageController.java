package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.inmarkit.qa.framework.mh.model.CreateOfferStep5PageModel;

public class CreateOfferStep5PageController extends MHControllerBase{

	CreateOfferStep5PageModel createOfferStep5 = null;
	public CreateOfferStep5PageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		createOfferStep5 = new CreateOfferStep5PageModel(driver);
	}
	
	public void enterStep5Information(String gender, String ageFrom, String ageTo, String region){
		if(gender !=null & gender.contains("Both")){
			createOfferStep5.bothRadioButton().click();
			delayFor(200);
		}
		else if(gender !=null & gender == "Male"){
			createOfferStep5.maleRadioButton().click();
			delayFor(200);
		}
		else if(gender !=null & gender == "Female"){
			createOfferStep5.femaleRadioButton().click();
			delayFor(200);
		}
		
		if(ageFrom !=null){
			createOfferStep5.ageFromEditbox().clear();
			createOfferStep5.ageFromEditbox().sendKeys(ageFrom);
			delayFor(200);
		}
		
		if(ageFrom !=null){
			createOfferStep5.ageToEditbox().clear();
			createOfferStep5.ageToEditbox().sendKeys(ageTo);
			delayFor(200);
		}
		
		if(region !=null){
			Select select = new Select(createOfferStep5.regionCombobox());
			select.selectByVisibleText(region); 
			delayFor(1000);
		}
		
		createOfferStep5.nextButton().click();
		delayFor(3000);
	}
	
	public Boolean isNextEnable(){
		boolean next = false;
		if(createOfferStep5.nextButton().isEnabled() != false){
			next = true;
		}
		return next;
	
	}
	
	public Boolean isPreviousEnable(){
		boolean prev = false;
		if(createOfferStep5.prevButton().isEnabled() != false){
			prev = true;
		}
		return prev;
	
	}


}
