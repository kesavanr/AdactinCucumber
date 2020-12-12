package com.adactin.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	static long timeOutInSecond = 15;
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
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
	
	public static void navigateTo(String Url) {
		driver.navigate().to(Url);
	}
	
	public static void navigateBack() {
		driver.navigate().back();
	}
	
	public static void navigateForward() {
		driver.navigate().forward();
	}
	
	public static void refreshWebpage() {
		driver.navigate().refresh();
	}
	
	public static String getCurrentWebpageUrl() {
		return driver.getCurrentUrl();
	}
	
	public static String getWebpageTitle() {
		return driver.getTitle();
	}
	
	public static String getWebElementText(WebElement element) {
		WebElement waitElement = waitElement(element);
		return waitElement.getText();
	}
	
	public static String getAttributeValue(WebElement element, String attributeName) {
		WebElement waitElement = waitElement(element);
		return waitElement.getAttribute(attributeName);
	}
	public static List<WebElement> getOptions(WebElement element) {
		List<WebElement> options = null;
		try {
			WebElement waitElement = waitElement(element);
			Select select = new Select(waitElement);
			options = select.getOptions();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return options;
	}
	
	public static List<WebElement> getAllSelectedOptions(WebElement element) {
		List<WebElement> options = null;
		try {
			WebElement waitElement = waitElement(element);
			Select select = new Select(waitElement);
			options = select.getAllSelectedOptions();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return options;
	}
	
	private boolean isMultipleSelect(WebElement element) {
		boolean multiple = false;
		try {
			WebElement waitElement = waitElement(element);
			Select select = new Select(waitElement);
			multiple = select.isMultiple();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return multiple;
	}
	 
	public static WebElement getFirstSelectedOption(WebElement element) {
		WebElement firstSelectedOption = null;
		try {
			WebElement waitElement = waitElement(element);
			Select select = new Select(waitElement);
			firstSelectedOption = select.getFirstSelectedOption();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return firstSelectedOption;
	}
	
	public static void findInputElement(WebElement element, String value) {
		WebElement waitElement = waitElement(element);
		try {			
			waitElement.clear();
			waitElement.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void moveToElement(WebElement element) {
		WebElement waitElement = waitElement(element);
		try {			
			Actions actions = new Actions(driver);
			actions.moveToElement(waitElement).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void Click(WebElement element) {
		try {
			WebElement elementToBeClickable = elementToBeClickable(element);
			elementToBeClickable.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void clickOnElement(WebElement element) {
		WebElement waitElement = waitElement(element);
		try {			
			Actions actions = new Actions(driver);
			actions.click(waitElement).perform();
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
	public static void scrollDown() {		
		try {	
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,1000);", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void scrollUp() {		
		try {	
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,-1000);", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void scrollTopOfPage() {		
		try {	
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,0);", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void scrollBottomOfPage() {		
		try {	
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,document.body.scrollHeight);", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void scrollIntoView(By locator) {		
		try {	
			WebElement element = presenceOfElementLocated(locator);
			if(element.isEnabled()) {
				//System.out.println("element enabled");				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", element);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static WebElement waitElement(WebElement element) {
		WebElement returnElement = null;
		try {
			WebDriverWait wt = new WebDriverWait(driver, timeOutInSecond);
			returnElement = wt.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return returnElement;
	}
	public static WebElement elementToBeClickable(WebElement element) {
		WebElement returnElement = null;
		try {
			WebDriverWait wt = new WebDriverWait(driver, timeOutInSecond);
			returnElement = wt.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returnElement;
	}
	public static WebElement presenceOfElementLocated(By locator) {
		WebElement returnElement = null;
		try {
			WebDriverWait wt = new WebDriverWait(driver, timeOutInSecond);
			returnElement = wt.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returnElement;
	}
	/*public static List<WebElement> presenceOfAllElementsLocatedBy(By locator) {
		WebDriverWait wt = new WebDriverWait(driver, timeOutInSecond);
		return wt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}*/
	public static WebElement visibilityOfElementLocated(By locator) {
		WebElement returnElement = null;
		try {
			WebDriverWait wt = new WebDriverWait(driver, timeOutInSecond);
			returnElement = wt.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returnElement;
	}
	public static List<WebElement> presenceOfAllElementsLocatedBy(List<WebElement> list) {
		List<WebElement> returnElement = null;
		try {
			WebDriverWait wt = new WebDriverWait(driver, timeOutInSecond);
			return wt.until(ExpectedConditions.visibilityOfAllElements(list));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returnElement;
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
	public static boolean isDisplayedStatus(WebElement element) {
		WebElement waitElement;
		try {
			waitElement = waitElement(element);
			return waitElement.isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean isEnabledStatus(WebElement element) {
		WebElement waitElement;
		try {
			waitElement = waitElement(element);
			return waitElement.isEnabled();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean isSelectedStatus(WebElement element) {
		WebElement waitElement;
		try {
			waitElement = waitElement(element);
			return waitElement.isSelected();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
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
		WebDriver driver1 = null;
		try {
			WebDriverWait wt = new WebDriverWait(driver, timeOutInSecond);
			driver1 = wt.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return driver1;
	}
	
	public static Alert SwitchToAlert() {
		WebDriverWait wt = new WebDriverWait(driver, timeOutInSecond);
		wt.until(ExpectedConditions.alertIsPresent());
		
		return driver.switchTo().alert();
	}
	
	public void getScreenshot(String filename) throws IOException {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			String filePath = System.getProperty("user.dir") +"\\Screenshot\\" + filename + ".png";
			File destFile = new File(filePath);
			FileUtils.copyFile(srcFile, destFile);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}