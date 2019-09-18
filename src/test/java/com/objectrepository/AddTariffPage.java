package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class AddTariffPage extends FunctionalLibrary{
	public AddTariffPage() {
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(id="rental1")
	private WebElement MonthlyRental;
	@FindBy(id="local_minutes")
	private WebElement FreeLM;
	@FindBy(id="inter_minutes")
	private WebElement FreeIM;
	@FindBy(id="sms_pack")
	private WebElement FreeSMS;
	@FindBy(id="minutes_charges")
	private WebElement LPMC;
	@FindBy(id="inter_charges")
	private WebElement IPMC;
	@FindBy(id="sms_charges")
	private WebElement SMSPC;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitButton;
	
	
	public WebElement getSubmitButton() {
		return submitButton;
	}
	public WebElement getMonthlyRental() {
		return MonthlyRental;
	}
	public WebElement getFreeLM() {
		return FreeLM;
	}
	public WebElement getFreeIM() {
		return FreeIM;
	}
	public WebElement getFreeSMS() {
		return FreeSMS;
	}
	public WebElement getLPMC() {
		return LPMC;
	}
	public WebElement getIPMC() {
		return IPMC;
	}
	public WebElement getSMSPC() {
		return SMSPC;
	}
	

}
