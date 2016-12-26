package com.test.cue;


import org.openqa.selenium.WebDriver;

public class ModelBase {
    
protected WebDriver driver = null;
    
public  ModelBase (WebDriver driver) {
    this.driver = driver;

}

}