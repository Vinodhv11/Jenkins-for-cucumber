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

public class AddTariffTwoDimensional {
	static WebDriver wd;
	@Given("User should be in the demo home page.")
	public void user_should_be_in_the_demo_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vvino\\eclipse-workspace1\\Cucumber\\NewDriver\\chromedriver.exe");
	    wd = new ChromeDriver();
	    wd.get("http://demo.guru99.com/telecom/index.html");
	    
	}

	@Given("User clicks on add tariff plan button.")
	public void user_clicks_on_add_tariff_plan_button() {
		WebElement a = wd.findElement(By.xpath("//a[text()='Add Tariff Plan']"));
	    a.click();
	}

	@When("User enters all the required fields with validcredentials.")
	public void user_enters_all_the_required_fields_with_validcredentials(DataTable cusData) {
		List<List<String>> data = cusData.asLists(String.class);
		wd.findElement(By.id("rental1")).sendKeys(data.get(0).get(0));
	    wd.findElement(By.id("local_minutes")).sendKeys(data.get(0).get(1));
	    wd.findElement(By.id("inter_minutes")).sendKeys(data.get(0).get(2));
	    wd.findElement(By.id("sms_pack")).sendKeys(data.get(0).get(3));
	    wd.findElement(By.id("minutes_charges")).sendKeys(data.get(0).get(4));
	    wd.findElement(By.id("inter_charges")).sendKeys(data.get(0).get(5));
	    wd.findElement(By.id("sms_charges")).sendKeys(data.get(0).get(6));
	}
	
	@When("User enters all the required fields with validcredentials here.")
	public void user_enters_all_the_required_fields_with_validcredentials_here(DataTable cusData) {
		List<Map<String, String>> data = cusData.asMaps(String.class,String.class);
	    wd.findElement(By.id("rental1")).sendKeys(data.get(0).get("MR"));
	    wd.findElement(By.id("local_minutes")).sendKeys(data.get(0).get("LM"));
	    wd.findElement(By.id("inter_minutes")).sendKeys(data.get(0).get("IM"));
	    wd.findElement(By.id("sms_pack")).sendKeys(data.get(0).get("SMS"));
	    wd.findElement(By.id("minutes_charges")).sendKeys(data.get(0).get("LPMC"));
	    wd.findElement(By.id("inter_charges")).sendKeys(data.get(0).get("IPMC"));
	    wd.findElement(By.id("sms_charges")).sendKeys(data.get(0).get("SPC"));
	}
	
	@When("User enters all the required fields with validcredentialss here.{string},{string},{string},{string},{string},{string},{string}")
	public void user_enters_all_the_required_fields_with_validcredentialss_here(String MR, String LM, String IM, String SMS, String LPMC, String IPMC, String SPC) {
		wd.findElement(By.id("rental1")).sendKeys(MR);
	    wd.findElement(By.id("local_minutes")).sendKeys(LM);
	    wd.findElement(By.id("inter_minutes")).sendKeys(IM);
	    wd.findElement(By.id("sms_pack")).sendKeys(SMS);
	    wd.findElement(By.id("minutes_charges")).sendKeys(LPMC);
	    wd.findElement(By.id("inter_charges")).sendKeys(IPMC);
	    wd.findElement(By.id("sms_charges")).sendKeys(SPC);
	    
	}

	@When("User clicks on the submit button at the bottom of the page.")
	public void user_clicks_on_the_submit_button_at_the_bottom_of_the_page() {
	    wd.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("Tariff plan is displayed.")
	public void tariff_plan_is_displayed() {
		WebElement a = wd.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']"));
	    Assert.assertTrue(a.isDisplayed());
	}

}
