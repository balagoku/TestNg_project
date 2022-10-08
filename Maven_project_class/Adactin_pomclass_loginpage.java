package org.Maven_project_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_pomclass_loginpage {
	public WebDriver driver;
	@FindBy(xpath = "//span[@id='username_span']//preceding-sibling::input")
	private WebElement mail_id;

	@FindBy(xpath = "//span[@id='password_span']//preceding-sibling::input")
	private WebElement password;

	@FindBy(xpath = "//span[@id='password_span']//following::input")
	private WebElement signin_btn;

	public Adactin_pomclass_loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	

	public WebElement getMail_id() {

		return mail_id;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignin_btn() {
		return signin_btn;
	}
}
