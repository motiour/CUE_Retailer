

package com.inmarkit.qa.framework.mh.controller;

import junit.framework.Assert;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.inmarkit.qa.framework.mh.model.AssortmentManagerPageModel;

public class AssortmentManagerPageController extends MHControllerBase{

	AssortmentManagerPageModel assortmentManager = null;
	public AssortmentManagerPageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		assortmentManager = new AssortmentManagerPageModel(driver);
	}
	
	public String getPageTitle(){
		String page = assortmentManager.pageTitle().getText();
		return page;
	}
	
	public void selectTab(String tabname){
		assortmentManager.assortmentTabs(tabname).click();
		delayFor(1000);
	}
	
	public String getTotalStoreMessage(){
		String total = assortmentManager.totalStoreItem().getText();
		return total;
	}
	
	public void clickUploadAndAddNewLink(){
		assortmentManager.uploadAndAddLink().click();
		delayFor(2000);
	}
	
	public void clickEditLink(String zipcode){
		assortmentManager.editLink(zipcode).click();
		delayFor(2000);
	}
	
	public void deleteAssortment(String zipcode){
		assortmentManager.deleteAssortmentLink(zipcode).click();
		delayFor(2000);
		driver.switchTo().alert().accept();
		delayFor(2000);
	}
	
	public void filterByKeyword(String keyword){
		assortmentManager.filterByEditbox().clear();
		assortmentManager.filterByEditbox().sendKeys(keyword);
		assortmentManager.filterByEditbox().sendKeys(Keys.RETURN);
		delayFor(2000);
	}
	
	public int getTotalStore(){
		int total = assortmentManager.storeName().size();
		return total;
	}
	
	public void verifyLocationName(String lname){
		for (WebElement location : assortmentManager.location()){
			String myLocation = location.getText();
			System.out.println("Location found :" + myLocation);
			if(myLocation == lname){
				Assert.assertTrue(true);
				System.out.println("Location found :" + myLocation);
			}
			else{
				Assert.assertFalse(true);
				System.out.println("Location not found :" + myLocation);
				break;
			}
		}
		
	}

}
