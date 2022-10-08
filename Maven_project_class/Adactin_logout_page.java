package org.Maven_project_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_logout_page {
	public WebDriver driver;
	
	public WebElement getLogout() {
		return logout;
	}
public Adactin_logout_page(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
	public WebElement getLoginagain() {
		return loginagain;
	}

	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logout;
	
	@FindBy(xpath = "//a[.='Click here to login again']")
	private WebElement loginagain;
}
