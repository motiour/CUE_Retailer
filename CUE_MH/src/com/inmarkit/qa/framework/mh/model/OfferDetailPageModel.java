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
public class OfferDetailPageModel extends MHModelBase{

	private WebElement pageHeader = null;
	private WebElement markitCode = null;
	private WebElement offerName = null;
	private WebElement offerDescription = null;
	private WebElement smsOfferDescription = null;
	private WebElement offerTag = null;
	private WebElement offerSmsName = null;
	private WebElement dateRange = null;
	private WebElement offerUrl = null;
	private WebElement deleteThisButton = null;
	private WebElement editThisButton = null;
	
	public OfferDetailPageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
		
	public WebElement pageTitle(){
		pageHeader = driver.findElement(By.xpath("//div[@class='header_gray']//td[@class='header_title']"));
		return pageHeader;
	}
	
	public WebElement markitCode(){
		markitCode = driver.findElement(By.xpath("//div[@class='store_info']//table[@class='detail_table']" +
																"//td[contains(text(), 'Markit Code')]"));
		return markitCode;
	}
	
	public WebElement offerName(){
		offerName = driver.findElement(By.xpath("//div[@class='store_info']/table//table[2]/tbody/tr[4]/td[1]"));
		return offerName;
	}
		
	public WebElement offerSmsName(){
		offerSmsName = driver.findElement(By.xpath("//div[@class='store_info']/table//table[2]/tbody/tr[4]/td[2]"));
		return offerSmsName;
	}
	

	public WebElement offerDescription(){
		offerDescription = driver.findElement(By.xpath("//div[@class='store_info']/table//table[2]/tbody/tr[7]/td[1]"));
		return offerDescription;
	}
	
	public WebElement smsOfferDescription(){
		smsOfferDescription = driver.findElement(By.xpath("//div[@class='store_info']/table//table[2]/tbody/tr[7]/td[2]"));
		return smsOfferDescription;
	}
	
	public WebElement offerTag(){
		offerTag = driver.findElement(By.xpath("//div[@class='store_info']/table//table[2]/tbody/tr[10]/td[1]"));
		return offerTag;
	}
	
	public WebElement offerUrl(){
		offerUrl = driver.findElement(By.xpath("//div[@class='store_info']/table//table[2]/tbody/tr[13]/td"));
		return offerUrl;
	}
	
	public WebElement dateRange(){
		dateRange = driver.findElement(By.xpath("//div[@class='store_info']/table//table[2]/tbody/tr[22]/td"));
		return dateRange;
	}
	
	public WebElement deleteThisButton(){
		deleteThisButton = driver.findElement(By.xpath("//div[@class='store_info']//table[1]//td[2]/input"));
		return deleteThisButton;
	}
	
	public WebElement editThisButton(){
		editThisButton = driver.findElement(By.xpath("//div[@class='store_info']//table[1]//td[3]/input"));
		return editThisButton;
	}

}
