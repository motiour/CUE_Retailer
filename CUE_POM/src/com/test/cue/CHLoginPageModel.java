package com.test.cue;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CHLoginPageModel extends ModelBase{

    public CHLoginPageModel(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        // TODO Auto-generated constructor stub
    }

    
    public void delayFor(int time) {

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    
    
    @FindBy(how = How.ID, using = "imi-opensignin")
    private WebElement signInButon1;
    
    @FindBy(how = How.XPATH, using = "//*[@id='signin-email']")
    private WebElement emailTextBox;
    
    @FindBy(how = How.XPATH, using = "//*[@id='signin-password']")
    private WebElement passwordTextBox;
    
    
    @FindBy(how = How.XPATH, using = "//*[@id='signin-submit']")
    private WebElement signInButton2;

    
    
    public void signIn(String email , String password){
    
        signInButon1.click();
        delayFor(3000);
        emailTextBox.sendKeys(email);
        delayFor(3000);
        passwordTextBox.sendKeys(password);
        delayFor(3000);
        signInButton2.click();
        
    }
    
    
    
    
    
    
    
}