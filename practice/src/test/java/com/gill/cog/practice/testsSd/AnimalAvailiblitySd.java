package com.gill.cog.practice.testsSd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gill.cog.practice.pageObject.AdoptionPage;
import com.gill.cog.practice.pageObject.AdoptionResultPage;
import com.gill.cog.practice.pageObject.HomePage;
import com.gill.cog.practice.test.AbstractTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class AnimalAvailiblitySd  {
	protected WebDriver driver;
	private HomePage onHomePage;
	private AdoptionPage adoptionPage;
	private AdoptionResultPage adoptionResultPage;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		onHomePage = new HomePage(driver);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Given("^I navigate to website$")
	public void I_navigate_to_website() throws Throwable {
		onHomePage =  onHomePage.navigateToTestSite();
	}

	@When("^I click on adoption link$")
	public void I_click_on_adoption_link() throws Throwable {
		adoptionPage = onHomePage.clickOnAdoptionPage();
	}

	@Then("^I select adoption date$")
	public void I_select_adoption_date() throws Throwable {
		adoptionResultPage = adoptionPage.checkAnimal();
	}

	@Then("^I check animal availablity$")
	public void I_check_animal_availablity() throws Throwable {
		assertTrue(adoptionResultPage.checkAnimalMessage());
		
	}

	

}
