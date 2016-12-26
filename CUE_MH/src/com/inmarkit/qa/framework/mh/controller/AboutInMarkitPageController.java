




package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.WebDriver;

import com.inmarkit.qa.framework.mh.model.AboutInMarkitPageModel;

public class AboutInMarkitPageController extends MHControllerBase{

	AboutInMarkitPageModel aboutInMarkit = null;
	public AboutInMarkitPageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		aboutInMarkit = new AboutInMarkitPageModel(driver);
	}
	
	public String getPageTitle(){
		String page = aboutInMarkit.pageTitle().getText();
		return page;
	}

}
