package org.Maven_project_class;

import org.openqa.selenium.WebDriver;

public class Page_object_manager_adactin {

	public WebDriver driver;
	private Adactin_pomclass_loginpage loginpage;
	private Adactin_pomclass_bookingpage bookingpage;
	private Adactin_Pomclass_confirmbooking confirmbooking;
	private Adactin_Pomclass_billingpage billingpage;
	private Adactin_logout_page logoutpage;

	public Page_object_manager_adactin(WebDriver driver) {
		this.driver = driver;
	}

	public Adactin_pomclass_loginpage getLoginpage() {

		if (loginpage == null) {
			loginpage = new Adactin_pomclass_loginpage(driver);
		}

		return loginpage;
	}

	public Adactin_pomclass_bookingpage getBookingpage() {
		if (bookingpage == null) {
			bookingpage = new Adactin_pomclass_bookingpage(driver);
		}
		return bookingpage;
	}

	public Adactin_Pomclass_confirmbooking getConfirmbooking() {
		if (confirmbooking == null) {
			confirmbooking = new Adactin_Pomclass_confirmbooking(driver);
		}
		return confirmbooking;
	}

	public Adactin_Pomclass_billingpage getBillingpage() {
		if (billingpage == null) {
			billingpage = new Adactin_Pomclass_billingpage(driver);
		}
		return billingpage;
	}

	public Adactin_logout_page getlogoutpage() {
		if (logoutpage == null) {
			logoutpage = new Adactin_logout_page(driver);
		}
		return logoutpage;
	}
}
