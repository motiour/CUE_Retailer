


package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.inmarkit.qa.framework.mh.model.CreateAssortmentAssignItemPageModel;

public class CreateAssortmentAssignItemPageController extends MHControllerBase{

	CreateAssortmentAssignItemPageModel assignItem = null;
	public CreateAssortmentAssignItemPageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		assignItem = new CreateAssortmentAssignItemPageModel(driver);
	}
	
	public String getPageTitle(){
		String page = assignItem.pageTitle().getText();
		return page;
	}
	
	public void selectAllThisPageAndNext(){
		assignItem.selectAllThisPage().click();
		delayFor(2000);
		assignItem.nextStepButton().click();
		delayFor(2000);
	}
	
	public void clearAllThispage(){
		assignItem.selectAllThisPage().click();
		delayFor(2000);
	}
	
	public void selectAllAllPagesAndNext(){
		assignItem.selectAllAllPages().click();
		delayFor(2000);
		assignItem.nextStepButton().click();
		delayFor(2000);
	}
	
	public void clearAllAllPage(){
		assignItem.clearAllAllPages().click();
		delayFor(2000);
	}


	public void filterByKeyword(String keyword){
		assignItem.filterByEditbox().clear();
		assignItem.filterByEditbox().sendKeys(keyword);
		assignItem.filterByEditbox().sendKeys(Keys.RETURN);
		delayFor(2000);
	}
	
	public String getItemName(String partialName){
		String itemname = assignItem.itemName(partialName).getText();
		return itemname;
	}
	
	public void clickNextStep(){
		assignItem.nextStepButton().click();
		delayFor(2000);
	}
	
	public void clickPreviousStep(){
		assignItem.prevStepButton().click();
		delayFor(2000);
	}
	
	public void selectAnItemByMarkitCode(String code){
		assignItem.checkboxByMarkitCode(code).click();
		assignItem.nextStepButton().click();
		delayFor(1000);
	}
	
//	public void selectMultipleItemByMarkitCode(String...code){
//		assignItem.checkboxByMarkitCode(code).click();
//		assignItem.nextStepButton().click();
//		delayFor(1000);
//	}
	
	public void selectItemsByMarkitCode(String... codes){
		for(String code : codes){
			assignItem.checkboxByMarkitCode(code).click();
			delayFor(1000);
		}
		assignItem.nextStepButton().click();
		delayFor(2000);
	}
	
	public void selectAnItemAndClickNext(String itemname){
		assignItem.checkboxByName(itemname).click();
		assignItem.nextStepButton().click();
		delayFor(1000);
	}

}
