package com.qaminds.pages;

import com.qaminds.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class ThirdPageIntroduction extends BasePage{

	public ThirdPageIntroduction(MyDriverAppium driver) {
		super(driver);
	}
	
	public final String buttonSkipId = "intro_btn_skip";
	
	public void doClickNext() {
		System.out.println("Haciendo Click en Skip");
		AndroidElement nextButton = getDriver().findElementById(buttonSkipId);
		nextButton.click();
	}

}