package com.inmarkit.qa.framework.script;

import org.junit.Test;

import com.inmarkit.qa.framework.ch.CHScriptBase;

public class ChLoginTest extends CHScriptBase{
	
	
	@Test
	public void logInwithValidIDandPWTest(){
		loginPage().login("mrahman3555@yahoo.com", "123456");
	}
	@Test
	public void loginWithINValidIDandPWTest(){
		loginPage().login("mrahman@yahoo.com", "123456");
	}
	@Test
	public void loginWithValidIDandInvalidPWTest(){
		loginPage().login("mrahman@yahoo.com", "1234567");
	}
	
	@Test
	public void FBloginTest(){
		loginPage().FBlogin();
		loginPage().switchToWindow("facebook");
		loginPage().FBdialoguebox("mrahman3555@yahoo.com", "mashreka7");
	}
	
	@Test
	public void TwitterloginTest(){
		loginPage().Twitterlogin();
		loginPage().switchToWindow("twitter");
		loginPage().twitterdialoguebox("mrahman3555", "mashreka7");

	}

	
	@Test
	public void YahoologinTest(){
		loginPage().Yahoologin();
		loginPage().switchToWindow("yahoo");
		loginPage().yahooDialoguebox("rashed_242000", "de5ertf4");

	}
	
	
	@Test
	public void GmailloginTest(){
		loginPage().Gmaillogin();
		loginPage().switchToWindow("gmail");
		loginPage().gmailDialoguebox("mohammadrahman03", "mashreka7");
		
	}


}