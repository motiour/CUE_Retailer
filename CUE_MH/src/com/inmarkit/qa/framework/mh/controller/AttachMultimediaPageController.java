


package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.inmarkit.qa.framework.mh.model.AttachMultimediaPageModel;

public class AttachMultimediaPageController extends MHControllerBase{

	AttachMultimediaPageModel attachMultimedia = null;
	public AttachMultimediaPageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		attachMultimedia = new AttachMultimediaPageModel(driver);
	}
	
	public String getPageTitle(){
		String page = attachMultimedia.pageTitle().getText();
		return page;
	}
	
	public void filterByKeyword(String keyword){
		attachMultimedia.filterByBox().clear();
		attachMultimedia.filterByBox().sendKeys(keyword);
		attachMultimedia.filterByBox().sendKeys(Keys.RETURN);
		delayFor(2000);
	}
	
	public void viewFilesType(String type){
		Select select = new Select(attachMultimedia.viewFilesSelection());
		select.selectByVisibleText(type);
		delayFor(1000);
	}
	
	public void exitMultimedia(){
		attachMultimedia.exitButton().click();
		delayFor(2000);
	}
	
	public void selectAllAndAttach(){
		attachMultimedia.selectAllCheckbox().click();
		delayFor(1000);
		attachMultimedia.attachMultimediaButton().click();
		delayFor(2000);
	}
	
	public int getTotalInThePage(){
		int total = attachMultimedia.totalItem().size();
		delayFor(2000);
		return total;
	}

}
