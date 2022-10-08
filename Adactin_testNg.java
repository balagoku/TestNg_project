package utility.demo;

import java.io.IOException;

import org.Maven_project_class.Page_object_manager_adactin;
import org.Maven_project_class.Utility_baseclass_adactin;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.test_data_adactin.File_reader_manager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Adactin_testNg extends Utility_baseclass_adactin {
	public static WebDriver driver = getbrowser("chrome");
	public static Page_object_manager_adactin manager = new Page_object_manager_adactin(driver);
	public static Logger log = Logger.getLogger(Adactin_testNg.class);

	@BeforeMethod
	private void url_launch() throws IOException {
		String get_url = File_reader_manager.get_instance().get_instance_reader().get_url();
		Url(get_url);
		sendkeys(manager.getLoginpage().getMail_id(),
				File_reader_manager.get_instance().get_instance_reader().get_username());
		
		sendkeys(manager.getLoginpage().getPassword(),
				File_reader_manager.get_instance().get_instance_reader().get_password());
		
		on_click(manager.getLoginpage().getSignin_btn());
	}

	@Test(priority = 1)
	private void bookinghotel_sunshine() throws IOException {
		
		
		on_click(manager.getBookingpage().getLocation());
		select_byindex(manager.getBookingpage().getLocation(), 2);

		on_click(manager.getBookingpage().getHotel());
		select_byindex(manager.getBookingpage().getHotel(), 2);

		on_click(manager.getBookingpage().getRooms());
		select_byindex(manager.getBookingpage().getRooms(), 1);

		on_click(manager.getBookingpage().getRoom_number());
		select_byvisibletext(manager.getBookingpage().getRoom_number(), "7 - Seven");

		on_click(manager.getBookingpage().getCheck_in());
		clear(manager.getBookingpage().getCheck_in());
		String datein = datadriven("C:\\Users\\Ramji\\Documents\\datadrivenAutomation.xlsx", 1, 1, 0);
		sendkeys(manager.getBookingpage().getCheck_in(), datein);

		on_click(manager.getBookingpage().getCheck_out());
		clear(manager.getBookingpage().getCheck_out());
		String dateout = datadriven("C:\\Users\\Ramji\\Documents\\datadrivenAutomation.xlsx", 1, 1, 1);
		sendkeys(manager.getBookingpage().getCheck_out(), dateout);
		
		on_click(manager.getBookingpage().getNo_of_adults());
		select_byvisibletext(manager.getBookingpage().getNo_of_adults(), "2 - Two");

		on_click(manager.getBookingpage().getNo_of_children());
		select_byvisibletext(manager.getBookingpage().getNo_of_children(), "2 - Two");

		on_click(manager.getBookingpage().getSearch_btn());
		
		on_click(manager.getConfirmbooking().getRadio_btn());
		on_click(manager.getConfirmbooking().getContinue_btn());
		log.info("confirm page redirected to billing page");

		log.info("billing page opens");
		String fname = datadriven("C:\\Users\\Ramji\\Documents\\datadrivenAutomation.xlsx", 2, 2, 0);
		sendkeys(manager.getBillingpage().getFirstname(), fname);
		
		String lname = datadriven("C:\\Users\\Ramji\\Documents\\datadrivenAutomation.xlsx", 2, 2, 1);
		sendkeys(manager.getBillingpage().getLastname(), lname);
		
		String address = datadriven("C:\\Users\\Ramji\\Documents\\datadrivenAutomation.xlsx", 2, 2, 2);
		sendkeys(manager.getBillingpage().getAddress(), address);
		
		String credit = datadriven("C:\\Users\\Ramji\\Documents\\datadrivenAutomation.xlsx", 2, 2, 3);
		sendkeys(manager.getBillingpage().getCreditcard_no(), credit);

		on_click(manager.getBillingpage().getCardtype());
		select_byvisibletext(manager.getBillingpage().getCardtype(), "American Express");

		on_click(manager.getBillingpage().getCard_Exp_month());
		select_byvisibletext(manager.getBillingpage().getCard_Exp_month(), "May");

		on_click(manager.getBillingpage().getCard_Exp_year());
		select_byvisibletext(manager.getBillingpage().getCard_Exp_year(), "2022");

		String cvv = datadriven("C:\\Users\\Ramji\\Documents\\datadrivenAutomation.xlsx", 2, 2, 4);
		sendkeys(manager.getBillingpage().getCvv(), cvv);

		on_click(manager.getBillingpage().getBooknow());
		log.info("project works");

	}
	@Test(priority = 2)
	private void bookinghotel_creek() throws IOException {
		on_click(manager.getBookingpage().getLocation());
		select_byindex(manager.getBookingpage().getLocation(), 2);

		on_click(manager.getBookingpage().getHotel());
		select_byindex(manager.getBookingpage().getHotel(), 1);

		on_click(manager.getBookingpage().getRooms());
		select_byindex(manager.getBookingpage().getRooms(), 1);

		on_click(manager.getBookingpage().getRoom_number());
		select_byvisibletext(manager.getBookingpage().getRoom_number(), "7 - Seven");

		on_click(manager.getBookingpage().getCheck_in());
		clear(manager.getBookingpage().getCheck_in());
		String datein = datadriven("C:\\Users\\Ramji\\Documents\\datadrivenAutomation.xlsx", 1, 1, 0);
		sendkeys(manager.getBookingpage().getCheck_in(), datein);

		on_click(manager.getBookingpage().getCheck_out());
		clear(manager.getBookingpage().getCheck_out());
		String dateout = datadriven("C:\\Users\\Ramji\\Documents\\datadrivenAutomation.xlsx", 1, 1, 1);
		sendkeys(manager.getBookingpage().getCheck_out(), dateout);
		
		on_click(manager.getBookingpage().getNo_of_adults());
		select_byvisibletext(manager.getBookingpage().getNo_of_adults(), "2 - Two");

		on_click(manager.getBookingpage().getNo_of_children());
		select_byvisibletext(manager.getBookingpage().getNo_of_children(), "2 - Two");

		on_click(manager.getBookingpage().getSearch_btn());
		
		on_click(manager.getConfirmbooking().getRadio_btn());
		on_click(manager.getConfirmbooking().getContinue_btn());
		log.info("confirm page redirected to billing page");

		log.info("billing page opens");
		String fname = datadriven("C:\\Users\\Ramji\\Documents\\datadrivenAutomation.xlsx", 2, 1, 0);
		sendkeys(manager.getBillingpage().getFirstname(), fname);
		
		String lname = datadriven("C:\\Users\\Ramji\\Documents\\datadrivenAutomation.xlsx", 2, 1, 1);
		sendkeys(manager.getBillingpage().getLastname(), lname);
		
		String address = datadriven("C:\\Users\\Ramji\\Documents\\datadrivenAutomation.xlsx", 2, 1, 2);
		sendkeys(manager.getBillingpage().getAddress(), address);
		
		String credit = datadriven("C:\\Users\\Ramji\\Documents\\datadrivenAutomation.xlsx", 2, 1, 3);
		sendkeys(manager.getBillingpage().getCreditcard_no(), credit);

		on_click(manager.getBillingpage().getCardtype());
		select_byvisibletext(manager.getBillingpage().getCardtype(), "American Express");

		on_click(manager.getBillingpage().getCard_Exp_month());
		select_byvisibletext(manager.getBillingpage().getCard_Exp_month(), "May");

		on_click(manager.getBillingpage().getCard_Exp_year());
		select_byvisibletext(manager.getBillingpage().getCard_Exp_year(), "2022");

		String cvv = datadriven("C:\\Users\\Ramji\\Documents\\datadrivenAutomation.xlsx", 2, 1, 4);
		sendkeys(manager.getBillingpage().getCvv(), cvv);

		on_click(manager.getBillingpage().getBooknow());
		log.info("project works");

	}
	@AfterMethod
	private void logout() {
		on_click(manager.getlogoutpage().getLogout());
		on_click(manager.getlogoutpage().getLoginagain());

	}

}
