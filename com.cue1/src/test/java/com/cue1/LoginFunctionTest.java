package com.cue1;

import org.testng.annotations.Test;

import com.cue1.framework.ScriptBase;

public class LoginFunctionTest extends ScriptBase{
	

	 @Test
	    public void logTest1(){
		 
		 cueConnect().loginPage().loginTest("mrahman3555@yahoo.com", "123456");
	 
	 }

}
