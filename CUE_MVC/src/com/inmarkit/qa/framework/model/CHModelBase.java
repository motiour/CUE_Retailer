package com.inmarkit.qa.framework.model;

import org.openqa.selenium.WebDriver;

public class CHModelBase
 {

	protected WebDriver driver = null;
			
	
public CHModelBase(WebDriver driver)

{
		this.driver = driver;
	}
	
}