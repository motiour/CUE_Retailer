/**
 * 
 */
package com.inmarkit.qa.framework.mh.model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author nazrulislam
 *
 */
public class OfferManagerPageModel extends MHModelBase{

	private WebElement pageTitle = null;
	private WebElement offerTab1 = null;
	private WebElement offerTabs = null;
	private WebElement totalOfferInfo = null;
	private WebElement selectAllLink = null;
	private WebElement clearAllLink = null;
	private WebElement deleteSelectedButton = null;
	private WebElement filterByEditbox = null;
	private WebElement selectOfferCombobox = null;
	private WebElement checkboxByOfferName = null;
	private WebElement editByOfferName = null;
	private WebElement deleteByOfferName = null;
	private List<WebElement> allCheckboxes = null;
	private WebElement offerName = null;
	private WebElement shareableStatus = null;
	private WebElement offerDescription = null;
	private WebElement offerRegion = null;
	private WebElement offerEnddate = null;
	private List<WebElement> offers = null;
	private List<WebElement> share = null;
	
	public OfferManagerPageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement pageTitle(){
		pageTitle = driver.findElement(By.xpath("//div[@class='header_gray']//td[@class='header_title']"));
		return pageTitle;
	}
	

	
	public WebElement offerTabs(String tabname){
		offerTabs = driver.findElement(By.xpath("//div[@class='content']//ul='"+tabname+"']"));
		return offerTabs;
	}
	
	public WebElement offerName(String startDate){
		offerName = driver.findElement(By.xpath("//div[@class='list_data']" +
												"//td[contains(text(), '"+ startDate +"')]/..//td[3]"));
		return offerName;
	}
	
//	public WebElement checkboxByOfferName(String name){
//		offerName = driver.findElement(By.xpath("//div[@class='list_data']" +
//												"//td[contains(text(), '"+ name +"')]/..//td[3]"));
//		return offerName;
//	}
	
	public WebElement shareableStatus(String offerName){
		shareableStatus = driver.findElement(By.xpath("//div[@class='list_data']" +
												"//td[contains(text(), '"+ offerName +"')]/..//td[2]"));
		return shareableStatus;
	}
	
	public WebElement offerDescription(String offerName){
		offerDescription = driver.findElement(By.xpath("//div[@class='list_data']" +
												"//td[contains(text(), '"+ offerName +"')]/..//td[4]"));
		return offerDescription;
	}
	
	public WebElement offerRegion(String offerName){
		offerRegion = driver.findElement(By.xpath("//div[@class='list_data']" +
												"//td[contains(text(), '"+ offerName +"')]/..//td[5]"));
		return offerRegion;
	}
	
	public WebElement offerEnddate(String offerName){
		offerEnddate = driver.findElement(By.xpath("//div[@class='list_data']" +
												"//td[contains(text(), '"+ offerName +"')]/..//td[7]"));
		return offerEnddate;
	}
	
	public WebElement totalOfferInfo(){
		totalOfferInfo = driver.findElement(By.xpath("//div[@class='store_info']//h2"));
		return totalOfferInfo;
	}
	
	public WebElement selectAllLink(){
		selectAllLink = driver.findElement(By.linkText("Select All"));
		return selectAllLink;
	}
	
	public WebElement clearAllLink(){
		clearAllLink = driver.findElement(By.linkText("Clear All"));
		return clearAllLink;
	}
	
	public WebElement deleteSelectedButton(){
		deleteSelectedButton = driver.findElement(By.xpath("//div[@class='list_header_normal']//input[@class='search']"));
		return deleteSelectedButton;
	}
	
	public WebElement filterByEditbox(){
		filterByEditbox = driver.findElement(By.xpath("//div[@class='list_header_normal']//input[@id='filter']"));
		return filterByEditbox;
	}
	
	public WebElement selectOfferCombobox(){
		selectOfferCombobox = driver.findElement(By.xpath("//div[@class='list_header_normal']//form[@id='cform']/select"));
		return selectOfferCombobox;
	}
	
	public WebElement checkboxByOfferName(String offername){
		checkboxByOfferName = driver.findElement(By.xpath("//div[@class='list_data']//tr[contains(@id, 'promo_row_')]" +
											"/td[contains(text(), '"+offername+"')]/..//input"));
		return checkboxByOfferName;
	}
	
	public WebElement editByOfferName(String offername){
		editByOfferName = driver.findElement(By.xpath("//div[@class='list_data']//tr[contains(@id, 'promo_row_')]" +
											"/td[contains(text(), '"+offername+"')]/..//a[contains(text(), 'Edit')]"));
		return editByOfferName;
	}
	
	public WebElement deleteByOfferName(String offername){
		deleteByOfferName = driver.findElement(By.xpath("//div[@class='list_data']//tr[contains(@id, 'promo_row_')]" +
											"/td[contains(text(), '"+offername+"')]/..//a[contains(text(), 'Delete')]"));
		return deleteByOfferName;
	}
	
	public List<WebElement> allCheckboxes(){
		allCheckboxes = driver.findElements(By.xpath("//div[@class='list_data']//tr[contains(@id, 'promo_row_')]/td//input"));
		return allCheckboxes;
	}
	
	public List<WebElement> offers(){
		offers = driver.findElements(By.xpath("//div[@class='list_data']//tr[contains(@id, 'promo_row_')]/td[3]"));
		return offers;
	}
	
	public List<WebElement> share(){
		share = driver.findElements(By.xpath("//div[@class='list_data']//tr[contains(@id, 'promo_row_')]/td[2]"));
		return share;
	}

}
