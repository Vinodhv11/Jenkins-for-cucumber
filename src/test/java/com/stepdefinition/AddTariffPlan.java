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

public class AddTariffPlan {
	static WebDriver wd;
	@Given("User should be in the demo home page")
	public void user_should_be_in_the_demo_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vvino\\eclipse-workspace1\\Cucumber\\NewDriver\\chromedriver.exe");
	    wd = new ChromeDriver();
	    wd.get("http://demo.guru99.com/telecom/index.html");
	}

	@Given("User clicks on add tariff plan button")
	public void user_clicks_on_add_tariff_plan_button() {
	    WebElement a = wd.findElement(By.xpath("//a[text()='Add Tariff Plan']"));
	    a.click();
	}

	@When("User enters all the required fields with valid credentials")
	public void user_enters_all_the_required_fields_with_valid_credentials() {
	    wd.findElement(By.id("rental1")).sendKeys("1000");
	    wd.findElement(By.id("local_minutes")).sendKeys("100");
	    wd.findElement(By.id("inter_minutes")).sendKeys("50");
	    wd.findElement(By.id("sms_pack")).sendKeys("200");
	    wd.findElement(By.id("minutes_charges")).sendKeys("20");
	    wd.findElement(By.id("inter_charges")).sendKeys("30");
	    wd.findElement(By.id("sms_charges")).sendKeys("5");

	}
	
	@When("User enters all the required fields with valid credentials.")
	public void user_enters_all_the_required_fields_with_valid_credentials(DataTable tariffPlan) {
	    List<String> data = tariffPlan.asList(String.class);
	    wd.findElement(By.id("rental1")).sendKeys(data.get(0));
	    wd.findElement(By.id("local_minutes")).sendKeys(data.get(1));
	    wd.findElement(By.id("inter_minutes")).sendKeys(data.get(2));
	    wd.findElement(By.id("sms_pack")).sendKeys(data.get(3));
	    wd.findElement(By.id("minutes_charges")).sendKeys(data.get(4));
	    wd.findElement(By.id("inter_charges")).sendKeys(data.get(5));
	    wd.findElement(By.id("sms_charges")).sendKeys(data.get(6));
	}
	
	@When("User enters all the required fields with valid user credentials.")
	public void user_enters_all_the_required_fields_with_valid_user_credentials(DataTable tariffPlan) {
	    Map<String, String> data = tariffPlan.asMap(String.class, String.class);
	    wd.findElement(By.id("rental1")).sendKeys(data.get("monthly rental"));
	    wd.findElement(By.id("local_minutes")).sendKeys(data.get("free local"));
	    wd.findElement(By.id("inter_minutes")).sendKeys(data.get("free intl"));
	    wd.findElement(By.id("sms_pack")).sendKeys(data.get("free sms"));
	    wd.findElement(By.id("minutes_charges")).sendKeys(data.get("local per min charge"));
	    wd.findElement(By.id("inter_charges")).sendKeys(data.get("intl per min charge"));
	    wd.findElement(By.id("sms_charges")).sendKeys(data.get("sms per charge"));
	    
	}
	
	@When("User clicks on the submit button at the bottom of the page")
	public void user_clicks_on_the_submit_button_at_the_bottom_of_the_page() {
	    wd.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("Tariff plan is displayed")
	public void tariff_plan_is_displayed() {
	    WebElement a = wd.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']"));
	    Assert.assertTrue(a.isDisplayed());
	}





}
