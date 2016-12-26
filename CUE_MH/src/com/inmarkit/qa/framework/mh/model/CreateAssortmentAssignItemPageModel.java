

package com.inmarkit.qa.framework.mh.model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAssortmentAssignItemPageModel extends MHModelBase{

	private WebElement pageTitle = null;
	private WebElement prevStepButton = null;
	private WebElement nextStepButton = null;
	private WebElement selectAllThisPage = null;
	private WebElement clearAllThisPage = null;
	private WebElement selectAllAllPages = null;
	private WebElement clearAllAllPages = null;
	private WebElement filterByEditbox = null;
	private WebElement checkboxByName = null;
	private WebElement checkboxByMarkitCode = null;
	private WebElement itemName = null;
	private List<WebElement> itemCheckboxes = null;
	public CreateAssortmentAssignItemPageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement pageTitle(){
		pageTitle = driver.findElement(By.xpath("//div[@class='store_info']//h1"));
		return pageTitle;
	}
	
	public WebElement prevStepButton(){
		prevStepButton = driver.findElement(By.xpath("//input[@class='prevstep clickable']"));
		return prevStepButton;
	}
	
	public WebElement nextStepButton(){
		nextStepButton = driver.findElement(By.xpath("//input[@class='nextstep clickable']"));
		return nextStepButton;
	}
	
	public WebElement selectAllThisPage(){
		selectAllThisPage = driver.findElement(By.xpath("//div[@class='list_header_normal']//tr[1]//a[text()='Select All']"));
		return selectAllThisPage;
	}
	
	public WebElement clearAllThisPage(){
		clearAllThisPage = driver.findElement(By.xpath("//div[@class='list_header_normal']//tr[1]//a[text()='Clear All']"));
		return clearAllThisPage;
	}
	
	public WebElement selectAllAllPages(){
		selectAllAllPages = driver.findElement(By.xpath("//div[@class='list_header_normal']//tr[2]//a[text()='Select All']"));
		return selectAllAllPages;
	}
	
	public WebElement clearAllAllPages(){
		clearAllAllPages = driver.findElement(By.xpath("//div[@class='list_header_normal']//tr[2]//a[text()='Clear All']"));
		return clearAllAllPages;
	}
	
	public WebElement filterByEditbox(){
		filterByEditbox = driver.findElement(By.id("filter"));
		return filterByEditbox;
	}
	
	public WebElement checkboxByMarkitCode(String code){
		checkboxByMarkitCode = driver.findElement(By.linkText("//div[@class='list_data']//tr[contains(@id, 'row')]" +
													"//a[contains(text(), '"+code+"')]/../..//input"));
		return checkboxByMarkitCode;
	}
	
	public WebElement checkboxByName(String itemname){
		checkboxByName = driver.findElement(By.linkText("//div[@class='list_data']//td/a[contains(text(), '"+itemname+"')]" +
																					"/../..//input[contains(@id,'cb')]"));
		return checkboxByName;
	}
	
	public WebElement itemName(String itemname){
		itemName = driver.findElement(By.linkText("//div[@class='list_data']//tr[contains(@id, 'row')]" +
																	"//a[contains(text(), '"+itemname+"')]"));
		return itemName;
	}
	
	public List<WebElement> itemCheckboxes(){
		itemCheckboxes = driver.findElements(By.xpath("//div[@class='list_data']//input"));
		return itemCheckboxes;
	}

}
