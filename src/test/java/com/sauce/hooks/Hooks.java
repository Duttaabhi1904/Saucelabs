package com.sauce.hooks;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.sauce.base.BaseFunction;
import com.sauce.base.LogBase;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseFunction{
	
	
	
	@Before
	public void bS(Scenario sc) {
		LogBase.logs().info("The Scenario Started - " + sc.getName());

	}
	
	@After
	public void aS(Scenario sc) {
		LogBase.logs().info("The Scenario Ended - " + sc.getName());
		if(sc.isFailed()) {
			LogBase.logs().fatal("The Scenario Failed - " + sc.getName());
		}

	}
	
	@AfterStep
	public void aSt(Scenario sc) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] shot = ts.getScreenshotAs(OutputType.BYTES);
		
		if(sc.isFailed()) {
			sc.attach(shot, "image/png", sc.getName());
		}

	}
	
	

}
