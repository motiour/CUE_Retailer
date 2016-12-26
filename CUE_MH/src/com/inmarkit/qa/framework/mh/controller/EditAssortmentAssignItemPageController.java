package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.inmarkit.qa.framework.mh.model.EditAssortmentAssignItemPageModel;

public class EditAssortmentAssignItemPageController extends MHControllerBase{

	EditAssortmentAssignItemPageModel editAssortment = null;
	public EditAssortmentAssignItemPageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		editAssortment = new EditAssortmentAssignItemPageModel(driver);
	}
	
	public void selectAllThisPageAndNext(){
		editAssortment.selectAllThisPage().click();
		delayFor(2000);
		editAssortment.nextStepButton().click();
		delayFor(2000);
	}
	
	public void clearAllThispage(){
		editAssortment.selectAllThisPage().click();
		delayFor(2000);
	}
	
	public void selectAllAllPagesAndNext(){
		editAssortment.selectAllAllPages().click();
		delayFor(2000);
		editAssortment.nextStepButton().click();
		delayFor(2000);
	}
	
	public void clearAllAllPage(){
		editAssortment.clearAllAllPages().click();
		delayFor(2000);
	}


	public void filterByKeyword(String keyword){
		editAssortment.filterByEditbox().clear();
		editAssortment.filterByEditbox().sendKeys(keyword);
		editAssortment.filterByEditbox().sendKeys(Keys.RETURN);
		delayFor(2000);
	}
	
	public String getItemName(String partialName){
		String itemname = editAssortment.itemName(partialName).getText();
		return itemname;
	}
	
	public void clickNextStep(){
		editAssortment.nextStepButton().click();
		delayFor(2000);
	}
	
	public void clickPreviousStep(){
		editAssortment.prevStepButton().click();
		delayFor(2000);
	}
	
	public void selectAnItemByMarkitCode(String code){
		editAssortment.checkboxByMarkitCode(code).click();
		editAssortment.nextStepButton().click();
		delayFor(1000);
	}
	

	public void selectItemsByMarkitCode(String... codes){
		for(String code : codes){
			editAssortment.checkboxByMarkitCode(code).click();
			delayFor(1000);
		}
		editAssortment.nextStepButton().click();
		delayFor(2000);
	}
	
	public void selectAnItemAndClickNext(String itemname){
		editAssortment.checkboxByName(itemname).click();
		editAssortment.nextStepButton().click();
		delayFor(1000);
	}


}
