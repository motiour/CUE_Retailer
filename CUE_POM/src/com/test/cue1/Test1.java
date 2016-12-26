package com.test.cue1;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;



public class Test1 {



    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\DevTools\\FireFoxDriver\\geckodriver.exe");

       WebDriver driver = new FirefoxDriver();

       driver.get("https://business.cueconnect.com/");

       driver.quit();

    }



}
