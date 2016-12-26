package com.cue1.framework.pages;

import org.openqa.selenium.WebDriver;

public class Application {
	
	
	public WebDriver driver;
	public LoginPage loginPage;

	
	
	
	public Application(WebDriver driver){
		this.driver=driver;
		loginPage = new LoginPage(driver);
		
	}
	
	public LoginPage loginPage(){
		return loginPage;
	}
	


}
