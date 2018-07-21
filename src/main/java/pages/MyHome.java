package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import lib.listeners.WebDriverListener;
import lib.selenium.WebDriverServiceImpl;
import pages_cucumberIntegration.MyLeadPage1;

public class MyHome extends WebDriverServiceImpl {

	@FindBy(linkText="Leads")
	WebElement eleLead;
	public MyHome(EventFiringWebDriver driver,ExtentTest test) {
	this.driver=driver;
		this.test=test;

		PageFactory.initElements(driver, this);
	}
	
	public MyLeadPage clickLead() {


		//WebElement eleCreateLead = locateElement("link", "Create Lead");
		click(eleLead);

		return new MyLeadPage(driver,test);
	}}
