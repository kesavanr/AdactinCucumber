package com.adactin.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotelPage {
	
	public static WebDriver driver;
	
	public BookAHotelPage(WebDriver localDriver) {
		this.driver=localDriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement first_name;
	
	@FindBy(id="last_name")
	private WebElement last_name;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement creditCardNumber;
	
	@FindBy(id="cc_type")
	private WebElement creditCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement creditCardExpMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement creditCardExpYear;
	
	@FindBy(id="cc_cvv")
	private WebElement creditCardCVV;
	
	@FindBy(id="book_now")
	private WebElement book_now;

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}

	public WebElement getCreditCardYype() {
		return creditCardType;
	}

	public WebElement getCreditCardExpMonth() {
		return creditCardExpMonth;
	}

	public WebElement getCreditCardExpYear() {
		return creditCardExpYear;
	}

	public WebElement getCreditCardCVV() {
		return creditCardCVV;
	}

	public WebElement getBook_now() {
		return book_now;
	}
	
	private By creditCardTypeLocator = By.id("cc_type");
	private By creditCardExpMonthLocator = By.id("cc_exp_month");
	private By creditCardExpYearLocator = By.id("cc_exp_year");

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public By getCreditCardTypeLocator() {
		return creditCardTypeLocator;
	}

	public By getCreditCardExpMonthLocator() {
		return creditCardExpMonthLocator;
	}

	public By getCreditCardExpYearLocator() {
		return creditCardExpYearLocator;
	}
	
}
