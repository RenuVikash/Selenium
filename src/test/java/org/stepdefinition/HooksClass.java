package org.stepdefinition;

import org.bas.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass{
	
	@Before(order= 1)
	//precondition
	private void precondition2() {
		launchBrowser();
		System.out.println("Launch the browser");
	}
	
	@Before(order =2)
	//precondition
	private void precondition1() {
		
		windowMaximize();
		System.out.println("Max the window");
		
	}
	
	@Before(order=3,value="@Smoke")
	//precondition
	private void precondition3() {
		System.out.println("precondition 3");
		
	}
	
	@After(order=10,value="@Smoke")
	//postcondition
	private void postcondition2() {
		System.out.println("Take screenshot of scenarios");
		
	}
	
	@After(order=4)
	//postcondition
	private void postcondition1() {
		closeEntireBrowser();
		
	}


}
