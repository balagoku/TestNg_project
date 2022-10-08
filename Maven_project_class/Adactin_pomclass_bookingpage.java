package org.Maven_project_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_pomclass_bookingpage {
	public WebDriver driver;
	
	@FindBy(xpath = "//span[@id='location_span']//preceding-sibling::select[@class='search_combobox']")
	private WebElement location;
	
	@FindBy(xpath = "//span[@id='location_span']//following::select[@id='hotels']")
	private WebElement hotel;
	
	@FindBy(xpath = "//span[@id='location_span']//following::select[@id='room_type']")
	private WebElement rooms;
	
	@FindBy(xpath = "//span[@id='location_span']//following::select[@id='room_nos']")
	private WebElement room_number;
	
	@FindBy(xpath = "//span[@id='checkin_span']//preceding-sibling::input")
	private WebElement check_in;
	
	@FindBy(xpath = "//span[@id='checkout_span']//preceding-sibling::input")
	private WebElement check_out;
	
	@FindBy(xpath = "//span[@id='checkout_span']//following::select[@name='adult_room']")
	private WebElement no_of_adults;
	
	@FindBy(xpath = "//span[@id='checkout_span']//following::select[@name='child_room']")
	private WebElement no_of_children;
	
	@FindBy(xpath = "//span[@id='checkout_span']//following::input[@id='Submit']")
	private WebElement search_btn;

	public Adactin_pomclass_bookingpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getRoom_number() {
		return room_number;
	}

	public WebElement getCheck_in() {
		return check_in;
	}

	public WebElement getCheck_out() {
		return check_out;
	}

	public WebElement getNo_of_adults() {
		return no_of_adults;
	}

	public WebElement getNo_of_children() {
		return no_of_children;
	}

	public WebElement getSearch_btn() {
		return search_btn;
	}
	
	
}
