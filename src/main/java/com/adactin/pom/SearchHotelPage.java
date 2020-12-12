package com.adactin.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {
	
	public static WebDriver driver;
	public SearchHotelPage(WebDriver localDriver) {
		this.driver=localDriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="search_form")
	private WebElement search_form;
	
	@FindBy(id="location")
	private WebElement location;
		
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement roomNos;
	
	@FindBy(id="datepick_in")
	private WebElement datePickIn;
	
	@FindBy(id="datepick_out")
	private WebElement datePickOut;
	
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	
	@FindBy(id="child_room")
	private WebElement childRoom;
	
	@FindBy(id="Submit")
	private WebElement Submit;
	
	public WebElement getSearch_form() {
		return search_form;
	}
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNos() {
		return roomNos;
	}

	public WebElement getDatePickIn() {
		return datePickIn;
	}

	public WebElement getDatePickOut() {
		return datePickOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	//===================
	
	private By locationLocator = By.id("location");
	private By hotelsLocator = By.id("hotels");
	private By roomTypeLocator = By.id("room_type");
	private By roomNosLocator = By.id("room_nos");
	private By adultRoomLocator = By.id("adult_room");
	private By childRoomLocator = By.id("child_room");
	
	public By getLocationLocator() {
		return locationLocator;
	}
	
	public By getHotelsLocator() {
		return hotelsLocator;
	}
	
	public By getRoomTypeLocator() {
		return roomTypeLocator;
	}
	
	public By getRoomNosLocator() {
		return roomNosLocator;
	}

	public By getAdultRoomLocator() {
		return adultRoomLocator;
	}

	public By getChildRoomLocator() {
		return childRoomLocator;
	}

	
	
	
}
