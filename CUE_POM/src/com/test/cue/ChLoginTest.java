package com.test.cue;





import org.junit.Test;



public class ChLoginTest extends ScriptBase{
    
    
    
    
    @Test
    public void logInTest(){
        CHLoginPageModel loginPage = new CHLoginPageModel(driver);
        loginPage.signIn("mrahman3555@yahoo.com", "123456");
        
    }
    
    
    

}
