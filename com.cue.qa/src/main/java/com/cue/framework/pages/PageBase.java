package com.cue.framework.pages;

import org.openqa.selenium.WebDriver;

public class PageBase {
	public WebDriver driver;
	
	
	
	public PageBase(WebDriver driver){
		this.driver = driver;
		
	}
	
	
	public void delayFor(int time) {

		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}

}
