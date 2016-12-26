package com.cue1.framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.cue1.framework.pages.Application;
import com.cue1.framework.pages.LoginPage;
import io.github.bonigarcia.wdm.ChromeDriverManager;


public class ScriptBase {
	
	public WebDriver driver;
	public Application cueConnect;


	@AfterClass
	public void afterTest() {

		driver.close();
		driver.quit();
		cueConnect = null;
	}
	public void delayFor(int time) {

		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

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
		
		cueConnect = new Application(driver);

	}
	
	public Application cueConnect(){
		return cueConnect;
	}
	

}
