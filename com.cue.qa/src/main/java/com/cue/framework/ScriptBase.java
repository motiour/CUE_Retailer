package com.cue.framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import com.cue.framework.pages.LoginPage;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import io.github.bonigarcia.wdm.PhantomJsDriverManager;

public class ScriptBase {

	public WebDriver driver;
	public LoginPage loginPage;


	@BeforeClass
	public void beforeTest() throws SecurityException, IOException {

		ChromeDriverManager.getInstance().setup();
		//InternetExplorerDriverManager.getInstance().setup();
		//EdgeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
		//driver = new EdgeDriver();
		//driver = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://business.cueconnect.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		

		/*
		 FirefoxProfile profile = new FirefoxProfile();
		 profile.setPreference("browser.cache.disk.enable", "false"); driver =
		 new FirefoxDriver(profile);
		
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.navigate().to("https://business.cueconnect.com/");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 */
		

		loginPage = new LoginPage(driver);
	

	}

	@AfterClass
	public void afterTest() {

		driver.close();
		driver.quit();
	}
	
	
	

	public void delayFor(int time) {

		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
