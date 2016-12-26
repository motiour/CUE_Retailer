package com.paxotech.qa;



import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.internal.Locatable;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Test1 {

	public WebDriver driver = null;
	

	
    @BeforeClass
    public void beforeTest() throws SecurityException, IOException {
    	
    	
    	
		System.setProperty("webdriver.gecko.driver", "C:\\DevTools\\FireFoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://business.cueconnect.com/");

    	
/*
    	 System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         driver.manage().window().maximize();
         driver.get("https://business.cueconnect.com/");
     */    
         
   
        
            
            
         
         /*
      
      
		
		System.setProperty("webdriver.gecko.driver", "C:\\DevTools\\FireFoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://business.cueconnect.com/");
          */
         

    }
    
    
    public void delayFor(int time) {

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    @AfterClass
    public void afterTest() {
    	
    
    	driver.quit();
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


public void mouseClick(WebElement element) {
    String code = "var fireOnThis = arguments[0];"
                + "var evObj = document.createEvent('MouseEvents');"
                + "evObj.initEvent( 'click',true,false );"
                + "fireOnThis.dispatchEvent(evObj);";
    ((JavascriptExecutor) driver).executeScript(code, element);
}





public void mouseOver(WebElement element) {
    String code = "var fireOnThis = arguments[0];"
                + "var evObj = document.createEvent('MouseEvents');"
                + "evObj.initEvent( 'mouseover', true, true );"
                + "fireOnThis.dispatchEvent(evObj);";
    ((JavascriptExecutor) driver).executeScript(code, element);
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
	public void LoginTestWith_Valid_Id_PW() {


		WebElement signInButton = driver.findElement(By.xpath("//*[@id='imi-opensignin']"));
		delayFor(2000);
		signInButton.click();

		/*
		WebElement signInButton = driver.findElement(By.id("//*[@id='imi-opensignin']"));
		delayFor(2000);
		signInButton.click();
*/
		WebElement emailTextBox = driver.findElement(By.xpath("//*[@id='signin-email']"));
		delayFor(2000);
		emailTextBox.sendKeys("mrahman3555@yahoo.com");

		WebElement passWordBox = driver.findElement(By.xpath("//*[@id='signin-password']"));
		delayFor(2000);
		passWordBox.sendKeys("123456");

		WebElement button = driver.findElement(By.xpath("//*[@id='signin-submit']"));
		button.click();
		delayFor(20000);

		driver.close();

	}

    
    
    
    

}