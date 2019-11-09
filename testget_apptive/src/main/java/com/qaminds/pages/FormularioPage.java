package com.qaminds.pages;

import com.qaminds.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class FormularioPage extends BasePage{

	public FormularioPage(MyDriverAppium driver) {
		super(driver);
	}
	
	public final String inputNombreId = "input_name";
	
	public void setNombre() {
		System.out.println("Llegas al método " + inputNombreId);
		AndroidElement inputNombre = getDriver().findElementById(inputNombreId);
		inputNombre.sendKeys("Samuel");
	}

}
