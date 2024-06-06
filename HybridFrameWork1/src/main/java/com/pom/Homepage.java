package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	@FindBy(id="email")
	private WebElement USERNAME;
	
	@FindBy(id="pass")
	private WebElement PASSWORD;
	
	@FindBy(name="login")
	private WebElement LOGIN;

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void username(String user) {
		USERNAME.sendKeys(user);
	}
	
	public void password(String pass) {
		PASSWORD.sendKeys(pass);
	}
	
	public void login() {
		LOGIN.click();
	}
	
	
}
