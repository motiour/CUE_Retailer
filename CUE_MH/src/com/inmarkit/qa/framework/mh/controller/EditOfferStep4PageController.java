package com.inmarkit.qa.framework.mh.controller;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.inmarkit.qa.framework.mh.model.EditOfferStep4PageModel;

public class EditOfferStep4PageController extends MHControllerBase{

	EditOfferStep4PageModel editOfferStep4 = null;
	public EditOfferStep4PageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		editOfferStep4 = new EditOfferStep4PageModel(driver);
	}

	public String getTotalItemMediaInformation(){
		String itemInfo = editOfferStep4.totalItemMsg().getText();
		return itemInfo;
	}
	
	public void selectAllThisPage(){
		editOfferStep4.selectAllThisPageLink().click();
		delayFor(2000);
	}
	
	public void clearAllThisPage(){
		editOfferStep4.clearAllThisPageLink().click();
		delayFor(2000);
	}
	
	public void selectAllAllPages(){
		editOfferStep4.selectAllAllPageLink().click();
		delayFor(2000);
	}
	
	public void clearAllAllPages(){
		editOfferStep4.clearAllAllPageLink().click();
		delayFor(2000);
	}
	
	public void filterItemByKeyword(String keyword){
		if(keyword != null){
			editOfferStep4.filterByEditbox().clear();
			editOfferStep4.filterByEditbox().sendKeys(keyword);
			editOfferStep4.filterByEditbox().sendKeys(Keys.RETURN);
			delayFor(1000);
		}
	}
	
	public String getItemName(String markitcode){
		String itemname = editOfferStep4.itemName(markitcode).getText();
		return itemname;
	}
	
	public String getBrandName(String markitcode){
		String brandName = editOfferStep4.brandName(markitcode).getText();
		return brandName;
	}
	
	public void selectBrand(String brandName){
		Select select = new Select(editOfferStep4.selectBrandCombobox());
		select.selectByVisibleText(brandName); 
		delayFor(2000);
	}
	
	public void selectAllItemAndClickNext(){
		editOfferStep4.selectAllThisPageLink().click();
		delayFor(1000);
		editOfferStep4.nextButton().click();
		delayFor(2000);
	}
	
	public void selectAnItemAndClickNext(String markitcode){
		editOfferStep4.checkboxByMarkitcode(markitcode).click();
		delayFor(1000);
		editOfferStep4.nextButton().click();
		delayFor(2000);
	}
	
	public void selectItemsFromList(String... markitcodes){
		ArrayList<WebElement> elements = new ArrayList<WebElement>();
		for(String code : markitcodes){
			elements.add(driver.findElement(By.xpath("//div[@class='list_data']//tr[contains(@id, 'row')]" +
																	"//a[contains(text(),'" + code + "']")));
			editOfferStep4.checkboxByMarkitcode(code).click();
		}
		
	}
	
	public Boolean isNextEnable(){
		boolean next = false;
		if(editOfferStep4.nextButton().isEnabled() != false){
			next = true;
		}
		return next;
	
	}
	
	public Boolean isPreviousEnable(){
		boolean prev = false;
		if(editOfferStep4.prevButton().isEnabled() != false){
			prev = true;
		}
		return prev;
	
	}

}
