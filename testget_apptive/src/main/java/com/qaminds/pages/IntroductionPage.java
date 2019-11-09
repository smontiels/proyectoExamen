package com.qaminds.pages;

import com.qaminds.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class IntroductionPage extends BasePage{

	public IntroductionPage(MyDriverAppium driver) {
		super(driver);
	}
	
	public final String titleIntroductioId = "section_label";
	public final String buttonNext = "intro_btn_next";
	
	public boolean getTitleIntroduction() {
		System.out.println("Llegas al método " + titleIntroductioId);
		AndroidElement titleIntroduction = getDriver().findElementById(titleIntroductioId);
		System.out.println("y pintas eso? " + titleIntroduction.getText());
		return titleIntroduction.isDisplayed();
	}
	
	public void doClickNext() {
		System.out.println("Haciendo Click primera pantalla");
		AndroidElement nextButton = getDriver().findElementById(buttonNext);
		nextButton.click();
	}

}
