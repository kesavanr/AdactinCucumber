package com.adactin.utilities;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookAHotelPage;
import com.adactin.pom.BookingConfirmed;
import com.adactin.pom.LoginPage;
import com.adactin.pom.SearchHotelPage;
import com.adactin.pom.SelectHotelPage;

public class PageObjectManager {
	public static WebDriver driver;
	
	private LoginPage lp;
	private SearchHotelPage sh;
	private SelectHotelPage sl;
	private BookAHotelPage bh;
	private BookingConfirmed bc;
	
	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	public LoginPage getLp() {
		if(lp == null)
			lp = new LoginPage(driver);
		return lp;
	}
	public SearchHotelPage getSh() {
		if(sh == null)
			sh = new SearchHotelPage(driver);
		return sh;
	}
	public SelectHotelPage getSl() {
		if(sl == null)
			sl= new SelectHotelPage(driver);
		return sl;
	}
	public BookAHotelPage getBh() {
		if(bh == null)
			bh = new BookAHotelPage(driver);
		return bh;
	}
	public BookingConfirmed getBc() {
		if(bc == null)
			bc = new BookingConfirmed(driver);
		return bc;
	}
}
