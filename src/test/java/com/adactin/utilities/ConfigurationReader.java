package com.adactin.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	Properties pr;
	
	public ConfigurationReader() throws IOException {
		File inputFile = new File("src\\test\\java\\com\\adactin\\property\\Adactin.property");
		FileInputStream fis = new FileInputStream(inputFile);
		pr = new Properties();
		pr.load(fis);
	}
	
	public String getBrowserName() {
		String browserName = pr.getProperty("BrowserName");
		//System.out.println("BrowserName : " + browserName);
		return browserName;
	}
	
	public String getUrl() {
		String url = pr.getProperty("Url");
		//System.out.println("Url : " + url);
		return url;
	}
	
	/*public static void main(String[] args) throws IOException {
		ConfigurationReader cr= new ConfigurationReader();
		cr.getBrowserName();
		cr.getUrl();
	}*/
}
