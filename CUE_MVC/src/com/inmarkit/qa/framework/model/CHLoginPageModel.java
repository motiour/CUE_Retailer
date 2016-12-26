package com.inmarkit.qa.framework.model;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CHLoginPageModel extends CHModelBase {

	public CHLoginPageModel(WebDriver driver) {
		super(driver);
	}

	private WebElement signInButton1 = null;
	private WebElement emailBox = null;
	private WebElement passWordBox = null;
	private WebElement signInButton2 = null;
	private WebElement fbSignIn = null;
	private WebElement twitterSignIn = null;
	private WebElement yahooSignIn = null;
	private WebElement gmailSignIn = null;
	private WebElement fbEmail = null;
	private WebElement fbPassword = null;
	private WebElement fbButton = null;
	private WebElement TwitterEmail = null;
	private WebElement twitterPassword = null;
	private WebElement twitterButton = null;
	private WebElement yahooEmail = null;
	private WebElement yahooPassword = null;
	private WebElement yahooButton = null;
	private WebElement yahooconfirmButton = null;
	
	private WebElement gmailEmail = null;
	private WebElement gmailPassword = null;
	private WebElement gmailButton = null;


	public WebElement fbEmail() {
		fbEmail = driver.findElement(By.id("email"));
	    return fbEmail;
	}
	public WebElement fbPassword() {
		fbPassword = driver.findElement(By.id("pass"));
	    return fbPassword;
	}
	public WebElement fbButton() {
		fbButton = driver.findElement(By.xpath("//*[@id='u_0_1']"));
	    return fbButton;
	}
	public WebElement TwitterEmail() {
		TwitterEmail = driver.findElement(By.name("session[username_or_email]"));
	    return TwitterEmail;
	}
	public WebElement twitterPassword() {
		twitterPassword = driver.findElement(By.name("session[password]"));
	    return twitterPassword;
	}
	public WebElement twitterButton() {
		twitterButton = driver.findElement(By.xpath("//*[@id='allow']"));
	    return twitterButton;
	}
	
	public WebElement yahooEmail() {
		yahooEmail = driver.findElement(By.id("username"));
	    return yahooEmail;
	}
	public WebElement yahooPassword() {
		yahooPassword = driver.findElement(By.id("passwd"));
	    return yahooPassword;
	}
	public WebElement yahooButton() {
		yahooButton = driver.findElement(By.id(".save"));
	    return yahooButton;
	}
	
	public WebElement yahooconfirmButton() {
		yahooconfirmButton = driver.findElement(By.name("agree"));
	    return yahooconfirmButton;
	}
	
	
	public WebElement gmailEmail() {
		gmailEmail = driver.findElement(By.id("Email"));
	    return gmailEmail;
	}
	public WebElement gmailPassword() {
		gmailPassword = driver.findElement(By.id("Passwd"));
	    return gmailPassword;
	}
	public WebElement gmailButton() {
		gmailButton = driver.findElement(By.id("signIn"));
	    return gmailButton;
	}

	
	public WebElement signInButton1() {
		signInButton1 = driver.findElement(By.id("imi-opensignin"));
	    return signInButton1;
	}

	public WebElement emailBox() {
		emailBox = driver.findElement(By.xpath("//*[@id='signin-email']"));
		return emailBox;
	}

	public WebElement passWordBox() {
		passWordBox = driver.findElement(By.xpath("//*[@id='signin-password']"));
		return passWordBox;
	}

	public WebElement signInButton2() {
		signInButton2 = driver.findElement(By.xpath("//*[@id='signin-submit']"));
		return signInButton2;
	}
	
	public WebElement fbSignIn() {
		fbSignIn = driver.findElement(By.xpath("//*[@id='signin-content']/div[1]/div[3]/div[1]"));
	return fbSignIn;
	}
	
	public WebElement twitterSignIn() {
		twitterSignIn = driver.findElement(By.xpath(".//*[@id='signin-content']/div[1]/div[3]/div[2]"));
		return twitterSignIn;
	}
	
	public WebElement yahooSignIn() {
		yahooSignIn = driver.findElement(By.xpath(".//*[@id='signin-content']/div[1]/div[3]/div[3]"));
		return yahooSignIn;
	}
	
	public WebElement gmailSignIn() {
		gmailSignIn = driver.findElement(By.xpath(".//*[@id='signin-content']/div[1]/div[3]/div[4]"));
		return gmailSignIn;
	}



}