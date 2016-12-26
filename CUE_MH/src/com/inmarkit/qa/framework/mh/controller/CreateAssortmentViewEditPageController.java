package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.WebDriver;

import com.inmarkit.qa.framework.mh.model.CreateAssortmentReviewPageModel;

public class CreateAssortmentViewEditPageController extends MHControllerBase{

	CreateAssortmentReviewPageModel reviewSave = null;
	public CreateAssortmentViewEditPageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		reviewSave = new CreateAssortmentReviewPageModel(driver);
	}

}
