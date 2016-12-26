package com.qa.inmarkit;

import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.internal.Locatable;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestJenkinDemo {

	
	public WebDriver driver = null;

	@BeforeClass
	
	//@BeforeMethod
	public void beforeTest() {



    	 System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         driver.manage().window().maximize();
         driver.get("https://business.cueconnect.com/");
         

	}

	
	
	public void mouseClick(WebElement element) {
		String code = "var fireOnThis = arguments[0];" + "var evObj = document.createEvent('MouseEvents');"
				+ "evObj.initEvent( 'click',true,false );" + "fireOnThis.dispatchEvent(evObj);";
		((JavascriptExecutor) driver).executeScript(code, element);
	}

	public void mouseOver(WebElement element) {
		String code = "var fireOnThis = arguments[0];" + "var evObj = document.createEvent('MouseEvents');"
				+ "evObj.initEvent( 'mouseover', true, true );" + "fireOnThis.dispatchEvent(evObj);";
		((JavascriptExecutor) driver).executeScript(code, element);
	}

	public void hoverItem(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
	}

	public void hoverItem(By by) {
		WebElement element = driver.findElement(by);
		hoverItem(element);
	}

	public void hoverItemEx(WebElement element) {
		Locatable hoverItem = (Locatable) element;
		Mouse mouse = ((HasInputDevices) driver).getMouse();
		mouse.mouseMove(hoverItem.getCoordinates());
	}

	public void hoverItemEx(By by) {
		WebElement element = driver.findElement(by);
		hoverItemEx(element);
	}

	

	public String switchWindowByTitle(String titleToMatch) {
		String currentWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for (String item : windows) {
			System.out.println(item);
			if (item.contentEquals(item)) {
				driver.switchTo().window(item);
				String title = driver.getTitle();
				if (title.contains(titleToMatch)) {
					break;
				}
			}
		}

		return currentWindow;
	}

	public void delayFor(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	@AfterClass
	public void afterMethod(){
		
		driver.quit();
	}

	
	

	@Test
	public void SearchByFacebook() {

		WebElement signInButton = driver.findElement(By.xpath("//*[@id='imi-opensignin']"));
		delayFor(2000);
		signInButton.click();

		WebElement emailTextBox = driver.findElement(By.xpath("//*[@id='signin-email']"));
		delayFor(2000);
		emailTextBox.sendKeys("nick45555@yahoo.com");

		WebElement passWordBox = driver.findElement(By.xpath("//*[@id='signin-password']"));
		delayFor(2000);
		passWordBox.sendKeys("123456");

		WebElement button = driver.findElement(By.xpath("//*[@id='signin-submit']"));
		delayFor(2000);
		button.click();
		
		WebElement searchButton = driver.findElement(By.xpath("//*[@class='search']"));
		delayFor(2000);
		mouseClick(searchButton);
		delayFor(5000);

		WebElement searchButton1 = driver.findElement(By.xpath("//*[@id='imi-search-field-fixed']/form/input"));
		delayFor(2000);
		searchButton1.sendKeys("email");
		delayFor(2000);
		searchButton1.sendKeys(Keys.RETURN);
		delayFor(10000);
		
		driver.close();
}
	

	     //@Test
	     public void TwitterPost() {

	                WebElement signInButton = driver.findElement(By.xpath("//*[@id='imi-opensignin']"));
	                delayFor(2000);
	                signInButton.click();

	                WebElement emailTextBox = driver.findElement(By.xpath("//*[@id='signin-email']"));
	                delayFor(2000);
	                emailTextBox.sendKeys("rameesaroja4@yahoo.com");

	                WebElement passWordBox = driver.findElement(By.xpath("//*[@id='signin-password']"));
	               delayFor(2000);
	                passWordBox.sendKeys("123456");

	                WebElement button = driver.findElement(By.xpath("//*[@id='signin-submit']"));
	               delayFor(2000);
	                button.click();


	                WebElement Item = driver.findElement(By.xpath("//*[@id='item-110845']/div[2]/a"));
	               
	                delayFor(2000);
	             
	                mouseClick(Item);

	                
	                
	                WebElement ShareTab = driver.findElement(By.xpath("//*[@id='item-detail-navbar-collapse']/ul/li[2]/a"));
	                ShareTab.click();
	                delayFor(2000);

	
	                WebElement TwitterShareButton = driver.findElement(By.xpath("//*[@id='post-twitter']"));
	                TwitterShareButton.click();
	                delayFor(2000);
	                
	                WebElement CommentsBox = driver.findElement(By.xpath("//*[@id='imi-after-post-network-select']/div[1]/textarea"));
	                CommentsBox.sendKeys("This is Facebook Great post!!");

	                WebElement SendButton = driver.findElement(By.xpath("//*[@id='post-submit']"));
	                delayFor(5000);
	                SendButton.click();

	                
	                WebElement searchButton = driver.findElement(By.xpath("//*[@class='search']"));
	        		delayFor(2000);
	        		mouseClick(searchButton);
	        		delayFor(10000);

	        		

	        		WebElement searchButton1 = driver.findElement(By.xpath("//*[@id='imi-search-field-fixed']/form/input"));
	        		delayFor(2000);
	        		searchButton1.sendKeys("twitter");
	        		delayFor(2000);
	        		searchButton1.sendKeys(Keys.RETURN);
	        		delayFor(10000);
	                
	                driver.close();

	        }

	     

	 	
	     @Test
	 	public void MHLoginTest() {
	     	

	 		WebElement signInButton = driver.findElement(By.xpath("//*[@id='imi-opensignin']"));
	 		delayFor(2000);
	 		signInButton.click();

	 		WebElement emailTextBox = driver.findElement(By.xpath("//*[@id='signin-email']"));
	 		delayFor(2000);
	 		emailTextBox.sendKeys("miclue@cueconnect.com");

	 		WebElement passWordBox = driver.findElement(By.xpath("//*[@id='signin-password']"));
	 		delayFor(2000);
	 		passWordBox.sendKeys("yecru3r");
	 		
	 		WebElement button = driver.findElement(By.xpath("//*[@id='signin-submit']"));
	 		button.click();
	 		delayFor(20000);


	 		WebElement homeTab = driver.findElement(By.xpath("//*[@id='imi-app']/body/div[2]/div[1]/ul/li[1]/a"));
	 		homeTab.click();
	 		delayFor(2000);


	 		WebElement codeImpTab = driver.findElement(By.xpath("//*[@id='imi-app']/body/div[2]/div[1]/ul/li[2]/a"));
	 		codeImpTab.click();
	 		delayFor(2000);
	 		

	 		WebElement actImpTab = driver.findElement(By.xpath("//*[@id='imi-app']/body/div[2]/div[1]/ul/li[3]/a"));
	 		actImpTab.click();
	 		delayFor(2000);

	 		

	 		WebElement designImpTab = driver.findElement(By.xpath("//*[@id='imi-app']/body/div[2]/div[1]/ul/li[4]/a"));
	 		designImpTab.click();
	 		delayFor(2000);

	 		

	 		WebElement dataImpTab = driver.findElement(By.xpath("//*[@id='imi-app']/body/div[2]/div[1]/ul/li[5]/a"));
	 		dataImpTab.click();
	 		delayFor(2000);

	 		WebElement AssortmentTab = driver.findElement(By.xpath("//*[@id='imi-app']/body/div[2]/div[1]/ul/li[6]/a"));
	 		AssortmentTab.click();
	 		delayFor(2000);


	 		WebElement offerTab = driver.findElement(By.xpath("//*[@id='imi-app']/body/div[2]/div[1]/ul/li[7]/a"));
	 		offerTab.click();
	 		delayFor(2000);

	 		
	 		//*[@id='imi-app']/body/div[2]/div[1]/ul/li[1]/a
	 		
	 	
	 		driver.close();
	 			
	 			}
	     
	     
	     
	     
	     @Test
	 	public void MH_AccountSetting_Page() {

	 		WebElement signInButton = driver.findElement(By.xpath("//*[@id='imi-opensignin']"));
	 		delayFor(2000);
	 		signInButton.click();

	 		WebElement emailTextBox = driver.findElement(By.xpath("//*[@id='signin-email']"));
	 		delayFor(2000);
	 		emailTextBox.sendKeys("miclue@cueconnect.com");

	 		WebElement passWordBox = driver.findElement(By.xpath("//*[@id='signin-password']"));
	 		delayFor(2000);
	 		passWordBox.sendKeys("yecru3r");

	 		WebElement button = driver.findElement(By.xpath("//*[@id='signin-submit']"));
	 		button.click();
	 		delayFor(20000);

	 		WebElement actImpTab = driver.findElement(By.xpath("//*[@id='imi-app']/body/div[2]/div[1]/ul/li[3]/a"));
	 		actImpTab.click();
	 		delayFor(2000);

	 		WebElement designImpTab = driver
	 				.findElement(By.xpath(".//*[@id='imi-app']/body/div[2]/div[1]/ul/li[3]/ul/li[2]/a"));
	 		designImpTab.click();
	 		delayFor(2000);

	 		WebElement dataImpTab = driver
	 				.findElement(By.xpath(".//*[@id='imi-app']/body/div[2]/div[1]/ul/li[3]/ul/li[3]/a"));
	 		dataImpTab.click();
	 		delayFor(2000);

	 		WebElement AssortmentTab = driver
	 				.findElement(By.xpath(".//*[@id='imi-app']/body/div[2]/div[1]/ul/li[3]/ul/li[4]/a"));
	 		AssortmentTab.click();
	 		delayFor(2000);

	 		driver.close();

	 	}
	
	
	
}
