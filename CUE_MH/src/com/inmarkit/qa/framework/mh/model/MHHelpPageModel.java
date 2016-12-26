package com.inmarkit.qa.framework.mh.model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MHHelpPageModel extends MHModelBase{

	private WebElement pageTitle = null;
	private WebElement helpLinkByText = null;
	private List<WebElement> formattinGuide = null;
	
	private List<WebElement> totalLinks = null;
	private List<WebElement> generalLinks = null;
	private List<WebElement> registrationLinks = null;
	private List<WebElement> loginLinks = null;
	private List<WebElement> gettingStartedLinks = null;
	private List<WebElement> formattinGuideLinks = null;
	private List<WebElement> accountInformationLinks = null;
	private List<WebElement> storeInformationLinks = null;
	private List<WebElement> itemManagerLinks = null;
	private List<WebElement> assortmentManagerLinks = null;
	private List<WebElement> offerManagerLinks = null;
	private List<WebElement> regionManagerLinks = null;
	private List<WebElement> multimediaLinks = null;
	private List<WebElement> uploadDataLinks = null;
	private List<WebElement> poweredByLinks = null;
	private List<WebElement> reportsLinks = null;
	private List<WebElement> supportsLinks = null;
	private List<WebElement> platformIntigrityLinks = null;
	private List<WebElement> retailPartnerTosLinks = null;
	private List<WebElement> miscellaneousLinks = null;
	
	public MHHelpPageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement pageTitle(){
		pageTitle = driver.findElement(By.xpath("//div[@class='header_gray']//td[@class='header_title']"));
		return pageTitle;
	}
	
	public WebElement helpLinkByText(String linktext){
		helpLinkByText = driver.findElement(By.xpath("//div[@class='typography']" +
													"//li/a[contains(text(), '"+linktext+"')]"));
		return helpLinkByText;
	}
	
	public List<WebElement> formattinGuide(){
		formattinGuide = driver.findElements(By.xpath("//div[@class='copy_text']/a"));
		return formattinGuide;
	}
	
	public List<WebElement> totalLinks(){
		totalLinks = driver.findElements(By.xpath("//div[@class='typography']//li/a"));
		return totalLinks;
	}
	
	public List<WebElement> generalLinks(){
		generalLinks = driver.findElements(By.xpath("//div[@id='Layout']/div/div[1]/ul/li/a"));
		return generalLinks;
	}
	
	public List<WebElement> registrationLinks(){
		registrationLinks = driver.findElements(By.xpath("//div[@id='Layout']/div/div[2]/ul/li/a"));
		return registrationLinks;
	}

	public List<WebElement> loginLinks(){
		loginLinks = driver.findElements(By.xpath("//div[@id='Layout']/div/div[3]/ul/li/a"));
		return loginLinks;
	}
	
	public List<WebElement> gettingStartedLinks(){
		gettingStartedLinks = driver.findElements(By.xpath("//div[@id='Layout']/div/div[4]/ul/li/a"));
		return gettingStartedLinks;
	}
	
	public List<WebElement> formattinGuideLinks(){
		formattinGuideLinks = driver.findElements(By.xpath("//div[@id='Layout']/div/div[5]/ul/li/a"));
		return formattinGuideLinks;
	}
	
	public List<WebElement> accountInformationLinks(){
		accountInformationLinks = driver.findElements(By.xpath("//div[@id='Layout']/div/div[6]/ul/li/a"));
		return accountInformationLinks;
	}
	
	public List<WebElement> storeInformationLinks(){
		storeInformationLinks = driver.findElements(By.xpath("//div[@id='Layout']/div/div[7]/ul/li/a"));
		return storeInformationLinks;
	}

	public List<WebElement> itemManagerLinks(){
		itemManagerLinks = driver.findElements(By.xpath("//div[@id='Layout']/div/div[8]/ul/li/a"));
		return itemManagerLinks;
	}
	
	public List<WebElement> assortmentManagerLinks(){
		assortmentManagerLinks = driver.findElements(By.xpath("//div[@id='Layout']/div/div[9]/ul/li/a"));
		return assortmentManagerLinks;
	}
	
	public List<WebElement> offerManagerLinks(){
		offerManagerLinks = driver.findElements(By.xpath("//div[@id='Layout']/div/div[10]/ul/li/a"));
		return offerManagerLinks;
	}
	
	public List<WebElement> regionManagerLinks(){
		regionManagerLinks = driver.findElements(By.xpath("//div[@id='Layout']/div/div[11]/ul/li/a"));
		return regionManagerLinks;
	}
	
	public List<WebElement> multimediaLinks(){
		multimediaLinks = driver.findElements(By.xpath("//div[@id='Layout']/div/div[12]/ul/li/a"));
		return multimediaLinks;
	}
	
	public List<WebElement> uploadDataLinks(){
		uploadDataLinks = driver.findElements(By.xpath("//div[@id='Layout']/div/div[13]/ul/li/a"));
		return uploadDataLinks;
	}
	
	public List<WebElement> poweredByLinks(){
		poweredByLinks = driver.findElements(By.xpath("//div[@id='Layout']/div/div[14]/ul/li/a"));
		return poweredByLinks;
	}
	
	public List<WebElement> reportsLinks(){
		reportsLinks = driver.findElements(By.xpath("//div[@id='Layout']/div/div[15]/ul/li/a"));
		return reportsLinks;
	}
	
	public List<WebElement> supportsLinks(){
		supportsLinks = driver.findElements(By.xpath("//div[@id='Layout']/div/div[16]/ul/li/a"));
		return supportsLinks;
	}
	
	public List<WebElement> platformIntigrityLinks(){
		platformIntigrityLinks = driver.findElements(By.xpath("//div[@id='Layout']/div/div[17]/ul/li/a"));
		return platformIntigrityLinks;
	}
	
	public List<WebElement> retailPartnerTosLinks(){
		retailPartnerTosLinks = driver.findElements(By.xpath("//div[@id='Layout']/div/div[18]/ul/li/a"));
		return retailPartnerTosLinks;
	}
	
	public List<WebElement> miscellaneousLinks(){
		miscellaneousLinks = driver.findElements(By.xpath("//div[@id='Layout']/div/div[19]/ul/li/a"));
		return miscellaneousLinks;
	}
	
	
}
