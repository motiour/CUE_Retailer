package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.WebDriver;

import com.inmarkit.qa.framework.mh.model.EditAccountPageModel;

public class EditAccountPageController extends MHControllerBase{

	private EditAccountPageModel editAccount = null;
	public EditAccountPageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		editAccount = new EditAccountPageModel(driver);
	}
	
	public void editPartnerInformation(String name, String title, String phone, String mobile, String email){
		
		if(name != null){
			editAccount.nameTextbox().clear();
			editAccount.nameTextbox().sendKeys(name);
			delayFor(500);
		}
		
		if(title != null){
			editAccount.titleTextbox().clear();
			editAccount.titleTextbox().sendKeys(title);
			delayFor(500);
		}
		
		if(phone != null){
			editAccount.phoneTextbox().clear();
			editAccount.phoneTextbox().sendKeys(phone);
			delayFor(500);
		}
		
		if(mobile != null){
			editAccount.mobileTextbox().clear();
			editAccount.mobileTextbox().sendKeys(mobile);
			delayFor(500);
		}
		
		if(email != null){
			editAccount.emailTextbox().clear();
			editAccount.emailTextbox().sendKeys(email);
			delayFor(500);
		}
		
		editAccount.saveChangesButton().click();
		delayFor(3000);
		
	}
	
	
	public void changePassword(String newPass, String ReenterPass ){
		
		if(newPass != null){
			editAccount.newpasswordTextbox().clear();
			editAccount.newpasswordTextbox().sendKeys(newPass);
			delayFor(500);
		}
		
		if(ReenterPass != null){
			editAccount.reEnterNewpasswordTextbox().clear();
			editAccount.reEnterNewpasswordTextbox().sendKeys(ReenterPass);
			delayFor(500);
		}
						
		editAccount.saveChangesButton().click();
		delayFor(3000);
		
	}

}
