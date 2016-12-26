package com.inmarkit.qa.framework.controller;




import org.openqa.selenium.WebDriver;

public class CHControllerBase {

	protected WebDriver driver = null;
	
	public CHControllerBase(WebDriver driver){
		this.driver = driver;
	}
		
	public void delayFor(int time){
		
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

