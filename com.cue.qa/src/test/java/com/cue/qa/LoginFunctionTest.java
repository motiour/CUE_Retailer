package com.cue.qa;

import org.testng.annotations.Test;

import com.cue.framework.ScriptBase;

public class LoginFunctionTest extends ScriptBase {

	
	 @Test
	    public void logTest1(){
		 loginPage.loginTest("mrahman3555@yahoo.com", "123456");
	 
	 }
	    	

}
