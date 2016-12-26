package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.inmarkit.qa.framework.mh.model.ItemManagerPageModel;

public class ItemManagerPageController extends MHControllerBase{

	ItemManagerPageModel itemManager = null;
	public ItemManagerPageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		itemManager = new ItemManagerPageModel(driver);
	}
	
	public String getPageTitle(){
		String page = itemManager.pageTitle().getText();
		return page;
	}
	
	public void selectAllThisPage(){
		itemManager.selectAllThisPageLink().click();
		delayFor(2000);
	}
	
	public void clearAllThisPage(){
		itemManager.clearAllThisPageLink().click();
		delayFor(2000);
	}
	
	public void selectAllAllPages(){
		itemManager.selectAllAllPageLink().click();
		delayFor(2000);
	}
	
	public void clearAllAllPages(){
		itemManager.clearAllAllPageLink().click();
		delayFor(2000);
	}
	
	public void filterItemByKeyword(String keyword){
		if(keyword != null){
			itemManager.filterByEditbox().clear();
			itemManager.filterByEditbox().sendKeys(keyword);
			itemManager.filterByEditbox().sendKeys(Keys.RETURN);
			delayFor(1000);
		}
	}

}
