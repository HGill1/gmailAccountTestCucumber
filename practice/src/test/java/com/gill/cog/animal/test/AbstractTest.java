package com.gill.cog.animal.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gill.cog.animal.pageObject.HomePage;

public class AbstractTest {
	protected static WebDriver driver;
	protected HomePage onHomePage;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		onHomePage = new HomePage(driver);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	

}
