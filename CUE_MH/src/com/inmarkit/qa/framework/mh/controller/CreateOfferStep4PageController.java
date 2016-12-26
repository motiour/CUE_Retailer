package com.inmarkit.qa.framework.mh.controller;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.inmarkit.qa.framework.mh.model.CreateOfferStep4PageModel;

public class CreateOfferStep4PageController extends MHControllerBase{
	
	CreateOfferStep4PageModel createOfferStep4 = null;
	public CreateOfferStep4PageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		createOfferStep4 = new CreateOfferStep4PageModel(driver);
	}
	
	public String getTotalItemMediaInformation(){
		String itemInfo = createOfferStep4.totalItemMsg().getText();
		return itemInfo;
	}
	
	public void selectAllThisPage(){
		createOfferStep4.selectAllThisPageLink().click();
		delayFor(2000);
	}
	
	public void clearAllThisPage(){
		createOfferStep4.clearAllThisPageLink().click();
		delayFor(2000);
	}
	
	public void selectAllAllPages(){
		createOfferStep4.selectAllAllPageLink().click();
		delayFor(2000);
	}
	
	public void clearAllAllPages(){
		createOfferStep4.clearAllAllPageLink().click();
		delayFor(2000);
	}
	
	public void filterItemByKeyword(String keyword){
		if(keyword != null){
			createOfferStep4.filterByEditbox().clear();
			createOfferStep4.filterByEditbox().sendKeys(keyword);
			createOfferStep4.filterByEditbox().sendKeys(Keys.RETURN);
			delayFor(1000);
		}
	}
	
	public String getItemName(String markitcode){
		String itemname = createOfferStep4.itemName(markitcode).getText();
		return itemname;
	}
	
	public String getBrandName(String markitcode){
		String brandName = createOfferStep4.brandName(markitcode).getText();
		return brandName;
	}
	
	public void selectBrand(String brandName){
		Select select = new Select(createOfferStep4.selectBrandCombobox());
		select.selectByVisibleText(brandName); 
		delayFor(2000);
	}
	
	public void selectAllItemAndClickNext(){
		createOfferStep4.selectAllThisPageLink().click();
		delayFor(1000);
		createOfferStep4.nextButton().click();
		delayFor(2000);
	}
	
	public void selectAnItemAndClickNext(String markitcode){
		createOfferStep4.checkboxByMarkitcode(markitcode).click();
		delayFor(1000);
		createOfferStep4.nextButton().click();
		delayFor(2000);
	}
	
	public void selectItemsFromList(String... markitcodes){
		ArrayList<WebElement> elements = new ArrayList<WebElement>();
		for(String code : markitcodes){
			elements.add(driver.findElement(By.xpath("//div[@class='list_data']//tr[contains(@id, 'row')]" +
																	"//a[contains(text(),'" + code + "']")));
			createOfferStep4.checkboxByMarkitcode(code).click();
		}
		
	}
	
	public void clickNextStepButton(){
		createOfferStep4.nextButton().click();
		delayFor(2000);
	}
	
	public void clickPrevStepButton(){
		createOfferStep4.prevButton().click();
		delayFor(2000);
	}
	
	public Boolean isNextEnable(){
		boolean next = false;
		if(createOfferStep4.nextButton().isEnabled() != false){
			next = true;
		}
		return next;
	
	}
	
	public Boolean isPreviousEnable(){
		boolean prev = false;
		if(createOfferStep4.prevButton().isEnabled() != false){
			prev = true;
		}
		return prev;
	
	}

}
