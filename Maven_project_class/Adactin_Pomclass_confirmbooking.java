package org.Maven_project_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Pomclass_confirmbooking {
	public WebDriver driver;
	@FindBy(xpath = "//td[@align='center']//preceding::input[@name='radiobutton_0']")
	private WebElement radio_btn;
	
	@FindBy(xpath = "//td[@align='center']//child::input[@id='continue']")
	private WebElement continue_btn;

	public Adactin_Pomclass_confirmbooking(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	

	public WebElement getRadio_btn() {
		return radio_btn;
	}

	public WebElement getContinue_btn() {
		return continue_btn;
	}
}
