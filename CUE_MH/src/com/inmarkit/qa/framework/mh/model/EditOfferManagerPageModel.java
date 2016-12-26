/**
 * 
 */
package com.inmarkit.qa.framework.mh.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author nrislam
 *
 */
public class EditOfferManagerPageModel extends MHModelBase{

	private WebElement pageTitle = null;
	private WebElement wizardSteps = null;
	private WebElement nextStepButton = null;
	private WebElement prevButton = null;
		
	public EditOfferManagerPageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement pageTitle(){
		pageTitle = driver.findElement(By.xpath("//div[@class='header_gray']//td[@class='header_title']"));
		return pageTitle;
	}
	
	public WebElement wizardSteps(String steps){
		wizardSteps = driver.findElement(By.xpath("//div[@class='subbox']//a[contains(text(), '"+ steps +"')]"));
		return wizardSteps;
	}
	
	public WebElement nextStepButton(){
		nextStepButton = driver.findElement(By.xpath("//div[@class='sub_floatright']/input[1]"));
		return nextStepButton;
	}
	
	public WebElement prevButton(){
		prevButton = driver.findElement(By.xpath("(//div[@class='sub_floatleft']/input)[2]"));
		return prevButton;
	}

}
