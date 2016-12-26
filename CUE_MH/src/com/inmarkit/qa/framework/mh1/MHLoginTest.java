package com.inmarkit.qa.framework.mh1;

import org.junit.Test;

public class MHLoginTest extends MHScriptBase{
	

	@Test
	public void logInwithValidIDandPWTest(){
		mhLoginPage().login("miclue@cueconnect.com", "yecru3r");
		mhHomePage().clickAboutInmarkitUpperMenu();

	}

}
