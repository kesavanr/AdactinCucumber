package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItinerary {
	public static WebDriver driver;

	public BookedItinerary(WebDriver localDriver) {
		this.driver = localDriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="booked_form")
	private WebElement booked_form;

	public WebElement getBooked_form() {
		return booked_form;
	}
}
