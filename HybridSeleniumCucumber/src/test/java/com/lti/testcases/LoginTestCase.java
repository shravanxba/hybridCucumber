package com.lti.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.lti.baseclass.Library;
import com.lti.pages.LoginPage;
import com.lti.seleniumreusablefunctions.SeleniumUtilities;

public class LoginTestCase extends Library {
	 @BeforeTest
	    public void stratUp() {
	        launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");

	    }
	    @Test
	    public void login() {
	        LoginPage lpage=new LoginPage(driver);
	        lpage.login("Admin", "admin123");

	    }
	    @AfterClass
	    public void close() throws IOException {
	        SeleniumUtilities sUti = new SeleniumUtilities(driver);
	        sUti.to_take_screenshot("src\\test\\resources\\ScreenShots\\orangeHRMLogin.png");

	    }

}
