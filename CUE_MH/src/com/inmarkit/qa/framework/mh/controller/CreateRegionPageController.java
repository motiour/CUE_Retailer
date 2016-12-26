package com.inmarkit.qa.framework.mh.controller;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.inmarkit.qa.framework.mh.model.CreateRegionPageModel;

public class CreateRegionPageController extends MHControllerBase{

	CreateRegionPageModel createRegion = null;
	public CreateRegionPageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		createRegion = new CreateRegionPageModel(driver);
	}
	
	public String getPageTitle(){
		String page = createRegion.pageTitle().getText();
		return page;
	}
		
	public void selectStates(String state){
		Select select = new Select(createRegion.stateSelectionBox());
		select.selectByVisibleText(state); 
		delayFor(2000);
	}
	
	public void selectFromRegionDetails(String state){
		Select select = new Select(createRegion.regionDetailsBox());
		select.selectByVisibleText(state); 
		delayFor(2000);
	}
	
	public void addMultipleStatesToRegion(String... states){
		ArrayList<WebElement> elements = new ArrayList<WebElement>();
		for(String state : states){
			elements.add(driver.findElement(By.xpath("//select[@id='states']/option[text()='" + state + "']")));
		}
	
		createRegion.stateSelectionBox().sendKeys(Keys.CONTROL);
		for(WebElement e : elements){
			e.click();
		}
		createRegion.addRegionButton().click();
		delayFor(1000);
	}


	public void saveRegionAs(String name){
		if(name != null){
			createRegion.saveAsEditbox().sendKeys(name);
			delayFor(200);
			createRegion.submitButton().submit();
			delayFor(2000);
		}
	}
	
	

}
