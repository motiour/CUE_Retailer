package com.inmarkit.qa.framework.mh.model;


import org.openqa.selenium.WebDriver;


public class MHModelBase {
	protected WebDriver driver = null;

public MHModelBase(WebDriver driver){
		this.driver = driver;
	}
}
