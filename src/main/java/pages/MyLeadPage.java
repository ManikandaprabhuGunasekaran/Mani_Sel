package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;
import pages_cucumberIntegration.Page_CreateLead1;
import tests.CreateLead;

public class MyLeadPage  extends WebDriverServiceImpl{
	@FindBy(linkText="Create Lead")
	WebElement eleCreateLead;
	public MyLeadPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;

		PageFactory.initElements(driver, this);
	}
	public Page_CreateLead clickCreateLead() {


		//WebElement eleCreateLead = locateElement("link", "Create Lead");
		click(eleCreateLead);
		return new Page_CreateLead(driver,test);
	}
}

