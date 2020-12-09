package com.adactin.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	static long timeOutInSecond = 20;
	public static WebDriver getBrowser(String browserName) {				
		try {
			if(browserName.equalsIgnoreCase("chrome")) {
				//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sys-033\\eclipse-workspace\\SeleniumTutor\\Drivers\\chromedriver.exe");
				String exePath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
				//System.out.println(exePath);
				System.setProperty("webdriver.chrome.driver", exePath);
				driver = new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "C:\\Users\\sys-033\\eclipse-workspace\\SeleniumTutor\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			else
			{
				System.out.println("Invalid browser");
			}
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}
	public static void getURL(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void findInputElement(WebElement element, String value) {
		try {
			waitElement(element);
			element.clear();
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void moveToElement(WebElement element) {
		try {
			waitElement(element);
			Actions actions = new Actions(driver);
			actions.moveToElement(element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void Click(WebElement element) {
		WebElement elementToBeClickable = elementToBeClickable(element);
		elementToBeClickable.click();
	}
	public static void clickOnElement(WebElement element) {
		try {
			waitElement(element);
			Actions actions = new Actions(driver);
			actions.click(element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void clickPresenceOfElement(By locator) {
		try {
			WebElement element = presenceOfElementLocated(locator);
			Actions actions = new Actions(driver);
			actions.click(element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void scrollIntoView(By locator) {		
		try {	
			WebElement element = presenceOfElementLocated(locator);
			if(element.isEnabled()) {
				System.out.println("element enabled");				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", element);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static WebElement waitElement(WebElement element) {
		WebDriverWait wt = new WebDriverWait(driver, timeOutInSecond);
		return wt.until(ExpectedConditions.visibilityOf(element));
	}	
	public static WebElement elementToBeClickable(WebElement element) {
		WebDriverWait wt = new WebDriverWait(driver, timeOutInSecond);
		return wt.until(ExpectedConditions.elementToBeClickable(element));
	}
	public static WebElement presenceOfElementLocated(By locator) {
		WebDriverWait wt = new WebDriverWait(driver, timeOutInSecond);
		return wt.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	/*public static List<WebElement> presenceOfAllElementsLocatedBy(By locator) {
		WebDriverWait wt = new WebDriverWait(driver, timeOutInSecond);
		return wt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}*/
	public static WebElement visibilityOfElementLocated(By locator) {
		WebDriverWait wt = new WebDriverWait(driver, timeOutInSecond);
		return wt.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	public static List<WebElement> presenceOfAllElementsLocatedBy(List<WebElement> list) {
		WebDriverWait wt = new WebDriverWait(driver, timeOutInSecond);
		return wt.until(ExpectedConditions.visibilityOfAllElements(list));
	}
	public static void switchToFrameUsingId(String option, int index) {
		try {
			if (option.equalsIgnoreCase("id")) {
				driver.switchTo().frame(index);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static boolean isDisplayed(WebElement element) {
		WebElement waitElement = waitElement(element);
		return waitElement.isDisplayed();
	}

	public static WebDriver switchToFrame(WebElement element) {
		try {			
			driver = waitFrameElement(element);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}
	public static void selectDropDown(By locator, String value, String options) {
		try {
			WebElement element = presenceOfElementLocated(locator);			
			if(options.equalsIgnoreCase("index")) {
				Select size = new Select(element);
				size.selectByIndex(Integer.parseInt(value));
				//System.out.println("1. Index : " + value);
			}
			else if(options.equalsIgnoreCase("value")) {
				Select size = new Select(element);
				size.selectByValue(value);
				//System.out.println("2. Value : " + value);
			}
			else if(options.equalsIgnoreCase("text")) {
				Select size = new Select(element);
				size.selectByVisibleText(value);
				//System.out.println("3. Text : " + value);
			}

		} catch (Exception e) {
			System.out.println("===========Error in selectDropDown===========");
			e.printStackTrace();
			System.out.println("===========Error in selectDropDown END===========");
		}
	}	
	public static WebDriver defaultContent() {
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {			
			e.printStackTrace();
		}

		return driver;
	}
	public static void quitBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void closeBrowser() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static WebDriver waitFrameElement(WebElement element) {
		WebDriverWait wt = new WebDriverWait(driver, timeOutInSecond);
		WebDriver driver1 = wt.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));

		return driver1;
	}
	public static Alert SwitchToAlert() {
		WebDriverWait wt = new WebDriverWait(driver, timeOutInSecond);
		wt.until(ExpectedConditions.alertIsPresent());
		
		return driver.switchTo().alert();
	}
	
	public void getScreenshot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		String filePath = System.getProperty("user.dir") +"\\Screenshot\\" + filename + ".png";
		File destFile = new File(filePath);
		FileUtils.copyFile(srcFile, destFile);
	}
}