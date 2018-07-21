package pages_cucumberIntegration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import lib.listeners.WebDriverListener;
import lib.selenium.WebDriverServiceImpl;
import pages.MyLeadPage;

public class MyHome1 extends WebDriverServiceImpl {

	@FindBy(xpath="(//div[@class='x-panel-header']/a[contains(text(),Leads)])[2]")
	WebElement eleLead;
	public MyHome1(/*EventFiringWebDriver driver,ExtentTest test*/) {
		/*this.driver=driver;
		this.test=test;*/

		PageFactory.initElements(driver, this);
	}
	@Given ("Click Leads")
	
	public MyLeadPage1 clickLead() {


		//WebElement eleCreateLead = locateElement("link", "Create Lead");
		click(eleLead);

		return new MyLeadPage1();
	}}
