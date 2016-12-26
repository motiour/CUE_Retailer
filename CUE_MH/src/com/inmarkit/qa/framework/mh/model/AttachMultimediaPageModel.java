

package com.inmarkit.qa.framework.mh.model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AttachMultimediaPageModel extends MHModelBase{

	private WebElement pageTitle = null;
	private WebElement filterByBox = null;
	private WebElement viewFilesSelection = null;
	private WebElement selectAllCheckbox = null;
	private WebElement attachMultimediaButton = null;
	private WebElement exitButton = null;
	private List<WebElement> totalItem = null;
	public AttachMultimediaPageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement pageTitle(){
		pageTitle = driver.findElement(By.xpath("//div[@class='header_gray']//td[@class='header_title']"));
		return pageTitle;
	}
	
	public WebElement filterByBox(){
		filterByBox = driver.findElement(By.id("filter"));
		return filterByBox;
	}
	
	public WebElement viewFilesSelection(){
		viewFilesSelection = driver.findElement(By.xpath("//select[@id='viewby']"));
		return viewFilesSelection;
	}
	
	public WebElement selectAllCheckbox(){
		selectAllCheckbox = driver.findElement(By.xpath("//table[@class='list']//input[@id='all']"));
		return selectAllCheckbox;
	}
	
	public WebElement attachMultimediaButton(){
		attachMultimediaButton = driver.findElement(By.xpath("//input[@value='Attach Multimedia']"));
		return attachMultimediaButton;
	}
	
	public WebElement exitButton(){
		exitButton = driver.findElement(By.xpath("//input[@value='Exit']"));
		return exitButton;
	}
	
	public List<WebElement> totalItem(){
		totalItem = driver.findElements(By.xpath("//form[@id='atform']/div[@class='list_data']"));
		return totalItem;
	}

}
