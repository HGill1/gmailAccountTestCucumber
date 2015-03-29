package com.gill.cog.animal.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CheckAnimalsAvailabilityTest extends AbstractTest{
	
	@Before
	public void setTestUp() throws Exception {
		onHomePage = onHomePage.navigateToTestSite();
	}

	@Test
	public void test() {
		Boolean isMessage = onHomePage.clickOnAdoptionPage().checkAnimal().checkAnimalMessage();
		assertTrue(isMessage);
	}

}
