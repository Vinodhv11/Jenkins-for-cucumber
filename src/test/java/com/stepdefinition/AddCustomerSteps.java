package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomerSteps {
	static WebDriver wd;
	@Given("User should be in the telecom home page")
	public void user_should_be_in_the_telecom_home_page() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\vvino\\eclipse-workspace1\\Cucumber\\NewDriver\\chromedriver.exe");
	    wd = new ChromeDriver();
	    wd.get("http://demo.guru99.com/telecom/index.html");
	}

	@Given("User click on add customer button")
	public void user_click_on_add_customer_button() {
	    WebElement a = wd.findElement(By.xpath("(//a[text()='Add Customer'])[1]"));
	    a.click();
	}

	@When("User enters all the fields with valid data")
	public void user_enters_all_the_fields_with_valid_data() {
	    WebElement b = wd.findElement(By.xpath("//label[@for='done']"));
	    b.click();
	    WebElement c = wd.findElement(By.id("fname"));
	    c.sendKeys("Vinodh");
	    wd.findElement(By.id("lname")).sendKeys("Kumar");
	    wd.findElement(By.id("email")).sendKeys("vvin@gmail.com");
	    wd.findElement(By.name("addr")).sendKeys("Chennai");
	    wd.findElement(By.id("telephoneno")).sendKeys("9790779992");
	}
	
	@When("User enters all the fields with valid data.")
	public void user_enters_all_the_fields_with_valid_data(DataTable cusData) {
		List<String> data = cusData.asList(String.class);
		WebElement b = wd.findElement(By.xpath("//label[@for='done']"));
	    b.click();
	    WebElement c = wd.findElement(By.id("fname"));
	    c.sendKeys(data.get(0));
	    wd.findElement(By.id("lname")).sendKeys(data.get(1));
	    wd.findElement(By.id("email")).sendKeys(data.get(2));
	    wd.findElement(By.name("addr")).sendKeys(data.get(3));
	    wd.findElement(By.id("telephoneno")).sendKeys(data.get(4));	
	}
	
	@When("User enters all the fields with valid datas.")
	public void user_enters_all_the_fields_with_valid_datas(io.cucumber.datatable.DataTable cusData) {
		Map<String, String> data = cusData.asMap(String.class, String.class);
		WebElement b = wd.findElement(By.xpath("//label[@for='done']"));
	    b.click();
	    WebElement c = wd.findElement(By.id("fname"));
	    c.sendKeys(data.get("fname"));
	    wd.findElement(By.id("lname")).sendKeys(data.get("lname"));
	    wd.findElement(By.id("email")).sendKeys(data.get("mail"));
	    wd.findElement(By.name("addr")).sendKeys(data.get("address"));
	    wd.findElement(By.id("telephoneno")).sendKeys(data.get("phno"));	
		    
	}


	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() {
	    wd.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@Then("User should be displayed and customer id is generated")
	public void user_should_be_displayed_and_customer_id_is_generated() {
		WebElement d = wd.findElement(By.xpath("(//td[@align='center'])[2]"));
		Assert.assertTrue(d.isDisplayed());
	}

}
