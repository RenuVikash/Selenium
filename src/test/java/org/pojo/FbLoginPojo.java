package org.pojo;


import org.bas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPojo extends BaseClass {
	
	
	//1. non parameterized
	public FbLoginPojo() {
		PageFactory.initElements(driver, this);
	}
	//2. private webElement
	// WebElement email = new findElement(by.id("email"))
		
		@FindBy(xpath = "//input[@type='text']")
		private WebElement email;
		
		@FindBy(xpath="//input[@type='password']")
		private WebElement password;
		
		@FindBy(name="login")
		private WebElement loginbtn;
		
		//3.Getters from access WebElement outside the class

		public WebElement getEmail() {
			return email;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLoginbtn() {
			return loginbtn;
		}
		
	
		
		



	
		
		

}
	
	
	

