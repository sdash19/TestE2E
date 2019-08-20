package com.cap.hashing;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resourcess.BaseTest;



	
	public class ValidateText extends BaseTest {
		public  static Logger log=LogManager.getLogger(BaseTest.class.getName());
		
		@BeforeTest
		public void homePageNavigation() throws IOException  {
			driver=initializeDriver();
			log.info("Driver is initialized");
			driver.get(prop.getProperty("url"));
			log.info("navigated to homepage");
			}
		
		@Test
			public void validateNavBar() throws IOException {
			
				LandingPage l=new LandingPage(driver);
				String str1=l.getTextLandingPage().getText();
		Assert.assertEquals(str1,"FEATURED COURSES" );	   
		Assert.assertTrue(l.getNavBarLandingPage().isDisplayed());
		log.info("Successfully validated text message");
		}
		
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}}
