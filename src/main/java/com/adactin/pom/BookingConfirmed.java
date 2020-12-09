package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmed {
	public static WebDriver driver;

	public BookingConfirmed(WebDriver localDriver) {
		this.driver=localDriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="my_itinerary")
	private WebElement myItinerary;

	public WebElement getMyItinerary() {
		return myItinerary;
	}
}
