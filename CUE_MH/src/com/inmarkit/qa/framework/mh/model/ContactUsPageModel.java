
package com.inmarkit.qa.framework.mh.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPageModel extends MHModelBase{

	private WebElement pageTitle = null;
	private WebElement ourFAQsLink = null;
	private WebElement chooseTopicsCombobox = null;
	private WebElement nameEditbox = null;
	private WebElement loginNameEditbox = null;
	private WebElement companyEditbox = null;
	private WebElement subjectEditbox = null;
	private WebElement commentsEditbox = null;
	private WebElement submitButton = null;
	public ContactUsPageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement pageTitle(){
		pageTitle = driver.findElement(By.xpath("//div[@class='header_gray']//td[@class='header_title']"));
		return pageTitle;
	}
	
	public WebElement ourFAQsLink(){
		ourFAQsLink = driver.findElement(By.xpath("//div[@class='content']/p[2]/a"));
		return ourFAQsLink;
	}
	
	
	public WebElement chooseTopicsCombobox(){
		chooseTopicsCombobox = driver.findElement(By.xpath("//div[@class='form-row']/select[@id='topic']"));
		return chooseTopicsCombobox;
	}
	
	public WebElement nameEditbox(){
		nameEditbox = driver.findElement(By.id("name"));
		return nameEditbox;
	}
	
	public WebElement loginNameEditbox(){
		loginNameEditbox = driver.findElement(By.id("loginName"));
		return loginNameEditbox;
	}
	
	public WebElement companyEditbox(){
		companyEditbox = driver.findElement(By.id("company"));
		return companyEditbox;
	}
	
	public WebElement subjectEditbox(){
		subjectEditbox = driver.findElement(By.id("subject"));
		return subjectEditbox;
	}
	
	public WebElement commentsEditbox(){
		commentsEditbox = driver.findElement(By.id("comment"));
		return commentsEditbox;
	}
	
	public WebElement submitButton(){
		submitButton = driver.findElement(By.xpath("//input[@class='button_us']"));
		return submitButton;
	}

}
