package com.stepdefinition;

import com.resources.FunctionalLibrary;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends FunctionalLibrary{
	
	
	@Before
	public void beforeBackground() {
		
		ChromeLaunch("http://demo.guru99.com/telecom/index.html");
	}
	@After
	public void afterScenario() {
		wd.quit();

	}
	
	

}
