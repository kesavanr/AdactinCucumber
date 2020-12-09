package com.adactin.stepdefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.adactin.baseclass.BaseClass;
import com.adactin.runner.TestRunner;
import com.adactin.utilities.FileReaderManager;
import com.adactin.utilities.PageObjectManager;
/*import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;*/

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition extends BaseClass{

	public static WebDriver driver = TestRunner.driver;	
	PageObjectManager pom = new PageObjectManager(driver);
	
	/*static ExtentHtmlReporter htmlReporter;
	static ExtentReports exReports;
	ExtentTest testCase;
	
	static {
		String filePath = System.getProperty("user.dir") + "\\ReportFolder\\extent.html";
		System.out.println("filePath : " + filePath);
		htmlReporter = new ExtentHtmlReporter(filePath);
		exReports = new ExtentReports();
		exReports.attachReporter(htmlReporter);
	}*/
	
	
	@Before
	public void beforeHooks(Scenario scenario) {
		System.out.println("@Before");
		String name = scenario.getName();		
		//System.out.println("Scenario Name : " + name);	
		//testCase = exReports.createTest(name);
	}
	
	@After
	public void afterHooks(Scenario scenario) throws IOException {
		System.out.println("@After");
		String status = scenario.getStatus();
		//System.out.println("\tStatus : " + status);
		if(scenario.isFailed()) {
			String filename = scenario.getName().replace(" ", "_");
			getScreenshot(filename);
			String filePath = System.getProperty("user.dir") + "\\Screenshot\\" + filename + ".png";
			//testCase.addScreenCaptureFromPath(filePath);
			//testCase.fail(scenario.getName());			
		}
		//exReports.flush();
	}
	
	@Before("@LoginHotel")
	public void beforeFirstScenario() {
		System.out.println("@Before(\"@LoginHotel\")");
	}
	@After("@LoginHotel")
	public void afterFirstScenario() {
		System.out.println("@After(\"@LoginHotel\")");
	}
	
	@After("@SearchHotel")
	public void afterSecondScenario() {
		System.out.println("@After(\"@SearchHotel\")");
	}
	@Given("^:Launch the application url$")
	public void launch_the_application_url() throws Throwable {
		//ConfigurationReader cr = new ConfigurationReader();
		//driver = getBrowser(cr.getBrowserName());
		//getURL(cr.getUrl());
		
		System.out.println("Step Definition login");
		String url = FileReaderManager.getInstance().getCrInstance().getUrl();		
		getURL(url);
		//testCase.pass("Launch the application url");
	}
	
	@When("^User enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_valid_and(String username, String password) throws Throwable {
		
		//System.out.println("pom : " + pom);	
		//System.out.println("pom.getLp() : " + pom.getLp());		
		findInputElement(pom.getLp().getUsername(), username);
		findInputElement(pom.getLp().getPassword(), password);
		//testCase.pass("User enter valid " + username + " and " + password);
	}

	@When("^User click on the login button$")
	public void user_click_on_the_login_button() throws Throwable {
		Click(pom.getLp().getLogin());
		//testCase.pass("User click on the login button");
	}

	@Then("^User verifies whether navigated to search hotel page$")
	public void user_verifies_whether_navigated_to_search_hotel_page() throws Throwable {
		String actualTitle = driver.getTitle();
		Assert.assertEquals("Adactin.com - Search Hotel11", actualTitle);
		//testCase.pass("User verifies whether navigated to search hotel page");
		System.out.println("Statement 1");
	}
	//----------------------------------------

	@When("^User select the location \"([^\"]*)\" as \"([^\"]*)\"  from the dropdown$")
	public void user_select_the_location_as_from_the_dropdown(String location, String type) throws Throwable {
		System.out.println("Step Definition search");
		selectDropDown(pom.getSh().getLocationLocator(), location, type);
		//testCase.pass("User select the location " + location + " as " + type + " from the dropdown");
	}

	@When("^User select the hotel (\\d+) as \"([^\"]*)\" from the dropdown$")
	public void user_select_the_hotel_as_from_the_dropdown(int hotel, String type) throws Throwable {
		String valueOf = String.valueOf(hotel);
		selectDropDown(pom.getSh().getHotelsLocator(), valueOf, type);
		//testCase.pass("User select the hotel " + valueOf + " as " + type + " from the dropdown");
	}

	@When("^User select the room type (\\d+) as \"([^\"]*)\" from the dropdown$")
	public void user_select_the_room_type_as_from_the_dropdown(int roomType, String type) throws Throwable {
		String valueOf = String.valueOf(roomType);
		selectDropDown(pom.getSh().getRoomTypeLocator(), valueOf, type);
		//testCase.pass("User select the room type " + valueOf + " as " + type + " from the dropdown");
	}

	@When("^User select the number of rooms (\\d+) as \"([^\"]*)\" from the dropdown$")
	public void user_select_the_number_of_rooms_as_from_the_dropdown(int numberOfRooms, String type) throws Throwable {
		String valueOf = String.valueOf(numberOfRooms);
		selectDropDown(pom.getSh().getRoomNosLocator(), valueOf, type);
		//testCase.pass("User select the number of rooms " + valueOf + " as " + type + " from the dropdown");
	}

	@When("^User enter checkin date \"([^\"]*)\" from the textbox$")
	public void user_enter_checkin_date_from_the_textbox(String checkInDate) throws Throwable {
		findInputElement(pom.getSh().getDatePickIn(), checkInDate);
		//testCase.pass("User enter checkin date " + checkInDate + " from the textbox");
	}

	@When("^User enter checkout date \"([^\"]*)\" from the textbox$")
	public void user_enter_checkout_date_from_the_textbox(String checkOutDate) throws Throwable {
		findInputElement(pom.getSh().getDatePickOut(), checkOutDate);
		//testCase.pass("User enter checkout date " + checkOutDate + " from the textbox");
	}

	@When("^User select the adults per room (\\d+) as \"([^\"]*)\" from the dropdown$")
	public void user_select_the_adults_per_room_as_from_the_dropdown(int adultPerRoom, String type) throws Throwable {
		String valueOf = String.valueOf(adultPerRoom);
		selectDropDown(pom.getSh().getAdultRoomLocator(), valueOf, type);
		//testCase.pass("User select the adults per room " + valueOf + " as " + type + " from the dropdown");
	}

	@When("^User select the children per room (\\d+) as \"([^\"]*)\" from the dropdown$")
	public void user_select_the_children_per_room_as_from_the_dropdown(int childrenPerRoom, String type) throws Throwable {
		String valueOf = String.valueOf(childrenPerRoom);
		selectDropDown(pom.getSh().getChildRoomLocator(), valueOf, type);
		//testCase.pass("User select the children per room " + valueOf + " as " + type + " from the dropdown");
	}
	
	@When("^User click the search button$")
	public void user_click_the_search_button() throws Throwable {
		clickOnElement(pom.getSh().getSubmit());
		//testCase.pass("User click the search button");
	}

	@Then("^User verifies whether navigated to select hotel page$")
	public void user_verifies_whether_navigated_to_select_hotel_page() throws Throwable {
		String actualTitle = driver.getTitle();
		Assert.assertEquals("Adactin.com - Select Hotel", actualTitle);
		//testCase.pass("User verifies whether navigated to select hotel page");
	}
	//----------------------------------------

	@When("^User select the hotel from the options$")
	public void user_select_the_hotel_from_the_options() throws Throwable {	
		System.out.println("Step Definition select");
		clickPresenceOfElement(pom.getSl().getSelectHotelLocator());
		//testCase.pass("User select the hotel from the options");
	}

	@When("^User click the continue button$")
	public void user_click_the_continue_button() throws Throwable {
		Click(pom.getSl().getContinueButton());
		//testCase.pass("User click the continue button");
	}

	@Then("^User verifies whether navigated to book a hotel page$")
	public void user_verifies_whether_navigated_to_book_a_hotel_page() throws Throwable {
		String actualTitle = driver.getTitle();
		Assert.assertEquals("Adactin.com - Book A Hotel11", actualTitle);
		//testCase.pass("User verifies whether navigated to book a hotel page");
	}
	//----------------------------------------
	
	@When("^User enter the firstname \"([^\"]*)\" from the textbox$")
	public void user_enter_the_firstname_from_the_textbox(String firstName) throws Throwable {
		findInputElement(pom.getBh().getFirst_name(),firstName);
		//testCase.pass("User enter the firstname " + firstName + " from the textbox");
	}

	@When("^User enter the lastname \"([^\"]*)\" from the textbox$")
	public void user_enter_the_lastname_from_the_textbox(String lastName) throws Throwable {
		findInputElement(pom.getBh().getLast_name(),lastName);
		//testCase.pass("User enter the lastname " + lastName + " from the textbox");
	}

	@When("^User enter the billing address \"([^\"]*)\" from the big textbox$")
	public void user_enter_the_billing_address_from_the_big_textbox(String address) throws Throwable {
		findInputElement(pom.getBh().getAddress(),address);
		//testCase.pass("User enter the billing address " + address + " from the big textbox");
	}

	@When("^User enter the credit card no \"([^\"]*)\" from the textbox$")
	public void user_enter_the_credit_card_no_from_the_textbox(String creditCardNo) throws Throwable {
		findInputElement(pom.getBh().getCreditCardNumber(),creditCardNo);
		//testCase.pass("User enter the credit card no " + creditCardNo + " from the textbox");
	}

	@When("^User select the credit card type \"([^\"]*)\" as \"([^\"]*)\" from the dropdown$")
	public void user_select_the_credit_card_type_as_from_the_dropdown(String creditCardType, String type) throws Throwable {
		selectDropDown(pom.getBh().getCreditCardTypeLocator(),creditCardType,type);
		//testCase.pass("User select the credit card type " + creditCardType + " as " + type + " from the dropdown");
	}
	
	@When("^User select the month of expiry date \"([^\"]*)\" as \"([^\"]*)\" from the dropdown$")
	public void user_select_the_month_of_expiry_date_as_from_the_dropdown(String monthExp, String type) throws Throwable {
		selectDropDown(pom.getBh().getCreditCardExpMonthLocator(),monthExp,type);
		//testCase.pass("User select the month of expiry date " + monthExp + " as " + type + " from the dropdown");
	}

	@When("^User select the year of expiry date \"([^\"]*)\" as \"([^\"]*)\" from the dropdown$")
	public void user_select_the_year_of_expiry_date_as_from_the_dropdown(String yearExp, String type) throws Throwable {
		selectDropDown(pom.getBh().getCreditCardExpYearLocator(),yearExp,type);
		//testCase.pass("User select the year of expiry date " + yearExp + " as " + type + " from the dropdown");
	}

	@When("^User enter the cvv number \"([^\"]*)\" from the textbox$")
	public void user_enter_the_cvv_number_from_the_textbox(String cvv) throws Throwable {
		findInputElement(pom.getBh().getCreditCardCVV(),cvv);
		//testCase.pass("User enter the cvv number " + cvv + " from the textbox");
	}
	
	@When("^User click the book now button$")
	public void user_click_the_book_now_button() throws Throwable {
		Click(pom.getBh().getBook_now());
		//testCase.pass("User click the book now button");
		Thread.sleep(6000);
	}	

	@Then("^User verifies whether navigated to booking confirmation page$")
	public void user_verifies_whether_navigated_to_booking_confirmation_page() throws Throwable {
		String actualTitle = driver.getTitle();
		Assert.assertEquals("Adactin.com - Hotel Booking Confirmation", actualTitle);
		//testCase.pass("User verifies whether navigated to booking confirmation page");
	}
	//----------------------------------------

	@When("^User click the my itinerary button$")
	public void user_click_the_my_itinerary_button() throws Throwable {
		System.out.println("Step Definition itinerary");
		Click(pom.getBc().getMyItinerary());
		//testCase.pass("User click the my itinerary button");
	}

	@Then("^User verifies whether navigated to booked itinerary page$")
	public void user_verifies_whether_navigated_to_booked_itinerary_page() throws Throwable {
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals("http://adactinhotelapp.com/BookedItinerary.php", actualUrl);
		//testCase.pass("User verifies whether navigated to booked itinerary page");
	}
	//----------------------------------------
}
