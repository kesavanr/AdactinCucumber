package com.adactin.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {
	
	public static WebDriver driver;

	public SelectHotelPage(WebDriver localDriver) {
		this.driver=localDriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement selectHotel;
	
	@FindBy(id="continue")
	private WebElement continueButton;

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}
	
	private By selectHotelLocator = By.xpath("(//input[@type='radio'])[1]");
	public By getSelectHotelLocator() {
		return selectHotelLocator;
	}
	
	@FindBy(xpath="(//form[@id='select_form']//following::table)[2]/tbody/tr//following-sibling::tr")
	private List<WebElement> lstHotel;

	public List<WebElement> getLstHotel() {
		return lstHotel;
	}
}
