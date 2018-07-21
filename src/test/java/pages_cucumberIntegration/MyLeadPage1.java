package pages_cucumberIntegration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import lib.selenium.WebDriverServiceImpl;
import pages.Page_CreateLead;
import tests.CreateLead;

public class MyLeadPage1  extends WebDriverServiceImpl{
	@FindBy(xpath="(//div[@class='x-panel-header']/a[contains(text(),Leads)])[2]")
	WebElement eleCreateLead;
	public MyLeadPage1(/*EventFiringWebDriver driver, ExtentTest test*/) {
		/*this.driver=driver;
		this.test=test;*/

		PageFactory.initElements(driver, this);
	}
	
	
	@And ("Click CreateLeads")
	public Page_CreateLead1 clickCreateLead() {


		//WebElement eleCreateLead = locateElement("link", "Create Lead");
		click(eleCreateLead);
		return new Page_CreateLead1();
	}
}

