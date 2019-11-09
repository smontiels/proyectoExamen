package com.qaminds.pages;

import com.qaminds.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class SecondPage extends BasePage {

	public SecondPage(MyDriverAppium driver) {
		super(driver);
	}

	public final String secondPageTitle = "section_label";
	public final String buttonNext = "intro_btn_next";
	
	public boolean getSecondTitle() {
		System.out.println("Llegas al método " + secondPageTitle);
		AndroidElement titleIntroduction = getDriver().findElementById(secondPageTitle);
		System.out.println("y pintas eso? " + titleIntroduction.getText());
		return titleIntroduction.isDisplayed();
	}
	
	public void doClickNext() {
		System.out.println("Haciendo Click segunda pantalla");
		AndroidElement nextButton = getDriver().findElementById(buttonNext);
		nextButton.click();
	}
	
}
