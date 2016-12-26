package com.paxotech.qa;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Test;
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

public class MyFirstTest {

	public WebDriver driver = null;

	@Before
	public void beforeTest() throws SecurityException, IOException {


		
		System.setProperty("webdriver.gecko.driver", "C:\\DevTools\\FireFoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://business.cueconnect.com/");
		 

	}

	public void delayFor(int time) {

		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@After
	public void afterTest() {

		driver.close();
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
		String code = "var fireOnThis = arguments[0];" + "var evObj = document.createEvent('MouseEvents');"
				+ "evObj.initEvent( 'click',true,false );" + "fireOnThis.dispatchEvent(evObj);";
		((JavascriptExecutor) driver).executeScript(code, element);
	}

	public void mouseOver(WebElement element) {
		String code = "var fireOnThis = arguments[0];" + "var evObj = document.createEvent('MouseEvents');"
				+ "evObj.initEvent( 'mouseover', true, true );" + "fireOnThis.dispatchEvent(evObj);";
		((JavascriptExecutor) driver).executeScript(code, element);
	}

	@Test
	public void LoginTestWith_Valid_Id_PW() {


		

		WebElement signInButton = driver.findElement(By.xpath("//*[@id='imi-opensignin']"));
		delayFor(2000);
		signInButton.click();

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
