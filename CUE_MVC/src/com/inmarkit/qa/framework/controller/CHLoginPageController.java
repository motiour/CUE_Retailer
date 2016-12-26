package com.inmarkit.qa.framework.controller;



import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.inmarkit.qa.framework.model.CHLoginPageModel;

public class CHLoginPageController extends CHControllerBase{

	CHLoginPageModel CHlogInPage = null;
	
	public CHLoginPageController(WebDriver driver) {
		super(driver);
		CHlogInPage = new CHLoginPageModel(driver);
	}

	public void login(String email, String password){
		CHlogInPage.signInButton1().click();
		delayFor(3000);
		CHlogInPage.emailBox().sendKeys(email);
		delayFor(1000);
		CHlogInPage.passWordBox().sendKeys(password);
		delayFor(1000);
		CHlogInPage.signInButton2().click();
		delayFor(10000);
		
		
	}
	
	public void FBlogin(){
		CHlogInPage.signInButton1().click();
		delayFor(3000);
		CHlogInPage.fbSignIn().click();
		
			
	}
	
	public void FBdialoguebox(String email, String pass){
		CHlogInPage.fbEmail().sendKeys(email);
		delayFor(3000);
		CHlogInPage.fbPassword().sendKeys(pass);
		delayFor(3000);
		CHlogInPage.fbButton().click();
		delayFor(10000);
		
			}
	
	
	public void twitterLogin(String email, String pass){
		CHlogInPage.TwitterEmail().sendKeys(email);
		CHlogInPage.twitterPassword().sendKeys(pass);
		CHlogInPage.twitterButton().click();
		
	}
	
	public void twitterdialoguebox(String email, String pass){
		CHlogInPage.TwitterEmail().sendKeys(email);
		delayFor(3000);
		CHlogInPage.twitterPassword().sendKeys(pass);
		delayFor(3000);
		CHlogInPage.twitterButton().click();
		delayFor(10000);
		}

		
	public void yahooDialoguebox(String email, String pass){
		CHlogInPage.yahooEmail().sendKeys(email);
		delayFor(3000);
		CHlogInPage.yahooPassword().sendKeys(pass);
		delayFor(3000);
		CHlogInPage.yahooButton().click();
		delayFor(30000);
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		CHlogInPage.yahooconfirmButton().click();
		delayFor(30000);

		
		}
	
	public void gmailDialoguebox(String email, String pass){
		CHlogInPage.gmailEmail().sendKeys(email);
		delayFor(3000);
		CHlogInPage.gmailPassword().sendKeys(pass);
		delayFor(3000);
		CHlogInPage.gmailButton().click();
		delayFor(10000);
		
		}


	
	public void switchToWindow(String title){
	Set<String> hwin = driver.getWindowHandles();
	for(String h:hwin){
		System.out.println(h);
		driver.switchTo().window(h);
		String currentWinTitle = driver.getTitle();
		if (currentWinTitle.contentEquals(title))
			break;
			}

		
	}
	
	
	
	
	public void Twitterlogin(){
		CHlogInPage.signInButton1().click();
		delayFor(3000);
		CHlogInPage.twitterSignIn().click();
	}
	
	
	
	
	
	

	public void Yahoologin(){
		CHlogInPage.signInButton1().click();
		delayFor(3000);
		CHlogInPage.yahooSignIn().click();
	}
	
	public void Gmaillogin(){
		CHlogInPage.signInButton1().click();
		delayFor(3000);
		CHlogInPage.gmailSignIn().click();
	}

	
	public void FBlogin1(){
		CHlogInPage.signInButton1().click();
		delayFor(3000);
		
		String currentWin = driver.getWindowHandle();
		
		CHlogInPage.fbSignIn().click();
		
		Set<String> hwin = driver.getWindowHandles();
		
		for(String h:hwin){
			System.out.println(h);
				driver.switchTo().window(h);
				System.out.println(driver.getTitle());
			}
	}
	
	
	
	
}
