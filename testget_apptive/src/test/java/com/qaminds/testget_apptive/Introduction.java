package com.qaminds.testget_apptive;

import org.testng.annotations.Test;

import com.qaminds.pages.IntroductionPage;
import com.qaminds.pages.SecondPage;
import com.qaminds.pages.ThirdPageIntroduction;

import static org.testng.Assert.assertTrue;

public class Introduction extends BaseTest{
	
	@Test
	public void validationTest() {
		System.out.println("validacion" + myDriver.getDriver());
		IntroductionPage introductionPage = new IntroductionPage(myDriver);
		assertTrue(introductionPage.getTitleIntroduction());
		introductionPage.doClickNext();
		
		SecondPage secondPage = new SecondPage(myDriver);
		assertTrue(secondPage.getSecondTitle());
		secondPage.doClickNext();
		
		ThirdPageIntroduction thirdPage = new ThirdPageIntroduction(myDriver);
		thirdPage.doClickNext();
	}

}
