package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.WebDriver;

import com.inmarkit.qa.framework.mh.model.EditCorpInfoPageModel;

public class EditCorpInfoPageController extends MHControllerBase{
	
	private EditCorpInfoPageModel editCorpInfo = null;

	public EditCorpInfoPageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		editCorpInfo = new EditCorpInfoPageModel(driver);
	}
	
	public String getPageTitle(){
		String page = editCorpInfo.pageHeader().getText();
		return page;
	}
	
	public void uploadLogoOrUrl(String logoPath, String logoUrl){
		
		if(logoPath != null){
			editCorpInfo.uploadLogoEditbox().sendKeys(logoPath);
			delayFor(1000);
		}
		
		if(logoUrl != null){
			editCorpInfo.logoUrlEditbox().sendKeys(logoUrl);
			delayFor(1000);
		}
		
		editCorpInfo.submitButton().click();
		delayFor(5000);
		
	}
	
	public void uploadCorporateLogo(String logoPath){
		
		if(logoPath != null){
			editCorpInfo.uploadLogoEditbox().sendKeys(logoPath);
			delayFor(1000);
		}
				
		editCorpInfo.submitButton().click();
		delayFor(5000);
		
	}
	
	public void uploadCorporateLogoUrl(String logoUrl){
		
		if(logoUrl != null){
			editCorpInfo.logoUrlEditbox().sendKeys(logoUrl);
			delayFor(1000);
		}
				
		editCorpInfo.submitButton().click();
		delayFor(5000);
		
	}
	
	public void changeStreamGreetings(boolean defaulRadioButton, boolean textRadioButton, 
										String someText, boolean imageRadioButton, String imagePath){
		
		if(defaulRadioButton != true){
			editCorpInfo.defaultRadioButton().click();
			delayFor(500);
		}
		
		else if(textRadioButton != true){
			editCorpInfo.textRadioButton().click();
			delayFor(500);
			if(someText != null){
				editCorpInfo.someTextEditbox().clear();
				editCorpInfo.someTextEditbox().sendKeys(someText);
				delayFor(500);
			}
		}
						
		else if(imageRadioButton != true){
			editCorpInfo.imageRadioButton().click();
			delayFor(500);
		
			editCorpInfo.imageBrowseEditbox().sendKeys(imagePath);
			delayFor(1000);
		}
		
		editCorpInfo.submitButton().click();
		delayFor(5000);
		
		
	}
	
	public void changeStreamGreetings(String greetings, String someText, String imagePath){

		if(greetings == "Default"){
			editCorpInfo.defaultRadioButton().click();
			delayFor(500);
		}
		
		else if(greetings == "Text"){
			editCorpInfo.textRadioButton().click();
			delayFor(500);
			if(someText != null){
					editCorpInfo.someTextEditbox().clear();
					editCorpInfo.someTextEditbox().sendKeys(someText);
					delayFor(500);
			}
		}
		
		else if(greetings == "Image"){
			editCorpInfo.imageRadioButton().click();
			delayFor(500);
		
			editCorpInfo.imageBrowseEditbox().sendKeys(imagePath);
			delayFor(1000);
		}
		
		editCorpInfo.submitButton().click();
		delayFor(5000);
			
	}

}
