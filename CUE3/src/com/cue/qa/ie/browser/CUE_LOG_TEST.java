package com.cue.qa.ie.browser;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CUE_LOG_TEST {
	
	

	

	public void delayFor(int time) {

		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	

	@Test
	public void LoginTestWith_Valid_Id_PW() {
		
		WebDriver driver = null;
		System.setProperty("webdriver.edge.driver", "C://DevTools//MicrosoftEdge//MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String domain = "https://business.cueconnect.com/";
		driver.get(domain);

		driver.close();
		driver.quit();

	}

}
