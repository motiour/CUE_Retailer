package com.inmarkit.qa.framework.mh.controller;


import java.util.Set;


import org.openqa.selenium.By;

import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.WebDriver;


public class MHControllerBase
 {
	
	protected WebDriver driver = null;
	
	public MHControllerBase(WebDriver driver){
		this.driver = driver;
	}
	
	public void delayFor(int time){
		
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public boolean elementExistsId(String elementId){
		boolean present;
	
		try {
		   driver.findElement(By.id(elementId));
		   present = true;
		} catch (NoSuchElementException e) {
		   present = false;
		}
		return present;
	}
	
	public boolean elementExistsLinkname(String linkText){
		boolean present;
	
		try {
		   driver.findElement(By.linkText(linkText));
		   present = true;
		} catch (NoSuchElementException e) {
		   present = false;
		}
		return present;
	}
	
	public boolean elementExistsXpath(String elementXpath){
		boolean present;
	
		try {
		   driver.findElement(By.xpath(elementXpath));
		   present = true;
		} catch (NoSuchElementException e) {
		   present = false;
		}
		return present;
	}
	
	public void handleWinHandler(){
		String curentWin = driver.getWindowHandle();
		Set<String > win = driver.getWindowHandles();
		for(String s : win){
			System.out.println(s);
			if(!(curentWin.contentEquals(s)))
			{
				driver.switchTo().window(s);
			}
		}
	}

}
