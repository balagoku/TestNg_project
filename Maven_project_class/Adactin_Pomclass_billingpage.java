package org.Maven_project_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Pomclass_billingpage {
	public WebDriver driver;
	@FindBy(xpath = "//label[@id='first_name_span']//preceding-sibling::input")
	private WebElement firstname;
	
	@FindBy(xpath = "//label[@id='first_name_span']//following::input[@name='last_name']")
	private WebElement lastname;
	
	@FindBy(xpath = "//label[@id='first_name_span']//following::textarea")
	private WebElement address;
	
	@FindBy(xpath = "//label[@id='first_name_span']//following::input[@name='cc_num']")
	private WebElement creditcard_no;

	@FindBy(xpath = "//label[@id='first_name_span']//following::select[@name='cc_type']")
	private WebElement cardtype;
	
	@FindBy(xpath = "//label[@id='first_name_span']//following::select[@name='cc_exp_month']")
	private WebElement card_Exp_month;
	
	@FindBy(xpath = "//label[@id='first_name_span']//following::select[@name='cc_exp_year']")
	private WebElement card_Exp_year;
	
	@FindBy(xpath = "//label[@id='first_name_span']//following::input[@name='cc_cvv']")
	private WebElement cvv;
	
	@FindBy(xpath = "//label[@id='first_name_span']//following::input[@type='button'and@name='book_now']")
	private WebElement booknow;

	public Adactin_Pomclass_billingpage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	

	public WebElement getFirstname() {
		
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditcard_no() {
		return creditcard_no;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getCard_Exp_month() {
		return card_Exp_month;
	}

	public WebElement getCard_Exp_year() {
		return card_Exp_year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	
}
