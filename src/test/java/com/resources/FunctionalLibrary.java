package com.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalLibrary {
	public static WebDriver wd;
	
public static void ChromeLaunch(String url) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vvino\\eclipse-workspace1\\Cucumber\\NewDriver\\chromedriver.exe");
	wd = new ChromeDriver();
	wd.get(url);

}
public static void insert(WebElement element, String value) {
	element.sendKeys(value);

}
public void button(WebElement element) {
	element.click();
}
}
