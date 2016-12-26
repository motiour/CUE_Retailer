package com.inmarkit.qa.framework.mh.controller;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.inmarkit.qa.framework.mh.model.EditOfferStep3PageModel;

public class EditOfferStep3PageController extends MHControllerBase{

	EditOfferStep3PageModel editOfferStep3 = null;
	public EditOfferStep3PageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		editOfferStep3 = new EditOfferStep3PageModel(driver);
	}
	public String getTotalItemMediaInformation(){
		String itemInfo = editOfferStep3.totalItemMsg().getText();
		return itemInfo;
	}
	
	public void selectAllThisPage(){
		editOfferStep3.selectAllThisPageLink().click();
		delayFor(2000);
	}
	
	public void clearAllThisPage(){
		editOfferStep3.clearAllThisPageLink().click();
		delayFor(2000);
	}
	
	public void selectAllAllPages(){
		editOfferStep3.selectAllAllPageLink().click();
		delayFor(2000);
	}
	
	public void clearAllAllPages(){
		editOfferStep3.clearAllAllPageLink().click();
		delayFor(2000);
	}
	
	public void filterItemByKeyword(String keyword){
		if(keyword != null){
			editOfferStep3.filterByEditbox().clear();
			editOfferStep3.filterByEditbox().sendKeys(keyword);
			editOfferStep3.filterByEditbox().sendKeys(Keys.RETURN);
			delayFor(1000);
		}
	}
	
	public String getItemName(String markitcode){
		String itemname = editOfferStep3.itemName(markitcode).getText();
		return itemname;
	}
	
	public String getBrandName(String markitcode){
		String brandName = editOfferStep3.brandName(markitcode).getText();
		return brandName;
	}
	
	public void selectBrand(String brandName){
		Select select = new Select(editOfferStep3.selectBrandCombobox());
		select.selectByVisibleText(brandName); 
		delayFor(2000);
	}
	
	public void selectAllItemAndClickNext(){
		editOfferStep3.selectAllThisPageLink().click();
		delayFor(1000);
		editOfferStep3.nextButton().click();
		delayFor(2000);
	}
	
	public void selectAnItemAndClickNext(String markitcode){
		editOfferStep3.checkboxByMarkitcode(markitcode).click();
		delayFor(1000);
		editOfferStep3.nextButton().click();
		delayFor(2000);
	}
	
	public void selectItemsFromList(String... markitcodes){
		ArrayList<WebElement> elements = new ArrayList<WebElement>();
		for(String code : markitcodes){
			elements.add(driver.findElement(By.xpath("//div[@class='list_data']//tr[contains(@id, 'row')]" +
																	"//a[contains(text(),'" + code + "']")));
			editOfferStep3.checkboxByMarkitcode(code).click();
		}
		
	}
	
	public void verifyCheckboxNotSelected(){
		Boolean checked = false;
		List<WebElement> checkboxes = editOfferStep3.checkboxes();
    	for (WebElement checkbox : checkboxes){
    		boolean status = checkbox.isSelected();	
    		if(status != false){
    			checked = status;
    			break;
    		}
    	}
    	
    	Assert.assertFalse(checked);
    	delayFor(1000);
	}
	
	public Boolean isNextEnable(){
		boolean next = false;
		if(editOfferStep3.nextButton().isEnabled() != false){
			next = true;
		}
		return next;
	
	}
	
	public Boolean isPreviousEnable(){
		boolean prev = false;
		if(editOfferStep3.prevButton().isEnabled() != false){
			prev = true;
		}
		return prev;
	
	}


}
