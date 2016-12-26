package com.inmarkit.qa.framework.mh.model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfileAccountInfoPageModel extends MHModelBase{

	private WebElement pageTitle = null;
	private WebElement partnerInfo = null;
	private List<WebElement> yourInformation = null;
	private WebElement name = null;
	private WebElement title = null;
	private WebElement phone = null;
	private WebElement mobile = null;
	private WebElement email = null;
	private WebElement editButton = null;
	private WebElement savedMsg = null;
	
	public ProfileAccountInfoPageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement pageTitle(){
		pageTitle = driver.findElement(By.xpath("//div[@class='header_gray']//td[@class='header_title']"));
		return pageTitle;
	}
	
	public WebElement partnerInfo(){
		partnerInfo = driver.findElement(By.xpath("(//div[@class='partner_info_box'])[1]"));
		return partnerInfo;
	}
	
	
	public List<WebElement> yourInformation(){
		yourInformation = driver.findElements(By.xpath("//div[@class='partner_info_box']//tr"));
		return yourInformation;
	}
	
	public WebElement name(){
		name = driver.findElement(By.xpath("//div[@class='partner_info_box']/table[@class='info_contact']//tr[2]/td[1]"));
		return name;
	}
	
	public WebElement title(){
		title = driver.findElement(By.xpath("//div[@class='partner_info_box']/table[@class='info_contact']//tr[2]/td[2]"));
		return title;
	}
	
	public WebElement phone(){
		phone = driver.findElement(By.xpath("//div[@class='partner_info_box']/table[@class='info_contact']//tr[3]/td[1]"));
		return phone;
	}
	
	public WebElement mobile(){
		mobile = driver.findElement(By.xpath("//div[@class='partner_info_box']/table[@class='info_contact']//tr[3]/td[2]"));
		return mobile;
	}

	public WebElement email(){
		email = driver.findElement(By.xpath("//div[@class='partner_info_box']/table[@class='info_contact']//tr[4]/td[2]"));
		return email;
	}
	
	public WebElement editButton(){
		editButton = driver.findElement(By.xpath("//div[@class='partner_info_box']/table[@class='info_contact']//a/img"));
		return editButton;
	}
	
	public WebElement savedMsg(){
		savedMsg = driver.findElement(By.xpath("//div[@id='update_msg']"));
		return savedMsg;
	}
	
}
