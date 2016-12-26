package com.inmarkit.qa.framework.mh.controller;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.inmarkit.qa.framework.mh.model.CreateOfferStep3PageModel;

public class CreateOfferStep3PageController extends MHControllerBase{

	CreateOfferStep3PageModel createOfferStep3 = null;
	public CreateOfferStep3PageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		createOfferStep3 = new CreateOfferStep3PageModel(driver);
	}
	
	public String getTotalItemMediaInformation(){
		String itemInfo = createOfferStep3.totalItemMsg().getText();
		return itemInfo;
	}
	
	public void selectAllThisPage(){
		createOfferStep3.selectAllThisPageLink().click();
		delayFor(2000);
	}
	
	public void clearAllThisPage(){
		createOfferStep3.clearAllThisPageLink().click();
		delayFor(2000);
	}
	
	public void selectAllAllPagesAndNext(){
		createOfferStep3.selectAllAllPageLink().click();
		delayFor(2000);
		createOfferStep3.nextButton().click();
		delayFor(2000);
	}
	
	public void clearAllAllPages(){
		createOfferStep3.clearAllAllPageLink().click();
		delayFor(2000);
	}
	
	public void filterItemByKeyword(String keyword){
		if(keyword != null){
			createOfferStep3.filterByEditbox().clear();
			createOfferStep3.filterByEditbox().sendKeys(keyword);
			createOfferStep3.filterByEditbox().sendKeys(Keys.RETURN);
			delayFor(1000);
		}
	}
	
	public String getItemName(String markitcode){
		String itemname = createOfferStep3.itemName(markitcode).getText();
		return itemname;
	}
	
	public String getBrandName(String markitcode){
		String brandName = createOfferStep3.brandName(markitcode).getText();
		return brandName;
	}
	
	public void selectBrand(String brandName){
		Select select = new Select(createOfferStep3.selectBrandCombobox());
		select.selectByVisibleText(brandName); 
		delayFor(2000);
	}
	
	public void selectAllItemAndClickNext(){
		createOfferStep3.selectAllThisPageLink().click();
		delayFor(1000);
		createOfferStep3.nextButton().click();
		delayFor(2000);
	}
	
	public void selectAnItemAndClickNext(String markitcode){
		createOfferStep3.checkboxByMarkitcode(markitcode).click();
		delayFor(1000);
		createOfferStep3.nextButton().click();
		delayFor(2000);
	}
	
	public void selectItemsFromList(String... markitcodes){
		ArrayList<WebElement> elements = new ArrayList<WebElement>();
		for(String code : markitcodes){
			elements.add(driver.findElement(By.xpath("//div[@class='list_data']//tr[contains(@id, 'row')]" +
																	"//a[contains(text(),'" + code + "']")));
			createOfferStep3.checkboxByMarkitcode(code).click();
		}
		
	}
	
	public Boolean isNextEnable(){
		boolean next = false;
		if(createOfferStep3.nextButton().isEnabled() != false){
			next = true;
		}
		return next;
	
	}
	
	public Boolean isPreviousEnable(){
		boolean prev = false;
		if(createOfferStep3.prevButton().isEnabled() != false){
			prev = true;
		}
		return prev;
	
	}

}
